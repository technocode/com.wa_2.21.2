package com.google.android.search.verification.client;

import X.AnonymousClass03E;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.search.verification.api.ISearchActionVerificationService;

public abstract class SearchActionVerificationClientService extends IntentService {
    public static final int CONNECTION_TIMEOUT_IN_MS = 1000;
    public static final String EXTRA_INTENT = "SearchActionVerificationClientExtraIntent";
    public static final long MS_TO_NS = 1000000;
    public static final String NOTIFICATION_CHANNEL_ID = "Assistant_verifier";
    public static final int NOTIFICATION_ID = 10000;
    public static final String REMOTE_ASSISTANT_GO_SERVICE_ACTION = "com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE";
    public static final String REMOTE_GSA_SERVICE_ACTION = "com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE";
    public static final String SEND_MESSAGE_ERROR_MESSAGE = "com.google.android.voicesearch.extra.ERROR_MESSAGE";
    public static final String SEND_MESSAGE_RESULT_RECEIVER = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER";
    public static final String TAG = "SAVerificationClientS";
    public static final int TIME_TO_SLEEP_IN_MS = 50;
    public final Intent assistantGoServiceIntent = new Intent(REMOTE_ASSISTANT_GO_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE);
    public SearchActionVerificationServiceConnection assistantGoVerificationServiceConnection;
    public final long connectionTimeout = 1000;
    public final boolean dbg = isDebugMode();
    public final Intent gsaServiceIntent = new Intent(REMOTE_GSA_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE);
    public SearchActionVerificationServiceConnection searchActionVerificationServiceConnection;

    public long getConnectionTimeout() {
        return 1000;
    }

    public boolean isTestingMode() {
        return false;
    }

    public abstract void performAction(Intent intent, boolean z, Bundle bundle);

    public class SearchActionVerificationServiceConnection implements ServiceConnection {
        public ISearchActionVerificationService iRemoteService;

        public SearchActionVerificationServiceConnection() {
        }

        public ISearchActionVerificationService getRemoteService() {
            return this.iRemoteService;
        }

        public static boolean isConnected(SearchActionVerificationServiceConnection searchActionVerificationServiceConnection) {
            return searchActionVerificationServiceConnection.iRemoteService != null;
        }

        public boolean isVerified(Intent intent, Bundle bundle) {
            ISearchActionVerificationService iSearchActionVerificationService = this.iRemoteService;
            return iSearchActionVerificationService != null && iSearchActionVerificationService.isSearchAction(intent, bundle);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceConnected");
            }
            this.iRemoteService = ISearchActionVerificationService.Stub.asInterface(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.iRemoteService = null;
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceDisconnected");
            }
        }
    }

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
    }

    private void createChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r11.assistantGoVerificationServiceConnection) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r11.searchActionVerificationServiceConnection) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean installedServicesConnected() {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.installedServicesConnected():boolean");
    }

    private boolean isDebugMode() {
        return !"user".equals(Build.TYPE);
    }

    private boolean isPackageInstalled(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || !applicationInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, String.format("Couldn't find package name %s", str), e);
            return false;
        }
    }

    private boolean isPackageSafe(String str) {
        if (isPackageInstalled(str)) {
            return isDebugMode() || SearchActionVerificationClientUtil.isPackageGoogleSigned(this, str);
        }
        return false;
    }

    private boolean maybePerformActionIfVerified(String str, Intent intent, SearchActionVerificationServiceConnection searchActionVerificationServiceConnection2) {
        boolean z;
        String str2;
        String str3;
        int i = 0;
        if (!str.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str.equals(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE)) {
            if (this.dbg) {
                Log.d(TAG, String.format("Unsupported package %s for verification.", str));
            }
            return false;
        } else if (!isDebugMode() && !SearchActionVerificationClientUtil.isPackageGoogleSigned(this, str)) {
            if (this.dbg) {
                Log.d(TAG, String.format("Cannot verify the intent with package %s in unsafe mode.", str));
            }
            return false;
        } else if (!intent.hasExtra(EXTRA_INTENT)) {
            if (this.dbg) {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("No extra, nothing to check: ");
                sb.append(valueOf);
                Log.d(TAG, sb.toString());
            }
            return false;
        } else {
            Intent intent2 = (Intent) intent.getParcelableExtra(EXTRA_INTENT);
            if (this.dbg) {
                SearchActionVerificationClientUtil.logIntentWithExtras(intent2);
            }
            String str4 = "VerificationService is not connected to %s, unable to check intent: %s";
            if (SearchActionVerificationServiceConnection.isConnected(searchActionVerificationServiceConnection2)) {
                try {
                    Log.i(TAG, String.format("%s Service API version: %s", str, Integer.valueOf(searchActionVerificationServiceConnection2.iRemoteService.getVersion())));
                    Bundle bundle = new Bundle();
                    z = searchActionVerificationServiceConnection2.isVerified(intent2, bundle);
                    performAction(intent2, z, bundle);
                    str4 = "";
                } catch (RemoteException e) {
                    String valueOf2 = String.valueOf(e.getMessage());
                    if (valueOf2.length() != 0) {
                        str3 = "Remote exception: ".concat(valueOf2);
                    } else {
                        str3 = new String("Remote exception: ");
                    }
                    Log.e(TAG, str3);
                    str4 = e.getMessage();
                } catch (Exception e2) {
                    String valueOf3 = String.valueOf(e2.getMessage());
                    if (valueOf3.length() != 0) {
                        str2 = "Exception: ".concat(valueOf3);
                    } else {
                        str2 = new String("Exception: ");
                    }
                    Log.e(TAG, str2);
                    str4 = e2.getMessage();
                }
            } else {
                Log.e(TAG, String.format(str4, str, intent));
                z = false;
            }
            if (intent2.hasExtra(SEND_MESSAGE_RESULT_RECEIVER)) {
                ResultReceiver resultReceiver = (ResultReceiver) intent2.getExtras().getParcelable(SEND_MESSAGE_RESULT_RECEIVER);
                Bundle bundle2 = new Bundle();
                bundle2.putString(SEND_MESSAGE_ERROR_MESSAGE, str4);
                if (!z) {
                    i = -1;
                }
                resultReceiver.send(i, bundle2);
            }
            return z;
        }
    }

    public final void onCreate() {
        if (this.dbg) {
            Log.d(TAG, "onCreate");
        }
        super.onCreate();
        this.searchActionVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE)) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE)) {
            bindService(this.assistantGoServiceIntent, this.assistantGoVerificationServiceConnection, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            postForegroundNotification();
        }
    }

    public final void onDestroy() {
        if (this.dbg) {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection2 = this.searchActionVerificationServiceConnection;
        if (SearchActionVerificationServiceConnection.isConnected(searchActionVerificationServiceConnection2)) {
            unbindService(searchActionVerificationServiceConnection2);
        }
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection3 = this.assistantGoVerificationServiceConnection;
        if (SearchActionVerificationServiceConnection.isConnected(searchActionVerificationServiceConnection3)) {
            unbindService(searchActionVerificationServiceConnection3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            long nanoTime = System.nanoTime();
            while (!installedServicesConnected() && System.nanoTime() - nanoTime < this.connectionTimeout * MS_TO_NS) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    if (this.dbg) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 33);
                        sb.append("Unexpected InterruptedException: ");
                        sb.append(valueOf);
                        Log.d(TAG, sb.toString());
                    }
                }
            }
            if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE, intent, this.searchActionVerificationServiceConnection)) {
                Log.i(TAG, "Verified the intent with GSA.");
                return;
            }
            Log.i(TAG, "Unable to verify the intent with GSA.");
            if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE, intent, this.assistantGoVerificationServiceConnection)) {
                Log.i(TAG, "Verified the intent with Assistant Go.");
            } else {
                Log.i(TAG, "Unable to verify the intent with Assistant Go.");
            }
        } else if (this.dbg) {
            Log.d(TAG, "Unable to verify null intent");
        }
    }

    public void postForegroundNotification() {
        createChannel();
        AnonymousClass03E r2 = new AnonymousClass03E(getApplicationContext(), NOTIFICATION_CHANNEL_ID);
        r2.A0K = NOTIFICATION_CHANNEL_ID;
        r2.A0A(getApplicationContext().getResources().getString(R.string.google_assistant_verification_notification_title));
        r2.A07.icon = 17301545;
        r2.A03 = -2;
        r2.A06 = 1;
        startForeground(NOTIFICATION_ID, r2.A01());
    }
}

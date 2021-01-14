package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.03H  reason: invalid class name */
public class AnonymousClass03H implements ServiceConnection, Handler.Callback {
    public Set A00 = new HashSet();
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A03;
    public final Map A04 = new HashMap();

    public AnonymousClass03H(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A03 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(this.A03.getLooper(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r7.A03 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C14590mX r7) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03H.A00(X.0mX):void");
    }

    public final void A01(C14590mX r8) {
        Handler handler = this.A02;
        ComponentName componentName = r8.A04;
        if (!handler.hasMessages(3, componentName)) {
            int i = r8.A00 + 1;
            r8.A00 = i;
            if (i > 6) {
                StringBuilder A0S = AnonymousClass008.A0S("Giving up on delivering ");
                A0S.append(r8.A02.size());
                A0S.append(" tasks to ");
                A0S.append(componentName);
                A0S.append(" after ");
                A0S.append(r8.A00);
                A0S.append(" retries");
                Log.w("NotifManCompat", A0S.toString());
                r8.A02.clear();
                return;
            }
            int i2 = (1 << (i - 1)) * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder("Scheduling retry for ");
                sb.append(i2);
                sb.append(" ms");
                Log.d("NotifManCompat", sb.toString());
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) i2);
        }
    }

    public boolean handleMessage(Message message) {
        Set set;
        INotificationSideChannel r1;
        int i = message.what;
        if (i == 0) {
            Object obj = message.obj;
            Context context = this.A01;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (AnonymousClass03D.A05) {
                if (string != null) {
                    if (!string.equals(AnonymousClass03D.A03)) {
                        String[] split = string.split(":", -1);
                        int length = split.length;
                        HashSet hashSet = new HashSet(length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        AnonymousClass03D.A04 = hashSet;
                        AnonymousClass03D.A03 = string;
                    }
                }
                set = AnonymousClass03D.A04;
            }
            if (!set.equals(this.A00)) {
                this.A00 = set;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet2 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (set.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w("NotifManCompat", sb.toString());
                        } else {
                            hashSet2.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    Map map = this.A04;
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        map.put(componentName2, new C14590mX(componentName2));
                    }
                }
                Iterator it2 = this.A04.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet2.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder A0S = AnonymousClass008.A0S("Removing listener record for ");
                            A0S.append(entry.getKey());
                            Log.d("NotifManCompat", A0S.toString());
                        }
                        C14590mX r12 = (C14590mX) entry.getValue();
                        if (r12.A03) {
                            context.unbindService(this);
                            r12.A03 = false;
                        }
                        r12.A01 = null;
                        it2.remove();
                    }
                }
            }
            for (C14590mX r13 : this.A04.values()) {
                r13.A02.add(obj);
                A00(r13);
            }
            return true;
        } else if (i == 1) {
            C14580mW r0 = (C14580mW) message.obj;
            ComponentName componentName3 = r0.A00;
            IBinder iBinder = r0.A01;
            C14590mX r2 = (C14590mX) this.A04.get(componentName3);
            if (r2 != null) {
                if (iBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                        r1 = new AnonymousClass1Z6(iBinder);
                    } else {
                        r1 = (INotificationSideChannel) queryLocalInterface;
                    }
                }
                r2.A01 = r1;
                r2.A00 = 0;
                A00(r2);
            }
            return true;
        } else if (i == 2) {
            C14590mX r14 = (C14590mX) this.A04.get(message.obj);
            if (r14 != null) {
                if (r14.A03) {
                    this.A01.unbindService(this);
                    r14.A03 = false;
                }
                r14.A01 = null;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            C14590mX r02 = (C14590mX) this.A04.get(message.obj);
            if (r02 != null) {
                A00(r02);
            }
            return true;
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Connected to service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(1, new C14580mW(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Disconnected from service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }
}

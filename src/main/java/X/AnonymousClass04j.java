package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.core.NetworkStateManager$SubscriptionManagerBasedRoamingDetector;
import com.whatsapp.util.Log;

/* renamed from: X.04j  reason: invalid class name */
public class AnonymousClass04j {
    public static volatile AnonymousClass04j A01;
    public final AnonymousClass03P A00;

    public AnonymousClass04j(AnonymousClass03P r1) {
        this.A00 = r1;
    }

    public static AnonymousClass04j A00() {
        if (A01 == null) {
            synchronized (AnonymousClass04j.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass04j(AnonymousClass03P.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04j.A01():boolean");
    }

    public static boolean A02(Context context) {
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        if (i < 17) {
            if (Settings.System.getInt(contentResolver, "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } else if (Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int A03(boolean z) {
        AnonymousClass03P r4 = this.A00;
        TelephonyManager A0F = r4.A0F();
        ConnectivityManager A0A = r4.A0A();
        if (A0A == null || A0F == null) {
            return 0;
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = A0A.getActiveNetworkInfo();
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException) && (Build.VERSION.SDK_INT < 24 || !(e.getCause() instanceof DeadSystemException))) {
                throw e;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("app/network-type network-info=");
            sb.append(networkInfo);
            Log.d(sb.toString());
        }
        if (networkInfo == null) {
            return 0;
        }
        boolean isConnected = networkInfo.isConnected();
        if (z) {
            AnonymousClass008.A1G("app/network-type network-connected=", isConnected);
        }
        if (!isConnected) {
            return 0;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Pair determineNetworkStateUsingSubscriptionManager = NetworkStateManager$SubscriptionManagerBasedRoamingDetector.determineNetworkStateUsingSubscriptionManager(r4, z);
            if (((Boolean) determineNetworkStateUsingSubscriptionManager.first).booleanValue()) {
                return ((Number) determineNetworkStateUsingSubscriptionManager.second).intValue();
            }
        }
        boolean isRoaming = networkInfo.isRoaming();
        if (z) {
            AnonymousClass008.A1G("app/network-type network-roaming=", isRoaming);
        }
        if (isRoaming) {
            return 3;
        }
        boolean isNetworkRoaming = A0F.isNetworkRoaming();
        if (z) {
            AnonymousClass008.A1G("app/network-type telephony-roaming=", isNetworkRoaming);
        }
        if (isNetworkRoaming) {
            return 3;
        }
        String simCountryIso = A0F.getSimCountryIso();
        if (z) {
            AnonymousClass008.A16("app/network-type sim-iso=", simCountryIso);
        }
        if (TextUtils.isEmpty(simCountryIso)) {
            return 3;
        }
        String simOperator = A0F.getSimOperator();
        if (z) {
            AnonymousClass008.A16("app/network-type sim-operator=", simOperator);
        }
        if (TextUtils.isEmpty(simOperator)) {
            return 3;
        }
        if (A0F.getPhoneType() != 2) {
            String networkCountryIso = A0F.getNetworkCountryIso();
            if (z) {
                AnonymousClass008.A16("app/network-type network-iso=", networkCountryIso);
            }
            if (!TextUtils.isEmpty(networkCountryIso) && simCountryIso.equals(networkCountryIso)) {
                String networkOperator = A0F.getNetworkOperator();
                if (z) {
                    AnonymousClass008.A16("app/network-type network-operator=", networkOperator);
                }
                if (TextUtils.isEmpty(networkOperator)) {
                    return 3;
                }
                if (networkOperator.equals(simOperator) || AnonymousClass04m.A00.contains(new AnonymousClass02R(networkOperator, simOperator))) {
                    return 2;
                }
            }
            return 3;
        }
        return 2;
    }

    public NetworkInfo A04() {
        ConnectivityManager A0A = this.A00.A0A();
        if (A0A != null) {
            return A0A.getActiveNetworkInfo();
        }
        Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
        return null;
    }

    public boolean A05() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager A0A = this.A00.A0A();
        if (A0A == null || (activeNetworkInfo = A0A.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        ConnectivityManager A0A = this.A00.A0A();
        if (A0A == null) {
            Log.w("NetworkStateManager/isDataSaverOn cm=null");
            return false;
        } else if (!A0A.isActiveNetworkMetered()) {
            return false;
        } else {
            A0A.getRestrictBackgroundStatus();
            if (A0A.getRestrictBackgroundStatus() == 3) {
                return true;
            }
            return false;
        }
    }
}

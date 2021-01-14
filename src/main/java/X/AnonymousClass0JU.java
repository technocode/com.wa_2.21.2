package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.0JU  reason: invalid class name */
public final class AnonymousClass0JU extends BroadcastReceiver {
    public static AnonymousClass0JU A00 = new AnonymousClass0JU();
    public static boolean A01;
    public static final AnonymousClass0IY A02 = AnonymousClass0IY.A00();

    public static boolean A00(AnonymousClass03P r2) {
        PowerManager A0C = r2.A0C();
        KeyguardManager A03 = r2.A03();
        if (A0C == null || !A0C.isScreenOn()) {
            return false;
        }
        return "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) || !A03.isKeyguardLocked() || !A03.inKeyguardRestrictedInputMode();
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        AnonymousClass03P A002 = AnonymousClass03P.A00();
        boolean z = A01;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode != -1454123155) {
                    if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                        str = "unlock";
                        boolean z2 = !A00(A002);
                        A01 = z2;
                        StringBuilder A0Z = AnonymousClass008.A0Z("ScreenLockReceiver; tag=", str, "; locked=");
                        A0Z.append(z2);
                        A0Z.append("; oldLocked=");
                        A0Z.append(z);
                        Log.i(A0Z.toString());
                        A02.A02(A01);
                    }
                } else if (action.equals("android.intent.action.SCREEN_ON")) {
                    str = "on";
                    boolean z22 = !A00(A002);
                    A01 = z22;
                    StringBuilder A0Z2 = AnonymousClass008.A0Z("ScreenLockReceiver; tag=", str, "; locked=");
                    A0Z2.append(z22);
                    A0Z2.append("; oldLocked=");
                    A0Z2.append(z);
                    Log.i(A0Z2.toString());
                    A02.A02(A01);
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                str = "off";
                boolean z222 = !A00(A002);
                A01 = z222;
                StringBuilder A0Z22 = AnonymousClass008.A0Z("ScreenLockReceiver; tag=", str, "; locked=");
                A0Z22.append(z222);
                A0Z22.append("; oldLocked=");
                A0Z22.append(z);
                Log.i(A0Z22.toString());
                A02.A02(A01);
            }
        }
        str = "unknown";
        boolean z2222 = !A00(A002);
        A01 = z2222;
        StringBuilder A0Z222 = AnonymousClass008.A0Z("ScreenLockReceiver; tag=", str, "; locked=");
        A0Z222.append(z2222);
        A0Z222.append("; oldLocked=");
        A0Z222.append(z);
        Log.i(A0Z222.toString());
        A02.A02(A01);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ScreenLockReceiver{locked=");
        A0S.append(A01);
        A0S.append('}');
        return A0S.toString();
    }
}

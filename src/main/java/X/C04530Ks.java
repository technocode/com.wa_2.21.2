package X;

import android.content.SharedPreferences;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ks  reason: invalid class name and case insensitive filesystem */
public class C04530Ks {
    public static final int A06 = 5;
    public static final long A07 = TimeUnit.SECONDS.toMillis(35);
    public static final long[] A08 = {TimeUnit.HOURS.toMillis(6), TimeUnit.HOURS.toMillis(12), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(3), TimeUnit.DAYS.toMillis(7)};
    public static volatile C04530Ks A09;
    public final SharedPreferences A00;
    public final AnonymousClass01J A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass0AR A04;
    public final List A05 = new LinkedList();

    public C04530Ks(AnonymousClass00S r2, AnonymousClass0AR r3, AnonymousClass01J r4, AnonymousClass04j r5, AnonymousClass022 r6) {
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r6.A01(AnonymousClass020.A02);
    }

    public static C04530Ks A00() {
        if (A09 == null) {
            synchronized (C04530Ks.class) {
                if (A09 == null) {
                    A09 = new C04530Ks(AnonymousClass00S.A00(), AnonymousClass0AR.A00(), AnonymousClass01J.A00(), AnonymousClass04j.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A09;
    }

    public void A01(String str, String str2) {
        if (!this.A02.A05()) {
            Log.i("twofactorauthmanager/set-two-factor-auth-settings no internet connection, cancelling");
            for (AnonymousClass0Z2 r0 : this.A05) {
                r0.ALK();
            }
            return;
        }
        StringBuilder sb = new StringBuilder("twofactorauthmanager/set-two-factor-auth-settings code [");
        sb.append(str);
        sb.append("] email [");
        sb.append(str2);
        sb.append("]");
        Log.d(sb.toString());
        AnonymousClass0AR r1 = this.A04;
        if (r1.A04.A06) {
            Log.i("sendmethods/send-set-two-factor-auth");
            AnonymousClass09H r3 = r1.A08;
            Message obtain = Message.obtain(null, 0, 111, 0);
            obtain.getData().putString("code", str);
            obtain.getData().putString("email", str2);
            r3.A09(obtain);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r11.isEmpty() != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r11, java.lang.String r12, int r13) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04530Ks.A02(java.lang.String, java.lang.String, int):void");
    }

    public void A03(boolean z) {
        int max;
        SharedPreferences sharedPreferences = this.A00;
        int i = sharedPreferences.getInt("two_factor_auth_nag_interval", 0);
        if (z) {
            max = Math.min(i + 1, 5);
        } else {
            max = Math.max(i - 1, 0);
        }
        sharedPreferences.edit().putLong("two_factor_auth_nag_time", this.A03.A05()).putInt("two_factor_auth_nag_interval", max).putBoolean("two_factor_auth_last_code_correctness", z).apply();
    }
}

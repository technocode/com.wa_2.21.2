package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.03B  reason: invalid class name */
public class AnonymousClass03B {
    public static volatile AnonymousClass03B A05;
    public Date A00;
    public boolean A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass03C A03;
    public final AnonymousClass00D A04;

    public AnonymousClass03B(AnonymousClass01I r1, AnonymousClass00D r2, AnonymousClass03C r3) {
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
    }

    public static AnonymousClass03B A00() {
        if (A05 == null) {
            synchronized (AnonymousClass03B.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass03B(AnonymousClass01I.A00(), AnonymousClass00D.A00(), AnonymousClass03C.A00());
                }
            }
        }
        return A05;
    }

    public static boolean A01() {
        return "chromium".equals(Build.MANUFACTURER) && "chromium".equals(Build.BRAND);
    }

    public Date A02() {
        SharedPreferences sharedPreferences = this.A04.A00;
        long j = sharedPreferences.getLong("software_forced_expiration", 0);
        if (j > 0) {
            return new Date(j);
        }
        long j2 = sharedPreferences.getLong("client_expiration_time", 0);
        if (j2 > 0) {
            return new Date(j2);
        }
        AnonymousClass01I r0 = this.A02;
        r0.A04();
        Me me = r0.A00;
        int i = -1;
        if (me != null) {
            try {
                if (!TextUtils.isEmpty(me.number)) {
                    i = (int) (Long.valueOf(me.number).longValue() % 14);
                }
            } catch (NumberFormatException e) {
                StringBuilder A0S = AnonymousClass008.A0S("number format not valid: ");
                A0S.append(me.number);
                Log.w(A0S.toString(), e);
            }
        }
        Date date = new Date(1614443627000L);
        StringBuilder sb = new StringBuilder("software/expiration/date ");
        sb.append(date);
        sb.append(" bucket: ");
        sb.append(i);
        sb.append(" number: ");
        AnonymousClass008.A1S(sb, me != null ? me.number : null);
        return date;
    }

    public boolean A03() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A02());
        this.A01 = after;
        return after;
    }

    public boolean A04() {
        if (this.A00 != null) {
            return true;
        }
        Date date = new Date();
        if (date.before(new Date(1610382827000L))) {
            this.A00 = date;
            return true;
        }
        boolean after = date.after(new Date(A02().getTime() + 31536000000L));
        if (after) {
            this.A00 = date;
        }
        return after;
    }
}

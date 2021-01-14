package X;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.0XP  reason: invalid class name */
public class AnonymousClass0XP {
    public static final int[] A03 = {1, 2, 3};
    public static volatile AnonymousClass0XP A04;
    public final AnonymousClass00S A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass01X A02;

    public AnonymousClass0XP(AnonymousClass00S r1, AnonymousClass01X r2, AnonymousClass00D r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static int A00(long j, Date date) {
        long time = date.getTime() - j;
        StringBuilder sb = new StringBuilder("software/expiration/ms ");
        sb.append(time);
        Log.d(sb.toString());
        int i = ((int) (time / 86400000)) + 1;
        AnonymousClass008.A0t("software/expiration/days ", i);
        return i;
    }

    public static AnonymousClass0XP A01() {
        if (A04 == null) {
            synchronized (AnonymousClass0XP.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0XP(AnonymousClass00S.A00(), AnonymousClass01X.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A04;
    }

    public int A02(AnonymousClass03B r12) {
        AnonymousClass00D r10 = this.A01;
        long j = r10.A00.getLong("software_expiration_last_warned", 0);
        long A05 = this.A00.A05();
        if (86400000 + j > A05) {
            Log.i("software/expiration/suppress/24h");
            return -1;
        }
        Date A022 = r12.A02();
        int A002 = A00(A05, A022);
        int A003 = A00(j, A022);
        int[] iArr = A03;
        for (int i : iArr) {
            if (A002 <= i && A003 > i) {
                AnonymousClass008.A0l(r10, "software_expiration_last_warned", A05);
                return A002;
            }
        }
        return -1;
    }

    public Dialog A03(Activity activity, AnonymousClass0GZ r11, AnonymousClass03B r12) {
        int A002 = A00(this.A00.A05(), r12.A02());
        AnonymousClass0MB r5 = new AnonymousClass0MB(activity);
        AnonymousClass01X r6 = this.A02;
        String A06 = r6.A06(R.string.software_about_to_expire_title);
        AnonymousClass0MC r8 = r5.A01;
        r8.A0I = A06;
        r8.A0E = r6.A0A(R.plurals.software_about_to_expire, (long) A002, Integer.valueOf(A002));
        r5.A07(r6.A06(R.string.upgrade), new AnonymousClass1JW(activity, r11));
        r5.A05(r6.A06(R.string.cancel), new AnonymousClass1JV(activity));
        return r5.A00();
    }
}

package X;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: X.1S6  reason: invalid class name */
public class AnonymousClass1S6 {
    public static final BigDecimal A0A = new BigDecimal("1000");
    public static volatile AnonymousClass1S6 A0B;
    public final AnonymousClass088 A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final C04360Kb A03;
    public final C27831Rq A04;
    public final AnonymousClass03S A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass3Ot A08;
    public final AnonymousClass00T A09;

    public AnonymousClass1S6(AnonymousClass02M r1, AnonymousClass01I r2, AnonymousClass00T r3, AnonymousClass088 r4, C04360Kb r5, AnonymousClass3Ot r6, AnonymousClass01X r7, AnonymousClass01K r8, AnonymousClass03S r9, C27831Rq r10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A09 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A08 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r9;
        this.A04 = r10;
    }

    public static AnonymousClass1S6 A00() {
        if (A0B == null) {
            synchronized (AnonymousClass1S6.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass1S6(AnonymousClass02M.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass088.A00(), C04360Kb.A00(), AnonymousClass3Ot.A00(), AnonymousClass01X.A00(), AnonymousClass01K.A00(), AnonymousClass03S.A00(), C27831Rq.A00());
                }
            }
        }
        return A0B;
    }

    public static String A01(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        return sb.toString();
    }

    public static BigDecimal A02(C05910Qz r3, long j) {
        int i = 0;
        while (true) {
            String str = r3.A00;
            if (i >= 3 - C05910Qz.A00(str)) {
                return new BigDecimal(new BigInteger(Long.toString(j)), C05910Qz.A00(str));
            }
            j /= 10;
            i++;
        }
    }

    public static boolean A03(C48052Ks r2) {
        boolean z = false;
        if (r2.A02.A00 == 0) {
            z = true;
        }
        return z && !r2.A00();
    }

    public String A04(AnonymousClass0Z9 r5) {
        if (r5.A08 == null || TextUtils.isEmpty(r5.A02)) {
            return r5.A03;
        }
        return new C05910Qz(r5.A02).A03(this.A06, r5.A08, true);
    }

    public void A05(ActivityC004702f r25, AnonymousClass1S0 r26, UserJid userJid, int i, List list, AnonymousClass02N r30, long j, int i2) {
        if (list != null && list.size() != 0 && i2 < list.size()) {
            int i3 = 44;
            if (i != 1) {
                i3 = 55;
                if (i != 2) {
                    i3 = 66;
                    if (i != 3) {
                        i3 = 0;
                    }
                }
            }
            if (!this.A05.A06()) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = R.string.permission_storage_need_write_access_on_sending_product_v30;
                if (i4 < 30) {
                    i5 = R.string.permission_storage_need_write_access_on_sending_product;
                }
                RequestPermissionActivity.A0B(r25, R.string.permission_storage_need_write_access_on_sending_product_request, i5, false, i3);
                return;
            }
            C48052Ks r13 = (C48052Ks) list.get(i2);
            if (r13.A00) {
                AnonymousClass01I r0 = this.A02;
                r0.A04();
                if (userJid.equals(r0.A03)) {
                    C27831Rq r5 = this.A04;
                    String str = r13.A06;
                    AnonymousClass00Z r4 = r5.A06;
                    if (r4.A01(r5.A00)) {
                        C44141zZ r2 = new C44141zZ();
                        r2.A00 = 34;
                        r2.A03 = r5.A00;
                        r2.A05 = str;
                        r5.A05(r2);
                        r5.A05.A08(r2, r4.A00);
                    }
                }
                r26.A02((C48072Ku) r13.A0A.get(0), 3, new C42191wI(this, i2, list, r25, i, r30, r13, userJid, j, r26), new C42171wG(this, list, i2, r25), new C42181wH(r25), null);
            }
        }
    }
}

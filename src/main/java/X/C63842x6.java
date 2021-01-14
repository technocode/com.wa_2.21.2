package X;

import android.text.TextUtils;

/* renamed from: X.2x6  reason: invalid class name and case insensitive filesystem */
public class C63842x6 {
    public static volatile C63842x6 A05;
    public C68743Ej A00 = null;
    public final AnonymousClass00G A01;
    public final C02010Ah A02;
    public final C02020Ai A03;
    public final C01970Ad A04;

    public C63842x6(AnonymousClass00G r2, C01970Ad r3, C02010Ah r4, C02020Ai r5) {
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static C63842x6 A00() {
        if (A05 == null) {
            synchronized (C63842x6.class) {
                if (A05 == null) {
                    A05 = new C63842x6(AnonymousClass00G.A01, C01970Ad.A00(), C02010Ah.A00(), C02020Ai.A00());
                }
            }
        }
        return A05;
    }

    public final C68743Ej A01() {
        AnonymousClass1X1 r1;
        String str;
        AbstractC07650Yy A8I;
        C02020Ai r2 = this.A03;
        if (r2.A02() != null) {
            r1 = this.A04.A02(r2.A02().A02);
        } else {
            r1 = null;
        }
        AbstractC05890Qx A012 = r2.A01();
        if (A012 != null) {
            str = A012.A5e();
        } else {
            str = null;
        }
        if (r1 == null || (A8I = r1.A8I(str)) == null) {
            return null;
        }
        return A8I.A85(this.A01, this.A02);
    }

    public String A02() {
        C68743Ej r2 = this.A00;
        if (r2 == null) {
            r2 = A01();
            this.A00 = r2;
        }
        String str = null;
        if (r2 != null) {
            str = r2.A01.A01().getString("payments_device_id", null);
            if (!TextUtils.isEmpty(str)) {
                C018809u r22 = r2.A02;
                StringBuilder sb = new StringBuilder("PaymentDeviceId: from cache: ");
                sb.append(str);
                r22.A03(sb.toString());
            } else {
                String A012 = r2.A01();
                AnonymousClass008.A0q(r2.A01, "payments_device_id", A012);
                C018809u r23 = r2.A02;
                StringBuilder sb2 = new StringBuilder("PaymentDeviceId: generated: ");
                sb2.append(A012);
                r23.A03(sb2.toString());
                return A012;
            }
        }
        return str;
    }
}

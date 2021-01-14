package X;

import com.google.android.search.verification.client.R;
import java.math.BigDecimal;

/* renamed from: X.3IS  reason: invalid class name */
public class AnonymousClass3IS implements AbstractC63782x0 {
    public final AnonymousClass01X A00;
    public final AbstractC05890Qx A01;
    public final C05900Qy A02;
    public final C05900Qy A03;
    public final C05900Qy A04;

    public AnonymousClass3IS(AbstractC05890Qx r1, AnonymousClass01X r2, C05900Qy r3, C05900Qy r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r3;
    }

    public AnonymousClass3IS(AbstractC05890Qx r1, AnonymousClass01X r2, C05900Qy r3, C05900Qy r4, C05900Qy r5) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final C63772wz A00(int i, BigDecimal bigDecimal, String str, boolean z) {
        BigDecimal bigDecimal2;
        if (i == 0) {
            bigDecimal2 = this.A02.A00;
        } else {
            bigDecimal2 = this.A03.A00;
        }
        if (bigDecimal.compareTo(bigDecimal2) <= 0 && (bigDecimal.compareTo(bigDecimal2) != 0 || !str.endsWith(".") || z)) {
            return new C63772wz(0, "");
        }
        AnonymousClass01X r3 = this.A00;
        return new C63772wz(3, r3.A0D(R.string.payments_send_payment_max_amount, this.A01.A4S(r3, bigDecimal2)));
    }
}

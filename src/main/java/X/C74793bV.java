package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import java.math.BigDecimal;

/* renamed from: X.3bV  reason: invalid class name and case insensitive filesystem */
public class C74793bV extends AnonymousClass3Y6 {
    public static volatile C74793bV A0C;
    public AbstractC61782tj A00 = new AnonymousClass3F4();
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final C000300f A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01X A05;
    public final C68433De A06;
    public final C01980Ae A07;
    public final C02060Am A08;
    public final C02040Ak A09;
    public final C62942vb A0A;
    public final C62952vc A0B;

    @Override // X.AbstractC07650Yy
    public String A84() {
        return null;
    }

    @Override // X.AbstractC07650Yy
    public int A92() {
        return 2;
    }

    @Override // X.AbstractC07650Yy
    public boolean AAx() {
        return true;
    }

    @Override // X.AbstractC07650Yy
    public boolean ABh(C61642tV r2) {
        return true;
    }

    public C74793bV(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass01I r4, C000300f r5, AnonymousClass01X r6, C01970Ad r7, C01980Ae r8, C62942vb r9, C02040Ak r10, C68433De r11, C62952vc r12, C02060Am r13) {
        super(r7);
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A0A = r9;
        this.A09 = r10;
        this.A06 = r11;
        this.A0B = r12;
        this.A08 = r13;
    }

    @Override // X.AbstractC07650Yy
    public Class A4e() {
        return BrazilPaymentCardDetailsActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC29071Wx A5W() {
        if (AnonymousClass3DO.A02 == null) {
            synchronized (AnonymousClass3DO.class) {
                if (AnonymousClass3DO.A02 == null) {
                    AnonymousClass3DO.A02 = new AnonymousClass3DO(C02010Ah.A00(), C01980Ae.A00());
                }
            }
        }
        return AnonymousClass3DO.A02;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC29081Wy A5Y() {
        return new AnonymousClass3DQ(this.A05, this.A09);
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass2LO A5Z() {
        return new AnonymousClass3DR(this.A04, this.A01, super.A00, this.A07, this.A0A, this.A06, this.A08);
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61782tj A6O() {
        return this.A00;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61142sZ A7y() {
        return new AnonymousClass3DS();
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61042sP A83() {
        return new AnonymousClass3DP();
    }

    @Override // X.AbstractC07650Yy
    public C68743Ej A85(AnonymousClass00G r2, C02010Ah r3) {
        return new AnonymousClass3Y8(r2, r3);
    }

    @Override // X.AbstractC07650Yy
    public int A86() {
        return R.string.brazil_ecosystem_name;
    }

    @Override // X.AbstractC07650Yy
    public C68753Ek A88() {
        return new AnonymousClass3Y7();
    }

    @Override // X.AbstractC07650Yy
    public C61052sQ A8D() {
        return new AnonymousClass3GU(this.A02, this.A05, super.A00);
    }

    @Override // X.AbstractC07650Yy
    public Class A8J() {
        return BrazilPaymentSettingsActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public Class A8K() {
        return BrazilPaymentTransactionDetailActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public Class A8z() {
        this.A09.A01();
        return BrazilPaymentActivity.class;
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass27v AAZ() {
        return new C74713bN();
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass0RK AAb() {
        return new AnonymousClass3Y2();
    }

    @Override // X.AnonymousClass0RJ
    public AbstractC43791yx AAd() {
        return new AnonymousClass3Y3();
    }

    @Override // X.AbstractC07650Yy
    public void APV(C02020Ai r5) {
        C05870Qv A022 = r5.A02();
        if (A022 != null) {
            String str = A022.A02;
            AbstractC05890Qx r3 = C05870Qv.A00(str).A09;
            if (str.equals(C05870Qv.A0D.A02) && r3.A5e().equalsIgnoreCase(C05880Qw.A00.A5e())) {
                r3.AOW(new C05900Qy(new BigDecimal(this.A03.A06(AbstractC000400g.A3k)), r3.A5z()));
            }
        }
    }
}

package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import java.math.BigDecimal;

/* renamed from: X.3bW  reason: invalid class name and case insensitive filesystem */
public class C74803bW extends AnonymousClass3Y6 {
    public static volatile C74803bW A0L;
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01X A05;
    public final C018609s A06;
    public final C449222e A07;
    public final C60922sD A08;
    public final C68393Da A09;
    public final C01980Ae A0A;
    public final AnonymousClass0GP A0B;
    public final C61112sW A0C;
    public final AnonymousClass0AD A0D;
    public final C03340Fu A0E;
    public final C68683Ed A0F;
    public final C69293Gm A0G;
    public final AnonymousClass1X6 A0H;
    public final C63842x6 A0I;
    public final C02150Av A0J;
    public final AnonymousClass00T A0K;

    @Override // X.AbstractC07650Yy
    public String A84() {
        return null;
    }

    @Override // X.AbstractC07650Yy
    public C61052sQ A8D() {
        return null;
    }

    @Override // X.AbstractC07650Yy
    public int A92() {
        return 1;
    }

    @Override // X.AbstractC07650Yy
    public boolean AAx() {
        return true;
    }

    @Override // X.AbstractC07650Yy
    public boolean ABh(C61642tV r2) {
        return true;
    }

    public C74803bW(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass00G r4, AnonymousClass00T r5, C000300f r6, C02150Av r7, AnonymousClass01X r8, C63842x6 r9, C01970Ad r10, AnonymousClass1X6 r11, C69293Gm r12, AnonymousClass04j r13, C01980Ae r14, C60922sD r15, C03340Fu r16, C018609s r17, C449222e r18, C68683Ed r19, AnonymousClass0GP r20, C68393Da r21, C61112sW r22, AnonymousClass0AD r23) {
        super(r10);
        this.A03 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A0K = r5;
        this.A01 = r6;
        this.A0J = r7;
        this.A05 = r8;
        this.A0I = r9;
        this.A0H = r11;
        this.A0G = r12;
        this.A02 = r13;
        this.A0A = r14;
        this.A08 = r15;
        this.A0E = r16;
        this.A06 = r17;
        this.A07 = r18;
        this.A0F = r19;
        this.A0B = r20;
        this.A09 = r21;
        this.A0C = r22;
        this.A0D = r23;
    }

    @Override // X.AbstractC07650Yy
    public Class A4e() {
        return IndiaUpiBankAccountDetailsActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC29071Wx A5W() {
        return this.A09;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC29081Wy A5Y() {
        return this.A0G;
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass2LO A5Z() {
        return new C68413Dc(this.A04, super.A00, this.A0A, this.A09);
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61782tj A6O() {
        return this.A0F;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61142sZ A7y() {
        return new AnonymousClass3DU();
    }

    @Override // X.AbstractC07650Yy
    public AbstractC61042sP A83() {
        return new AnonymousClass3DV(this.A00, this.A04, this.A0K, this.A0I, super.A00, this.A02, this.A08, this.A0E, this.A06, this.A07, this.A0B);
    }

    @Override // X.AbstractC07650Yy
    public C68743Ej A85(AnonymousClass00G r2, C02010Ah r3) {
        return new AnonymousClass3YA(r2, r3);
    }

    @Override // X.AbstractC07650Yy
    public int A86() {
        return R.string.india_upi_short_name;
    }

    @Override // X.AbstractC07650Yy
    public C68753Ek A88() {
        return new AnonymousClass3Y9();
    }

    @Override // X.AbstractC07650Yy
    public Class A8J() {
        return IndiaUpiPaymentSettingsActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public Class A8K() {
        return IndiaUpiPaymentTransactionDetailsActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public Class A8z() {
        return IndiaUpiPaymentActivity.class;
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass27v AAZ() {
        return new C74463ay();
    }

    @Override // X.AnonymousClass0RJ
    public AnonymousClass0RK AAb() {
        return new AnonymousClass0RM();
    }

    @Override // X.AnonymousClass0RJ
    public AbstractC43791yx AAd() {
        return new AnonymousClass3XM();
    }

    @Override // X.AbstractC07650Yy
    public void APV(C02020Ai r5) {
        C05870Qv A022 = r5.A02();
        if (A022 != null) {
            String str = A022.A02;
            AbstractC05890Qx r3 = C05870Qv.A00(str).A09;
            if (str.equals(C05870Qv.A0E.A02) && r3.A5e().equals(C05880Qw.A01.A5e())) {
                r3.AOW(new C05900Qy(new BigDecimal(this.A01.A06(AbstractC000400g.A3n)), r3.A5z()));
            }
        }
    }
}

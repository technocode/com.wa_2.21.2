package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3YC  reason: invalid class name */
public class AnonymousClass3YC extends AbstractC41241ui {
    public String A00;
    public final ActivityC004702f A01;
    public final FingerprintBottomSheet A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final AbstractC61552tM A05;
    public final C61942tz A06;
    public final C69203Gd A07;

    public AnonymousClass3YC(AnonymousClass00S r1, AnonymousClass01X r2, C61942tz r3, ActivityC004702f r4, AbstractC61552tM r5, FingerprintBottomSheet fingerprintBottomSheet, C69203Gd r7) {
        this.A03 = r1;
        this.A04 = r2;
        this.A06 = r3;
        this.A01 = r4;
        this.A05 = r5;
        this.A02 = fingerprintBottomSheet;
        this.A07 = r7;
    }

    @Override // X.AnonymousClass1Pz
    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A0v(true);
        String str = this.A00;
        if (str != null) {
            C69203Gd r0 = this.A07;
            BrazilPaymentActivity.A08(r0.A03, r0.A04, r0.A01, r0.A02, str, r0.A05);
        }
        fingerprintBottomSheet.A0r();
    }
}

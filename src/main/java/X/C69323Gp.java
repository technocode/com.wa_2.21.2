package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3Gp  reason: invalid class name and case insensitive filesystem */
public class C69323Gp implements AbstractC61382t5 {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public C69323Gp(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r2) {
        this.A00.A0j();
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r5) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        if (!C69293Gm.A02(indiaUpiPaymentActivity, "upi-get-vpa", r5.code, false)) {
            indiaUpiPaymentActivity.A0W.A07(null, "could not get account vpa: showErrorAndFinish", null);
            indiaUpiPaymentActivity.A0i();
        }
    }
}

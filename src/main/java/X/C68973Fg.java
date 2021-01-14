package X;

import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.3Fg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68973Fg implements AnonymousClass0SG {
    public final /* synthetic */ IndiaUpiMandatePaymentActivity A00;

    public /* synthetic */ C68973Fg(IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity) {
        this.A00 = indiaUpiMandatePaymentActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = this.A00;
        C63322wE r12 = (C63322wE) obj;
        int i = r12.A00;
        if (i == 0) {
            ((AnonymousClass1DU) indiaUpiMandatePaymentActivity).A03.A02("upi-get-credential");
            indiaUpiMandatePaymentActivity.A0k(r12.A07, r12.A06, r12.A01, r12.A03, r12.A02, r12.A09, r12.A08, null);
        } else if (i == 1) {
            indiaUpiMandatePaymentActivity.overridePendingTransition(0, 0);
            indiaUpiMandatePaymentActivity.finish();
        } else if (i == 2) {
            indiaUpiMandatePaymentActivity.A0i();
        } else if (i == 3) {
            indiaUpiMandatePaymentActivity.A0N(r12.A05, r12.A04);
        }
    }
}

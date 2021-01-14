package X;

import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;

/* renamed from: X.3IH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IH implements AbstractC61022sN {
    public final /* synthetic */ C60892sA A00;
    public final /* synthetic */ MandatePaymentBottomSheetFragment A01;

    public /* synthetic */ AnonymousClass3IH(MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment, C60892sA r2) {
        this.A01 = mandatePaymentBottomSheetFragment;
        this.A00 = r2;
    }

    @Override // X.AbstractC61022sN
    public final void AJE(C61072sS r5) {
        MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = this.A01;
        C60892sA r1 = this.A00;
        mandatePaymentBottomSheetFragment.A0F.A02();
        if (r5 == null) {
            r1.A04 = "REJECT";
            r1.A06 = "SUCCESS";
            mandatePaymentBottomSheetFragment.A0P.ANF(new RunnableEBaseShape11S0100000_I1_6(mandatePaymentBottomSheetFragment, 44));
            ((ActivityC004702f) mandatePaymentBottomSheetFragment.A0A()).A0J("MandatePaymentBottomSheetFragment");
        }
    }
}

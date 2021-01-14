package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.0e2  reason: invalid class name and case insensitive filesystem */
public class C10100e2 extends AnonymousClass0JW {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public C10100e2(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity;
        AnonymousClass0RM r3 = (AnonymousClass0RM) obj;
        if (r3 != null) {
            indiaUpiPaymentActivity = this.A00;
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A07 = r3.A01;
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A08 = r3.A02;
        } else {
            indiaUpiPaymentActivity = this.A00;
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A07 = null;
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A08 = null;
        }
        indiaUpiPaymentActivity.A0s();
    }
}

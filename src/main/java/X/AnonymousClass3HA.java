package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3HA  reason: invalid class name */
public class AnonymousClass3HA implements AnonymousClass0GT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC61782tj A01;
    public final /* synthetic */ AbstractView$OnClickListenerC32271ec A02;

    public AnonymousClass3HA(AbstractView$OnClickListenerC32271ec r1, AbstractC61782tj r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r5) {
        AbstractView$OnClickListenerC32271ec r3 = this.A02;
        C018809u r2 = r3.A0C;
        StringBuilder sb = new StringBuilder("removePayment/onRequestError. paymentNetworkError: ");
        sb.append(r5);
        r2.A03(sb.toString());
        AbstractC61782tj r1 = this.A01;
        if (r1 != null) {
            r1.ABo(this.A00, r5);
        }
        r3.A0K.A00();
        r3.APo(R.string.payment_method_cannot_be_removed);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r5) {
        AbstractView$OnClickListenerC32271ec r3 = this.A02;
        C018809u r2 = r3.A0C;
        StringBuilder sb = new StringBuilder("removePayment/onResponseError. paymentNetworkError: ");
        sb.append(r5);
        r2.A07(null, sb.toString(), null);
        AbstractC61782tj r1 = this.A01;
        if (r1 != null) {
            r1.ABo(this.A00, r5);
        }
        r3.A0K.A00();
        r3.APo(R.string.payment_method_cannot_be_removed);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r5) {
        AbstractView$OnClickListenerC32271ec r3 = this.A02;
        r3.A0C.A07(null, "removePayment Success", null);
        AbstractC61782tj r1 = this.A01;
        if (r1 != null) {
            r1.ABo(this.A00, null);
        }
        r3.A0K.A00();
        r3.APo(R.string.payment_method_is_removed);
    }
}

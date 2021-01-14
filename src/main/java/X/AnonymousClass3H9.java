package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3H9  reason: invalid class name */
public class AnonymousClass3H9 implements AnonymousClass0GT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC29081Wy A01;
    public final /* synthetic */ AbstractC61782tj A02;
    public final /* synthetic */ AbstractView$OnClickListenerC32271ec A03;

    public AnonymousClass3H9(AbstractView$OnClickListenerC32271ec r1, AbstractC61782tj r2, int i, AbstractC29081Wy r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r4;
    }

    public final void A00(C61072sS r5) {
        int i;
        AbstractC61782tj r1 = this.A02;
        if (r1 != null) {
            r1.ABo(this.A00, r5);
        }
        AbstractView$OnClickListenerC32271ec r3 = this.A03;
        r3.A0K.A00();
        if (r5 != null) {
            AbstractC29081Wy r2 = this.A01;
            if (r2 == null || (i = r2.A6F(r5.code, null)) == 0) {
                i = R.string.payment_method_cannot_be_set_default;
            }
            r3.APo(i);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C018809u r2 = this.A03.A0C;
        StringBuilder sb = new StringBuilder("setDefault/onRequestError. paymentNetworkError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        A00(r4);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C018809u r2 = this.A03.A0C;
        StringBuilder sb = new StringBuilder("setDefault/onResponseError. paymentNetworkError: ");
        sb.append(r4);
        r2.A03(sb.toString());
        A00(r4);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r6) {
        AbstractView$OnClickListenerC32271ec r4 = this.A03;
        r4.A0C.A07(null, "setDefault Success", null);
        AbstractC61782tj r1 = this.A02;
        if (r1 != null) {
            r1.ABo(this.A00, null);
        }
        r4.A02.setImageResource(R.drawable.ic_settings_starred);
        r4.A04.setText(((AnonymousClass2C0) r4).A01.A06(R.string.default_payment_method_set));
        r4.A01.setOnClickListener(null);
        r4.A0K.A00();
        r4.APo(R.string.payment_method_set_as_default);
    }
}

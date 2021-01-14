package X;

import com.whatsapp.util.Log;

/* renamed from: X.3EG  reason: invalid class name */
public class AnonymousClass3EG implements AbstractC61382t5 {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ AnonymousClass3EI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04 = true;

    public AnonymousClass3EG(AnonymousClass3EI r2, String str, String str2, AnonymousClass0GT r5) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r5;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r8) {
        this.A01.A01(r8.A01, r8.A02, this.A03, this.A02, this.A04, this.A00);
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to set default payment method");
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r2);
        }
    }
}

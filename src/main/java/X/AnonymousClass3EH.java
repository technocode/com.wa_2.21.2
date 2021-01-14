package X;

import com.whatsapp.util.Log;

/* renamed from: X.3EH  reason: invalid class name */
public class AnonymousClass3EH implements AbstractC61382t5 {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ AnonymousClass3EI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass3EH(AnonymousClass3EI r1, String str, String str2, AnonymousClass0GT r4) {
        this.A01 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r4;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r7) {
        this.A01.A00(r7.A01, r7.A02, this.A03, this.A02, this.A00);
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method");
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r2);
        }
    }
}

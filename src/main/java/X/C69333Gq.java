package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public class C69333Gq implements AbstractC61382t5 {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ C10100e2 A01;

    public C69333Gq(C10100e2 r1, UserJid userJid) {
        this.A01 = r1;
        this.A00 = userJid;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r5) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A01.A00;
        indiaUpiPaymentActivity.A0H = false;
        ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
        if (!indiaUpiPaymentActivity.A0y(r5)) {
            C018809u r2 = indiaUpiPaymentActivity.A0W;
            StringBuilder A0S = AnonymousClass008.A0S("starting onContactVpa for jid: ");
            A0S.append(this.A00);
            A0S.append(" vpa: ");
            A0S.append(C28051Sr.A17(r5.A01));
            A0S.append(" receiverVpaId: ");
            A0S.append(r5.A02);
            r2.A07(null, A0S.toString(), null);
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A07 = r5.A01;
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A08 = r5.A02;
            indiaUpiPaymentActivity.A0s();
        }
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r5) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A01.A00;
        indiaUpiPaymentActivity.A0H = false;
        ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
        if (!C69293Gm.A02(indiaUpiPaymentActivity, "upi-get-vpa", r5.code, false)) {
            C018809u r2 = indiaUpiPaymentActivity.A0W;
            StringBuilder A0S = AnonymousClass008.A0S("could not get vpa for jid: ");
            A0S.append(this.A00);
            A0S.append("; showErrorAndFinish");
            r2.A07(null, A0S.toString(), null);
            indiaUpiPaymentActivity.A0i();
        }
    }
}

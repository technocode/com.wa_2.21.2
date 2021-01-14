package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3ED  reason: invalid class name */
public class AnonymousClass3ED implements AbstractC61382t5 {
    public final /* synthetic */ C74463ay A00;
    public final /* synthetic */ AbstractC61442tB A01;
    public final /* synthetic */ AnonymousClass3EE A02;

    public AnonymousClass3ED(AnonymousClass3EE r1, C74463ay r2, AbstractC61442tB r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r6) {
        this.A02.A01(r6.A01, r6.A02, this.A00, this.A01);
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
        AbstractC61442tB r0 = this.A01;
        if (r0 != null) {
            ((IndiaUpiResetPinActivity) r0).A0o(r2);
        }
    }
}

package X;

import com.whatsapp.util.Log;

/* renamed from: X.3E4  reason: invalid class name */
public class AnonymousClass3E4 implements AbstractC61562tN {
    public final /* synthetic */ AbstractC61332t0 A00;

    public AnonymousClass3E4(AbstractC61332t0 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC61562tN
    public void AFb(C61072sS r4) {
        Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
        this.A00.A01(null, new C61072sS());
    }

    @Override // X.AbstractC61562tN
    public void AJa(C68653Ea r3) {
        this.A00.A01(r3, null);
    }
}

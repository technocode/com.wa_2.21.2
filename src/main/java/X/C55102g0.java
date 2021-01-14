package X;

import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2g0  reason: invalid class name and case insensitive filesystem */
public class C55102g0 implements AbstractC64792yn {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C55102g0(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    @Override // X.AbstractC64792yn
    public void ADi(int i) {
        Log.e("idverification/cameraerror");
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape1S0101000_I1(this, i, 15));
    }

    @Override // X.AbstractC64792yn
    public void AIo() {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        identityVerificationActivity.A0D = true;
        AnonymousClass02M r2 = ((ActivityC004702f) identityVerificationActivity).A0F;
        r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 21));
    }
}

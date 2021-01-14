package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

/* renamed from: X.1vt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41941vt implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41941vt(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        String str;
        CartFragment cartFragment = this.A00;
        String trim = cartFragment.A09.getStringText().trim();
        cartFragment.A09.setText("");
        C41991vy r3 = cartFragment.A0G;
        ActivityC004802g r7 = (ActivityC004802g) cartFragment.A0B();
        C41831vi r6 = cartFragment.A0F;
        AnonymousClass1S0 r8 = cartFragment.A0H;
        AnonymousClass01P r0 = r3.A0I;
        UserJid userJid = r3.A0J;
        AnonymousClass0J9 A0C = r0.A02.A0C(userJid);
        if (A0C == null || (str = A0C.A08) == null) {
            r3.A0C.A00.A01(new GetVNameCertificateJob(userJid));
            return;
        }
        r3.A02(trim, str, r6, r7, r8);
    }
}

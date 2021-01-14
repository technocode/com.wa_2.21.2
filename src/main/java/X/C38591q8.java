package X;

import com.whatsapp.Conversation;

/* renamed from: X.1q8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38591q8 implements AnonymousClass1Kh {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ C38591q8(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass1Kh
    public final void AJY(C26301Ki r6) {
        Conversation conversation = this.A00;
        C26471Lb r3 = r6.A00;
        if (r3 != null) {
            conversation.A0h();
            AbstractC007503q r1 = r6.A01;
            if (r1 != null) {
                if (!AnonymousClass1VY.A0b(r1.A0n.A00)) {
                    conversation.A1D(r1, false);
                } else {
                    return;
                }
            }
            C27131Oe r2 = conversation.A0l;
            if (r2 != null) {
                r2.A0G(r3.A01, true);
            }
            conversation.A0W.setEnabled(true);
        }
    }
}

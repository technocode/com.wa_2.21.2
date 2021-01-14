package X;

import com.whatsapp.Conversation;

/* renamed from: X.1q5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38561q5 implements AbstractC47552Ik {
    public final /* synthetic */ Conversation A00;
    public final /* synthetic */ C28301Tu A01;
    public final /* synthetic */ AnonymousClass0MP A02;

    public /* synthetic */ C38561q5(Conversation conversation, AnonymousClass0MP r2, C28301Tu r3) {
        this.A00 = conversation;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC47552Ik
    public final void AIU(int i) {
        Conversation conversation = this.A00;
        AnonymousClass0MP r2 = this.A02;
        C28301Tu r1 = this.A01;
        if (conversation.A1R && conversation.A34(r2, i, r1.A0N)) {
            r1.A0M = true;
        }
    }
}

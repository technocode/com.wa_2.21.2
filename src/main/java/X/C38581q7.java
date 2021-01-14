package X;

import com.whatsapp.Conversation;

/* renamed from: X.1q7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38581q7 implements AbstractC49342Qc {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ C38581q7(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AbstractC49342Qc
    public final void ACU(AnonymousClass02N r3) {
        Conversation conversation = this.A00;
        AnonymousClass02N r0 = conversation.A14;
        if (r0 == null) {
            throw null;
        } else if (r0.equals(r3)) {
            conversation.A0n();
            conversation.invalidateOptionsMenu();
        }
    }
}

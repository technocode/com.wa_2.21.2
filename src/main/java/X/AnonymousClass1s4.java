package X;

import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;

/* renamed from: X.1s4  reason: invalid class name */
public class AnonymousClass1s4 implements AbstractC48332Lu {
    public final /* synthetic */ Conversation A00;

    public AnonymousClass1s4(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AbstractC48332Lu
    public void ACd() {
        Conversation conversation = this.A00;
        C007003k r2 = conversation.A0z;
        Jid A02 = r2.A02(AnonymousClass02N.class);
        if (A02 != null) {
            conversation.A15(r2, (AnonymousClass02N) A02, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48332Lu
    public void AEl() {
        Conversation conversation = this.A00;
        C007003k r2 = conversation.A0z;
        Jid A02 = r2.A02(AnonymousClass02N.class);
        if (A02 != null) {
            conversation.A15(r2, (AnonymousClass02N) A02, true);
            return;
        }
        throw null;
    }
}

package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.2at  reason: invalid class name and case insensitive filesystem */
public class C52292at implements AbstractC48332Lu {
    public final /* synthetic */ ConversationsFragment A00;
    public final /* synthetic */ C007003k A01;

    public C52292at(ConversationsFragment conversationsFragment, C007003k r2) {
        this.A00 = conversationsFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC48332Lu
    public void ACd() {
        ConversationsFragment conversationsFragment = this.A00;
        C007003k r2 = this.A01;
        Jid A02 = r2.A02(AnonymousClass02N.class);
        if (A02 != null) {
            ConversationsFragment.A01(conversationsFragment, r2, (AnonymousClass02N) A02, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48332Lu
    public void AEl() {
        ConversationsFragment conversationsFragment = this.A00;
        C007003k r2 = this.A01;
        Jid A02 = r2.A02(AnonymousClass02N.class);
        if (A02 != null) {
            ConversationsFragment.A01(conversationsFragment, r2, (AnonymousClass02N) A02, true);
            return;
        }
        throw null;
    }
}

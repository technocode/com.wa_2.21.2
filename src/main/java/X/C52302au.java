package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Set;

/* renamed from: X.2au  reason: invalid class name and case insensitive filesystem */
public class C52302au implements AnonymousClass35U {
    public final /* synthetic */ AnonymousClass0LW A00;
    public final /* synthetic */ C52312av A01;

    public C52302au(C52312av r1, AnonymousClass0LW r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass35U
    public void A3A() {
        AnonymousClass0LW r3 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0F;
        conversationsFragment.A1u.ANC(new C10710f4(r3, (DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), conversationsFragment.A1R, (Set) conversationsFragment.A0U, true), new Object[0]);
    }

    @Override // X.AnonymousClass35U
    public void AA1(boolean z) {
        AnonymousClass0LW r3 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0F;
        conversationsFragment.A1u.ANC(new C10710f4(r3, new ConversationsFragment.BulkDeleteConversationDialogFragment(), conversationsFragment.A1R, conversationsFragment.A0U, z), new Object[0]);
    }
}

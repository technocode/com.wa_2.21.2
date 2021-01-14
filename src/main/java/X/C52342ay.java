package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.2ay  reason: invalid class name and case insensitive filesystem */
public class C52342ay implements AnonymousClass35S {
    public final /* synthetic */ ConversationsFragment.DeleteContactDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public C52342ay(ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment, C007003k r2) {
        this.A00 = deleteContactDialogFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        this.A00.A0w(false, false);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("conversations/delete-contact");
        ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = this.A00;
        deleteContactDialogFragment.A0w(false, false);
        C007003k r0 = this.A01;
        C28051Sr.A1X((ActivityC004702f) deleteContactDialogFragment.A0A(), Collections.singletonList(r0), z, deleteContactDialogFragment.A07, deleteContactDialogFragment.A00, deleteContactDialogFragment.A03, deleteContactDialogFragment.A05);
    }
}

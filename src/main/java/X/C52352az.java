package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.2az  reason: invalid class name and case insensitive filesystem */
public class C52352az implements AnonymousClass35S {
    public final /* synthetic */ ConversationsFragment.DeleteGroupDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public C52352az(ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment, C007003k r2) {
        this.A00 = deleteGroupDialogFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        this.A00.A0w(false, false);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("conversations/user-deleteGroup");
        ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = this.A00;
        deleteGroupDialogFragment.A0w(false, false);
        C007003k r0 = this.A01;
        C28051Sr.A1X((ActivityC004702f) deleteGroupDialogFragment.A0A(), Collections.singletonList(r0), z, deleteGroupDialogFragment.A08, deleteGroupDialogFragment.A00, deleteGroupDialogFragment.A03, deleteGroupDialogFragment.A05);
    }
}

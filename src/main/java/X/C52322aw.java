package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2aw  reason: invalid class name and case insensitive filesystem */
public class C52322aw implements AnonymousClass35S {
    public final /* synthetic */ ConversationsFragment.BulkDeleteConversationDialogFragment A00;
    public final /* synthetic */ List A01;

    public C52322aw(ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment, List list) {
        this.A00 = bulkDeleteConversationDialogFragment;
        this.A01 = list;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        this.A00.A0w(false, false);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("conversations/bulk-delete");
        ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = this.A00;
        bulkDeleteConversationDialogFragment.A0w(false, false);
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass02N r1 : this.A01) {
            arrayList.add(bulkDeleteConversationDialogFragment.A01.A0A(r1));
        }
        ActivityC004702f r4 = (ActivityC004702f) bulkDeleteConversationDialogFragment.A0A();
        if (r4 != null) {
            C28051Sr.A1X(r4, arrayList, z, bulkDeleteConversationDialogFragment.A06, bulkDeleteConversationDialogFragment.A00, bulkDeleteConversationDialogFragment.A02, bulkDeleteConversationDialogFragment.A04);
            return;
        }
        throw null;
    }
}

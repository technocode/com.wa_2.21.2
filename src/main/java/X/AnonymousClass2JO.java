package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2JO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JO implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.BulkLeaveGroupsDialogFragment A00;

    public /* synthetic */ AnonymousClass2JO(ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment) {
        this.A00 = bulkLeaveGroupsDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A0w(false, false);
    }
}

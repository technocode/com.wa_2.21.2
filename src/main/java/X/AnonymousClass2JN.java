package X;

import android.content.DialogInterface;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;

/* renamed from: X.2JN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JN implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.BulkLeaveGroupsDialogFragment A00;
    public final /* synthetic */ ArrayList A01;

    public /* synthetic */ AnonymousClass2JN(ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment, ArrayList arrayList) {
        this.A00 = bulkLeaveGroupsDialogFragment;
        this.A01 = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment = this.A00;
        MuteDialogFragment A012 = MuteDialogFragment.A01(this.A01);
        AnonymousClass0LW r1 = bulkLeaveGroupsDialogFragment.A0H;
        if (r1 != null) {
            A012.A0u(r1, null);
            bulkLeaveGroupsDialogFragment.A0w(false, false);
            return;
        }
        throw null;
    }
}

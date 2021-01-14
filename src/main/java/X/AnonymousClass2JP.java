package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2JP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JP implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.BulkLeaveGroupsDialogFragment A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ AnonymousClass2JP(ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment, List list) {
        this.A00 = bulkLeaveGroupsDialogFragment;
        this.A01 = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationsFragment.BulkLeaveGroupsDialogFragment bulkLeaveGroupsDialogFragment = this.A00;
        List<AnonymousClass02N> list = this.A01;
        Log.i("conversations/bulk-user-try-leaveGroup");
        if (bulkLeaveGroupsDialogFragment.A02.A05()) {
            for (AnonymousClass02N r6 : list) {
                StringBuilder sb = new StringBuilder("conversations/bulkexit/group:");
                sb.append(r6);
                Log.i(sb.toString());
                bulkLeaveGroupsDialogFragment.A06.A07(r6, true);
                bulkLeaveGroupsDialogFragment.A0B.ANF(new RunnableEBaseShape7S0200000_I1_2(bulkLeaveGroupsDialogFragment, r6, 31));
            }
        } else {
            bulkLeaveGroupsDialogFragment.A00.A06(R.string.failed_to_leave_group, 0);
        }
        AnonymousClass00D r2 = bulkLeaveGroupsDialogFragment.A03;
        r2.A0N(r2.A00.getInt("delete_chat_count", 0) + list.size());
        bulkLeaveGroupsDialogFragment.A06.A03(2);
        bulkLeaveGroupsDialogFragment.A0w(false, false);
    }
}

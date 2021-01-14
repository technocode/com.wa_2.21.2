package X;

import android.content.DialogInterface;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2QN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QN implements DialogInterface.OnClickListener {
    public final /* synthetic */ GroupChatInfo A00;

    public /* synthetic */ AnonymousClass2QN(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GroupChatInfo groupChatInfo = this.A00;
        Log.i("group_info/onclick_endGroup");
        if (groupChatInfo.A0n.A05()) {
            groupChatInfo.APv(R.string.participant_removing, R.string.register_wait_message);
            AnonymousClass0A8 r9 = groupChatInfo.A0u;
            r9.A07(groupChatInfo.A0S, true);
            AnonymousClass0AR r1 = groupChatInfo.A1A;
            C59962oZ r5 = new C59962oZ(groupChatInfo, groupChatInfo.A1I, groupChatInfo.A13, r9, groupChatInfo.A0S);
            if (r1.A04.A06) {
                Log.i("sendmethods/sendEndGroup");
                r1.A08.A09(Message.obtain(null, 0, 93, 0, r5));
            }
            groupChatInfo.A0h();
            return;
        }
        groupChatInfo.A0Z.A06(R.string.failed_to_leave_group, 0);
    }
}

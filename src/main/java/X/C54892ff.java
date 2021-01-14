package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2ff  reason: invalid class name and case insensitive filesystem */
public class C54892ff implements AnonymousClass35S {
    public final /* synthetic */ GroupChatInfo A00;

    public C54892ff(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        C002001d.A2N(this.A00, 1);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("group_info/onclick_deleteGroup");
        GroupChatInfo groupChatInfo = this.A00;
        if (!groupChatInfo.A0v.A04(groupChatInfo.A0S)) {
            ((ChatInfoActivity) groupChatInfo).A0H.ANC(new AnonymousClass2X4(groupChatInfo, groupChatInfo.A0S, groupChatInfo.A0f, z), new Void[0]);
        } else if (groupChatInfo.A0n.A05()) {
            groupChatInfo.APv(R.string.participant_removing, R.string.register_wait_message);
            groupChatInfo.A1A.A08(new C59952oY(groupChatInfo, groupChatInfo.A1I, groupChatInfo.A13, groupChatInfo.A0u, groupChatInfo.A0S));
        } else {
            groupChatInfo.A0Z.A06(R.string.failed_to_leave_group, 0);
        }
    }
}

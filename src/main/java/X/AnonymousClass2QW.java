package X;

import android.widget.CompoundButton;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;

/* renamed from: X.2QW  reason: invalid class name */
public class AnonymousClass2QW implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ GroupChatInfo A00;

    public AnonymousClass2QW(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        GroupChatInfo groupChatInfo = this.A00;
        if (z) {
            groupChatInfo.APl(MuteDialogFragment.A00(groupChatInfo.A0S), null);
        } else {
            ((ChatInfoActivity) groupChatInfo).A0H.ANF(new RunnableEBaseShape10S0100000_I1_5(this, 5));
        }
    }
}

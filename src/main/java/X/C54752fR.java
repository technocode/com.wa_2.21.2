package X;

import android.content.Intent;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupChatInfo;

/* renamed from: X.2fR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C54752fR implements AbstractC665434t {
    public final /* synthetic */ GroupChatInfo A00;

    public /* synthetic */ C54752fR(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    @Override // X.AbstractC665434t
    public final void AEE() {
        GroupChatInfo groupChatInfo = this.A00;
        Intent intent = new Intent(groupChatInfo, MediaGalleryActivity.class);
        intent.putExtra("jid", groupChatInfo.A0S.getRawString());
        groupChatInfo.startActivity(intent);
    }
}

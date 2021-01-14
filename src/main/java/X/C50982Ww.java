package X;

import android.content.Intent;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2Ww  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C50982Ww implements AbstractC665434t {
    public final /* synthetic */ ChatInfoActivity A00;

    public /* synthetic */ C50982Ww(ChatInfoActivity chatInfoActivity) {
        this.A00 = chatInfoActivity;
    }

    @Override // X.AbstractC665434t
    public final void AEE() {
        ChatInfoActivity chatInfoActivity = this.A00;
        Intent intent = new Intent(chatInfoActivity, MediaGalleryActivity.class);
        intent.putExtra("jid", chatInfoActivity.A0V().getRawString());
        chatInfoActivity.startActivity(intent);
    }
}

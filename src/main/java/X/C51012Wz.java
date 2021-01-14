package X;

import android.content.Intent;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2Wz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51012Wz implements AbstractC665434t {
    public final /* synthetic */ ListChatInfo A00;

    public /* synthetic */ C51012Wz(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    @Override // X.AbstractC665434t
    public final void AEE() {
        ListChatInfo listChatInfo = this.A00;
        Intent intent = new Intent(listChatInfo, MediaGalleryActivity.class);
        intent.putExtra("jid", listChatInfo.A0g().getRawString());
        listChatInfo.startActivity(intent);
    }
}

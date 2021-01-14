package X;

import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2XH  reason: invalid class name */
public class AnonymousClass2XH implements AnonymousClass35S {
    public final /* synthetic */ ListChatInfo A00;

    public AnonymousClass2XH(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        C002001d.A2N(this.A00, 2);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("list_chat_info/onclick_leaveGroup");
        ListChatInfo listChatInfo = this.A00;
        ((ChatInfoActivity) listChatInfo).A0H.ANC(new AnonymousClass2X4(listChatInfo, listChatInfo.A0g(), listChatInfo.A0D, z), new Void[0]);
    }
}

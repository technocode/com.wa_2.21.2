package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2mW  reason: invalid class name and case insensitive filesystem */
public class C58782mW extends AnonymousClass2X5 {
    public final WeakReference A00;

    public C58782mW(ListChatInfo listChatInfo, C007003k r3) {
        super(listChatInfo, r3);
        this.A00 = new WeakReference(listChatInfo);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A00.get();
        if (chatInfoActivity != null) {
            chatInfoActivity.A0O(false);
            if (chatInfoActivity.findViewById(R.id.media_card_view).getVisibility() == 0) {
                chatInfoActivity.A0X();
            }
            Log.i("list_chat_info/updated");
        }
    }
}

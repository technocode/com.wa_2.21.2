package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2Hm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47352Hm implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationRowContact$MessageSharedContactDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ DialogInterface$OnClickListenerC47352Hm(ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment, List list, String str) {
        this.A00 = conversationRowContact$MessageSharedContactDialogFragment;
        this.A02 = list;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = this.A00;
        List list = this.A02;
        String str = this.A01;
        UserJid userJid = ((AnonymousClass2I9) list.get(i)).A01;
        if (userJid != null) {
            conversationRowContact$MessageSharedContactDialogFragment.A01.A02(conversationRowContact$MessageSharedContactDialogFragment.A00(), userJid, str);
        }
    }
}

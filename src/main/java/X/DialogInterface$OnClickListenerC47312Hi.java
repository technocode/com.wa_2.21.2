package X;

import android.content.DialogInterface;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import java.util.List;

/* renamed from: X.2Hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47312Hi implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationRow$ConversationRowDialogFragment A00;
    public final /* synthetic */ AnonymousClass02N A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ DialogInterface$OnClickListenerC47312Hi(ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment, List list, AnonymousClass02N r3) {
        this.A00 = conversationRow$ConversationRowDialogFragment;
        this.A02 = list;
        this.A01 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = this.A00;
        List list = this.A02;
        AnonymousClass02N r2 = this.A01;
        ActivityC004902h A0A = conversationRow$ConversationRowDialogFragment.A0A();
        if (A0A instanceof Conversation) {
            ((Conversation) A0A).A1L(((AnonymousClass2I9) list.get(i)).A00, r2);
        }
    }
}

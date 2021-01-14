package X;

import android.os.Build;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;

/* renamed from: X.1rj  reason: invalid class name and case insensitive filesystem */
public class C39561rj {
    public final /* synthetic */ Conversation A00;

    public C39561rj(Conversation conversation) {
        this.A00 = conversation;
    }

    public void A00() {
        AnonymousClass377 r1;
        Conversation conversation = this.A00;
        conversation.A1E(conversation.A4R, conversation.A14);
        if (Build.VERSION.SDK_INT >= 19 && (r1 = conversation.A1D) != null && r1.A0E) {
            r1.A00();
        }
        if (Build.VERSION.SDK_INT >= 26 && C002001d.A3N(conversation.A2G, conversation.A2p)) {
            conversation.sendBroadcast(ConversationVideoPictureInPictureActivity.A00());
        }
    }
}

package X;

import android.view.View;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.2H2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H2 implements View.OnLongClickListener {
    public final /* synthetic */ ConversationAttachmentContentView A00;

    public /* synthetic */ AnonymousClass2H2(ConversationAttachmentContentView conversationAttachmentContentView) {
        this.A00 = conversationAttachmentContentView;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2Z6 r1 = this.A00.A09;
        AnonymousClass2HD r0 = r1.A01;
        if (r0 != null) {
            r0.dismiss();
            r1.A07();
            return true;
        }
        throw null;
    }
}

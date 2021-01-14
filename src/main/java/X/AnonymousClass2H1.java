package X;

import android.view.View;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.2H1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H1 implements View.OnLongClickListener {
    public final /* synthetic */ ConversationAttachmentContentView A00;

    public /* synthetic */ AnonymousClass2H1(ConversationAttachmentContentView conversationAttachmentContentView) {
        this.A00 = conversationAttachmentContentView;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2Z6 r2 = this.A00.A09;
        AnonymousClass2HD r0 = r2.A01;
        if (r0 != null) {
            r0.dismiss();
            r2.A04.APm(new CapturePictureOrVideoDialogFragment());
            return true;
        }
        throw null;
    }
}

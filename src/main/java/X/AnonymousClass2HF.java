package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.2HF  reason: invalid class name */
public class AnonymousClass2HF extends View {
    public int A00;
    public final /* synthetic */ ConversationAttachmentContentView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HF(ConversationAttachmentContentView conversationAttachmentContentView, Context context) {
        super(context);
        this.A01 = conversationAttachmentContentView;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(1, this.A00 + this.A01.A05);
    }
}

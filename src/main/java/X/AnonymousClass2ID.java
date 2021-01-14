package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.2ID  reason: invalid class name */
public class AnonymousClass2ID extends BitmapDrawable {
    public final /* synthetic */ ConversationRowImage$RowImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ID(ConversationRowImage$RowImageView conversationRowImage$RowImageView, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.A00 = conversationRowImage$RowImageView;
    }

    public int getIntrinsicHeight() {
        return this.A00.A00;
    }

    public int getIntrinsicWidth() {
        return this.A00.A01;
    }
}

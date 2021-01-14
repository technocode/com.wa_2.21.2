package X;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2a0  reason: invalid class name and case insensitive filesystem */
public class C51772a0 implements AnonymousClass0D9 {
    public final /* synthetic */ AnonymousClass2IK A00;

    public C51772a0(AnonymousClass2IK r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00.A0M.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
        Log.w("ConversationRowSticker/onFileReadError");
        this.A00.A07 = false;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        if (bitmap == null || !(r5 instanceof AnonymousClass0M3)) {
            AnonymousClass2IK r1 = this.A00;
            r1.A07 = false;
            r1.A0M.setImageResource(R.drawable.sticker_error_in_conversation);
            return;
        }
        this.A00.A0M.setImageBitmap(bitmap);
        Log.d("ConversationRowSticker/displayed thumbnail");
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        Log.w("ConversationRowSticker/showPlaceholder");
        AnonymousClass2IK r1 = this.A00;
        r1.A07 = false;
        r1.A0M.setImageResource(R.drawable.sticker_error_in_conversation);
    }
}

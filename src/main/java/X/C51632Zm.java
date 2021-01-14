package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;

/* renamed from: X.2Zm  reason: invalid class name and case insensitive filesystem */
public class C51632Zm implements AnonymousClass0D9 {
    public final /* synthetic */ C60352pI A00;

    public C51632Zm(C60352pI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return (AbstractC59162nB.A04(this.A00.getContext()) * 72) / 100;
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
        this.A00.A0m();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r8) {
        C60352pI r4 = this.A00;
        if (bitmap != null) {
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r4.A0H;
            conversationRowVideo$RowVideoView.setImageDrawable(new BitmapDrawable(r4.getContext().getResources(), bitmap));
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (r4.A00 <= 0 || r4.A01 <= 0) {
                r4.A00 = height;
                r4.A01 = width;
            }
            conversationRowVideo$RowVideoView.A00(width, height, false);
            return;
        }
        r4.A0H.setImageDrawable(new ColorDrawable(C004302a.A00(r4.getContext(), R.color.dark_gray)));
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.A0H.setImageDrawable(new ColorDrawable(-7829368));
    }
}

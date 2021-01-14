package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;

/* renamed from: X.2Zs  reason: invalid class name and case insensitive filesystem */
public class C51692Zs implements AnonymousClass0D9 {
    public final /* synthetic */ C60382pL A00;

    public C51692Zs(C60382pL r1) {
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
    public void APh(View view, Bitmap bitmap, AbstractC007503q r7) {
        C60382pL r0 = this.A00;
        if (bitmap != null) {
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r0.A08;
            conversationRowVideo$RowVideoView.setImageDrawable(new BitmapDrawable(r0.getContext().getResources(), bitmap));
            conversationRowVideo$RowVideoView.A00(bitmap.getWidth(), bitmap.getHeight(), false);
            return;
        }
        r0.A08.setImageDrawable(new ColorDrawable(C004302a.A00(r0.getContext(), R.color.dark_gray)));
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.A08.setBackgroundColor(-7829368);
    }
}

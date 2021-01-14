package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.2Zy  reason: invalid class name and case insensitive filesystem */
public class C51752Zy implements AnonymousClass0D9 {
    public final /* synthetic */ C60422pP A00;

    public C51752Zy(C60422pP r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        C60422pP r1 = this.A00;
        int A04 = AbstractC59162nB.A04(r1.getContext());
        int i = 72;
        if (((AnonymousClass2I2) r1).A0K) {
            i = 100;
        }
        return (A04 * i) / 100;
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
        this.A00.A0m();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r7) {
        int i;
        if (bitmap == null || !(r7 instanceof AnonymousClass0M3)) {
            this.A00.A0A.setImageResource(R.drawable.media_image);
            return;
        }
        AnonymousClass0M4 r0 = ((AnonymousClass0M3) r7).A02;
        if (r0 != null) {
            int i2 = r0.A08;
            if (!(i2 == 0 || (i = r0.A06) == 0)) {
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A00.A0A;
                conversationRowImage$RowImageView.A01 = i2;
                conversationRowImage$RowImageView.A00 = i;
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.A00.A0A.setImageBitmap(bitmap);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.A0A.setBackgroundColor(-7829368);
    }
}

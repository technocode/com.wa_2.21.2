package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.2Zp  reason: invalid class name and case insensitive filesystem */
public class C51662Zp implements AnonymousClass0D9 {
    public final /* synthetic */ C60362pJ A00;

    public C51662Zp(C60362pJ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        C60362pJ r1 = this.A00;
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
    public void APh(View view, Bitmap bitmap, AbstractC007503q r8) {
        int i;
        ImageView.ScaleType scaleType;
        if (bitmap == null || !(r8 instanceof AnonymousClass0M3)) {
            C60362pJ r2 = this.A00;
            r2.A08.setImageResource(R.drawable.media_image);
            r2.A00 = false;
            return;
        }
        AnonymousClass0M4 r0 = ((AnonymousClass0M3) r8).A02;
        if (r0 != null) {
            int i2 = r0.A08;
            if (!(i2 == 0 || (i = r0.A06) == 0)) {
                C60362pJ r02 = this.A00;
                boolean z = r02 instanceof C60712q0;
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = r02.A08;
                conversationRowImage$RowImageView.A01 = i2;
                conversationRowImage$RowImageView.A00 = i;
                if (((AnonymousClass2I2) r02).A0K || z) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = ImageView.ScaleType.MATRIX;
                }
                conversationRowImage$RowImageView.setScaleType(scaleType);
            }
            this.A00.A08.setImageBitmap(bitmap);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        C60362pJ r1 = this.A00;
        r1.A00 = false;
        r1.A08.setBackgroundColor(-7829368);
    }
}

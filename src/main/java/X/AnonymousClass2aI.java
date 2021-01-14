package X;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2aI  reason: invalid class name */
public class AnonymousClass2aI implements AnonymousClass0D9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC007503q A01;
    public final /* synthetic */ AnonymousClass0D1 A02;
    public final /* synthetic */ StickerView A03;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public AnonymousClass2aI(StickerView stickerView, AnonymousClass0D1 r2, AbstractC007503q r3, int i) {
        this.A03 = stickerView;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r13) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            AnonymousClass0D1 r1 = this.A02;
            C29241Xq A11 = ((AnonymousClass0ZE) this.A01).A11();
            StickerView stickerView = this.A03;
            int i = this.A00;
            r1.A06(A11, 1, stickerView, i, i, false, false, null);
            return;
        }
        this.A03.setImageBitmap(bitmap);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A03.setImageResource(R.drawable.sticker_error_in_conversation);
    }
}

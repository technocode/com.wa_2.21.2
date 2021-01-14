package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;

/* renamed from: X.33V  reason: invalid class name */
public class AnonymousClass33V implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ StickerStorePackPreviewActivity A00;

    public AnonymousClass33V(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        this.A00 = stickerStorePackPreviewActivity;
    }

    public void onGlobalLayout() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        int width = stickerStorePackPreviewActivity.A0B.getWidth() / stickerStorePackPreviewActivity.A0B.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_item);
        if (stickerStorePackPreviewActivity.A00 != width) {
            stickerStorePackPreviewActivity.A0A.A1N(width);
            stickerStorePackPreviewActivity.A00 = width;
            AnonymousClass3QO r0 = stickerStorePackPreviewActivity.A0H;
            if (r0 != null) {
                ((AbstractC16300pa) r0).A01.A00();
            }
        }
    }
}

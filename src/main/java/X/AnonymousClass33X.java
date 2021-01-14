package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreTabFragment;

/* renamed from: X.33X  reason: invalid class name */
public class AnonymousClass33X implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ StickerStoreTabFragment A00;

    public AnonymousClass33X(StickerStoreTabFragment stickerStoreTabFragment) {
        this.A00 = stickerStoreTabFragment;
    }

    public void onGlobalLayout() {
        StickerStoreTabFragment stickerStoreTabFragment = this.A00;
        AbstractC11910hD A0C = stickerStoreTabFragment.A04.A0C(stickerStoreTabFragment.A03.A0s());
        if (A0C instanceof C71833Qm) {
            RecyclerView recyclerView = ((C71833Qm) A0C).A0F;
            int min = Math.min(recyclerView.getWidth() / (stickerStoreTabFragment.A02().getDimensionPixelSize(R.dimen.sticker_store_row_preview_padding) + recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item)), 5);
            if (stickerStoreTabFragment.A00 != min) {
                stickerStoreTabFragment.A00 = min;
                ((AbstractC16300pa) stickerStoreTabFragment.A05).A01.A00();
            }
        }
    }
}

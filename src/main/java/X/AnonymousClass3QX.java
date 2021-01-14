package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.stickers.StickerStoreDialogFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;

/* renamed from: X.3QX  reason: invalid class name */
public class AnonymousClass3QX implements AnonymousClass0XW {
    public final /* synthetic */ StickerStoreDialogFragment A00;

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
    }

    public AnonymousClass3QX(StickerStoreDialogFragment stickerStoreDialogFragment) {
        this.A00 = stickerStoreDialogFragment;
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        int i2 = 0;
        while (true) {
            StickerStoreDialogFragment stickerStoreDialogFragment = this.A00;
            if (i2 < stickerStoreDialogFragment.A04.A01()) {
                StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) ((AnonymousClass037) stickerStoreDialogFragment.A04.A00.get(i2));
                boolean z = false;
                if (i == i2) {
                    z = true;
                }
                RecyclerView recyclerView = stickerStoreTabFragment.A04;
                if (recyclerView != null) {
                    recyclerView.setNestedScrollingEnabled(z);
                }
                i2++;
            } else {
                stickerStoreDialogFragment.A01.requestLayout();
                return;
            }
        }
    }
}

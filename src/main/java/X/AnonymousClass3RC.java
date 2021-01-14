package X;

import android.os.Bundle;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;

/* renamed from: X.3RC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RC implements AnonymousClass33K {
    public final /* synthetic */ C74213aM A00;

    public /* synthetic */ AnonymousClass3RC(C74213aM r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33K
    public final void AKX(C29241Xq r5) {
        C74213aM r3 = this.A00;
        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = new RemoveStickerFromFavoritesDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", r5);
        removeStickerFromFavoritesDialogFragment.A0N(bundle);
        ((ActivityC004702f) r3.A09).APm(removeStickerFromFavoritesDialogFragment);
    }
}

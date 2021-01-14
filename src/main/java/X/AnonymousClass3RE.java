package X;

import android.os.Bundle;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;

/* renamed from: X.3RE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RE implements AnonymousClass33K {
    public final /* synthetic */ C74223aN A00;

    public /* synthetic */ AnonymousClass3RE(C74223aN r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33K
    public final void AKX(C29241Xq r5) {
        C74223aN r3 = this.A00;
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", r5);
        starStickerFromPickerDialogFragment.A0N(bundle);
        ((ActivityC004702f) r3.A09).APm(starStickerFromPickerDialogFragment);
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;

/* renamed from: X.3RA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RA implements AnonymousClass33K {
    public final /* synthetic */ C74193aK A00;

    public /* synthetic */ AnonymousClass3RA(C74193aK r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33K
    public final void AKX(C29241Xq r5) {
        C74193aK r3 = this.A00;
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", r5);
        starStickerFromPickerDialogFragment.A0N(bundle);
        ((ActivityC004702f) r3.A09).APm(starStickerFromPickerDialogFragment);
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;

/* renamed from: X.3RB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RB implements AnonymousClass33K {
    public final /* synthetic */ C74203aL A00;

    public /* synthetic */ AnonymousClass3RB(C74203aL r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33K
    public final void AKX(C29241Xq r5) {
        C74203aL r3 = this.A00;
        StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = new StarOrRemoveFromRecentsStickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", r5);
        starOrRemoveFromRecentsStickerDialogFragment.A0N(bundle);
        ((ActivityC004702f) ((AnonymousClass3RI) r3).A09).APm(starOrRemoveFromRecentsStickerDialogFragment);
    }
}

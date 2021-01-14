package X;

import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.3Ir  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69823Ir implements AnonymousClass0SG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ StickerSearchDialogFragment A01;
    public final /* synthetic */ StickerSearchTabFragment A02;

    public /* synthetic */ C69823Ir(StickerSearchTabFragment stickerSearchTabFragment, StickerSearchDialogFragment stickerSearchDialogFragment, int i) {
        this.A02 = stickerSearchTabFragment;
        this.A01 = stickerSearchDialogFragment;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        StickerSearchTabFragment stickerSearchTabFragment = this.A02;
        StickerSearchDialogFragment stickerSearchDialogFragment = this.A01;
        int i = this.A00;
        AnonymousClass3QG r1 = stickerSearchTabFragment.A02;
        if (r1 != null) {
            r1.A08(stickerSearchDialogFragment.A0y(i));
            ((AbstractC16300pa) stickerSearchTabFragment.A02).A01.A00();
        }
    }
}

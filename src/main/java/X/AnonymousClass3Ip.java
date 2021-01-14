package X;

import android.text.TextUtils;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.3Ip  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Ip implements AnonymousClass0SG {
    public final /* synthetic */ StickerSearchDialogFragment A00;

    public /* synthetic */ AnonymousClass3Ip(StickerSearchDialogFragment stickerSearchDialogFragment) {
        this.A00 = stickerSearchDialogFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        StickerSearchDialogFragment stickerSearchDialogFragment = this.A00;
        List list = (List) obj;
        AnonymousClass3QG r2 = stickerSearchDialogFragment.A08;
        if (r2 != null) {
            r2.A04 = !TextUtils.isEmpty(stickerSearchDialogFragment.A0A);
            stickerSearchDialogFragment.A08.A08(list);
            ((AbstractC16300pa) stickerSearchDialogFragment.A08).A01.A00();
            ViewTreeObserver$OnGlobalLayoutListenerC64002xM r0 = stickerSearchDialogFragment.A06;
            if (r0 != null) {
                r0.A02 = true;
            }
            stickerSearchDialogFragment.A0z();
        }
    }
}

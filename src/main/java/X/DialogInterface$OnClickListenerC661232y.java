package X;

import android.content.DialogInterface;
import com.whatsapp.stickers.StickerInfoDialogFragment;

/* renamed from: X.32y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC661232y implements DialogInterface.OnClickListener {
    public final /* synthetic */ StickerInfoDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC661232y(StickerInfoDialogFragment stickerInfoDialogFragment) {
        this.A00 = stickerInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C29241Xq r0;
        StickerInfoDialogFragment stickerInfoDialogFragment = this.A00;
        AnonymousClass33I r1 = stickerInfoDialogFragment.A0B;
        if (r1 != null && (r0 = stickerInfoDialogFragment.A09) != null) {
            stickerInfoDialogFragment.A0x(r1, r0);
        }
    }
}

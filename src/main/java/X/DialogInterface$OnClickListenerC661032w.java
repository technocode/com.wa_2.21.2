package X;

import android.content.DialogInterface;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.32w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC661032w implements DialogInterface.OnClickListener {
    public final /* synthetic */ StarStickerFromPickerDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC661032w(StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment) {
        this.A00 = starStickerFromPickerDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = this.A00;
        C29241Xq r4 = starStickerFromPickerDialogFragment.A01;
        AnonymousClass33B r2 = starStickerFromPickerDialogFragment.A00;
        Log.d("StarStickerFromPickerDialogFragment/downloadAndStarStickerAsync/begin");
        AnonymousClass3QF r3 = new AnonymousClass3QF(starStickerFromPickerDialogFragment.A04, starStickerFromPickerDialogFragment.A02, r2);
        starStickerFromPickerDialogFragment.A05.ANC(r3, r4);
    }
}

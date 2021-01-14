package X;

import android.content.DialogInterface;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.32t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC660732t implements DialogInterface.OnClickListener {
    public final /* synthetic */ RemoveStickerFromFavoritesDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC660732t(RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment) {
        this.A00 = removeStickerFromFavoritesDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = this.A00;
        C03570Gt r4 = removeStickerFromFavoritesDialogFragment.A02;
        Set singleton = Collections.singleton(removeStickerFromFavoritesDialogFragment.A00);
        Log.d("StickerRepository/unstarStickersAsync/begin");
        r4.A0R.ANF(new RunnableEBaseShape4S0200000_I0_3(r4, singleton, 8));
    }
}

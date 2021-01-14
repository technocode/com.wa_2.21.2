package X;

import android.content.DialogInterface;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;

/* renamed from: X.2Pc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC49122Pc implements DialogInterface.OnClickListener {
    public final /* synthetic */ RemoveGifFromFavoritesDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC49122Pc(RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment) {
        this.A00 = removeGifFromFavoritesDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment = this.A00;
        if (i == -1) {
            C03400Ga r4 = removeGifFromFavoritesDialogFragment.A02;
            r4.A0A.execute(new RunnableEBaseShape8S0200000_I1_3(r4, removeGifFromFavoritesDialogFragment.A00, 7));
        }
    }
}

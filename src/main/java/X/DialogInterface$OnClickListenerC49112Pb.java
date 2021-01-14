package X;

import android.content.DialogInterface;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;

/* renamed from: X.2Pb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC49112Pb implements DialogInterface.OnClickListener {
    public final /* synthetic */ RemoveDownloadableGifFromFavoritesDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC49112Pb(RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment) {
        this.A00 = removeDownloadableGifFromFavoritesDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment = this.A00;
        if (i == -1) {
            C49182Pi r4 = removeDownloadableGifFromFavoritesDialogFragment.A02;
            C49262Ps r3 = removeDownloadableGifFromFavoritesDialogFragment.A00;
            AnonymousClass02M r2 = r4.A00;
            r2.A02.post(new RunnableEBaseShape8S0200000_I1_3(r4, r3, 3));
            r4.A01.A00(r3.A01.A02);
        }
    }
}

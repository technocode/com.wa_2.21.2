package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;

/* renamed from: X.2Pz  reason: invalid class name and case insensitive filesystem */
public class View$OnLongClickListenerC49312Pz implements View.OnLongClickListener {
    public final /* synthetic */ C60542pf A00;

    public View$OnLongClickListenerC49312Pz(C60542pf r1) {
        this.A00 = r1;
    }

    public boolean onLongClick(View view) {
        C60542pf r5 = this.A00;
        if (r5.A00 == 1) {
            C49262Ps r2 = r5.A01;
            StarDownloadableGifDialogFragment starDownloadableGifDialogFragment = new StarDownloadableGifDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("gif", r2);
            starDownloadableGifDialogFragment.A0N(bundle);
            ((ActivityC004702f) view.getContext()).APm(starDownloadableGifDialogFragment);
        }
        if (r5.A00 == 2) {
            C49262Ps r22 = r5.A01;
            RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment = new RemoveDownloadableGifFromFavoritesDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("gif", r22);
            removeDownloadableGifFromFavoritesDialogFragment.A0N(bundle2);
            ((ActivityC004702f) view.getContext()).APm(removeDownloadableGifFromFavoritesDialogFragment);
        }
        return true;
    }
}

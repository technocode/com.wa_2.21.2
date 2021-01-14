package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;

/* renamed from: X.2Pf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC49152Pf implements View.OnLongClickListener {
    public final /* synthetic */ C49232Po A00;

    public /* synthetic */ View$OnLongClickListenerC49152Pf(C49232Po r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C49232Po r3 = this.A00;
        RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment = new RemoveGifFromFavoritesDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("gif", r3);
        removeGifFromFavoritesDialogFragment.A0N(bundle);
        ((ActivityC004702f) view.getContext()).APm(removeGifFromFavoritesDialogFragment);
        return true;
    }
}

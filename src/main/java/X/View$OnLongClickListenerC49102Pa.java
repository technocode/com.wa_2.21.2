package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;

/* renamed from: X.2Pa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC49102Pa implements View.OnLongClickListener {
    public final /* synthetic */ C49232Po A00;

    public /* synthetic */ View$OnLongClickListenerC49102Pa(C49232Po r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C49232Po r3 = this.A00;
        StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment = new StarOrRemoveFromRecentGifsDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("gif", r3);
        starOrRemoveFromRecentGifsDialogFragment.A0N(bundle);
        ((ActivityC004702f) view.getContext()).APm(starOrRemoveFromRecentGifsDialogFragment);
        return true;
    }
}

package X;

import android.content.DialogInterface;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;

/* renamed from: X.2Pe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC49142Pe implements DialogInterface.OnClickListener {
    public final /* synthetic */ StarOrRemoveFromRecentGifsDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC49142Pe(StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment) {
        this.A00 = starOrRemoveFromRecentGifsDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment = this.A00;
        if (i == -3) {
            C03400Ga r4 = starOrRemoveFromRecentGifsDialogFragment.A03;
            r4.A0A.execute(new RunnableEBaseShape8S0200000_I1_3(r4, starOrRemoveFromRecentGifsDialogFragment.A00, 8));
        } else if (i == -1) {
            C03400Ga r2 = starOrRemoveFromRecentGifsDialogFragment.A03;
            r2.A0A.execute(new RunnableEBaseShape1S0200100_I1(r2, starOrRemoveFromRecentGifsDialogFragment.A00, starOrRemoveFromRecentGifsDialogFragment.A01.A05(), 1));
        }
    }
}

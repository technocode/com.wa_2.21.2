package X;

import android.content.DialogInterface;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import java.util.Collections;

/* renamed from: X.32u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC660832u implements DialogInterface.OnClickListener {
    public final /* synthetic */ StarOrRemoveFromRecentsStickerDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC660832u(StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment) {
        this.A00 = starOrRemoveFromRecentsStickerDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = this.A00;
        if (i == -3) {
            C04230Jo r4 = starOrRemoveFromRecentsStickerDialogFragment.A02;
            r4.A0A.execute(new RunnableEBaseShape4S0200000_I0_3(r4, starOrRemoveFromRecentsStickerDialogFragment.A00, 6));
        } else if (i == -1) {
            starOrRemoveFromRecentsStickerDialogFragment.A03.A0K(Collections.singleton(starOrRemoveFromRecentsStickerDialogFragment.A00));
        }
    }
}

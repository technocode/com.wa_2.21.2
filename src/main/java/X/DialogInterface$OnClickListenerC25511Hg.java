package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ChatMediaVisibilityDialog;

/* renamed from: X.1Hg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25511Hg implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChatMediaVisibilityDialog A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25511Hg(ChatMediaVisibilityDialog chatMediaVisibilityDialog) {
        this.A00 = chatMediaVisibilityDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((DialogFragment) this.A00).A03.dismiss();
    }
}

package X;

import android.content.DialogInterface;
import com.whatsapp.ChatMediaVisibilityDialog;

/* renamed from: X.1Hh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25521Hh implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChatMediaVisibilityDialog A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25521Hh(ChatMediaVisibilityDialog chatMediaVisibilityDialog) {
        this.A00 = chatMediaVisibilityDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChatMediaVisibilityDialog chatMediaVisibilityDialog = this.A00;
        if (i == 1) {
            chatMediaVisibilityDialog.A01 = 2;
        } else if (i != 2) {
            chatMediaVisibilityDialog.A01 = 0;
        } else {
            chatMediaVisibilityDialog.A01 = 1;
        }
    }
}

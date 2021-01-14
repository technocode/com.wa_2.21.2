package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.ephemeral.EphemeralNUXDialog;

/* renamed from: X.2Nk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC48712Nk implements DialogInterface.OnKeyListener {
    public final /* synthetic */ EphemeralNUXDialog A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC48712Nk(EphemeralNUXDialog ephemeralNUXDialog) {
        this.A00 = ephemeralNUXDialog;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        ActivityC004902h A0A;
        EphemeralNUXDialog ephemeralNUXDialog = this.A00;
        if (i != 4 || keyEvent.getAction() != 0 || (A0A = ephemeralNUXDialog.A0A()) == null) {
            return false;
        }
        A0A.onBackPressed();
        return true;
    }
}

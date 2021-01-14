package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.voipcalling.VoipContactPickerDialogFragment;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC673038a implements DialogInterface.OnKeyListener {
    public final /* synthetic */ VoipContactPickerDialogFragment A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC673038a(VoipContactPickerDialogFragment voipContactPickerDialogFragment) {
        this.A00 = voipContactPickerDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        ActivityC004902h A0A;
        VoipContactPickerDialogFragment voipContactPickerDialogFragment = this.A00;
        if (i != 4 || keyEvent.getAction() != 1 || (A0A = voipContactPickerDialogFragment.A0A()) == null) {
            return false;
        }
        A0A.onBackPressed();
        return true;
    }
}

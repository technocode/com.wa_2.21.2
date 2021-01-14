package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

/* renamed from: X.38d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC673338d implements DialogInterface.OnKeyListener {
    public final /* synthetic */ VoipErrorDialogFragment A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC673338d(VoipErrorDialogFragment voipErrorDialogFragment) {
        this.A00 = voipErrorDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        VoipErrorDialogFragment voipErrorDialogFragment = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        voipErrorDialogFragment.A0A().finish();
        return true;
    }
}

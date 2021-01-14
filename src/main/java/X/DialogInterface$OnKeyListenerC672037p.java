package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;

/* renamed from: X.37p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC672037p implements DialogInterface.OnKeyListener {
    public final /* synthetic */ MaximizedParticipantVideoDialogFragment A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC672037p(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment) {
        this.A00 = maximizedParticipantVideoDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        maximizedParticipantVideoDialogFragment.A0y(true);
        return true;
    }
}

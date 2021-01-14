package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.1Jp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC26121Jp implements DialogInterface.OnKeyListener {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC26121Jp(Activity activity) {
        this.A00 = activity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Activity activity = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        activity.finish();
        return true;
    }
}

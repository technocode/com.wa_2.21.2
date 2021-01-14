package X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.1TN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TN implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C28021Sn A00;

    public /* synthetic */ AnonymousClass1TN(C28021Sn r1) {
        this.A00 = r1;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C28021Sn r1 = this.A00;
        if (i != 4) {
            return true;
        }
        r1.A00("on_press_back");
        dialogInterface.dismiss();
        return true;
    }
}

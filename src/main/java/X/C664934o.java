package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.34o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C664934o implements TextView.OnEditorActionListener {
    public final /* synthetic */ C665134q A00;

    public /* synthetic */ C664934o(C665134q r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C665134q r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        r2.A03.A00();
        return true;
    }
}

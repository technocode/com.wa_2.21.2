package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.1Hn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25581Hn implements TextView.OnEditorActionListener {
    public final /* synthetic */ C39711ry A00;

    public /* synthetic */ C25581Hn(C39711ry r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C39711ry r2 = this.A00;
        if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            return false;
        }
        r2.A00.A1F(true);
        return true;
    }
}

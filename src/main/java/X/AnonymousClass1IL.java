package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.1IL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IL implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass1MN A00;

    public /* synthetic */ AnonymousClass1IL(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass1MN r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        r2.A05.A00();
        return true;
    }
}

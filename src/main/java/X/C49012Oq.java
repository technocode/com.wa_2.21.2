package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.2Oq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C49012Oq implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass2P5 A00;

    public /* synthetic */ C49012Oq(AnonymousClass2P5 r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass2P5 r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        r2.A01.A00();
        return true;
    }
}

package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.2Op  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C49002Op implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass2P5 A00;

    public /* synthetic */ C49002Op(AnonymousClass2P5 r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass2P5 r1 = this.A00;
        if (i != 6) {
            return false;
        }
        r1.dismiss();
        return true;
    }
}

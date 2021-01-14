package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.2M3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M3 implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public /* synthetic */ AnonymousClass2M3(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass2MQ r1 = this.A00;
        if (i != 6) {
            return false;
        }
        r1.A0C = textView.getText().toString();
        r1.dismiss();
        return true;
    }
}

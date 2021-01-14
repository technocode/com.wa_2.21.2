package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

/* renamed from: X.1ND  reason: invalid class name */
public class AnonymousClass1ND extends ProgressDialog {
    public AnonymousClass1ND(Context context) {
        super(context);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 84) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}

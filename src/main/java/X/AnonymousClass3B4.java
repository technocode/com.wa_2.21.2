package X;

import android.view.MotionEvent;
import android.view.View;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.3B4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3B4 implements View.OnTouchListener {
    public final /* synthetic */ GetCredential A00;

    public /* synthetic */ AnonymousClass3B4(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GetCredential getCredential = this.A00;
        view.performClick();
        if (motionEvent.getAction() != 1 || getCredential.A02.getVisibility() != 0) {
            return false;
        }
        getCredential.A0D(false);
        return true;
    }
}

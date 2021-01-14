package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3BQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3BQ implements View.OnTouchListener {
    public final /* synthetic */ C73263Wc A00;

    public /* synthetic */ AnonymousClass3BQ(C73263Wc r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C73263Wc r2 = this.A00;
        view.performClick();
        if (r2.A0B == null || motionEvent.getAction() != 1) {
            return false;
        }
        r2.A0B.AGK(r2.A01);
        return false;
    }
}

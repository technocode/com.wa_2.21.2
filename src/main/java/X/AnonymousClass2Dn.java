package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2Dn  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dn implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass2E4 A00;

    public /* synthetic */ AnonymousClass2Dn(AnonymousClass2E4 r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass2E4 r1 = this.A00;
        r1.A02.A00.AL5(motionEvent);
        r1.A01.onTouchEvent(motionEvent);
        return true;
    }
}

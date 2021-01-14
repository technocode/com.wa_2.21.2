package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2QE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QE implements View.OnTouchListener {
    public final /* synthetic */ PointF A00;

    public /* synthetic */ AnonymousClass2QE(PointF pointF) {
        this.A00 = pointF;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.set(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}

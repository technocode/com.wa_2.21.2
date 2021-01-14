package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.37o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC671937o implements View.OnTouchListener {
    public final /* synthetic */ PointF A00;

    public /* synthetic */ View$OnTouchListenerC671937o(PointF pointF) {
        this.A00 = pointF;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.set(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}

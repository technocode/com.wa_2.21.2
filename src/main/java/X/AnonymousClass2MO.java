package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2MO  reason: invalid class name */
public class AnonymousClass2MO implements View.OnTouchListener {
    public float A00 = Float.MIN_VALUE;
    public float A01 = Float.MIN_VALUE;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00 = motionEvent.getX();
        this.A01 = motionEvent.getY();
        return false;
    }
}

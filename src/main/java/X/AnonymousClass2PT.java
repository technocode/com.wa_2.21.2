package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.2PT  reason: invalid class name */
public class AnonymousClass2PT extends ScaleGestureDetector {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PT(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, int i) {
        super(context, onScaleGestureListener);
        this.A00 = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getPointerCount() > 1) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                f2 += motionEvent.getX(i);
                f3 += motionEvent.getY(i);
            }
            float f4 = (float) pointerCount;
            float f5 = f2 / f4;
            float f6 = f3 / f4;
            float f7 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                f += Math.abs(motionEvent.getX(i2) - f5);
                f7 += Math.abs(motionEvent.getY(i2) - f6);
            }
            if (((float) Math.hypot((double) ((f / f4) * 2.0f), (double) ((f7 / f4) * 2.0f))) <= ((float) this.A00)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

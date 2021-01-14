package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.2MV  reason: invalid class name */
public class AnonymousClass2MV {
    public GestureDetector$OnGestureListenerC52962c7 A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final PointF A04 = new PointF();
    public final PointF A05 = new PointF();
    public final PointF A06 = new PointF();

    public AnonymousClass2MV(GestureDetector$OnGestureListenerC52962c7 r2, Context context) {
        this.A00 = r2;
        this.A03 = ViewConfiguration.get(context).getScaledPagingTouchSlop() >> 2;
    }

    public static final void A00(PointF pointF, MotionEvent motionEvent) {
        pointF.set(0.0f, 0.0f);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            pointF.x = motionEvent.getX(i) + pointF.x;
            pointF.y = motionEvent.getY(i) + pointF.y;
        }
        float f = (float) pointerCount;
        pointF.x /= f;
        pointF.y /= f;
    }
}

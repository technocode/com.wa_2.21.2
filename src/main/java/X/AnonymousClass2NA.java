package X;

import android.graphics.PointF;

/* renamed from: X.2NA  reason: invalid class name */
public class AnonymousClass2NA extends PointF {
    public AnonymousClass2NA() {
        super(0.0f, 0.0f);
    }

    public AnonymousClass2NA(float f, float f2) {
        super(f, f2);
    }

    public AnonymousClass2NA(PointF pointF) {
        super(pointF.x, pointF.y);
    }

    public float A00(PointF pointF) {
        float f = ((PointF) this).x - pointF.x;
        float f2 = ((PointF) this).y - pointF.y;
        return (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
    }
}

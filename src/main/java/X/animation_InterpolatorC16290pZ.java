package X;

import android.view.animation.Interpolator;

/* renamed from: X.0pZ  reason: invalid class name and case insensitive filesystem */
public final class animation.InterpolatorC16290pZ implements Interpolator {
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}

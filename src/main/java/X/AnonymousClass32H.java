package X;

import android.view.animation.Interpolator;

/* renamed from: X.32H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32H implements Interpolator {
    public static final /* synthetic */ AnonymousClass32H A00 = new AnonymousClass32H();

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}

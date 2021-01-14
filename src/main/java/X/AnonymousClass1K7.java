package X;

import android.animation.TimeInterpolator;

/* renamed from: X.1K7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K7 implements TimeInterpolator {
    public final /* synthetic */ C27131Oe A00;

    public /* synthetic */ AnonymousClass1K7(C27131Oe r1) {
        this.A00 = r1;
    }

    public final float getInterpolation(float f) {
        C27131Oe r5 = this.A00;
        if (((double) f) > 0.5d) {
            return Math.min(f, r5.A00);
        }
        return 0.0f;
    }
}

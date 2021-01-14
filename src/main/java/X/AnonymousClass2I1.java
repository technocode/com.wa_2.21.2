package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2I1  reason: invalid class name */
public class AnonymousClass2I1 extends Animation {
    public final /* synthetic */ AnonymousClass2I2 A00;

    public AnonymousClass2I1(AnonymousClass2I2 r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass2I2 r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}

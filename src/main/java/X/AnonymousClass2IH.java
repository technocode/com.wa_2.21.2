package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2IH  reason: invalid class name */
public final class AnonymousClass2IH extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass2IJ A02;

    public AnonymousClass2IH(AnonymousClass2IJ r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        if (f != 1.0f) {
            AnonymousClass2IJ r2 = this.A02;
            int i = this.A01;
            r2.A00 = i + ((int) (((float) (this.A00 - i)) * f));
            r2.invalidateSelf();
        }
    }
}

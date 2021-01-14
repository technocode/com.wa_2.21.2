package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.366  reason: invalid class name */
public class AnonymousClass366 extends Animation {
    public Camera A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    public AnonymousClass366(float f, float f2, float f3, float f4) {
        this.A04 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public void applyTransformation(float f, Transformation transformation) {
        Matrix matrix = transformation.getMatrix();
        this.A00.save();
        this.A00.translate(0.0f, 0.0f, (float) (Math.sin(((double) f) * 3.141592653589793d) * ((double) this.A03)));
        this.A00.rotateY(((this.A04 - 0.0f) * f) + 0.0f);
        this.A00.getMatrix(matrix);
        this.A00.restore();
        float f2 = this.A01;
        float f3 = this.A02;
        matrix.preTranslate(-f2, -f3);
        matrix.postTranslate(f2, f3);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.A00 = new Camera();
    }
}

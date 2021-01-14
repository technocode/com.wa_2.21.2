package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: X.2IS  reason: invalid class name */
public class AnonymousClass2IS extends Animation {
    public int A00;
    public Camera A01;
    public ImageView A02;
    public boolean A03;

    public AnonymousClass2IS(ImageView imageView, int i) {
        this.A02 = imageView;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        int i = ((int) (f * 180.0f)) % 360;
        Matrix matrix = transformation.getMatrix();
        this.A01.save();
        this.A01.translate(0.0f, 0.0f, (float) (Math.sin((((double) i) * 3.141592653589793d) / 180.0d) * ((double) this.A02.getWidth())));
        Camera camera = this.A01;
        if (i < 90) {
            camera.rotateY((float) i);
        } else {
            camera.rotateY((float) (i + 180));
        }
        this.A01.getMatrix(matrix);
        this.A01.restore();
        matrix.preTranslate((float) ((-this.A02.getWidth()) >> 1), (float) ((-this.A02.getHeight()) >> 1));
        matrix.postTranslate((float) (this.A02.getWidth() >> 1), (float) (this.A02.getHeight() >> 1));
        if (i > 90 && !this.A03) {
            this.A03 = true;
            this.A02.setImageResource(this.A00);
        }
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.A01 = new Camera();
    }
}

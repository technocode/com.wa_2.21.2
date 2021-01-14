package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: X.0Vd  reason: invalid class name and case insensitive filesystem */
public class animation.InterpolatorC06900Vd implements Interpolator {
    public final float[] A00;
    public final float[] A01;

    public animation.InterpolatorC06900Vd(float f, float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, 1.0f, 1.0f, 1.0f);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.A00 = new float[i];
        this.A01 = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.A00[i2] = fArr[0];
            this.A01[i2] = fArr[1];
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) >> 1;
            if (f < fArr[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.A01[i];
        }
        float[] fArr2 = this.A01;
        float f5 = fArr2[i];
        return ((fArr2[length] - f5) * ((f - f3) / f4)) + f5;
    }
}

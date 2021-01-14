package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.0yf  reason: invalid class name and case insensitive filesystem */
public class C21390yf {
    public final Matrix A00;

    public C21390yf(AnonymousClass0VV r7, int i, int i2, int i3, Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i2, (float) i3);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(r7 == AnonymousClass0VV.FRONT ? -1.0f : 1.0f, 1.0f);
        matrix2.postRotate((float) i);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), rectF, Matrix.ScaleToFit.FILL);
        matrix2.setConcat(matrix3, matrix2);
        Matrix matrix4 = new Matrix();
        this.A00 = matrix4;
        matrix2.invert(matrix4);
    }
}

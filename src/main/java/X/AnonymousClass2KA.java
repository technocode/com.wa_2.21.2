package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.2KA  reason: invalid class name */
public class AnonymousClass2KA {
    public Bitmap A00;
    public Matrix A01;

    public AnonymousClass2KA(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public int A00() {
        if (A02()) {
            return this.A00.getWidth();
        }
        return this.A00.getHeight();
    }

    public int A01() {
        if (A02()) {
            return this.A00.getHeight();
        }
        return this.A00.getWidth();
    }

    public boolean A02() {
        Matrix matrix = this.A01;
        if (matrix != null) {
            float[] fArr = {0.0f, 1.0f};
            matrix.mapVectors(fArr);
            if (fArr[0] != 0.0f) {
                return true;
            }
        }
        return false;
    }
}

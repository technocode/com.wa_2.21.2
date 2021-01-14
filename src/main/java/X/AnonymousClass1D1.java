package X;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: X.1D1  reason: invalid class name */
public class AnonymousClass1D1 extends Property {
    public final Matrix A00 = new Matrix();

    public AnonymousClass1D1() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        Matrix matrix = this.A00;
        matrix.set(((ImageView) obj).getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}

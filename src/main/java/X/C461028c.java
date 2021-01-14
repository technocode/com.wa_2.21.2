package X;

import android.graphics.Bitmap;

/* renamed from: X.28c  reason: invalid class name and case insensitive filesystem */
public class C461028c implements AnonymousClass251 {
    @Override // X.AbstractC32511f4, X.AbstractC20050w2
    public void AMT(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            bitmap.recycle();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC32511f4
    public Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}

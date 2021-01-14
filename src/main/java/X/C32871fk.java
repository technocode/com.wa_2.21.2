package X;

import android.graphics.Bitmap;

/* renamed from: X.1fk  reason: invalid class name and case insensitive filesystem */
public class C32871fk extends AbstractC20720xB {
    public static boolean A00(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C19960vt.A00("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C19960vt.A00("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    @Override // X.AbstractC20720xB
    public Object A01(int i) {
        Bitmap bitmap = (Bitmap) super.A01(i);
        if (bitmap == null || !A00(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // X.AbstractC20720xB
    public void A02(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (A00(bitmap)) {
            super.A02(bitmap);
        }
    }
}

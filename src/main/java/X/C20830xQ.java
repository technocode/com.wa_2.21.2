package X;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: X.0xQ  reason: invalid class name and case insensitive filesystem */
public final class C20830xQ {
    public static int A00(Bitmap.Config config) {
        int i = C20820xP.A00[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    public static int A01(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getByteCount();
    }
}

package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

/* renamed from: X.253  reason: invalid class name */
public class AnonymousClass253 extends AbstractC32941fr {
    public AnonymousClass253(AnonymousClass251 r1, int i, C30101aj r3) {
        super(r1, i, r3);
    }

    @Override // X.AbstractC32941fr
    public int A00(int i, int i2, BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null && colorSpace.isWideGamut() && options.inPreferredConfig != Bitmap.Config.RGBA_F16) {
            return (i * i2) << 3;
        }
        return C20830xQ.A00(options.inPreferredConfig) * i * i2;
    }
}

package X;

import android.graphics.Bitmap;

/* renamed from: X.28b  reason: invalid class name and case insensitive filesystem */
public class C460928b extends AnonymousClass250 implements AnonymousClass251 {
    @Override // X.AnonymousClass250
    public int A00(int i) {
        return i;
    }

    public C460928b(AbstractC19980vv r1, C20790xI r2, AbstractC20800xJ r3) {
        super(r1, r2, r3);
    }

    @Override // X.AnonymousClass250
    public int A01(Object obj) {
        return ((Bitmap) obj).getAllocationByteCount();
    }

    @Override // X.AnonymousClass250
    public Object A03(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // X.AnonymousClass250
    public Object A04(C20660x5 r3) {
        Bitmap bitmap = (Bitmap) super.A04(r3);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // X.AnonymousClass250
    public void A06(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // X.AnonymousClass250
    public boolean A08(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}

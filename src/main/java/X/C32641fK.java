package X;

import android.graphics.Bitmap;

/* renamed from: X.1fK  reason: invalid class name and case insensitive filesystem */
public class C32641fK {
    public C32691fQ A00;
    public C20390wd A01;
    public final AbstractC20220wL A02;
    public final AbstractC20370wb A03;

    public C32641fK(AbstractC20220wL r3, C32691fQ r4) {
        C32631fJ r1 = new C32631fJ(this);
        this.A03 = r1;
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = new C20390wd(r4, r1);
    }

    public boolean A00(int i, Bitmap bitmap) {
        try {
            this.A01.A00(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C19960vt.A00.A01(6, C32641fK.class.getSimpleName(), String.format(null, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i)), e);
            return false;
        }
    }
}

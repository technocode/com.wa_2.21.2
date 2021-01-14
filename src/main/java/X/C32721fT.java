package X;

import android.graphics.Bitmap;

/* renamed from: X.1fT  reason: invalid class name and case insensitive filesystem */
public class C32721fT extends AbstractC20420wg {
    public final C20510wp A00;
    public final AnonymousClass251 A01;

    public C32721fT(AnonymousClass251 r1, C20510wp r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC20420wg
    public AbstractC20030w0 A00(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        AnonymousClass251 r4 = this.A01;
        Bitmap bitmap = (Bitmap) r4.get(C20830xQ.A00(config) * i3);
        boolean z = false;
        if (bitmap.getAllocationByteCount() >= C20830xQ.A00(config) * i3) {
            z = true;
        }
        AnonymousClass0N2.A1Y(z);
        bitmap.reconfigure(i, i2, config);
        return AbstractC20030w0.A01(bitmap, r4, this.A00.A00);
    }
}

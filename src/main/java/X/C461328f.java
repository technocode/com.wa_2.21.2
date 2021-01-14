package X;

import android.graphics.Bitmap;

/* renamed from: X.28f  reason: invalid class name and case insensitive filesystem */
public class C461328f implements AnonymousClass251 {
    public int A00;
    public int A01 = 4194304;
    public final AbstractC20720xB A02 = new C32871fk();
    public final AbstractC20800xJ A03;

    public C461328f(AbstractC20800xJ r3) {
        this.A03 = r3;
    }

    @Override // X.AbstractC32511f4, X.AbstractC20050w2
    public void AMT(Object obj) {
        AbstractC20720xB r2 = this.A02;
        int A012 = C20830xQ.A01((Bitmap) obj);
        if (A012 <= this.A01) {
            r2.A02(obj);
            synchronized (this) {
                this.A00 += A012;
            }
        }
    }

    @Override // X.AbstractC32511f4
    public Object get(int i) {
        Object obj;
        synchronized (this) {
            int i2 = this.A00;
            if (i2 > 0) {
                while (i2 > 0) {
                    AbstractC20720xB r5 = this.A02;
                    C20680x7 r4 = r5.A00;
                    synchronized (r4) {
                        C20670x6 r3 = r4.A01;
                        if (r3 == null) {
                            obj = null;
                        } else {
                            obj = r3.A03.pollLast();
                            if (r3.A03.isEmpty()) {
                                r4.A00(r3);
                                r4.A02.remove(r3.A00);
                            }
                        }
                    }
                    if (obj != null) {
                        synchronized (r5) {
                            r5.A01.remove(obj);
                        }
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap == null) {
                        break;
                    }
                    i2 = this.A00 - C20830xQ.A01(bitmap);
                    this.A00 = i2;
                }
            }
            Bitmap bitmap2 = (Bitmap) this.A02.A01(i);
            if (bitmap2 != null) {
                this.A00 -= C20830xQ.A01(bitmap2);
                return bitmap2;
            }
            return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
        }
    }
}

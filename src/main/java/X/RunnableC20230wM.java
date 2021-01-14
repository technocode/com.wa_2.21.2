package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* renamed from: X.0wM  reason: invalid class name and case insensitive filesystem */
public class RunnableC20230wM extends RunnableEmptyBase implements Runnable {
    public final int A00;
    public final int A01;
    public final AbstractC32551fB A02;
    public final AbstractC20220wL A03;
    public final /* synthetic */ C32601fG A04;

    public RunnableC20230wM(C32601fG r1, AbstractC32551fB r2, AbstractC20220wL r3, int i, int i2) {
        this.A04 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean A00(int i, int i2) {
        boolean z;
        int i3 = 2;
        AbstractC20030w0 r4 = null;
        if (i2 == 1) {
            AbstractC20220wL r2 = this.A03;
            AbstractC32551fB r0 = this.A02;
            r4 = r2.A4w(i, r0.A6t(), r0.A6s());
        } else if (i2 != 2) {
            if (0 != 0) {
                r4.close();
            }
            return false;
        } else {
            try {
                C32601fG r5 = this.A04;
                AbstractC20420wg r3 = r5.A03;
                AbstractC32551fB r02 = this.A02;
                r4 = r3.A00(r02.A6t(), r02.A6s(), r5.A00);
                i3 = -1;
            } catch (RuntimeException e) {
                C19960vt.A00.A01(5, C32601fG.class.getSimpleName(), "Failed to create frame bitmap", e);
                if (r4 != null) {
                    r4.close();
                }
                return false;
            } catch (Throwable th) {
                if (r4 != null) {
                    r4.close();
                }
                throw th;
            }
        }
        if (!AbstractC20030w0.A02(r4)) {
            z = false;
        } else {
            C32601fG r32 = this.A04;
            if (!r32.A02.A00(i, (Bitmap) r4.A04())) {
                z = false;
            } else {
                int i4 = this.A00;
                synchronized (r32.A01) {
                    this.A03.AGN(i4, r4, i2);
                }
                z = true;
            }
        }
        if (r4 != null) {
            r4.close();
        }
        return (z || i3 == -1) ? z : A00(i, i3);
    }

    public void run() {
        try {
            AbstractC20220wL r0 = this.A03;
            int i = this.A00;
            if (r0.A30(i)) {
                SparseArray sparseArray = this.A04.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
                return;
            }
            if (!A00(i, 1)) {
                C19960vt.A00.A00(6, C32601fG.class.getSimpleName(), String.format(null, "Could not prepare frame %d.", Integer.valueOf(i)));
            }
            SparseArray sparseArray2 = this.A04.A01;
            synchronized (sparseArray2) {
                sparseArray2.remove(this.A01);
            }
        } catch (Throwable th) {
            SparseArray sparseArray3 = this.A04.A01;
            synchronized (sparseArray3) {
                sparseArray3.remove(this.A01);
                throw th;
            }
        }
    }
}

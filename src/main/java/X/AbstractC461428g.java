package X;

import android.util.SparseIntArray;

/* renamed from: X.28g  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC461428g extends AnonymousClass250 {
    public final int[] A00;

    public AbstractC461428g(AbstractC19980vv r5, C20790xI r6, AbstractC20800xJ r7) {
        super(r5, r6, r7);
        SparseIntArray sparseIntArray = r6.A03;
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    public AbstractC20730xC A09(int i) {
        return new C32881fl(i);
    }
}

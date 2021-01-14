package X;

import android.util.SparseIntArray;

/* renamed from: X.28e  reason: invalid class name and case insensitive filesystem */
public class C461228e extends AnonymousClass250 implements AbstractC32511f4 {
    public final int[] A00;

    public C461228e(AbstractC19980vv r5, C20790xI r6, AbstractC20800xJ r7) {
        super(r5, r6, r7);
        SparseIntArray sparseIntArray = r6.A03;
        this.A00 = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
        }
    }
}

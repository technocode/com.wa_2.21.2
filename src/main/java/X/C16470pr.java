package X;

import android.util.SparseArray;

/* renamed from: X.0pr  reason: invalid class name and case insensitive filesystem */
public class C16470pr {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public final C16460pq A00(int i) {
        SparseArray sparseArray = this.A01;
        C16460pq r0 = (C16460pq) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        C16460pq r02 = new C16460pq();
        sparseArray.put(i, r02);
        return r02;
    }
}

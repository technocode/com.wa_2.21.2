package X;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: X.180  reason: invalid class name */
public class AnonymousClass180 {
    public AnonymousClass0LQ A00;
    public final SparseIntArray A01 = new SparseIntArray();

    public AnonymousClass180(AnonymousClass0LQ r2) {
        C001801b.A1Q(r2);
        this.A00 = r2;
    }

    public int A00(Context context, AbstractC34701j2 r7) {
        C001801b.A1Q(context);
        C001801b.A1Q(r7);
        int i = 0;
        if (!r7.AMu()) {
            return 0;
        }
        int A7V = r7.A7V();
        SparseIntArray sparseIntArray = this.A01;
        int i2 = sparseIntArray.get(A7V, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= sparseIntArray.size()) {
                i = this.A00.A00(context, A7V);
                break;
            }
            int keyAt = sparseIntArray.keyAt(i3);
            if (keyAt > A7V && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        sparseIntArray.put(A7V, i);
        return i;
    }
}

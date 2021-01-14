package X;

import android.util.SparseArray;

/* renamed from: X.0x7  reason: invalid class name and case insensitive filesystem */
public class C20680x7 {
    public C20670x6 A00;
    public C20670x6 A01;
    public final SparseArray A02 = new SparseArray();

    public final synchronized void A00(C20670x6 r4) {
        C20670x6 r2 = r4.A02;
        C20670x6 r1 = r4.A01;
        if (r2 != null) {
            r2.A01 = r1;
        }
        if (r1 != null) {
            r1.A02 = r2;
        }
        r4.A02 = null;
        r4.A01 = null;
        if (r4 == this.A00) {
            this.A00 = r1;
        }
        if (r4 == this.A01) {
            this.A01 = r2;
        }
    }
}

package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.0xB  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC20720xB {
    public final C20680x7 A00 = new C20680x7();
    public final Set A01 = new HashSet();

    public Object A01(int i) {
        Object obj;
        C20680x7 r3 = this.A00;
        synchronized (r3) {
            C20670x6 r2 = (C20670x6) r3.A02.get(i);
            if (r2 == null) {
                obj = null;
            } else {
                obj = r2.A03.pollFirst();
                if (r3.A00 != r2) {
                    r3.A00(r2);
                    C20670x6 r0 = r3.A00;
                    if (r0 == null) {
                        r3.A00 = r2;
                        r3.A01 = r2;
                    } else {
                        r2.A01 = r0;
                        r0.A02 = r2;
                        r3.A00 = r2;
                    }
                }
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.A01.remove(obj);
        }
        return obj;
    }

    public void A02(Object obj) {
        boolean add;
        synchronized (this) {
            add = this.A01.add(obj);
        }
        if (add) {
            C20680x7 r4 = this.A00;
            int A012 = C20830xQ.A01((Bitmap) obj);
            synchronized (r4) {
                SparseArray sparseArray = r4.A02;
                C20670x6 r1 = (C20670x6) sparseArray.get(A012);
                if (r1 == null) {
                    r1 = new C20670x6(A012, new LinkedList());
                    sparseArray.put(A012, r1);
                }
                r1.A03.addLast(obj);
                if (r4.A00 != r1) {
                    r4.A00(r1);
                    C20670x6 r0 = r4.A00;
                    if (r0 == null) {
                        r4.A00 = r1;
                        r4.A01 = r1;
                    } else {
                        r1.A01 = r0;
                        r0.A02 = r1;
                        r4.A00 = r1;
                    }
                }
            }
        }
    }
}

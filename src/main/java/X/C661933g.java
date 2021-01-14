package X;

import java.lang.ref.WeakReference;

/* renamed from: X.33g  reason: invalid class name and case insensitive filesystem */
public class C661933g implements Comparable {
    public final int A00;
    public final long A01;
    public final C661533c A02;
    public final WeakReference A03;

    public C661933g(C661533c r2, int i, long j, C71923Qv r6) {
        this.A02 = r2;
        this.A01 = j;
        this.A00 = i;
        this.A03 = new WeakReference(r6);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C661933g r6 = (C661933g) obj;
        if (r6 == null) {
            return -1;
        }
        long j = this.A01;
        long j2 = r6.A01;
        if (j >= j2) {
            return j == j2 ? 0 : 1;
        }
        return -1;
    }
}

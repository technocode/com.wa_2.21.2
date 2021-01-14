package X;

import java.util.ArrayList;

/* renamed from: X.0lU  reason: invalid class name and case insensitive filesystem */
public class C14080lU {
    public static int A02;
    public AbstractC29841aH A00;
    public ArrayList A01 = new ArrayList();

    public C14080lU(AbstractC29841aH r2) {
        A02++;
        this.A00 = r2;
    }

    public final long A00(C29831aG r9, long j) {
        AbstractC29841aH r4 = r9.A06;
        if (r4 instanceof C451823h) {
            return j;
        }
        int size = r9.A07.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC14050lR r7 = (AbstractC14050lR) r9.A07.get(i);
            if (r7 instanceof C29831aG) {
                C29831aG r72 = (C29831aG) r7;
                if (r72.A06 != r4) {
                    j2 = Math.min(j2, A00(r72, ((long) r72.A00) + j));
                }
            }
        }
        if (r9 != r4.A04) {
            return j2;
        }
        long A04 = j - r4.A04();
        return Math.min(Math.min(j2, A00(r4.A05, A04)), A04 - ((long) r4.A05.A00));
    }

    public final long A01(C29831aG r9, long j) {
        AbstractC29841aH r4 = r9.A06;
        if (r4 instanceof C451823h) {
            return j;
        }
        int size = r9.A07.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC14050lR r7 = (AbstractC14050lR) r9.A07.get(i);
            if (r7 instanceof C29831aG) {
                C29831aG r72 = (C29831aG) r7;
                if (r72.A06 != r4) {
                    j2 = Math.max(j2, A01(r72, ((long) r72.A00) + j));
                }
            }
        }
        if (r9 != r4.A05) {
            return j2;
        }
        long A04 = j + r4.A04();
        return Math.max(Math.max(j2, A01(r4.A04, A04)), A04 - ((long) r4.A04.A00));
    }
}

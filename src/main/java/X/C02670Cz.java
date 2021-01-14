package X;

import android.util.SparseArray;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Cz  reason: invalid class name and case insensitive filesystem */
public class C02670Cz {
    public static final SparseArray A08;
    public int A00 = 0;
    public RandomAccessFile A01;
    public String A02;
    public final AnonymousClass009 A03;
    public final AnonymousClass00G A04;
    public final Object A05 = new Object();
    public final Map A06 = new ConcurrentHashMap();
    public final ReentrantLock A07 = new ReentrantLock();

    static {
        SparseArray sparseArray = new SparseArray();
        A08 = sparseArray;
        sparseArray.put(0, "EMPTY");
        sparseArray.put(1, "LOADING");
        sparseArray.put(2, "COMPLETE");
    }

    public C02670Cz(AnonymousClass00G r2, AnonymousClass009 r3) {
        this.A04 = r2;
        this.A03 = r3;
    }

    public final synchronized int A00() {
        return this.A00;
    }

    public final RandomAccessFile A01() {
        RandomAccessFile randomAccessFile;
        synchronized (this.A05) {
            randomAccessFile = this.A01;
        }
        return randomAccessFile;
    }

    public final synchronized String A02() {
        return this.A02;
    }

    public final void A03(int i) {
        AnonymousClass00E.A07(this.A07.isHeldByCurrentThread());
        if (i == 1 || this.A00 == 1) {
            StringBuilder A0S = AnonymousClass008.A0S("FlatfileStorage/setState/state change from ");
            SparseArray sparseArray = A08;
            A0S.append((String) sparseArray.get(this.A00));
            A0S.append(" to ");
            AnonymousClass008.A1S(A0S, (String) sparseArray.get(i));
        }
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02670Cz.A04():boolean");
    }
}

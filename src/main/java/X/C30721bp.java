package X;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1bp  reason: invalid class name and case insensitive filesystem */
public class C30721bp implements AbstractC17050qt, AbstractC17040qs {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final int A01;
    public final double[] A02;
    public final int[] A03;
    public final long[] A04;
    public final String[] A05;
    public final byte[][] A06;
    public volatile String A07;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C30721bp(int i) {
        this.A01 = i;
        int i2 = i + 1;
        this.A03 = new int[i2];
        this.A04 = new long[i2];
        this.A02 = new double[i2];
        this.A05 = new String[i2];
        this.A06 = new byte[i2][];
    }

    public static C30721bp A00(String str, int i) {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C30721bp r0 = (C30721bp) ceilingEntry.getValue();
                r0.A07 = str;
                r0.A00 = i;
                return r0;
            }
            C30721bp r02 = new C30721bp(i);
            r02.A07 = str;
            r02.A00 = i;
            return r02;
        }
    }

    public void A01() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.A01), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public void A02(int i, String str) {
        this.A03[i] = 4;
        this.A05[i] = str;
    }

    @Override // X.AbstractC17050qt
    public void A2G(AbstractC17040qs r6) {
        for (int i = 1; i <= this.A00; i++) {
            int i2 = this.A03[i];
            if (i2 == 1) {
                ((C30791bx) r6).A00.bindNull(i);
            } else if (i2 == 2) {
                ((C30791bx) r6).A00.bindLong(i, this.A04[i]);
            } else if (i2 == 3) {
                ((C30791bx) r6).A00.bindDouble(i, this.A02[i]);
            } else if (i2 == 4) {
                ((C30791bx) r6).A00.bindString(i, this.A05[i]);
            } else if (i2 == 5) {
                ((C30791bx) r6).A00.bindBlob(i, this.A06[i]);
            }
        }
    }

    @Override // X.AbstractC17050qt
    public String A9A() {
        return this.A07;
    }
}

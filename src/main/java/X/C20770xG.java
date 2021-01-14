package X;

import android.util.SparseIntArray;

/* renamed from: X.0xG  reason: invalid class name and case insensitive filesystem */
public class C20770xG {
    public final int A00;
    public final AbstractC19980vv A01;
    public final C20790xI A02 = C20690x8.A00();
    public final C20790xI A03;
    public final C20790xI A04;
    public final C20790xI A05;
    public final AbstractC20800xJ A06 = C32921fp.A00();
    public final AbstractC20800xJ A07;
    public final AbstractC20800xJ A08;
    public final String A09;

    public C20770xG() {
        C32501f3 r0;
        int i;
        int i2;
        C20810xN.A00();
        int i3 = C20700x9.A00;
        int i4 = i3 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i5 = 131072;
        do {
            sparseIntArray.put(i5, i3);
            i5 <<= 1;
        } while (i5 <= 4194304);
        this.A03 = new C20790xI(4194304, i4, sparseIntArray, i3);
        synchronized (C32501f3.class) {
            r0 = C32501f3.A00;
            if (r0 == null) {
                r0 = new C32501f3();
                C32501f3.A00 = r0;
            }
        }
        this.A01 = r0;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 3145728;
        } else {
            i = 12582912;
            if (min < 33554432) {
                i = 6291456;
            }
        }
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = min2 / 2;
        } else {
            i2 = (min2 >> 2) * 3;
        }
        this.A04 = new C20790xI(i, i2, sparseIntArray2, -1);
        this.A07 = C32921fp.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A05 = new C20790xI(81920, 1048576, sparseIntArray3, -1);
        this.A08 = C32921fp.A00();
        this.A09 = "legacy";
        this.A00 = 4194304;
        C20810xN.A00();
    }
}

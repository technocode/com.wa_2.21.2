package X;

import android.util.SparseIntArray;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public class C20690x8 {
    public static final SparseIntArray A00 = new SparseIntArray(0);

    public static C20790xI A00() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min >> 2) * 3;
        } else {
            i = min >> 1;
        }
        return new C20790xI(0, i, A00, -1);
    }
}

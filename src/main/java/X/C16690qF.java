package X;

import java.util.Arrays;

/* renamed from: X.0qF  reason: invalid class name and case insensitive filesystem */
public class C16690qF {
    public boolean A00;
    public boolean A01;
    public final int[] A02;
    public final long[] A03;
    public final boolean[] A04;

    public C16690qF(int i) {
        long[] jArr = new long[i];
        this.A03 = jArr;
        this.A04 = new boolean[i];
        this.A02 = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(this.A04, false);
    }
}

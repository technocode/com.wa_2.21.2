package X;

import android.graphics.Color;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0ok  reason: invalid class name and case insensitive filesystem */
public final class C15810ok {
    public static final Comparator A05 = new C15790oi();
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final AbstractC15840on[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014a, code lost:
        if (r2 < r1) goto L_0x014c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15810ok(int[] r14, X.AbstractC15840on[] r15) {
        /*
        // Method dump skipped, instructions count: 469
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15810ok.<init>(int[], X.0on[]):void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = (1 << 8) - 1;
        return Color.rgb((i << 3) & i4, (i2 << 3) & i4, (i3 << 3) & i4);
    }

    public static void A01(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }
}

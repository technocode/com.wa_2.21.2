package X;

import java.util.Arrays;

/* renamed from: X.1bN  reason: invalid class name and case insensitive filesystem */
public class C30451bN implements AbstractC16390pj {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public void A00(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.A00 << 1;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[(i3 << 1)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(androidx.recyclerview.widget.RecyclerView r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30451bN.A01(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}

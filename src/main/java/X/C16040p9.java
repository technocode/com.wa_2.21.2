package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0p9  reason: invalid class name and case insensitive filesystem */
public class C16040p9 {
    public final int A00;
    public final int A01;
    public final AbstractC16030p8 A02;
    public final List A03;
    public final boolean A04 = true;
    public final int[] A05;
    public final int[] A06;

    public C16040p9(AbstractC16030p8 r11, List list, int[] iArr, int[] iArr2) {
        C16070pC r1;
        this.A03 = list;
        this.A06 = iArr;
        this.A05 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.A05, 0);
        this.A02 = r11;
        this.A01 = r11.A01();
        this.A00 = r11.A00();
        if (this.A03.isEmpty() || (r1 = (C16070pC) this.A03.get(0)) == null || r1.A01 != 0 || r1.A02 != 0) {
            C16070pC r12 = new C16070pC();
            r12.A01 = 0;
            r12.A02 = 0;
            r12.A03 = false;
            r12.A00 = 0;
            r12.A04 = false;
            this.A03.add(0, r12);
        }
        int i = this.A01;
        int i2 = this.A00;
        for (int size = this.A03.size() - 1; size >= 0; size--) {
            C16070pC r8 = (C16070pC) this.A03.get(size);
            int i3 = r8.A01;
            int i4 = r8.A00;
            int i5 = i3 + i4;
            int i6 = r8.A02 + i4;
            if (this.A04) {
                while (i > i5) {
                    int i7 = i - 1;
                    if (this.A06[i7] == 0) {
                        A01(i, i2, size, false);
                    }
                    i = i7;
                }
                while (i2 > i6) {
                    int i8 = i2 - 1;
                    if (this.A05[i8] == 0) {
                        A01(i, i2, size, true);
                    }
                    i2 = i8;
                }
            }
            for (int i9 = 0; i9 < r8.A00; i9++) {
                int i10 = r8.A01 + i9;
                int i11 = r8.A02 + i9;
                int i12 = 2;
                if (this.A02.A02(i10, i11)) {
                    i12 = 1;
                }
                this.A06[i10] = (i11 << 5) | i12;
                this.A05[i11] = (i10 << 5) | i12;
            }
            i = r8.A01;
            i2 = r8.A02;
        }
    }

    public static C16050pA A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            C16050pA r3 = (C16050pA) list.get(size);
            if (r3.A01 == i && r3.A02 == z) {
                list.remove(size);
                while (size < list.size()) {
                    C16050pA r2 = (C16050pA) list.get(size);
                    int i2 = r2.A00;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    r2.A00 = i2 + i3;
                    size++;
                }
                return r3;
            }
            size--;
        }
        return null;
    }

    public final void A01(int i, int i2, int i3, boolean z) {
        int i4 = i - 1;
        int i5 = i4;
        if (z) {
            i2--;
            i5 = i;
            i4 = i2;
        }
        while (i3 >= 0) {
            C16070pC r7 = (C16070pC) this.A03.get(i3);
            int i6 = r7.A01;
            int i7 = r7.A00;
            int i8 = i6 + i7;
            int i9 = r7.A02 + i7;
            int i10 = 8;
            if (z) {
                for (int i11 = i5 - 1; i11 >= i8; i11--) {
                    AbstractC16030p8 r1 = this.A02;
                    if (r1.A03(i11, i4)) {
                        if (!r1.A02(i11, i4)) {
                            i10 = 4;
                        }
                        this.A05[i4] = (i11 << 5) | 16;
                        this.A06[i11] = (i4 << 5) | i10;
                        return;
                    }
                }
                continue;
            } else {
                for (int i12 = i2 - 1; i12 >= i9; i12--) {
                    AbstractC16030p8 r12 = this.A02;
                    if (r12.A03(i4, i12)) {
                        if (!r12.A02(i4, i12)) {
                            i10 = 4;
                        }
                        int i13 = i - 1;
                        this.A06[i13] = (i12 << 5) | 16;
                        this.A05[i12] = (i13 << 5) | i10;
                        return;
                    }
                }
                continue;
            }
            i5 = r7.A01;
            i2 = r7.A02;
            i3--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        r1 = r8.A01;
        r12 = r8.A02;
        r7 = r7 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AbstractC16260pW r19) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16040p9.A02(X.0pW):void");
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1GE  reason: invalid class name */
public class AnonymousClass1GE {
    public boolean A00;
    public final C25201Fn A01;
    public final List A02 = new ArrayList();
    public final int[] A03 = new int[5];

    public AnonymousClass1GE(C25201Fn r2) {
        this.A01 = r2;
    }

    public static boolean A00(int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        } while (i < 5);
        if (i2 < 7) {
            return false;
        }
        float f = ((float) i2) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        List<AnonymousClass1o3> list = this.A02;
        int size = list.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (AnonymousClass1o3 r2 : list) {
            if (r2.A01 >= 2) {
                i++;
                f2 += r2.A00;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (AnonymousClass1o3 r0 : list) {
            f += Math.abs(r0.A00 - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        r8 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0294, code lost:
        if (A00(r6) != false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0121, code lost:
        r1 = Float.NaN;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(int[] r21, int r22, int r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 767
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GE.A02(int[], int, int, boolean):boolean");
    }
}

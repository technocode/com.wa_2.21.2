package X;

import java.lang.reflect.Array;

/* renamed from: X.05j  reason: invalid class name */
public final class AnonymousClass05j {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public AnonymousClass05j(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.A02 = (byte[][]) Array.newInstance(byte.class, iArr);
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder sb = new StringBuilder(((i << 1) * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                byte b = this.A02[i3][i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}

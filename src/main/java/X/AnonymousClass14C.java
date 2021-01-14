package X;

import java.util.Arrays;

/* renamed from: X.14C  reason: invalid class name */
public final class AnonymousClass14C {
    public static final AnonymousClass14C A04 = new AnonymousClass14C(new long[0]);
    public final int A00;
    public final long A01;
    public final long[] A02;
    public final AnonymousClass14B[] A03;

    public AnonymousClass14C(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A02 = Arrays.copyOf(jArr, length);
        AnonymousClass14B[] r2 = new AnonymousClass14B[length];
        this.A03 = r2;
        for (int i = 0; i < length; i++) {
            r2[i] = new AnonymousClass14B();
        }
        this.A01 = -9223372036854775807L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass14C.class != obj.getClass()) {
            return false;
        }
        AnonymousClass14C r5 = (AnonymousClass14C) obj;
        if (this.A00 != r5.A00 || !Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A03) + ((Arrays.hashCode(this.A02) + (((((this.A00 * 31) + ((int) 0)) * 31) + ((int) -9223372036854775807L)) * 31)) * 31);
    }
}

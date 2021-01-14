package X;

import java.util.Arrays;

/* renamed from: X.1VG  reason: invalid class name */
public class AnonymousClass1VG {
    public final int A00;
    public final long A01;

    public AnonymousClass1VG(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AnonymousClass1VG)) {
            return false;
        }
        AnonymousClass1VG r7 = (AnonymousClass1VG) obj;
        if (this.A00 == r7.A00 && this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A01)});
    }
}

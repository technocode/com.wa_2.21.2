package X;

import java.util.Arrays;

/* renamed from: X.359  reason: invalid class name */
public class AnonymousClass359 {
    public final int A00;
    public final int A01;
    public final long A02;

    public AnonymousClass359(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass359)) {
            return false;
        }
        AnonymousClass359 r7 = (AnonymousClass359) obj;
        if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("FutureStageTiming{stage=");
        A0S.append(this.A00);
        A0S.append(", type=");
        A0S.append(this.A01);
        A0S.append(", timeInMillis=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.1YY  reason: invalid class name */
public class AnonymousClass1YY {
    public final int A00;
    public final byte[] A01;

    public AnonymousClass1YY(byte[] bArr) {
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1YY)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass1YY) obj).A01);
    }

    public int hashCode() {
        return this.A00;
    }
}

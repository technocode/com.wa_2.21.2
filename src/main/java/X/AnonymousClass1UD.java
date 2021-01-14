package X;

import java.util.Arrays;

/* renamed from: X.1UD  reason: invalid class name */
public class AnonymousClass1UD {
    public final byte A00;
    public final byte[] A01;

    public AnonymousClass1UD(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass1UD)) {
            return Arrays.equals(this.A01, ((AnonymousClass1UD) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}

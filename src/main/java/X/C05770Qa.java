package X;

import java.util.Arrays;

/* renamed from: X.0Qa  reason: invalid class name and case insensitive filesystem */
public class C05770Qa {
    public final byte A00;
    public final byte[] A01;

    public C05770Qa(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }

    public byte[] A00() {
        return C05360Of.A08(new byte[]{this.A00}, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C05770Qa)) {
            return Arrays.equals(this.A01, ((C05770Qa) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}

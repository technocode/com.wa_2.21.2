package X;

import java.util.Arrays;

/* renamed from: X.0DO  reason: invalid class name */
public class AnonymousClass0DO {
    public final long A00;
    public final AnonymousClass0DN A01;
    public final byte[] A02;

    public String toString() {
        return "SyncdKeyData";
    }

    public AnonymousClass0DO(byte[] bArr, long j, AnonymousClass0DN r4) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = r4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0DO)) {
            return false;
        }
        AnonymousClass0DO r7 = (AnonymousClass0DO) obj;
        if (this.A00 != r7.A00 || !Arrays.equals(this.A02, r7.A02) || !this.A01.equals(r7.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + (Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01}) * 31);
    }
}

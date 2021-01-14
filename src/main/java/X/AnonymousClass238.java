package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.238  reason: invalid class name */
public class AnonymousClass238 implements Comparable {
    public final byte[] A00;

    public AnonymousClass238(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] A00() {
        return AnonymousClass1YV.A0f(new byte[]{5}, this.A00);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((AnonymousClass238) obj).A00));
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass238)) {
            return Arrays.equals(this.A00, ((AnonymousClass238) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }
}

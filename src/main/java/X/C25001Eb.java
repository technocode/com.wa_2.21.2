package X;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: X.1Eb  reason: invalid class name and case insensitive filesystem */
public final class C25001Eb {
    public final long A00;
    public final KeyPair A01;

    public C25001Eb(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25001Eb)) {
            return false;
        }
        C25001Eb r7 = (C25001Eb) obj;
        if (this.A00 == r7.A00) {
            KeyPair keyPair = this.A01;
            PublicKey publicKey = keyPair.getPublic();
            KeyPair keyPair2 = r7.A01;
            if (!publicKey.equals(keyPair2.getPublic()) || !keyPair.getPrivate().equals(keyPair2.getPrivate())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return Arrays.hashCode(new Object[]{keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00)});
    }
}

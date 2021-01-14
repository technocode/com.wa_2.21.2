package X;

/* renamed from: X.0gv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11760gv {
    public void A00(byte[] bArr, int i, int i2) {
        C11820h2 r4 = (C11820h2) this;
        try {
            System.arraycopy(bArr, i, r4.A02, r4.A00, i2);
            r4.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), Integer.valueOf(i2)), e);
        }
    }
}

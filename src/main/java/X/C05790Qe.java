package X;

import java.security.MessageDigest;

/* renamed from: X.0Qe  reason: invalid class name and case insensitive filesystem */
public class C05790Qe extends MessageDigest {
    public AbstractC05820Qj A00;

    public C05790Qe(AbstractC05820Qj r2) {
        super(r2.A4i());
        this.A00 = r2;
    }

    public byte[] engineDigest() {
        AbstractC05820Qj r2 = this.A00;
        byte[] bArr = new byte[r2.A64()];
        r2.A3r(bArr, 0);
        return bArr;
    }

    public void engineReset() {
        this.A00.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.A00.AQm(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }
}

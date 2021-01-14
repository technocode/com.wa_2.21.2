package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLException;

/* renamed from: X.2Vu  reason: invalid class name and case insensitive filesystem */
public final class C50722Vu {
    public MessageDigest A00;
    public MessageDigest A01 = null;

    public C50722Vu(String str) {
        try {
            this.A00 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }

    public void A00(byte[] bArr) {
        if (bArr != null) {
            try {
                this.A01 = (MessageDigest) this.A00.clone();
                this.A00.update(bArr);
            } catch (CloneNotSupportedException e) {
                throw new C29001Wo((byte) 80, new SSLException(e));
            }
        } else {
            throw new C29001Wo((byte) 80, new SSLException("Cannot add null transcript."));
        }
    }

    public byte[] A01() {
        try {
            return ((MessageDigest) this.A00.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }

    public byte[] A02() {
        try {
            return ((MessageDigest) this.A01.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }
}

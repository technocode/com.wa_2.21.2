package X;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: X.3Eb  reason: invalid class name and case insensitive filesystem */
public class C68663Eb implements AbstractC61742tf {
    public final byte[] A00;

    public C68663Eb(byte[] bArr) {
        this.A00 = bArr;
    }

    @Override // X.AbstractC61742tf
    public byte[] A44(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length >= length2) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr3));
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, generatePublic);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("PAY: RsaKey encrypt: payload length is ");
            A0S.append(length2);
            A0S.append(" bytes while key can encrypt at most ");
            A0S.append(length);
            A0S.append(" bytes");
            throw new AssertionError(C018809u.A01("RsaKey", A0S.toString()));
        }
    }
}

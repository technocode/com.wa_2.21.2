package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3EY  reason: invalid class name */
public class AnonymousClass3EY implements AbstractC61742tf {
    public final C11460gK A00;

    public AnonymousClass3EY(byte[] bArr) {
        this.A00 = new C11460gK(bArr);
    }

    @Override // X.AbstractC61742tf
    public byte[] A44(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = C007603r.A0C(16);
        }
        C11470gL A002 = C11470gL.A00();
        byte[] bArr3 = A002.A02.A01;
        byte[][] A09 = C05360Of.A09(C002001d.A3p(C11580gY.A00().A04(this.A00.A01, A002.A01.A01), bArr3, null, 64));
        byte[] bArr4 = A09[0];
        byte[] bArr5 = A09[1];
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(new SecretKeySpec(bArr5, "HmacSHA256"));
                instance2.update(bArr2);
                byte[] A08 = C05360Of.A08(bArr2, bArr3, instance2.doFinal(doFinal), doFinal);
                A002.destroy();
                return A08;
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw new AssertionError(e2);
        }
    }
}

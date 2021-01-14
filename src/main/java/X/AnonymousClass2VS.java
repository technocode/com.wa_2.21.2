package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2VS  reason: invalid class name */
public class AnonymousClass2VS {
    public final int A00 = 32;
    public final String A01 = "SHA-256";

    public byte[] A00(byte[] bArr, byte[] bArr2) {
        String replace = this.A01.replace("-", "");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Hmac");
            sb.append(replace);
            Mac instance = Mac.getInstance(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hmac");
            sb2.append(replace);
            instance.init(new SecretKeySpec(bArr, sb2.toString()));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        String replace = this.A01.replace("-", "");
        try {
            int ceil = (int) Math.ceil(((double) i) / ((double) this.A00));
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                StringBuilder sb = new StringBuilder();
                sb.append("Hmac");
                sb.append(replace);
                Mac instance = Mac.getInstance(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Hmac");
                sb2.append(replace);
                instance.init(new SecretKeySpec(bArr, sb2.toString()));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i2);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                byteArrayOutputStream.write(bArr3, 0, min);
                i -= min;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}

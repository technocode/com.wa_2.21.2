package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Cm  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC68253Cm {
    public static AbstractC68253Cm A00(int i) {
        if (i == 2) {
            return new AnonymousClass3XB();
        }
        if (i == 3) {
            return new AnonymousClass3XC();
        }
        throw new AssertionError(AnonymousClass008.A0F("Unknown version: ", i));
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                int ceil = (int) Math.ceil(((double) i) / 32.0d);
                byte[] bArr4 = new byte[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i2 = !(this instanceof AnonymousClass3XC) ? 0 : 1;
                while (i2 < i2 + ceil) {
                    Mac instance2 = Mac.getInstance("HmacSHA256");
                    instance2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
                    instance2.update(bArr4);
                    if (bArr3 != null) {
                        instance2.update(bArr3);
                    }
                    instance2.update((byte) i2);
                    bArr4 = instance2.doFinal();
                    int min = Math.min(i, bArr4.length);
                    byteArrayOutputStream.write(bArr4, 0, min);
                    i -= min;
                    i2++;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}

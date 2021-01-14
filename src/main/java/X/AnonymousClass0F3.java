package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
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

/* renamed from: X.0F3  reason: invalid class name */
public class AnonymousClass0F3 {
    public static final Charset A02 = Charset.forName("UTF-8");
    public static final byte[] A03 = new byte[0];
    public static volatile AnonymousClass0F3 A04;
    public final C000300f A00;
    public final AnonymousClass0F4 A01;

    public AnonymousClass0F3(C000300f r1, AnonymousClass0F4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0F3 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0F3.class) {
                if (A04 == null) {
                    C000300f A002 = C000300f.A00();
                    if (AnonymousClass0F4.A01 == null) {
                        synchronized (AnonymousClass0F4.class) {
                            if (AnonymousClass0F4.A01 == null) {
                                AnonymousClass0F4.A01 = new AnonymousClass0F4();
                            }
                        }
                    }
                    A04 = new AnonymousClass0F3(A002, AnonymousClass0F4.A01);
                }
            }
        }
        return A04;
    }

    public static final byte[] A01(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new C52512bF(e);
        }
    }

    public static final byte[] A02(String str, byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(bArr2, str));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new C52512bF(e);
        }
    }

    public final byte[] A03(AnonymousClass0DM r8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A08 = C05360Of.A08(bArr, r8.A00);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong((long) A08.length);
        return C05360Of.A07(A02("HmacSHA512", C05360Of.A08(A08, bArr3, order.array()), bArr2), 32);
    }

    public byte[] A04(String str, long j, AnonymousClass0DP r7, byte[] bArr, byte[] bArr2) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A02("HmacSHA256", C05360Of.A08(bArr2, bArr, order.array(), str.getBytes(A02)), this.A01.A00(r7.A00).A01);
    }

    public byte[] A05(String str, long j, byte[] bArr, AnonymousClass0DP r8) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A02("HmacSHA256", C05360Of.A08(bArr, order.array(), str.getBytes(A02)), this.A01.A00(r8.A00).A02);
    }
}

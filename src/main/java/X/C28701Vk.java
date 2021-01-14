package X;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Vk  reason: invalid class name and case insensitive filesystem */
public class C28701Vk {
    public static volatile C28701Vk A01;
    public final C28751Vp A00;

    public C28701Vk(C28751Vp r1) {
        this.A00 = r1;
    }

    public static C28701Vk A00() {
        if (A01 == null) {
            synchronized (C28701Vk.class) {
                if (A01 == null) {
                    A01 = new C28701Vk(C28751Vp.A00());
                }
            }
        }
        return A01;
    }

    public static byte[] A01(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Cipher cipher = (Cipher) AnonymousClass1UL.A00(instance, "AES/CBC/PKCS5Padding", instance.getProvider().getName());
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new SecurityException(e);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2) {
        boolean z = true;
        byte[] A0G = C007603r.A0G(bArr, bArr2);
        if (A0G.length < 20) {
            z = false;
        }
        AnonymousClass00E.A06(z);
        return C05360Of.A07(A0G, 20);
    }

    public String A03(C28831Vx r9, String str) {
        if (r9.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A0A = C05360Of.A0A(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A0A[0];
                byte[] bArr2 = A0A[1];
                byte[] bArr3 = A0A[2];
                byte[] A05 = A05(r9);
                if (Arrays.equals(bArr, A02(A05, C05360Of.A08(bArr2, bArr3)))) {
                    return new String(A01(2, bArr2, bArr3, A05));
                }
                throw new SecurityException("Data mac corrupt");
            } catch (ParseException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public String A04(C28831Vx r8, String str) {
        if (r8.A03) {
            byte[] A05 = A05(r8);
            byte[] A02 = A02(A05, str.getBytes());
            boolean z = false;
            if (A02.length >= 16) {
                z = true;
            }
            AnonymousClass00E.A06(z);
            byte[] A07 = C05360Of.A07(A02, 16);
            byte[] A08 = C05360Of.A08(A07, A01(1, A07, str.getBytes(), A05));
            return Base64.encodeToString(C05360Of.A08(A02(A05, A08), A08), 11);
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public final synchronized byte[] A05(C28831Vx r9) {
        String string;
        C28751Vp r1 = this.A00;
        String str = r9.A01;
        String A012 = C28751Vp.A01(str, "auth/encryption_key");
        SharedPreferences sharedPreferences = r1.A00;
        string = sharedPreferences.getString(A012, null);
        if (string == null) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator = (KeyGenerator) AnonymousClass1UL.A00(instance, "AES", instance.getProvider().getName());
                SecureRandom A013 = AnonymousClass1UL.A01();
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                keyGenerator.init(256, A013);
                string = Base64.encodeToString(encoded, 11);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                string = null;
            }
            sharedPreferences.edit().putString(C28751Vp.A01(str, "auth/encryption_key"), string).apply();
        }
        return Base64.decode(string, 11);
    }
}

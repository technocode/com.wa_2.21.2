package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.3BA  reason: invalid class name */
public class AnonymousClass3BA {
    public static AnonymousClass3BA A03;
    public KeyStore A00;
    public final C018809u A01 = C018809u.A00("CLKeyStorageManager", "onboarding", "IN");
    public final AnonymousClass3B9 A02;

    public AnonymousClass3BA(Context context, AnonymousClass022 r6) {
        this.A02 = new AnonymousClass3B9(r6);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                this.A01.A07(null, "initializing KS", null);
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load(null);
                A03(context);
            } catch (Exception e) {
                this.A01.A06("onboarding", null, e);
                throw new RuntimeException(e);
            }
        }
    }

    public static AnonymousClass3BA A00(Context context) {
        if (A03 == null) {
            synchronized (AnonymousClass3BA.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass3BA(context, AnonymousClass022.A00());
                }
            }
        }
        return A03;
    }

    public final String A01(String str, String str2, String str3) {
        try {
            this.A01.A07("onboarding", "decrypt the key", new AnonymousClass1X2[]{new AnonymousClass1X2("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            byte[] decode = Base64.decode(str3, 0);
            byte[] bArr = new byte[16];
            System.arraycopy(decode, 0, bArr, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            int length = decode.length - 16;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, 16, bArr2, 0, length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= 18) {
                z = true;
            }
            if (z) {
                Cipher instance = Cipher.getInstance(i >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                instance.init(2, secretKeySpec, ivParameterSpec);
                return AnonymousClass1YV.A09(instance.doFinal(bArr2));
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("PAY");
            A0S.append(e.toString());
            Log.w(A0S.toString());
            throw new RuntimeException(e);
        }
    }

    public final String A02(String str, String str2, String str3) {
        try {
            this.A01.A07("onboarding", " encrypt the key ", new AnonymousClass1X2[]{new AnonymousClass1X2("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= 18) {
                z = true;
            }
            if (z) {
                Cipher instance = Cipher.getInstance(i >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
                byte[] doFinal = instance.doFinal(AnonymousClass1YV.A0b(str3));
                int length = doFinal.length;
                byte[] bArr2 = new byte[(length + 16)];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(doFinal, 0, bArr2, 16, length);
                return Base64.encodeToString(bArr2, 0);
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public final synchronized void A03(Context context) {
        SharedPreferences sharedPreferences = this.A02.A00;
        if (!sharedPreferences.getBoolean("use_ks", false)) {
            try {
                this.A00.load(null);
                A04(context, "k0");
                A04(context, "token");
                A05("aes_k0", "k0");
                A05("aes_token", "token");
                sharedPreferences.edit().putBoolean("use_ks", true).apply();
            } catch (Exception e) {
                C018809u r3 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(" Skip Android KeyStore setup because: ");
                sb.append(e.toString());
                r3.A06("onboarding", sb.toString(), e);
            }
        }
    }

    public final void A04(Context context, String str) {
        try {
            this.A01.A07("onboarding", "generate rsa key pairs for", new AnonymousClass1X2[]{new AnonymousClass1X2("alias", str)});
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(2, 1);
            KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
            StringBuilder sb = new StringBuilder();
            sb.append("CN=");
            sb.append(str);
            KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(sb.toString())).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(build);
            instance3.generateKeyPair();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public final void A05(String str, String str2) {
        C018809u r5 = this.A01;
        r5.A07("onboarding", "generate and store aes key", new AnonymousClass1X2[]{new AnonymousClass1X2("alias", str2)});
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str2, null);
            int i = Build.VERSION.SDK_INT;
            if (i >= 18) {
                Cipher instance = Cipher.getInstance(i >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                instance.init(1, privateKeyEntry.getCertificate().getPublicKey());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
                cipherOutputStream.write(bArr);
                cipherOutputStream.close();
                this.A02.A00.edit().putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).apply();
                return;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            r5.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public synchronized void A06(String str, String str2) {
        if (A07()) {
            try {
                String A022 = A02("k0", "aes_k0", str);
                str2 = A02("token", "aes_token", str2);
                str = A022;
            } catch (Exception e) {
                this.A02.A00.edit().putBoolean("use_ks", false).apply();
                C018809u r3 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(" Skip using Android KeyStore ");
                sb.append(e.toString());
                r3.A06("onboarding", sb.toString(), e);
            }
        }
        SharedPreferences sharedPreferences = this.A02.A00;
        sharedPreferences.edit().putString("k0", str).apply();
        sharedPreferences.edit().putString("token", str2).apply();
    }

    public final boolean A07() {
        if (this.A00 == null || !this.A02.A00.getBoolean("use_ks", false)) {
            return false;
        }
        return true;
    }

    public final byte[] A08(byte[] bArr, String str) {
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str, null);
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= 18) {
                z = true;
            }
            if (z) {
                Cipher instance = Cipher.getInstance(i >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                instance.init(2, privateKeyEntry.getPrivateKey());
                CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), instance);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    arrayList.add(Byte.valueOf((byte) read));
                }
                int size = arrayList.size();
                byte[] bArr2 = new byte[size];
                for (int i2 = 0; i2 < size; i2++) {
                    bArr2[i2] = ((Byte) arrayList.get(i2)).byteValue();
                }
                return bArr2;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }
}

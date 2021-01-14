package X;

import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.2x7  reason: invalid class name and case insensitive filesystem */
public class C63852x7 {
    public static volatile C63852x7 A04;
    public KeyStore A00;
    public final AnonymousClass00G A01;
    public final C02010Ah A02;
    public final C018809u A03 = C018809u.A00("PaymentTrustedDeviceManager", "infra", "COMMON");

    public C63852x7(AnonymousClass00G r5, C02010Ah r6) {
        this.A01 = r5;
        this.A02 = r6;
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load(null);
                if (!this.A02.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                    A01();
                }
            } catch (Exception e) {
                C018809u r2 = this.A03;
                StringBuilder A0S = AnonymousClass008.A0S("keystore init fails: ");
                A0S.append(e.toString());
                r2.A04(A0S.toString());
            }
        }
    }

    public PrivateKey A00() {
        C02010Ah r7 = this.A02;
        String string = r7.A01().getString("payment_trusted_device_credential", null);
        byte[] decode = !TextUtils.isEmpty(string) ? Base64.decode(string, 3) : null;
        if (decode == null) {
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
                instance.initialize(2048);
                PrivateKey privateKey = instance.genKeyPair().getPrivate();
                if (Build.VERSION.SDK_INT >= 18) {
                    byte[] A032 = A03(privateKey.getEncoded());
                    if (A032 == null) {
                        return null;
                    }
                    AnonymousClass008.A0q(r7, "payment_trusted_device_credential", Base64.encodeToString(A032, 3));
                    if (!r7.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                        r7.A01().edit().putBoolean("payment_trusted_device_credential_use_keystore", true).apply();
                    }
                    Arrays.fill(A032, (byte) 0);
                    return privateKey;
                }
                AnonymousClass008.A0q(r7, "payment_trusted_device_credential", Base64.encodeToString(privateKey.getEncoded(), 3));
                return privateKey;
            } catch (NoSuchAlgorithmException e) {
                C018809u r2 = this.A03;
                StringBuilder A0S = AnonymousClass008.A0S("generate RSA key fails: ");
                A0S.append(e.toString());
                r2.A04(A0S.toString());
                return null;
            }
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    if (!r7.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                        byte[] A033 = A03(decode);
                        if (A033 != null) {
                            AnonymousClass008.A0q(r7, "payment_trusted_device_credential", Base64.encodeToString(A033, 3));
                            r7.A01().edit().putBoolean("payment_trusted_device_credential_use_keystore", true).apply();
                            Arrays.fill(A033, (byte) 0);
                        }
                    } else {
                        try {
                            byte[] bArr = null;
                            String string2 = r7.A01().getString("payment_trusted_device_credential_encrypted_aes", null);
                            if (!TextUtils.isEmpty(string2)) {
                                bArr = Base64.decode(string2, 3);
                            }
                            if (bArr == null) {
                                bArr = A02();
                            }
                            if (bArr == null) {
                                decode = null;
                            } else {
                                byte[] A042 = A04(bArr);
                                if (A042 == null) {
                                    decode = null;
                                } else {
                                    byte[] bArr2 = new byte[16];
                                    System.arraycopy(decode, 0, bArr2, 0, 16);
                                    int length = decode.length - 16;
                                    byte[] bArr3 = new byte[length];
                                    System.arraycopy(decode, 16, bArr3, 0, length);
                                    SecretKeySpec secretKeySpec = new SecretKeySpec(A042, "AES");
                                    Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                    instance2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                                    decode = instance2.doFinal(bArr3);
                                }
                            }
                        } catch (Exception e2) {
                            C018809u r22 = this.A03;
                            StringBuilder A0S2 = AnonymousClass008.A0S("decrypt key fails: ");
                            A0S2.append(e2.toString());
                            r22.A04(A0S2.toString());
                            decode = null;
                        }
                    }
                }
                if (decode == null) {
                    return null;
                }
                PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(decode);
                KeyFactory instance3 = KeyFactory.getInstance("RSA");
                Arrays.fill(decode, (byte) 0);
                return instance3.generatePrivate(pKCS8EncodedKeySpec);
            } catch (Exception e3) {
                C018809u r23 = this.A03;
                StringBuilder A0S3 = AnonymousClass008.A0S("loadRSAKey fails, ");
                A0S3.append(e3.toString());
                r23.A04(A0S3.toString());
                return null;
            }
        }
    }

    public final void A01() {
        if (!this.A02.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
            try {
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance2.add(1, 50);
                KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(this.A01.A00).setAlias("payment_trusted_device_key_alias").setSubject(new X500Principal("CN=payment_trusted_device_key_alias")).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                instance3.initialize(build);
                instance3.generateKeyPair();
            } catch (Exception e) {
                C018809u r2 = this.A03;
                StringBuilder A0S = AnonymousClass008.A0S("generate RSA key pairs fails: ");
                A0S.append(e.toString());
                r2.A04(A0S.toString());
            }
            A02();
        }
    }

    public final byte[] A02() {
        byte[] bArr;
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
            cipherOutputStream.write(bArr2);
            cipherOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C018809u r2 = this.A03;
            StringBuilder A0S = AnonymousClass008.A0S("RSA encrypt fails: ");
            A0S.append(e.toString());
            r2.A04(A0S.toString());
            bArr = null;
        }
        if (bArr != null) {
            C02010Ah r22 = this.A02;
            if (r22 != null) {
                AnonymousClass008.A0q(r22, "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr, 3));
            } else {
                throw null;
            }
        }
        Arrays.fill(bArr2, (byte) 0);
        return bArr;
    }

    public final byte[] A03(byte[] bArr) {
        byte[] A042;
        try {
            byte[] bArr2 = null;
            String string = this.A02.A01().getString("payment_trusted_device_credential_encrypted_aes", null);
            if (!TextUtils.isEmpty(string)) {
                bArr2 = Base64.decode(string, 3);
            }
            if (bArr2 == null) {
                bArr2 = A02();
            }
            if (bArr2 == null || (A042 = A04(bArr2)) == null) {
                return null;
            }
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A042, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr);
            int length = doFinal.length;
            byte[] bArr4 = new byte[(length + 16)];
            System.arraycopy(bArr3, 0, bArr4, 0, 16);
            System.arraycopy(doFinal, 0, bArr4, 16, length);
            return bArr4;
        } catch (Exception e) {
            C018809u r2 = this.A03;
            StringBuilder A0S = AnonymousClass008.A0S("encrypt key fails: ");
            A0S.append(e.toString());
            r2.A04(A0S.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A04(byte[] r9) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63852x7.A04(byte[]):byte[]");
    }
}

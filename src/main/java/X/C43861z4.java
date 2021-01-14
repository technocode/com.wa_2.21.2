package X;

import android.security.keystore.KeyGenParameterSpec;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.1z4  reason: invalid class name and case insensitive filesystem */
public class C43861z4 extends AnonymousClass1VU {
    public final String A00 = "aes_auth_key";

    @Override // X.AnonymousClass1VU
    public String A01() {
        return "EncryptedKeyHelperAESKeyStore/";
    }

    public C43861z4(AnonymousClass009 r2, C000300f r3) {
        super(r2, r3);
    }

    @Override // X.AnonymousClass1VU
    public C11560gW A00(byte[] bArr) {
        SecretKey secretKey;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            String str = this.A00;
            if (!instance.containsAlias(str) || !instance.entryInstanceOf(str, KeyStore.SecretKeyEntry.class)) {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance2.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                secretKey = instance2.generateKey();
            } else {
                secretKey = A06();
            }
            if (secretKey != null) {
                Cipher instance3 = Cipher.getInstance("AES/GCM/NoPadding");
                instance3.init(1, secretKey);
                return new C11560gW(0, instance3.doFinal(bArr), instance3.getIV(), null, null);
            }
            throw new KeyStoreException("could not get key store entry");
        } catch (NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESKeyStore/");
            sb.append("crypto issue on encryption");
            Log.e(sb.toString(), e);
            return null;
        } catch (IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EncryptedKeyHelperAESKeyStore/");
            sb2.append("key store issue on decryption");
            Log.e(sb2.toString(), e2);
            return null;
        }
    }

    @Override // X.AnonymousClass1VU
    public void A02() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            instance.deleteEntry(this.A00);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESKeyStore/");
            sb.append("failed to clear keyStore");
            Log.e(sb.toString());
        }
    }

    @Override // X.AnonymousClass1VU
    public byte[] A05(C11560gW r9) {
        if (r9.A00 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESKeyStore/");
            sb.append("getDecrypted invalid type");
            Log.e(sb.toString());
            return null;
        }
        try {
            SecretKey A06 = A06();
            if (A06 != null) {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, A06, new GCMParameterSpec(128, r9.A03));
                return instance.doFinal(r9.A02);
            }
            throw new KeyStoreException("could not get key store entry");
        } catch (NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EncryptedKeyHelperAESKeyStore/");
            sb2.append("crypto issue on decryption");
            Log.e(sb2.toString(), e);
            return null;
        } catch (IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("EncryptedKeyHelperAESKeyStore/");
            sb3.append("key store issue on decryption");
            Log.e(sb3.toString(), e2);
            return null;
        }
    }

    public final SecretKey A06() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        try {
            return ((KeyStore.SecretKeyEntry) instance.getEntry(this.A00, null)).getSecretKey();
        } catch (UnrecoverableKeyException unused) {
            return ((KeyStore.SecretKeyEntry) instance.getEntry(this.A00, null)).getSecretKey();
        }
    }
}

package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1VU  reason: invalid class name */
public abstract class AnonymousClass1VU {
    public final AnonymousClass009 A00;
    public final C000300f A01;
    public final Set A02 = new HashSet();

    public void A02() {
    }

    public AnonymousClass1VU(AnonymousClass009 r2, C000300f r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public C11560gW A00(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[4];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr2);
            byte[] bArr3 = new byte[16];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr3);
            byte[] bArr4 = new byte[16];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr4);
            String encodeToString = Base64.encodeToString(bArr4, 3);
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass04k.A0I);
            sb.append(encodeToString);
            SecretKeySpec secretKeySpec = new SecretKeySpec(AnonymousClass05D.A00(sb.toString(), bArr2), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return new C11560gW(2, instance.doFinal(bArr), bArr3, bArr2, encodeToString);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            StringBuilder sb2 = new StringBuilder("EncryptedKeyHelperAESPassword/");
            sb2.append("crypto issue on encryption");
            Log.e(sb2.toString(), e);
            return null;
        }
    }

    public String A01() {
        return "EncryptedKeyHelperAESPassword/";
    }

    public void A03(AnonymousClass00A r13) {
        AnonymousClass009 r3 = this.A00;
        r3.A04("EncryptedKeyHelper issue", r13.getMessage(), false);
        if (this.A01.A0D(AbstractC000400g.A09)) {
            if (r3 != null) {
                Log.e("UNCAUGHT EXCEPTION", r13);
                Set set = this.A02;
                if (!set.contains(r13.getMessage())) {
                    set.add(r13.getMessage());
                    r3.A06(false, true, false, false, false, new HashSet(Collections.singletonList("log_files_upload")), null, null);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void A04(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(A01());
        sb.append(str);
        AnonymousClass00A r1 = new AnonymousClass00A(sb.toString());
        r1.setStackTrace(exc.getStackTrace());
        A03(r1);
    }

    public byte[] A05(C11560gW r8) {
        if (r8.A00 != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESPassword/");
            sb.append("getDecrypted invalid type");
            Log.e(sb.toString());
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AnonymousClass04k.A0I);
            sb2.append(r8.A01);
            SecretKeySpec secretKeySpec = new SecretKeySpec(AnonymousClass05D.A00(sb2.toString(), r8.A04), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(2, secretKeySpec, new IvParameterSpec(r8.A03));
            return instance.doFinal(r8.A02);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("EncryptedKeyHelperAESPassword/");
            sb3.append("crypto issue on decryption");
            Log.e(sb3.toString(), e);
            return null;
        }
    }
}

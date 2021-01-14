package X;

import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0BC  reason: invalid class name */
public class AnonymousClass0BC {
    public static volatile AnonymousClass0BC A05;
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public boolean A04;

    public static AnonymousClass0BC A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0BC.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0BC();
                }
            }
        }
        return A05;
    }

    public static final CipherOutputStream A01(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }

    public synchronized OutputStream A02(OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        A03();
        try {
            outputStream = new DeflaterOutputStream(A01(outputStream, this.A02, bArr, bArr2), new Deflater(1, false));
        } catch (InvalidKeyException e) {
            Log.w("encrypter/encrypt/invalidkey", e);
        } catch (InvalidAlgorithmParameterException e2) {
            Log.w("encrypter/encrypt/invalidalgparam", e2);
        }
        return outputStream;
    }

    public final synchronized void A03() {
        if (!this.A04) {
            this.A02 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A00 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A03 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A01 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A04 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.io.InputStream r12, java.io.OutputStream r13, int r14, int r15, long r16, X.C39171r4 r18, X.AnonymousClass1Y3 r19, byte[] r20, byte[] r21) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BC.A04(java.io.InputStream, java.io.OutputStream, int, int, long, X.1r4, X.1Y3, byte[], byte[]):void");
    }
}

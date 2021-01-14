package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.net.ssl.SSLException;

/* renamed from: X.3WE  reason: invalid class name */
public class AnonymousClass3WE implements AnonymousClass2VM {
    public Cipher A00;
    public SecretKey A01;
    public byte[] A02;

    @Override // X.AnonymousClass2VM
    public byte[] A3Y(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        try {
            this.A00.init(2, this.A01, new GCMParameterSpec(128, AnonymousClass3WD.A00(this.A02, j)));
            this.A00.updateAAD(bArr);
            return this.A00.doFinal(bArr2, i, i2);
        } catch (BadPaddingException e) {
            throw new C29001Wo((byte) 80, new SSLException("Bad padding", e));
        } catch (IllegalBlockSizeException e2) {
            throw new C29001Wo((byte) 80, new SSLException("Illegal block size ", e2));
        } catch (InvalidAlgorithmParameterException e3) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid Algorithm Params", e3));
        } catch (InvalidKeyException e4) {
            throw new C29001Wo((byte) 80, new SSLException(" Invalid Key", e4));
        }
    }

    @Override // X.AnonymousClass2VM
    public byte[] A43(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        try {
            this.A00.init(1, this.A01, new GCMParameterSpec(128, AnonymousClass3WD.A00(this.A02, j)));
            this.A00.updateAAD(bArr);
            return this.A00.doFinal(bArr2, i, i2);
        } catch (BadPaddingException e) {
            throw new C29001Wo((byte) 80, new SSLException("Bad padding", e));
        } catch (IllegalBlockSizeException e2) {
            throw new C29001Wo((byte) 80, new SSLException("Illegal block size ", e2));
        } catch (InvalidAlgorithmParameterException e3) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid Algorithm Params", e3));
        } catch (InvalidKeyException e4) {
            throw new C29001Wo((byte) 80, new SSLException(" Invalid Key", e4));
        }
    }

    @Override // X.AnonymousClass2VM
    public C006703h A8b() {
        return C006703h.A00();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.A00 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw new X.C29001Wo((byte) 80, new javax.net.ssl.SSLException("No such padding", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        throw new X.C29001Wo((byte) 80, new javax.net.ssl.SSLException("AES/GCM/NoPadding not found", r2));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0026 */
    @Override // X.AnonymousClass2VM
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AAY(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r2 = "AES/GCM/NoPadding"
            r3 = 80
            if (r5 == 0) goto L_0x0056
            int r1 = r5.length
            r0 = 16
            if (r1 != r0) goto L_0x0056
            if (r6 == 0) goto L_0x0049
            int r1 = r6.length
            r0 = 12
            if (r1 != r0) goto L_0x0049
            r4.A02 = r6
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            r0.<init>(r5, r1)
            r4.A01 = r0
            java.lang.String r0 = "AndroidOpenSSL"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r2, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            return
        L_0x0026:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x003b, NoSuchPaddingException -> 0x002d }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException -> 0x003b, NoSuchPaddingException -> 0x002d }
            return
        L_0x002d:
            r2 = move-exception
            java.lang.String r0 = "No such padding"
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0, r2)
            X.1Wo r0 = new X.1Wo
            r0.<init>(r3, r1)
            throw r0
        L_0x003b:
            r2 = move-exception
            java.lang.String r0 = "AES/GCM/NoPadding not found"
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0, r2)
            X.1Wo r0 = new X.1Wo
            r0.<init>(r3, r1)
            throw r0
        L_0x0049:
            java.lang.String r0 = "Invalid iv length."
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.1Wo r0 = new X.1Wo
            r0.<init>(r3, r1)
            throw r0
        L_0x0056:
            java.lang.String r0 = "Invalid key length."
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.1Wo r0 = new X.1Wo
            r0.<init>(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WE.AAY(byte[], byte[]):void");
    }
}

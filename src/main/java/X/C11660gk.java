package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.0gk  reason: invalid class name and case insensitive filesystem */
public class C11660gk extends MacSpi {
    public C11510gR A00;

    public C11660gk(C11510gR r1) {
        this.A00 = r1;
    }

    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.A00.A01(bArr);
        return bArr;
    }

    public int engineGetMacLength() {
        return this.A00.A01;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        AbstractC11530gT r4;
        if (key != null) {
            if (key instanceof C11540gU) {
                C11540gU r6 = (C11540gU) key;
                r4 = r6.param;
                if (r4 == null) {
                    boolean z = algorithmParameterSpec instanceof PBEParameterSpec;
                    if (!z) {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    } else if (algorithmParameterSpec == null || !z) {
                        throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
                    } else {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        C11500gQ A0A = AnonymousClass1YV.A0A(r6.type, r6.digest);
                        byte[] encoded = r6.getEncoded();
                        byte[] salt = pBEParameterSpec.getSalt();
                        int iterationCount = pBEParameterSpec.getIterationCount();
                        A0A.A02 = encoded;
                        A0A.A03 = salt;
                        A0A.A00 = iterationCount;
                        r4 = A0A.A00(r6.keySize);
                        for (int i = 0; i != encoded.length; i++) {
                            encoded[i] = 0;
                        }
                    }
                }
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                r4 = new C11550gV(new C11520gS(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec == null) {
                r4 = new C11520gS(key.getEncoded());
            } else {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
            this.A00.A00(r4);
            return;
        }
        throw new InvalidKeyException("key is null");
    }

    public void engineReset() {
        C11510gR r1 = this.A00;
        r1.A02.reset();
        AbstractC05820Qj r3 = r1.A02;
        byte[] bArr = r1.A05;
        r3.update(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        this.A00.A02.AQm(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.A02.update(bArr, i, i2);
    }
}

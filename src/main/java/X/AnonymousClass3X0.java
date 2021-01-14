package X;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.3X0  reason: invalid class name */
public class AnonymousClass3X0 extends AbstractC68033Bl {
    public byte[] A00;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (str.equals("RAW")) {
            return C002001d.A3m(this.A00);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.A00 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            return;
        }
        throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        this.A00 = C002001d.A3m(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        if (str.equals("RAW")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameters format in IV parameters object");
    }
}

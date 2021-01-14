package X;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.3Bl  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC68033Bl extends AlgorithmParametersSpi {
    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            AnonymousClass3X0 r1 = (AnonymousClass3X0) this;
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(r1.A00);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }
}

package org.whispersystems.curve25519;

import X.AbstractC11590ga;
import X.AnonymousClass3CN;
import X.C05850Qn;

public class NativeCurve25519Provider implements AbstractC11590ga {
    public C05850Qn A00 = new C05850Qn();

    private native boolean smokeCheck(int i);

    @Override // X.AbstractC11590ga
    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    @Override // X.AbstractC11590ga
    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    @Override // X.AbstractC11590ga
    public native byte[] generatePublicKey(byte[] bArr);

    @Override // X.AbstractC11590ga
    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new AnonymousClass3CN(e);
        }
    }

    @Override // X.AbstractC11590ga
    public byte[] A4Y() {
        return generatePrivateKey(A8f(32));
    }

    @Override // X.AbstractC11590ga
    public byte[] A8f(int i) {
        byte[] bArr = new byte[i];
        C05850Qn.A00(bArr);
        return bArr;
    }
}

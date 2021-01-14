package org.whispersystems.curve25519;

import X.AbstractC11590ga;
import X.AnonymousClass3CN;

public class OpportunisticCurve25519Provider implements AbstractC11590ga {
    public AbstractC11590ga A00;

    public OpportunisticCurve25519Provider() {
        try {
            this.A00 = new NativeCurve25519Provider();
        } catch (AnonymousClass3CN unused) {
            this.A00 = new JavaCurve25519Provider();
        }
    }

    @Override // X.AbstractC11590ga
    public byte[] A4Y() {
        return this.A00.A4Y();
    }

    @Override // X.AbstractC11590ga
    public byte[] A8f(int i) {
        return this.A00.A8f(i);
    }

    @Override // X.AbstractC11590ga
    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.A00.calculateAgreement(bArr, bArr2);
    }

    @Override // X.AbstractC11590ga
    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.calculateSignature(bArr, bArr2, bArr3);
    }

    @Override // X.AbstractC11590ga
    public byte[] generatePublicKey(byte[] bArr) {
        return this.A00.generatePublicKey(bArr);
    }

    @Override // X.AbstractC11590ga
    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.verifySignature(bArr, bArr2, bArr3);
    }
}

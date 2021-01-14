package X;

import javax.security.auth.Destroyable;

/* renamed from: X.0gL  reason: invalid class name and case insensitive filesystem */
public class C11470gL implements Destroyable {
    public boolean A00;
    public final C11480gM A01;
    public final C11460gK A02;

    public C11470gL(C11460gK r1, C11480gM r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public static C11470gL A00() {
        C11600gc A022 = C11580gY.A00().A02();
        return new C11470gL(new C11460gK(A022.A01), new C11480gM(A022.A00));
    }

    public static C11470gL A01(byte[] bArr) {
        if (bArr == null || bArr.length != 64) {
            return null;
        }
        byte[][] A09 = C05360Of.A09(bArr);
        return new C11470gL(new C11460gK(A09[1]), new C11480gM(A09[0]));
    }

    public byte[] A02() {
        return C05360Of.A08(this.A01.A01, this.A02.A01);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (!this.A00) {
            this.A01.destroy();
            this.A02.destroy();
            this.A00 = true;
        }
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}

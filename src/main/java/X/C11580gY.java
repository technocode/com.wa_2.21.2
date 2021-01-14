package X;

/* renamed from: X.0gY  reason: invalid class name and case insensitive filesystem */
public class C11580gY {
    public final AbstractC11590ga A00;

    public C11580gY(AbstractC11590ga r1) {
        this.A00 = r1;
    }

    public static C11580gY A00() {
        if ("native".equals("best")) {
            return new C11580gY(A01("NativeCurve25519Provider"));
        }
        if ("java".equals("best")) {
            return new C11580gY(A01("JavaCurve25519Provider"));
        }
        if ("j2me".equals("best")) {
            return new C11580gY(A01("J2meCurve25519Provider"));
        }
        if ("best".equals("best")) {
            return new C11580gY(A01("OpportunisticCurve25519Provider"));
        }
        throw new AnonymousClass3CN();
    }

    public static AbstractC11590ga A01(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("org.whispersystems.curve25519.");
            sb.append(str);
            return (AbstractC11590ga) Class.forName(sb.toString()).newInstance();
        } catch (InstantiationException e) {
            throw new AnonymousClass3CN(e);
        } catch (IllegalAccessException e2) {
            throw new AnonymousClass3CN(e2);
        } catch (ClassNotFoundException e3) {
            throw new AnonymousClass3CN(e3);
        }
    }

    public C11600gc A02() {
        AbstractC11590ga r0 = this.A00;
        byte[] A4Y = r0.A4Y();
        return new C11600gc(r0.generatePublicKey(A4Y), A4Y);
    }

    public boolean A03(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] A04(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.A00.calculateAgreement(bArr2, bArr);
        } else {
            throw new IllegalArgumentException("Keys must be 32 bytes!");
        }
    }
}

package X;

import java.text.ParseException;

/* renamed from: X.3XD  reason: invalid class name */
public class AnonymousClass3XD implements AbstractC29491Yx {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    @Override // X.AbstractC29491Yx
    public int A9V() {
        return 4;
    }

    public AnonymousClass3XD(int i, int i2, byte[] bArr, AbstractC29461Yo r15) {
        byte[] bArr2 = {(byte) 51};
        AbstractC04160Jh A0B = C77613gi.A04.AQb();
        A0B.A02();
        C77613gi r1 = (C77613gi) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = i;
        A0B.A02();
        C77613gi r12 = (C77613gi) A0B.A00;
        r12.A00 |= 2;
        r12.A02 = i2;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        C77613gi r13 = (C77613gi) A0B.A00;
        r13.A00 |= 4;
        r13.A03 = A002;
        byte[] A09 = A0B.A01().A09();
        byte[] A0f = AnonymousClass1YV.A0f(bArr2, A09);
        try {
            int A9V = r15.A9V();
            if (A9V == 5) {
                C11580gY A003 = C11580gY.A00();
                byte[] bArr3 = ((AnonymousClass3XA) r15).A00;
                if (bArr3 == null || bArr3.length != 32) {
                    throw new IllegalArgumentException("Invalid private key length!");
                }
                AbstractC11590ga r14 = A003.A00;
                this.A03 = AnonymousClass1YV.A0f(bArr2, A09, r14.calculateSignature(r14.A8f(64), bArr3, A0f));
                this.A01 = i;
                this.A00 = i2;
                this.A02 = bArr;
                return;
            }
            StringBuilder A0S = AnonymousClass008.A0S("Unknown type: ");
            A0S.append(A9V);
            throw new C29361Ye(A0S.toString());
        } catch (C29361Ye e) {
            throw new AssertionError(e);
        }
    }

    public AnonymousClass3XD(byte[] bArr) {
        try {
            byte[][] A0i = AnonymousClass1YV.A0i(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b = A0i[0][0];
            byte[] bArr2 = A0i[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C29401Yi(sb.toString());
            } else if (i <= 3) {
                C77613gi r3 = (C77613gi) AnonymousClass078.A02(C77613gi.A04, bArr2);
                int i2 = r3.A00;
                if ((i2 & 1) == 1 && (i2 & 2) == 2 && (i2 & 4) == 4) {
                    this.A03 = bArr;
                    this.A01 = r3.A01;
                    this.A00 = r3.A02;
                    this.A02 = r3.A03.A01();
                    return;
                }
                throw new C29381Yg("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C29381Yg(sb2.toString());
            }
        } catch (C04190Jk | ParseException e) {
            throw new C29381Yg(e);
        }
    }

    public void A00(AnonymousClass238 r5) {
        try {
            byte[] bArr = this.A03;
            byte[][] A0h = AnonymousClass1YV.A0h(bArr, bArr.length - 64, 64);
            if (!C11580gY.A00().A03(r5.A00, A0h[0], A0h[1])) {
                throw new C29381Yg("Invalid signature!");
            }
        } catch (C29361Ye e) {
            throw new C29381Yg(e);
        }
    }

    @Override // X.AbstractC29491Yx
    public byte[] ANr() {
        return this.A03;
    }
}

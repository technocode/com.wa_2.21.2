package X;

/* renamed from: X.23B  reason: invalid class name */
public class AnonymousClass23B implements AbstractC29491Yx {
    public final int A00;
    public final int A01;
    public final AnonymousClass238 A02;
    public final byte[] A03;
    public final byte[] A04;

    @Override // X.AbstractC29491Yx
    public int A9V() {
        return 5;
    }

    public AnonymousClass23B(int i, int i2, byte[] bArr, AnonymousClass238 r12) {
        AbstractC04160Jh A0B = C77593gg.A05.AQb();
        A0B.A02();
        C77593gg r1 = (C77593gg) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = i;
        A0B.A02();
        C77593gg r13 = (C77593gg) A0B.A00;
        r13.A00 |= 2;
        r13.A02 = i2;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        C77593gg r14 = (C77593gg) A0B.A00;
        r14.A00 |= 4;
        r14.A03 = A002;
        byte[] A003 = r12.A00();
        AnonymousClass071 A004 = AnonymousClass071.A00(A003, 0, A003.length);
        A0B.A02();
        C77593gg r15 = (C77593gg) A0B.A00;
        r15.A00 |= 8;
        r15.A04 = A004;
        byte[] A09 = A0B.A01().A09();
        this.A00 = i;
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = r12;
        this.A04 = AnonymousClass1YV.A0f(new byte[]{(byte) 51}, A09);
    }

    public AnonymousClass23B(byte[] bArr) {
        try {
            byte[][] A0h = AnonymousClass1YV.A0h(bArr, 1, bArr.length - 1);
            byte b = A0h[0][0];
            byte[] bArr2 = A0h[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C29401Yi(sb.toString());
            } else if (i <= 3) {
                C77593gg r3 = (C77593gg) AnonymousClass078.A02(C77593gg.A05, bArr2);
                int i2 = r3.A00;
                if ((i2 & 1) != 1 ? false : true) {
                    if ((i2 & 2) == 2) {
                        if ((i2 & 4) == 4) {
                            if ((i2 & 8) == 8) {
                                this.A04 = bArr;
                                this.A00 = r3.A01;
                                this.A01 = r3.A02;
                                this.A03 = r3.A03.A01();
                                this.A02 = C05360Of.A02(r3.A04.A01());
                                return;
                            }
                        }
                    }
                }
                throw new C29381Yg("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C29381Yg(sb2.toString());
            }
        } catch (C04190Jk | C29361Ye e) {
            throw new C29381Yg(e);
        }
    }

    @Override // X.AbstractC29491Yx
    public byte[] ANr() {
        return this.A04;
    }
}

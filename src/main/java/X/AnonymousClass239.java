package X;

/* renamed from: X.239  reason: invalid class name */
public class AnonymousClass239 implements AbstractC29491Yx {
    public final int A00;
    public final int A01;
    public final AnonymousClass238 A02;
    public final byte[] A03;
    public final byte[][] A04;

    @Override // X.AbstractC29491Yx
    public int A9V() {
        return 6;
    }

    public AnonymousClass239(int i, int i2, byte[][] bArr, AnonymousClass238 r15) {
        byte[] bArr2 = {(byte) 51};
        AbstractC04160Jh A0B = C77553gc.A05.AQb();
        A0B.A02();
        C77553gc r1 = (C77553gc) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = i;
        A0B.A02();
        C77553gc r12 = (C77553gc) A0B.A00;
        r12.A00 |= 2;
        r12.A02 = i2;
        byte[] A002 = r15.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        C77553gc r13 = (C77553gc) A0B.A00;
        r13.A00 |= 4;
        r13.A03 = A003;
        for (byte[] bArr3 : bArr) {
            AnonymousClass071 A004 = AnonymousClass071.A00(bArr3, 0, bArr3.length);
            A0B.A02();
            C77553gc r2 = (C77553gc) A0B.A00;
            AbstractC04120Jd r14 = r2.A04;
            if (!((AbstractC05040Mx) r14).A00) {
                r14 = AnonymousClass078.A04(r14);
                r2.A04 = r14;
            }
            r14.add(A004);
        }
        byte[] A09 = A0B.A01().A09();
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = r15;
        this.A03 = AnonymousClass1YV.A0f(bArr2, A09);
    }

    public AnonymousClass239(byte[] bArr) {
        try {
            byte[][] A0h = AnonymousClass1YV.A0h(bArr, 1, bArr.length - 1);
            int i = 0;
            byte b = A0h[0][0];
            byte[] bArr2 = A0h[1];
            int i2 = (b & 255) >> 4;
            if (i2 < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i2);
                throw new C29401Yi(sb.toString());
            } else if (i2 <= 3) {
                C77553gc r4 = (C77553gc) AnonymousClass078.A02(C77553gc.A05, bArr2);
                int i3 = r4.A00;
                if ((i3 & 1) != 1 ? false : true) {
                    if (((i3 & 2) == 2) && r4.A04.size() > 0) {
                        if ((r4.A00 & 4) == 4) {
                            this.A03 = bArr;
                            this.A00 = r4.A01;
                            this.A01 = r4.A02;
                            this.A02 = C05360Of.A02(r4.A03.A01());
                            AbstractC04120Jd r2 = r4.A04;
                            this.A04 = new byte[r2.size()][];
                            while (true) {
                                byte[][] bArr3 = this.A04;
                                if (i < bArr3.length) {
                                    bArr3[i] = ((AnonymousClass071) r2.get(i)).A01();
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
                throw new C29381Yg("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i2);
                throw new C29381Yg(sb2.toString());
            }
        } catch (C04190Jk | C29361Ye e) {
            throw new C29381Yg(e);
        }
    }

    @Override // X.AbstractC29491Yx
    public byte[] ANr() {
        return this.A03;
    }
}

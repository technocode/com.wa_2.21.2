package X;

/* renamed from: X.23A  reason: invalid class name */
public class AnonymousClass23A implements AbstractC29491Yx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass1Yc A03;
    public final AnonymousClass238 A04;
    public final AnonymousClass23C A05;
    public final AbstractC68363Cx A06;
    public final byte[] A07;

    @Override // X.AbstractC29491Yx
    public int A9V() {
        return 3;
    }

    public AnonymousClass23A(int i, int i2, AbstractC68363Cx r10, int i3, AnonymousClass238 r12, AnonymousClass1Yc r13, AnonymousClass23C r14) {
        boolean z;
        this.A02 = i;
        this.A00 = i2;
        this.A06 = r10;
        this.A01 = i3;
        this.A04 = r12;
        this.A03 = r13;
        this.A05 = r14;
        AbstractC04160Jh A0B = C77573ge.A07.AQb();
        A0B.A02();
        C77573ge r1 = (C77573ge) A0B.A00;
        r1.A00 |= 4;
        r1.A03 = i3;
        byte[] A002 = r12.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        C77573ge r15 = (C77573ge) A0B.A00;
        r15.A00 |= 8;
        r15.A04 = A003;
        byte[] A004 = r13.A00.A00();
        AnonymousClass071 A005 = AnonymousClass071.A00(A004, 0, A004.length);
        A0B.A02();
        C77573ge r16 = (C77573ge) A0B.A00;
        r16.A00 |= 16;
        r16.A05 = A005;
        byte[] bArr = r14.A04;
        AnonymousClass071 A006 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        C77573ge r17 = (C77573ge) A0B.A00;
        r17.A00 |= 32;
        r17.A06 = A006;
        A0B.A02();
        C77573ge r18 = (C77573ge) A0B.A00;
        r18.A00 |= 1;
        r18.A02 = i2;
        if (!(r10 instanceof AnonymousClass3XF)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int intValue = ((Number) r10.A00()).intValue();
            A0B.A02();
            C77573ge r19 = (C77573ge) A0B.A00;
            r19.A00 |= 2;
            r19.A01 = intValue;
        }
        this.A07 = AnonymousClass1YV.A0f(new byte[]{(byte) (((this.A02 << 4) | 3) & 255)}, A0B.A01().A09());
    }

    public AnonymousClass23A(byte[] bArr) {
        AbstractC68363Cx r0;
        int i;
        try {
            int i2 = (bArr[0] & 255) >> 4;
            this.A02 = i2;
            if (i2 > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown version: ");
                sb.append(i2);
                throw new C29391Yh(sb.toString());
            } else if (i2 >= 3) {
                C77573ge r2 = (C77573ge) AnonymousClass078.A00(C77573ge.A07, AnonymousClass071.A00(bArr, 1, bArr.length - 1));
                int i3 = r2.A00;
                boolean z = (i3 & 4) == 4;
                if (z) {
                    if ((i3 & 8) == 8) {
                        if ((i3 & 16) == 16) {
                            if ((i3 & 32) == 32) {
                                this.A07 = bArr;
                                this.A00 = r2.A02;
                                if ((i3 & 2) == 2) {
                                    Integer valueOf = Integer.valueOf(r2.A01);
                                    if (valueOf != null) {
                                        r0 = new AnonymousClass3XF(valueOf);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    r0 = AnonymousClass3XE.A00;
                                }
                                this.A06 = r0;
                                if (z) {
                                    i = r2.A03;
                                } else {
                                    i = -1;
                                }
                                this.A01 = i;
                                this.A04 = C05360Of.A02(r2.A04.A01());
                                this.A03 = new AnonymousClass1Yc(C05360Of.A02(r2.A05.A01()));
                                this.A05 = new AnonymousClass23C(r2.A06.A01());
                                return;
                            }
                        }
                    }
                }
                throw new C29381Yg("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Legacy version: ");
                sb2.append(i2);
                throw new C29401Yi(sb2.toString());
            }
        } catch (C04190Jk | C29361Ye | C29401Yi e) {
            throw new C29381Yg(e);
        }
    }

    @Override // X.AbstractC29491Yx
    public byte[] ANr() {
        return this.A07;
    }
}

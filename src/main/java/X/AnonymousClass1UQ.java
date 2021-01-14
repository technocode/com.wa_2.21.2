package X;

/* renamed from: X.1UQ  reason: invalid class name */
public class AnonymousClass1UQ {
    public final AnonymousClass2BD A00;

    public AnonymousClass1UQ(int i, long j, AnonymousClass1UC r9, byte[] bArr) {
        AnonymousClass2BC r3 = (AnonymousClass2BC) AnonymousClass2BD.A06.AQb();
        r3.A04(i);
        byte[] A002 = r9.A01.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        r3.A02();
        AnonymousClass2BD r1 = (AnonymousClass2BD) r3.A00;
        r1.A00 |= 2;
        r1.A04 = A003;
        byte[] bArr2 = r9.A00.A01;
        AnonymousClass071 A004 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
        r3.A02();
        AnonymousClass2BD r12 = (AnonymousClass2BD) r3.A00;
        r12.A00 |= 4;
        r12.A03 = A004;
        AnonymousClass071 A005 = AnonymousClass071.A00(bArr, 0, bArr.length);
        r3.A02();
        AnonymousClass2BD r13 = (AnonymousClass2BD) r3.A00;
        r13.A00 |= 8;
        r13.A05 = A005;
        r3.A05(j);
        this.A00 = (AnonymousClass2BD) r3.A01();
    }

    public AnonymousClass1UQ(byte[] bArr) {
        this.A00 = (AnonymousClass2BD) AnonymousClass078.A02(AnonymousClass2BD.A06, bArr);
    }

    public AnonymousClass1UC A00() {
        try {
            AnonymousClass2BD r1 = this.A00;
            return new AnonymousClass1UC(C001801b.A08(r1.A04.A01()), new AnonymousClass1UD(r1.A03.A01(), (byte) 5));
        } catch (AnonymousClass1UK e) {
            throw new AssertionError(e);
        }
    }
}

package X;

/* renamed from: X.1Yz  reason: invalid class name and case insensitive filesystem */
public class C29511Yz {
    public AnonymousClass2B9 A00;

    public C29511Yz(int i, C29451Yn r7) {
        AbstractC04160Jh A0B = AnonymousClass2B9.A04.AQb();
        A0B.A02();
        AnonymousClass2B9 r1 = (AnonymousClass2B9) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = i;
        byte[] A002 = r7.A00.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        AnonymousClass2B9 r12 = (AnonymousClass2B9) A0B.A00;
        r12.A00 |= 2;
        r12.A03 = A003;
        byte[] ANr = r7.A01.ANr();
        AnonymousClass071 A004 = AnonymousClass071.A00(ANr, 0, ANr.length);
        A0B.A02();
        AnonymousClass2B9 r13 = (AnonymousClass2B9) A0B.A00;
        r13.A00 |= 4;
        r13.A02 = A004;
        this.A00 = (AnonymousClass2B9) A0B.A01();
    }

    public C29511Yz(byte[] bArr) {
        this.A00 = (AnonymousClass2B9) AnonymousClass078.A02(AnonymousClass2B9.A04, bArr);
    }
}

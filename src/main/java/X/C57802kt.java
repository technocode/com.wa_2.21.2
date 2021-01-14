package X;

/* renamed from: X.2kt  reason: invalid class name and case insensitive filesystem */
public final class C57802kt implements AnonymousClass1UE {
    public final int A00;
    public final AnonymousClass09G A01;
    public final C44281zn A02;
    public final AnonymousClass0X6 A03;
    public final AnonymousClass1XJ A04;
    public final boolean A05;

    public C57802kt(int i, boolean z, AnonymousClass09G r3, AnonymousClass1XJ r4, C44281zn r5, AnonymousClass0X6 r6) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = r4;
        this.A03 = r6;
    }

    @Override // X.AnonymousClass1UE
    public void AA9(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            C44281zn r1 = this.A02;
            r1.A00 = Boolean.TRUE;
            r1.A06 = 12;
            AnonymousClass1XJ r12 = this.A04;
            int i = this.A00;
            C007303n r3 = r12.A09;
            if (r3 == null) {
                r3 = r12.A0a;
            }
            AnonymousClass0ZI r2 = new AnonymousClass0ZI(r3, r12.A0X, bArr, i);
            r12.A05(r2);
            this.A03.A00(r2, r12);
        } else if (this.A05) {
            this.A01.A05(this.A04);
        }
    }
}

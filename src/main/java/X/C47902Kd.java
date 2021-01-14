package X;

/* renamed from: X.2Kd  reason: invalid class name and case insensitive filesystem */
public class C47902Kd {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass02N A03;
    public final C007303n A04;
    public final String A05;

    public /* synthetic */ C47902Kd(C007303n r2, AnonymousClass02N r3, long j, int i, String str, int i2) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        AnonymousClass00E.A06(z);
        this.A04 = r2;
        this.A03 = r3;
        this.A02 = j;
        this.A01 = i;
        this.A05 = str;
        this.A00 = i2;
    }

    public C47902Kd(AnonymousClass0ZJ r8) {
        C007303n r6 = r8.A0n;
        AnonymousClass02N r5 = r8.A0G;
        long j = r8.A0E;
        String str = r8.A00;
        if (1 != 0) {
            this.A04 = r6;
            this.A03 = r5;
            this.A02 = j;
            this.A01 = 0;
            this.A05 = str;
            this.A00 = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C47902Kd(AnonymousClass1XJ r8) {
        C007303n r6 = r8.A09;
        r6 = r6 == null ? r8.A0a : r6;
        AnonymousClass02N A09 = AnonymousClass1VY.A09(r8.A06);
        long j = r8.A0X;
        int A012 = r8.A01();
        if (1 != 0) {
            this.A04 = r6;
            this.A03 = A09;
            this.A02 = j;
            this.A01 = 1;
            this.A05 = null;
            this.A00 = A012;
            return;
        }
        throw new IllegalArgumentException();
    }
}

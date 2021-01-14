package X;

/* renamed from: X.0hi  reason: invalid class name and case insensitive filesystem */
public class C12200hi extends C05490Ot implements AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public int A00;
    public String A01;

    public C12200hi(C007303n r2, long j) {
        super(r2, j, (byte) 32);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12200hi(C007303n r5, long j, C02840Dr r8) {
        super(r5, j, (byte) 32);
        C76513ef r0 = r8.A0W;
        r0 = r0 == null ? C76513ef.A05 : r0;
        String str = r0.A03;
        String str2 = r0.A04;
        int i = r0.A01;
        A0d(str);
        this.A01 = str2;
        this.A00 = i;
    }

    public C12200hi(C007303n r2, long j, String str, String str2, int i) {
        super(r2, j, (byte) 32);
        A0d(str);
        this.A01 = str2;
        this.A00 = i;
    }

    public C12200hi(C12200hi r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A01 = r8.A01;
    }
}

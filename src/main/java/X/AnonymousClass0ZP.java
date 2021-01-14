package X;

/* renamed from: X.0ZP  reason: invalid class name */
public class AnonymousClass0ZP extends C05490Ot {
    public AnonymousClass1XU A00;

    public AnonymousClass0ZP(C007303n r2, long j) {
        super(r2, j, (byte) 46);
    }

    public AnonymousClass0ZP(C007303n r2, long j, AnonymousClass1XU r5) {
        super(r2, j, (byte) 46);
        this.A00 = r5;
    }

    public AnonymousClass0ZP(C007303n r7, long j, C76283eI r10) {
        super(r7, j, (byte) 46);
        AnonymousClass3JV r0;
        String str = r10.A05;
        String str2 = r10.A04;
        C76273eH r02 = r10.A03;
        String str3 = (r02 == null ? C76273eH.A02 : r02).A01;
        AnonymousClass3JV r2 = AnonymousClass3JV.UNKNOWN;
        int i = r10.A01;
        if (i != 0) {
            r0 = i == 1 ? AnonymousClass3JV.SINGLE_SELECT : r0;
            this.A00 = new AnonymousClass1XU(str, str2, str3, r2.value);
        }
        r0 = r2;
        if (r0 != null) {
            r2 = r0;
        }
        this.A00 = new AnonymousClass1XU(str, str2, str3, r2.value);
    }

    public AnonymousClass0ZP(AnonymousClass0ZP r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r8.A00;
    }
}

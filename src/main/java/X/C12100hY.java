package X;

/* renamed from: X.0hY  reason: invalid class name and case insensitive filesystem */
public class C12100hY extends C05400Oj {
    public String A00;
    public String A01;

    public C12100hY(C007303n r2, long j) {
        super(r2, j, 1);
    }

    public C12100hY(AnonymousClass1XX r7, C05340Od r8, long j) {
        super(r7, r8, j, 1);
    }

    @Override // X.AbstractC007503q
    public void A0d(String str) {
        synchronized (this.A0o) {
            this.A00 = str;
        }
    }

    public String A0v() {
        String str;
        synchronized (this.A0o) {
            str = this.A00;
        }
        return str;
    }
}

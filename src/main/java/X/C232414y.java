package X;

/* renamed from: X.14y  reason: invalid class name and case insensitive filesystem */
public final class C232414y {
    public final int A00;
    public final C232214w A01;
    public final Object A02;
    public final AnonymousClass12M[] A03;

    public C232414y(AnonymousClass12M[] r2, AbstractC232114v[] r3, Object obj) {
        this.A03 = r2;
        this.A01 = new C232214w(r3);
        this.A02 = obj;
        this.A00 = r2.length;
    }

    public boolean A00(C232414y r4, int i) {
        if (r4 != null && AnonymousClass0W2.A08(this.A03[i], r4.A03[i]) && AnonymousClass0W2.A08(this.A01.A02[i], r4.A01.A02[i])) {
            return true;
        }
        return false;
    }
}

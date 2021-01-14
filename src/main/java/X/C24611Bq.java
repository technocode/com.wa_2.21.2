package X;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public class C24611Bq {
    public final C011506v A00 = new C011506v();

    public void A00(Exception exc) {
        C011506v r2 = this.A00;
        if (r2 != null) {
            C001801b.A1R(exc, "Exception must not be null");
            synchronized (r2.A04) {
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A00 = exc;
                    r2.A03.A00(r2);
                    return;
                }
                return;
            }
        }
        throw null;
    }
}

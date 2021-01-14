package X;

/* renamed from: X.22u  reason: invalid class name and case insensitive filesystem */
public class C450622u implements AbstractC29171Xj {
    public int A00;
    public final long A01;
    public final AnonymousClass0J5 A02;

    public C450622u(String str, long j) {
        this.A02 = new AnonymousClass0J5(str, str, "", null, null, 0);
        this.A01 = j;
    }

    @Override // X.AbstractC29171Xj
    public long A4t() {
        return this.A01;
    }

    @Override // X.AbstractC29171Xj
    public int A5l() {
        return this.A00;
    }

    @Override // X.AbstractC29171Xj
    public AnonymousClass0J5 A5o() {
        if (this.A00 < 4) {
            return this.A02;
        }
        return null;
    }

    @Override // X.AbstractC29171Xj
    public void AFg(boolean z, int i) {
        this.A00++;
    }
}

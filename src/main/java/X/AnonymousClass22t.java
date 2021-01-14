package X;

/* renamed from: X.22t  reason: invalid class name */
public class AnonymousClass22t implements AbstractC29171Xj {
    public int A00 = 0;
    public boolean A01;
    public final long A02;
    public final AnonymousClass0J5 A03;
    public final C450422q A04;

    public AnonymousClass22t(String str, C450422q r9, long j) {
        this.A03 = new AnonymousClass0J5(str, str, "", null, null, 0);
        this.A04 = r9;
        this.A02 = j;
    }

    @Override // X.AbstractC29171Xj
    public long A4t() {
        return this.A01 ? this.A04.A4t() : this.A02;
    }

    @Override // X.AbstractC29171Xj
    public int A5l() {
        return this.A00;
    }

    @Override // X.AbstractC29171Xj
    public AnonymousClass0J5 A5o() {
        if (!this.A01) {
            return this.A03;
        }
        return this.A04.A02;
    }

    @Override // X.AbstractC29171Xj
    public void AFg(boolean z, int i) {
        if (this.A01) {
            C450422q r1 = this.A04;
            if (i != -1) {
                r1.A0B.A07(i);
            }
            r1.A00++;
            r1.A02(z);
        }
        if (!z || this.A00 > 1) {
            this.A01 = true;
        }
        this.A00++;
    }
}

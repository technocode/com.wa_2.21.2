package X;

import java.util.List;

/* renamed from: X.25b  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC455025b extends AbstractC33971hg implements AnonymousClass14F {
    public long A00;
    public AnonymousClass14F A01;

    @Override // X.AnonymousClass14F
    public List A5d(long j) {
        return this.A01.A5d(j - this.A00);
    }

    @Override // X.AnonymousClass14F
    public long A6H(int i) {
        return this.A01.A6H(i) + this.A00;
    }

    @Override // X.AnonymousClass14F
    public int A6I() {
        return this.A01.A6I();
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        return this.A01.A7e(j - this.A00);
    }
}

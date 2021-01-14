package X;

/* renamed from: X.1rL  reason: invalid class name and case insensitive filesystem */
public class C39341rL implements AbstractC47572Im {
    public final /* synthetic */ AnonymousClass1KT A00;
    public final /* synthetic */ ActivityC004702f A01;
    public final /* synthetic */ C28301Tu A02;
    public final /* synthetic */ AnonymousClass0MP A03;

    @Override // X.AbstractC47572Im
    public void AFP(boolean z) {
    }

    public C39341rL(AnonymousClass1KT r1, C28301Tu r2, ActivityC004702f r3, AnonymousClass0MP r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    @Override // X.AbstractC47572Im
    public AnonymousClass0MP A6J() {
        return this.A03;
    }

    @Override // X.AbstractC47572Im
    public void AIK(int i) {
        this.A00.A02(this.A01, false);
    }

    @Override // X.AbstractC47572Im
    public void AIr(int i) {
        AnonymousClass1KT r2 = this.A00;
        r2.A0C.setProgress(i);
        r2.A00((long) i);
    }

    @Override // X.AbstractC47572Im
    public void AJj() {
        this.A00.A01(this.A01);
    }

    @Override // X.AbstractC47572Im
    public void AKJ(int i) {
        this.A02.A0M(0);
        AnonymousClass1KT r1 = this.A00;
        r1.A01(this.A01);
        r1.A0C.setMax(i);
    }

    @Override // X.AbstractC47572Im
    public void AKb(int i) {
        AnonymousClass1KT r2 = this.A00;
        r2.A02(this.A01, true);
        r2.A0C.setProgress(0);
        C28301Tu.A0i = null;
    }
}

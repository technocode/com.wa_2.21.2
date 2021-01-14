package X;

/* renamed from: X.3EO  reason: invalid class name */
public class AnonymousClass3EO implements AbstractC61562tN {
    public final /* synthetic */ AbstractC61542tL A00;
    public final /* synthetic */ AbstractC61552tM A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3EO(AbstractC61552tM r1, String str, AbstractC61542tL r3) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = r3;
    }

    @Override // X.AbstractC61562tN
    public void AFb(C61072sS r2) {
        this.A00.AFb(r2);
    }

    @Override // X.AbstractC61562tN
    public void AJa(C68653Ea r7) {
        AbstractC61552tM r5 = this.A01;
        C61952u0 r4 = new C61952u0(r7);
        r5.A0C.A01(r4, this.A02, new AnonymousClass3EP(r5, r4, this.A00));
    }
}

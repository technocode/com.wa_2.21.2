package X;

/* renamed from: X.3EP  reason: invalid class name */
public class AnonymousClass3EP implements AbstractC61182sd {
    public final /* synthetic */ AbstractC61542tL A00;
    public final /* synthetic */ AbstractC61552tM A01;
    public final /* synthetic */ C61952u0 A02;

    public AnonymousClass3EP(AbstractC61552tM r1, C61952u0 r2, AbstractC61542tL r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r2) {
        this.A00.AFb(r2);
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        C61952u0 r2 = this.A02;
        AbstractC61552tM r4 = this.A01;
        AnonymousClass0M5 A002 = r2.A00(C61962u1.A00("AUTH", Boolean.TRUE, str, r4.A0I.A00.A05() / 1000, null, null, new Object[0]));
        byte[] A0x = AnonymousClass0FI.A0x(r4.A04, r4.A02, false);
        if (A0x != null) {
            AbstractC61552tM.A00(r4, C007603r.A03(A0x), A002, this.A00);
            return;
        }
        throw null;
    }
}

package X;

/* renamed from: X.3Ex  reason: invalid class name and case insensitive filesystem */
public class C68883Ex implements AbstractC61182sd {
    public final /* synthetic */ AbstractC61922tx A00;
    public final /* synthetic */ C61932ty A01;
    public final /* synthetic */ C61952u0 A02;

    public C68883Ex(C61932ty r1, C61952u0 r2, AbstractC61922tx r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r2) {
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r2);
        }
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        C61932ty r9 = this.A01;
        C61952u0 r15 = this.A02;
        AbstractC61922tx r14 = this.A00;
        r9.A08.A05("[Set PIN] called");
        C61962u1 r2 = r9.A01;
        C74753bR r8 = new C74753bR(r9, r9.A04.A00, r9.A02, r9.A03, r9.A05, r14, r15);
        byte[] A002 = C61962u1.A00("CREATE", null, null, r2.A00.A05() / 1000, str, null, new Object[0]);
        r2.A01.A09(true, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "create-payment-pin", null, (byte) 0)}, r15.A00(A002)), r8, 30000);
    }
}

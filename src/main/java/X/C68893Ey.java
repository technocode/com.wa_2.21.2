package X;

/* renamed from: X.3Ey  reason: invalid class name and case insensitive filesystem */
public class C68893Ey implements AbstractC61182sd {
    public final /* synthetic */ AbstractC61922tx A00;
    public final /* synthetic */ C61932ty A01;
    public final /* synthetic */ C61952u0 A02;

    public C68893Ey(C61932ty r1, C61952u0 r2, AbstractC61922tx r3) {
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
        C61932ty r8 = this.A01;
        C61952u0 r14 = this.A02;
        AbstractC61922tx r13 = this.A00;
        C61962u1 r2 = r8.A01;
        C74763bS r7 = new C74763bS(r8, r8.A04.A00, r8.A02, r8.A03, r8.A05, r13, r14);
        if (r2 != null) {
            r2.A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "verify-payment-pin", null, (byte) 0)}, r14.A00(C61962u1.A00("VERIFY", Boolean.TRUE, str, r2.A00.A05() / 1000, null, null, new Object[0]))), r7, 30000);
            return;
        }
        throw null;
    }
}

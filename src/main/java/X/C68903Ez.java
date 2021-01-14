package X;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public class C68903Ez implements AbstractC61192se {
    public final /* synthetic */ AbstractC61922tx A00;
    public final /* synthetic */ C61932ty A01;
    public final /* synthetic */ C61952u0 A02;

    public C68903Ez(C61932ty r1, C61952u0 r2, AbstractC61922tx r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC61192se
    public void AFb(C61072sS r2) {
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r2);
        }
    }

    @Override // X.AbstractC61192se
    public void AKl(String[] strArr) {
        C61932ty r9 = this.A01;
        C61952u0 r15 = this.A02;
        String str = strArr[0];
        String str2 = strArr[1];
        AbstractC61922tx r14 = this.A00;
        C61962u1 r1 = r9.A01;
        C74773bT r8 = new C74773bT(r9, r9.A04.A00, r9.A02, r9.A03, r9.A05, r14, r15);
        byte[] A002 = C61962u1.A00("CHANGE", Boolean.TRUE, str, r1.A00.A05() / 1000, str2, null, new Object[0]);
        r1.A01.A09(true, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "change-payment-pin", null, (byte) 0)}, r15.A00(A002)), r8, 30000);
    }
}

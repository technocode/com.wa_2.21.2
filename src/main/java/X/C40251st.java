package X;

/* renamed from: X.1st  reason: invalid class name and case insensitive filesystem */
public class C40251st implements AnonymousClass1W7 {
    public final /* synthetic */ C04220Jn A00;
    public final /* synthetic */ AbstractC007503q A01;

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
    }

    public C40251st(C04220Jn r1, AbstractC007503q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r7, C49982Sy r8) {
        AnonymousClass0M4 r1;
        AbstractC007503q r2 = this.A01;
        if (r2 instanceof AnonymousClass0ZE) {
            AnonymousClass0ZE r22 = (AnonymousClass0ZE) r2;
            if (r7.A02() && (r1 = ((AnonymousClass0M3) r22).A02) != null) {
                r1.A0F = r8.A03();
                C04230Jo r5 = this.A00.A0a;
                if (r5 != null) {
                    r5.A0A.execute(new RunnableEBaseShape0S0210000_I0(r5, r22.A11(), false, 11));
                    return;
                }
                throw null;
            }
        }
    }
}

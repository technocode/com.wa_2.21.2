package X;

/* renamed from: X.1yO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43451yO implements AbstractC28611Uz {
    public final /* synthetic */ AbstractC007503q A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C43451yO(AbstractC007503q r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    @Override // X.AbstractC28611Uz
    public final void AQo(AbstractC007503q r8) {
        AbstractC007503q r3 = this.A00;
        boolean z = this.A01;
        if (r8.A0f && r8.A0E == r3.A0E) {
            C007303n r1 = r8.A0n;
            if (r1.A02 && r1.A01.equals(r3.A0n.A01)) {
                r8.A0T(r3.A08);
                boolean z2 = false;
                if (r8.A02 > 0) {
                    z2 = true;
                }
                if (z2 && z) {
                    r8.A0R = Long.valueOf((((long) r8.A02) * 1000) + r3.A0D);
                }
            }
        }
    }
}

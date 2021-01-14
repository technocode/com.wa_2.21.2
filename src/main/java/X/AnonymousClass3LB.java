package X;

/* renamed from: X.3LB  reason: invalid class name */
public class AnonymousClass3LB implements AnonymousClass09O {
    public final int A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass0EQ A02;
    public final AnonymousClass0EO A03;
    public final AnonymousClass09H A04;
    public final C015808q A05;

    public AnonymousClass3LB(AnonymousClass009 r1, AnonymousClass09H r2, AnonymousClass0EO r3, AnonymousClass0EQ r4, C015808q r5, int i) {
        this.A01 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A05 = r5;
        this.A00 = i;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A17("GroupRequestProtocolHelper/onDeliveryFailure/iqId=", str);
        this.A03.A09(this.A00);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        AnonymousClass008.A17("GroupRequestProtocolHelper/onError/iqId=", str);
        this.A03.A09(this.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0192 A[Catch:{ 02Y -> 0x01da }] */
    @Override // X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKk(java.lang.String r39, X.AnonymousClass0M5 r40) {
        /*
        // Method dump skipped, instructions count: 515
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LB.AKk(java.lang.String, X.0M5):void");
    }
}

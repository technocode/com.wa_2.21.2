package X;

/* renamed from: X.17f  reason: invalid class name and case insensitive filesystem */
public final class C237117f {
    public int A00;
    public boolean A01;
    public final AnonymousClass05V A02;
    public final AnonymousClass05V A03;
    public final C24611Bq A04;

    public final void A00(C237017e r6, C34661ix r7, String str) {
        AnonymousClass05V r4 = this.A02;
        r4.put(r6, r7);
        AnonymousClass05V r3 = this.A03;
        r3.put(r6, str);
        int i = this.A00 - 1;
        this.A00 = i;
        if (!r7.A02()) {
            this.A01 = true;
        }
        if (i != 0) {
            return;
        }
        if (this.A01) {
            this.A04.A00.A07(new AnonymousClass171(r4));
            return;
        }
        this.A04.A00.A08(r3);
    }
}

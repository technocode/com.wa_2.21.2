package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3Eg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68713Eg implements AbstractC61022sN {
    public final /* synthetic */ AnonymousClass0MH A00;
    public final /* synthetic */ AbstractC61092sU A01;
    public final /* synthetic */ C68733Ei A02;

    public /* synthetic */ C68713Eg(C68733Ei r1, AnonymousClass0MH r2, AbstractC61092sU r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC61022sN
    public final void AJE(C61072sS r13) {
        C68733Ei r3 = this.A02;
        AnonymousClass0MH r2 = this.A00;
        AbstractC61092sU r1 = this.A01;
        if (r13 == null) {
            C01970Ad r0 = r3.A09;
            r0.A04();
            r0.A05.A0Z(r2.A0G, 20, r2.A04, r2.A05, 15);
            r1.AIO();
            r3.A07.A02(r2);
        } else {
            int i = 0;
            if (r13.code == 443) {
                i = R.string.payments_upgrade_error;
            }
            AnonymousClass02M r22 = r3.A00;
            AnonymousClass01X r02 = r3.A03;
            if (i == 0) {
                i = R.string.request_cannot_be_rejected;
            }
            r22.A0C(r02.A06(i), 0);
        }
        r3.A00.A02();
    }
}

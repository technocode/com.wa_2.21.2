package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3DF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DF implements AbstractC61022sN {
    public final /* synthetic */ AnonymousClass0MH A00;
    public final /* synthetic */ AbstractC61092sU A01;
    public final /* synthetic */ C61112sW A02;

    public /* synthetic */ AnonymousClass3DF(C61112sW r1, AnonymousClass0MH r2, AbstractC61092sU r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC61022sN
    public final void AJE(C61072sS r13) {
        C61112sW r3 = this.A02;
        AnonymousClass0MH r2 = this.A00;
        AbstractC61092sU r1 = this.A01;
        if (r13 == null) {
            C01970Ad r0 = r3.A0B;
            r0.A04();
            C018609s r4 = r0.A05;
            String str = r2.A0G;
            int i = r2.A02;
            AnonymousClass00S r02 = r3.A01;
            r4.A0Z(str, i, r02.A05(), r02.A05(), 15);
            r1.AIO();
        } else {
            int i2 = 0;
            if (r13.code == 443) {
                i2 = R.string.payments_upgrade_error;
            }
            AnonymousClass02M r22 = r3.A00;
            AnonymousClass01X r03 = r3.A02;
            if (i2 == 0) {
                i2 = R.string.request_cannot_be_rejected;
            }
            r22.A0C(r03.A06(i2), 0);
        }
        r3.A00.A02();
    }
}

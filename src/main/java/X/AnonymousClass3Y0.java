package X;

import android.content.Context;

/* renamed from: X.3Y0  reason: invalid class name */
public class AnonymousClass3Y0 extends AbstractC68463Dh {
    public final /* synthetic */ C61602tR A00;
    public final /* synthetic */ C61952u0 A01;
    public final /* synthetic */ AnonymousClass3FO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Y0(C61602tR r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass3FO r6, C61952u0 r7) {
        super(context, r3, r4, r5);
        this.A00 = r1;
        this.A02 = r6;
        this.A01 = r7;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        AnonymousClass3FO r0 = this.A02;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        AnonymousClass3FO r0 = this.A02;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        C61072sS r3;
        int i;
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D != null) {
            r3 = C61072sS.A00(A0D);
            if (!(r3 == null || (i = r3.code) == 0)) {
                if (i == 1448) {
                    this.A00.A07.A04(this.A01.A00.A05, "PIN", r3);
                }
            }
            C61942tz r2 = this.A00.A08;
            r2.A02();
            r2.A03(0);
        } else {
            r3 = null;
            C61942tz r22 = this.A00.A08;
            r22.A02();
            r22.A03(0);
        }
        AnonymousClass3FO r0 = this.A02;
        if (r0 != null) {
            r0.A00(r3);
        }
    }
}

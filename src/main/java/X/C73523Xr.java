package X;

import android.content.Context;

/* renamed from: X.3Xr  reason: invalid class name and case insensitive filesystem */
public class C73523Xr extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass3EW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73523Xr(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, AnonymousClass3EW r5) {
        super(context, r2, r3, r4);
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        this.A00.A00(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        if (r3.code == 10756) {
            this.A00.A01(false);
        } else {
            this.A00.A00(r3);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r3) {
        this.A00.A01(true);
    }
}

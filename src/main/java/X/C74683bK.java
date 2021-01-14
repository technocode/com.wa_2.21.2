package X;

import android.content.Context;

/* renamed from: X.3bK  reason: invalid class name and case insensitive filesystem */
public class C74683bK extends C73483Xm {
    public final /* synthetic */ AnonymousClass3IX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74683bK(Context context, AnonymousClass02M r9, AnonymousClass04j r10, AnonymousClass0GP r11, C61082sT r12, AnonymousClass3IX r13) {
        super(context, r9, r10, r11, r12, "upi-sign-qr-code");
        this.A00 = r13;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        this.A00.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        this.A00.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r5) {
        super.A03(r5);
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D != null) {
            this.A00.A00(A0D.A0G("signed-qr-code", null), null);
        }
    }
}

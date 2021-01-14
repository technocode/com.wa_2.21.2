package X;

import android.text.TextUtils;

/* renamed from: X.3Dx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68623Dx implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass3E2 A00;

    public /* synthetic */ C68623Dx(AnonymousClass3E2 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass3E2 r3 = this.A00;
        AnonymousClass1VM r12 = (AnonymousClass1VM) obj;
        C74723bO r2 = (C74723bO) r12.A06;
        if (r2 != null && "VISA".equals(r2.A03) && TextUtils.isEmpty(r2.A06)) {
            new C61512tI(((AbstractC61552tM) r3).A00, r3.A01, r3.A03, r3.A0A, r3.A09, new C68613Dw(r3, r2, r12)).A00(r3.A0M);
        }
    }
}

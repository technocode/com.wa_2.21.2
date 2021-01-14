package X;

import android.text.TextUtils;

/* renamed from: X.3Dw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68613Dw implements AbstractC61502tH {
    public final /* synthetic */ AnonymousClass1VM A00;
    public final /* synthetic */ AnonymousClass3E2 A01;
    public final /* synthetic */ C74723bO A02;

    public /* synthetic */ C68613Dw(AnonymousClass3E2 r1, C74723bO r2, AnonymousClass1VM r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC61502tH
    public final void AJe(String str, C61072sS r6) {
        AnonymousClass3E2 r3 = this.A01;
        C74723bO r1 = this.A02;
        AnonymousClass1VM r2 = this.A00;
        if (!TextUtils.isEmpty(str)) {
            r1.A06 = str;
            r3.A00.A01().A01(r2, null);
        }
    }
}

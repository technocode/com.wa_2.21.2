package X;

import android.text.TextUtils;

/* renamed from: X.3Dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68563Dr implements AbstractC61502tH {
    public final /* synthetic */ C43761yu A00;
    public final /* synthetic */ C61232sq A01;

    public /* synthetic */ C68563Dr(C61232sq r1, C43761yu r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61502tH
    public final void AJe(String str, C61072sS r6) {
        C61232sq r3 = this.A01;
        C43761yu r2 = this.A00;
        C74723bO r1 = (C74723bO) r2.A06;
        if (TextUtils.isEmpty(str) || r1 == null) {
            r3.A09.AEy(null, null, new C61072sS());
            return;
        }
        r1.A06 = str;
        r3.A08.A01().A01(r2, new C68553Dq(r3, r2));
    }
}

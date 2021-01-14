package X;

import android.app.Activity;

/* renamed from: X.3DI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DI implements AnonymousClass1O8 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1KW A01;
    public final /* synthetic */ C61122sX A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3DI(C61122sX r1, Activity activity, String str, AnonymousClass1KW r4) {
        this.A02 = r1;
        this.A00 = activity;
        this.A03 = str;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        C61122sX r2 = this.A02;
        r2.A05.A03().A5X().A01(this.A00, r2.A04, this.A03, false, new AnonymousClass3DG(this.A01));
    }
}

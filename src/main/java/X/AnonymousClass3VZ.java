package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3VZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VZ implements AnonymousClass36E {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C73153Vr A02;

    public /* synthetic */ AnonymousClass3VZ(C73153Vr r1, Context context, Intent intent) {
        this.A02 = r1;
        this.A00 = context;
        this.A01 = intent;
    }

    @Override // X.AnonymousClass36E
    public final void AFk(Object obj) {
        C73153Vr r5 = this.A02;
        Context context = this.A00;
        Intent intent = this.A01;
        int i = ((C73173Vt) obj).A00;
        if (2 == i) {
            ((C02780Dk) r5.A01.get()).A05(context, intent);
        } else if (i == 0) {
            AnonymousClass008.A0k((AnonymousClass00D) ((C73183Vu) AnonymousClass3AP.lazy(C73183Vu.class).get()).A01.get(), "shops_privacy_notice", -1);
            r5.A00(context, intent);
        }
    }
}

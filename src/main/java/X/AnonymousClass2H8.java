package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.2H8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC004502c A01;
    public final /* synthetic */ C47242Ha A02;
    public final /* synthetic */ C007003k A03;

    public /* synthetic */ AnonymousClass2H8(C47242Ha r1, Activity activity, AbstractC004502c r3, C007003k r4) {
        this.A02 = r1;
        this.A00 = activity;
        this.A01 = r3;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47242Ha r4 = this.A02;
        Activity activity = this.A00;
        AbstractC004502c r2 = this.A01;
        C007003k r1 = this.A03;
        C002001d.A2N(activity, 10);
        r4.A02(activity, r2, r1, true);
    }
}

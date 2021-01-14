package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.0mH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC14440mH implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C02780Dk A01;
    public final /* synthetic */ AnonymousClass0MA A02;
    public final /* synthetic */ AnonymousClass00D A03;
    public final /* synthetic */ AnonymousClass0M9 A04;

    public /* synthetic */ DialogInterface$OnClickListenerC14440mH(AnonymousClass0MA r1, AnonymousClass00D r2, AnonymousClass0M9 r3, C02780Dk r4, Context context) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0MA r0 = this.A02;
        AnonymousClass00D r2 = this.A03;
        AnonymousClass0M9 r5 = this.A04;
        C02780Dk r4 = this.A01;
        Context context = this.A00;
        r0.AJF();
        AnonymousClass008.A0n(r2, "pref_revoke_nux", false);
        Intent intent = new Intent("android.intent.action.VIEW", r5.A03("android", "26000068", null));
        intent.addFlags(268435456);
        r4.A05(context, intent);
    }
}

package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.2Lq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC48292Lq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C02780Dk A01;
    public final /* synthetic */ AnonymousClass0M9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ DialogInterface$OnClickListenerC48292Lq(AnonymousClass0M9 r1, String str, String str2, C02780Dk r4, Context context) {
        this.A02 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r4;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A05(this.A00, new Intent("android.intent.action.VIEW", this.A02.A03("general", this.A03, this.A04)));
    }
}

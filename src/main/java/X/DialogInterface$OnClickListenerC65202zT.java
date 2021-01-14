package X;

import android.content.DialogInterface;

/* renamed from: X.2zT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65202zT implements DialogInterface.OnClickListener {
    public final /* synthetic */ ActivityC004702f A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ DialogInterface$OnClickListenerC65202zT(ActivityC004702f r1, Runnable runnable, String str, String str2) {
        this.A00 = r1;
        this.A01 = runnable;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004702f r4 = this.A00;
        Runnable runnable = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        C002001d.A2N(r4, 124);
        if (runnable != null) {
            runnable.run();
        }
        r4.startActivity(C002001d.A0R(r4, AnonymousClass008.A0L("blocked +", str, str2), null, null, null, null, null));
    }
}

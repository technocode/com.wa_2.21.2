package X;

import android.content.DialogInterface;

/* renamed from: X.2zS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65192zS implements DialogInterface.OnClickListener {
    public final /* synthetic */ ActivityC004702f A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ DialogInterface$OnClickListenerC65192zS(ActivityC004702f r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004702f r2 = this.A00;
        Runnable runnable = this.A01;
        C002001d.A2N(r2, 124);
        if (runnable != null) {
            runnable.run();
        }
    }
}

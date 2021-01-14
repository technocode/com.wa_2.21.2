package X;

import android.content.DialogInterface;
import android.os.Handler;

/* renamed from: X.2v6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62632v6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1DU A01;
    public final /* synthetic */ Runnable A02;

    public /* synthetic */ DialogInterface$OnClickListenerC62632v6(AnonymousClass1DU r1, int i, Runnable runnable) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1DU r1 = this.A01;
        int i2 = this.A00;
        Runnable runnable = this.A02;
        C002001d.A2N(r1, i2);
        if (runnable != null) {
            new Handler(r1.getMainLooper()).post(runnable);
        }
    }
}

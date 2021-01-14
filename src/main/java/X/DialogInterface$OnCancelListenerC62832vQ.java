package X;

import android.content.DialogInterface;

/* renamed from: X.2vQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnCancelListenerC62832vQ implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractView$OnClickListenerC32271ec A01;

    public /* synthetic */ DialogInterface$OnCancelListenerC62832vQ(AbstractView$OnClickListenerC32271ec r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C002001d.A2N(this.A01, this.A00);
    }
}

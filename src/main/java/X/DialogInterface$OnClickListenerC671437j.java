package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.37j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC671437j implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C09200cS A01;

    public /* synthetic */ DialogInterface$OnClickListenerC671437j(C09200cS r1, Context context) {
        this.A01 = r1;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C09200cS r0 = this.A01;
        Context context = this.A00;
        context.startActivity(AbstractActivityC60812rK.A04(context, r0.A06, r0.A0H));
    }
}

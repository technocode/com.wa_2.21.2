package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.2tq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC61852tq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0MH A01;
    public final /* synthetic */ AbstractC61092sU A02;
    public final /* synthetic */ C68733Ei A03;

    public /* synthetic */ DialogInterface$OnClickListenerC61852tq(C68733Ei r1, Context context, AnonymousClass0MH r3, AbstractC61092sU r4) {
        this.A03 = r1;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C68733Ei r2 = this.A03;
        Context context = this.A00;
        AnonymousClass0MH r6 = this.A01;
        r2.A06.A02(context, r6, true, new C68723Eh(r2, true, context, this.A02, r6));
    }
}

package X;

import android.content.DialogInterface;

/* renamed from: X.0mD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC14400mD implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0MA A00;
    public final /* synthetic */ AnonymousClass00D A01;

    public /* synthetic */ DialogInterface$OnClickListenerC14400mD(AnonymousClass0MA r1, AnonymousClass00D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0MA r0 = this.A00;
        AnonymousClass00D r2 = this.A01;
        r0.AJF();
        AnonymousClass008.A0n(r2, "pref_revoke_nux", false);
    }
}

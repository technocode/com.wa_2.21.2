package X;

import android.content.DialogInterface;

/* renamed from: X.2v5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62622v5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1DU A01;

    public /* synthetic */ DialogInterface$OnClickListenerC62622v5(AnonymousClass1DU r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1DU r1 = this.A01;
        C002001d.A2N(r1, this.A00);
        r1.A0Z();
        r1.finish();
    }
}

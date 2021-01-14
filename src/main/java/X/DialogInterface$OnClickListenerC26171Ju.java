package X;

import android.content.DialogInterface;

/* renamed from: X.1Ju  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26171Ju implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC07170We A01;

    public /* synthetic */ DialogInterface$OnClickListenerC26171Ju(AbstractC07170We r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC07170We r2 = this.A01;
        C002001d.A2N(r2.A01, this.A00);
        r2.A00 = true;
        r2.A03(true, false);
    }
}

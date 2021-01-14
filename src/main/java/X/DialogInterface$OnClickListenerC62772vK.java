package X;

import android.content.DialogInterface;

/* renamed from: X.2vK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62772vK implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1PU A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ DialogInterface$OnClickListenerC62772vK(AnonymousClass1PU r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1PU r3 = this.A01;
        int i2 = this.A00;
        boolean z = this.A02;
        C002001d.A2N(r3, i2);
        C63342wG r1 = new C63342wG(2);
        r1.A01 = z;
        r3.A00.A02(r1);
    }
}

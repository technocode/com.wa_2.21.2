package X;

import android.content.DialogInterface;

/* renamed from: X.2Iy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47632Iy implements DialogInterface.OnClickListener {
    public final /* synthetic */ C52002aQ A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ DialogInterface$OnClickListenerC47632Iy(C52002aQ r1, C007003k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52002aQ r0 = this.A00;
        C007003k r4 = this.A01;
        AnonymousClass0GG r3 = r0.A04;
        ActivityC004802g r2 = r0.A02;
        if (r4 != null) {
            r3.A09(r2, r4, !r0.A0A.A0D(AbstractC000400g.A0q));
            C002001d.A2N(r2, 106);
            return;
        }
        throw null;
    }
}

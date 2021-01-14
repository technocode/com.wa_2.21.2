package X;

import android.content.DialogInterface;

/* renamed from: X.2S6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC49792Sd A01;

    public /* synthetic */ AnonymousClass2S6(AbstractC49792Sd r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC49792Sd r2 = this.A01;
        C002001d.A2N(r2.A0X, this.A00);
        if (r2.A0p) {
            r2.A08();
        }
    }
}

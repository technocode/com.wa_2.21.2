package X;

import android.content.DialogInterface;

/* renamed from: X.2S7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC49792Sd A01;

    public /* synthetic */ AnonymousClass2S7(AbstractC49792Sd r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC49792Sd r3 = this.A01;
        int i2 = this.A00;
        C002001d.A2N(r3.A0X, i2);
        if (i2 == 3) {
            AnonymousClass008.A0n(r3.A19, "live_location_is_new_user", false);
            r3.A0R(true);
        } else if (i2 == 4) {
            AnonymousClass008.A0n(r3.A19, "nearby_location_new_user", false);
            Runnable runnable = r3.A0j;
            if (runnable != null) {
                runnable.run();
                return;
            }
            throw null;
        }
    }
}

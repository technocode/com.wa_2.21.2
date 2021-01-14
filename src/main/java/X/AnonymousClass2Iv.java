package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.2Iv  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Iv implements DialogInterface.OnClickListener {
    public final /* synthetic */ C52002aQ A00;

    public /* synthetic */ AnonymousClass2Iv(C52002aQ r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52002aQ r3 = this.A00;
        ActivityC004802g r2 = r3.A02;
        r2.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        C002001d.A2N(r2, r3.A0I.A02);
    }
}

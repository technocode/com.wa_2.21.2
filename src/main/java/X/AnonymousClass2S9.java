package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.2S9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AbstractC49792Sd A00;

    public /* synthetic */ AnonymousClass2S9(AbstractC49792Sd r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC49792Sd r3 = this.A00;
        r3.A0X.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
        C002001d.A2N(r3.A0X, 2);
    }
}

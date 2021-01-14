package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.2S3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public /* synthetic */ AnonymousClass2S3(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractView$OnCreateContextMenuListenerC56112i5 r3 = this.A00;
        r3.A0E.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
        C002001d.A2N(r3.A0E, 2);
    }
}

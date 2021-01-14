package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.35D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35D implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ AnonymousClass35Y A02;

    public /* synthetic */ AnonymousClass35D(AnonymousClass35Y r1, Context context, Uri uri) {
        this.A02 = r1;
        this.A00 = context;
        this.A01 = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass35Y r4 = this.A02;
        r4.A00.A05(this.A00, new Intent("android.intent.action.VIEW", this.A01));
    }
}

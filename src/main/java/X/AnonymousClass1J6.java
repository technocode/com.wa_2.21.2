package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.1J6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;

    public /* synthetic */ AnonymousClass1J6(Context context) {
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
    }
}

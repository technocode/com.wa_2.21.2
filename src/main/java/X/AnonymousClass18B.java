package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.18B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass18B implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ AnonymousClass18B(Activity activity) {
        this.A00 = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}

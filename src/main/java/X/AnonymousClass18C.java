package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Process;

/* renamed from: X.18C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass18C implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ AnonymousClass18C(Activity activity) {
        this.A00 = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.finish();
        Process.killProcess(Process.myPid());
    }
}

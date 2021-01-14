package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.1JW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JW implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0GZ A01;

    public /* synthetic */ AnonymousClass1JW(Activity activity, AnonymousClass0GZ r2) {
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A00;
        AnonymousClass0GZ r2 = this.A01;
        C002001d.A2N(activity, 115);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(r2.A01());
        activity.startActivity(intent);
    }
}

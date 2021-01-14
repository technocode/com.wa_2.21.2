package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.storage.StorageUsageActivity;

/* renamed from: X.1Hx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25681Hx implements DialogInterface.OnClickListener {
    public final /* synthetic */ C42921xV A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25681Hx(C42921xV r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C42921xV r0 = this.A00;
        Activity activity = r0.A01;
        activity.startActivity(StorageUsageActivity.A04(activity.getApplicationContext(), r0.A02, r0.A00));
    }
}

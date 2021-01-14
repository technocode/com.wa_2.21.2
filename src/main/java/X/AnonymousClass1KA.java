package X;

import android.content.DialogInterface;
import com.whatsapp.WaInAppBrowsingActivity;

/* renamed from: X.1KA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1KA implements DialogInterface.OnClickListener {
    public final /* synthetic */ WaInAppBrowsingActivity A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass1KA(WaInAppBrowsingActivity waInAppBrowsingActivity, boolean z) {
        this.A00 = waInAppBrowsingActivity;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        boolean z = this.A01;
        dialogInterface.dismiss();
        if (z) {
            waInAppBrowsingActivity.setResult(0, waInAppBrowsingActivity.getIntent());
            waInAppBrowsingActivity.finish();
        }
    }
}

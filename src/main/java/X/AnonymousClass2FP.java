package X;

import android.content.DialogInterface;
import com.whatsapp.companiondevice.optin.OptInActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2FP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FP implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass2FQ A00;
    public final /* synthetic */ OptInActivity A01;

    public /* synthetic */ AnonymousClass2FP(OptInActivity optInActivity, AnonymousClass2FQ r2) {
        this.A01 = optInActivity;
        this.A00 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OptInActivity optInActivity = this.A01;
        AnonymousClass2FQ r0 = this.A00;
        C51132Xm r2 = optInActivity.A07;
        int i2 = r0.A01;
        Log.d("OptInWebBeta/OptIn-Out_Confirmation_Clicked");
        boolean z = false;
        if (i2 == 0) {
            z = true;
        }
        r2.A04(z);
    }
}

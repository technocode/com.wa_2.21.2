package X;

import android.app.ProgressDialog;
import com.whatsapp.companiondevice.optin.OptInActivity;

/* renamed from: X.2Xj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51102Xj implements AnonymousClass0SG {
    public final /* synthetic */ OptInActivity A00;

    public /* synthetic */ C51102Xj(OptInActivity optInActivity) {
        this.A00 = optInActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        OptInActivity optInActivity = this.A00;
        Number number = (Number) obj;
        if (number == null) {
            ProgressDialog progressDialog = optInActivity.A00;
            if (progressDialog != null && progressDialog.isShowing()) {
                optInActivity.A00.dismiss();
                return;
            }
            return;
        }
        ProgressDialog progressDialog2 = optInActivity.A00;
        if (progressDialog2 == null || !progressDialog2.isShowing()) {
            if (optInActivity.A00 == null) {
                ProgressDialog progressDialog3 = new ProgressDialog(optInActivity);
                optInActivity.A00 = progressDialog3;
                progressDialog3.setCancelable(false);
            }
            optInActivity.A00.setMessage(optInActivity.getString(number.intValue()));
            optInActivity.A00.show();
        }
    }
}

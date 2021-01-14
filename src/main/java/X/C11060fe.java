package X;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.accountsync.LoginActivity;

/* renamed from: X.0fe  reason: invalid class name and case insensitive filesystem */
public class C11060fe extends AnonymousClass0JW {
    public final ProgressDialog A00;
    public final /* synthetic */ LoginActivity A01;

    public C11060fe(LoginActivity loginActivity, Context context) {
        this.A01 = loginActivity;
        ProgressDialog show = ProgressDialog.show(context, "", ((AnonymousClass2C0) loginActivity).A01.A06(R.string.account_sync_authenticating), true, false);
        this.A00 = show;
        show.setCancelable(true);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        this.A00.dismiss();
        if (((Boolean) obj).booleanValue()) {
            this.A01.finish();
        }
    }
}

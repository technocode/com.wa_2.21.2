package X;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;

/* renamed from: X.2CR  reason: invalid class name */
public class AnonymousClass2CR extends AnonymousClass2C0 {
    public AccountAuthenticatorResponse A00 = null;
    public Bundle A01 = null;

    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A00;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.A01;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.A00 = null;
        }
        super.finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("accountAuthenticatorResponse");
        this.A00 = accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }
}

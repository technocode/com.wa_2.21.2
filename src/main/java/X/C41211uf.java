package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
public class C41211uf extends AbstractC13660kc {
    public final /* synthetic */ AppAuthenticationActivity A00;

    public C41211uf(AppAuthenticationActivity appAuthenticationActivity) {
        this.A00 = appAuthenticationActivity;
    }

    @Override // X.AbstractC13660kc
    public void A00(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/error");
        AppAuthenticationActivity appAuthenticationActivity = this.A00;
        appAuthenticationActivity.A07.A02(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/error-too-many-attempts");
            appAuthenticationActivity.A0F.A0C(((AnonymousClass2C0) appAuthenticationActivity).A01.A0D(R.string.app_auth_lockout_error, 30), 1);
        }
    }

    @Override // X.AbstractC13660kc
    public void A01(C13670kd r4) {
        Log.i("AppAuthenticationActivity/success");
        AppAuthenticationActivity appAuthenticationActivity = this.A00;
        appAuthenticationActivity.A07.A02(false);
        appAuthenticationActivity.A0R();
        appAuthenticationActivity.finish();
    }
}

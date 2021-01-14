package X;

import com.whatsapp.AuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1rP  reason: invalid class name and case insensitive filesystem */
public class C39381rP extends AnonymousClass1Pz {
    public final /* synthetic */ AuthenticationActivity A00;

    public C39381rP(AuthenticationActivity authenticationActivity) {
        this.A00 = authenticationActivity;
    }

    @Override // X.AnonymousClass1Pz
    public void A00() {
        Log.i("AuthenticationActivity/fingerprint-success-animation-end");
        AuthenticationActivity authenticationActivity = this.A00;
        authenticationActivity.setResult(-1);
        authenticationActivity.finish();
    }
}

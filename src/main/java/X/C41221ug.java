package X;

import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1ug  reason: invalid class name and case insensitive filesystem */
public class C41221ug extends AnonymousClass1Pz {
    public final /* synthetic */ AppAuthenticationActivity A00;

    public C41221ug(AppAuthenticationActivity appAuthenticationActivity) {
        this.A00 = appAuthenticationActivity;
    }

    @Override // X.AnonymousClass1Pz
    public void A00() {
        Log.i("AppAuthenticationActivity/fingerprint-success-animation-end");
        AppAuthenticationActivity appAuthenticationActivity = this.A00;
        appAuthenticationActivity.A0R();
        appAuthenticationActivity.finish();
    }
}

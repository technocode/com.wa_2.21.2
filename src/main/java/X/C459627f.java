package X;

import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.27f  reason: invalid class name and case insensitive filesystem */
public class C459627f extends AbstractC41241ui {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C459627f(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    @Override // X.AnonymousClass1Pz
    public void A00() {
        Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        FingerprintBottomSheet fingerprintBottomSheet = appAuthSettingsActivity.A09;
        if (fingerprintBottomSheet != null && fingerprintBottomSheet.A0W()) {
            appAuthSettingsActivity.A09.A0r();
        }
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A0V(true);
    }
}

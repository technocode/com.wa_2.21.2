package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1ue  reason: invalid class name and case insensitive filesystem */
public class C41201ue extends AbstractC13660kc {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C41201ue(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    @Override // X.AbstractC13660kc
    public void A00(int i, CharSequence charSequence) {
        if (i == 7) {
            AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
            ((ActivityC004702f) appAuthSettingsActivity).A0F.A0C(((AnonymousClass2C0) appAuthSettingsActivity).A01.A0D(R.string.app_auth_lockout_error_short, 30), 1);
        }
        Log.i("AppAuthSettingsActivity/error");
        this.A00.A0T();
    }

    @Override // X.AbstractC13660kc
    public void A01(C13670kd r6) {
        Log.i("AppAuthSettingsActivity/success");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        AnonymousClass1Pw r3 = ((ActivityC004602e) appAuthSettingsActivity).A0A;
        r3.A02(false);
        AnonymousClass008.A0n(appAuthSettingsActivity.A0J, "privacy_fingerprint_enabled", true);
        appAuthSettingsActivity.A0D.A04();
        appAuthSettingsActivity.A0V(true);
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A0A.A02();
        r3.A01(appAuthSettingsActivity);
    }
}

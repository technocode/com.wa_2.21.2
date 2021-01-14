package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsPrivacy;

/* renamed from: X.1qr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39041qr {
    public final /* synthetic */ SettingsPrivacy A00;

    public /* synthetic */ C39041qr(SettingsPrivacy settingsPrivacy) {
        this.A00 = settingsPrivacy;
    }

    public final void A00(String str, int i) {
        SettingsPrivacy settingsPrivacy = this.A00;
        if (!settingsPrivacy.A0T.A05()) {
            settingsPrivacy.A0M.A06(R.string.coldsync_no_network, 0);
        } else {
            settingsPrivacy.A0c(SettingsPrivacy.A06(str), SettingsPrivacy.A05(settingsPrivacy.A0V(str, i)));
        }
    }
}

package X;

import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;
import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1JL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JL implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;

    public /* synthetic */ AnonymousClass1JL(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        this.A00 = settingsJidNotificationActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        String str = Build.MODEL;
        if ((str.contains("Desire") || str.contains("Wildfire")) && !obj.toString().equals("00FF00")) {
            settingsJidNotificationActivity.APo(R.string.led_support_green_only);
        }
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        AnonymousClass0BB r2 = settingsJidNotificationActivity.A05;
        AnonymousClass02N r0 = settingsJidNotificationActivity.A00;
        String obj2 = obj.toString();
        if (r2 != null) {
            r2.A0I(r0.getRawString(), obj2);
            return true;
        }
        throw null;
    }
}

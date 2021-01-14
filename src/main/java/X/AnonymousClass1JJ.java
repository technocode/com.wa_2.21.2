package X;

import android.preference.ListPreference;
import android.preference.Preference;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1JJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JJ implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;

    public /* synthetic */ AnonymousClass1JJ(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        this.A00 = settingsJidNotificationActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        AnonymousClass0BB r2 = settingsJidNotificationActivity.A05;
        AnonymousClass02N r0 = settingsJidNotificationActivity.A00;
        String obj2 = obj.toString();
        if (r2 != null) {
            r2.A0J(r0.getRawString(), obj2);
            return true;
        }
        throw null;
    }
}

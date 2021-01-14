package X;

import android.preference.ListPreference;
import android.preference.Preference;
import android.text.TextUtils;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1JF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JF implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;

    public /* synthetic */ AnonymousClass1JF(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        this.A00 = settingsJidNotificationActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        AnonymousClass0BB r3 = settingsJidNotificationActivity.A05;
        AnonymousClass02N r0 = settingsJidNotificationActivity.A00;
        String obj2 = obj.toString();
        if (r3 != null) {
            AnonymousClass0BG A09 = r3.A09(r0.getRawString());
            if (TextUtils.equals(obj2, A09.A07)) {
                return true;
            }
            A09.A07 = obj2;
            r3.A0H(A09);
            return true;
        }
        throw null;
    }
}

package X;

import android.preference.Preference;
import com.whatsapp.SettingsJidNotificationActivity;
import com.whatsapp.preference.WaRingtonePreference;

/* renamed from: X.1JG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JG implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;
    public final /* synthetic */ WaRingtonePreference A01;

    public /* synthetic */ AnonymousClass1JG(SettingsJidNotificationActivity settingsJidNotificationActivity, WaRingtonePreference waRingtonePreference) {
        this.A00 = settingsJidNotificationActivity;
        this.A01 = waRingtonePreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        WaRingtonePreference waRingtonePreference = this.A01;
        String obj2 = obj.toString();
        waRingtonePreference.A00 = obj2;
        waRingtonePreference.setSummary(AnonymousClass0BS.A06(preference.getContext(), settingsJidNotificationActivity.A0D, obj2));
        settingsJidNotificationActivity.A05.A0K(settingsJidNotificationActivity.A00.getRawString(), obj2);
        return true;
    }
}

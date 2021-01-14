package X;

import android.preference.Preference;
import android.text.TextUtils;
import com.whatsapp.SettingsJidNotificationActivity;
import com.whatsapp.preference.WaRingtonePreference;

/* renamed from: X.1JK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JK implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;
    public final /* synthetic */ WaRingtonePreference A01;

    public /* synthetic */ AnonymousClass1JK(SettingsJidNotificationActivity settingsJidNotificationActivity, WaRingtonePreference waRingtonePreference) {
        this.A00 = settingsJidNotificationActivity;
        this.A01 = waRingtonePreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        WaRingtonePreference waRingtonePreference = this.A01;
        String obj2 = obj.toString();
        waRingtonePreference.A00 = obj2;
        waRingtonePreference.setSummary(AnonymousClass0BS.A06(preference.getContext(), settingsJidNotificationActivity.A0D, obj2));
        AnonymousClass0BB r2 = settingsJidNotificationActivity.A05;
        AnonymousClass0BG A09 = r2.A09(settingsJidNotificationActivity.A00.getRawString());
        if (TextUtils.equals(obj2, A09.A06)) {
            return true;
        }
        A09.A06 = obj2;
        r2.A0H(A09);
        return true;
    }
}

package X;

import android.preference.Preference;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1JM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JM implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;

    public /* synthetic */ AnonymousClass1JM(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        this.A00 = settingsJidNotificationActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        AnonymousClass0BB r3 = settingsJidNotificationActivity.A05;
        AnonymousClass02N r1 = settingsJidNotificationActivity.A00;
        boolean equals = Boolean.FALSE.equals(obj);
        if (r3 != null) {
            AnonymousClass0BG A09 = r3.A09(r1.getRawString());
            if (equals == A09.A0D) {
                return true;
            }
            A09.A0D = equals;
            r3.A0H(A09);
            return true;
        }
        throw null;
    }
}

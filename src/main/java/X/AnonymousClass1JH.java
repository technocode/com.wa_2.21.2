package X;

import android.preference.Preference;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1JH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JH implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ SettingsJidNotificationActivity A00;

    public /* synthetic */ AnonymousClass1JH(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        this.A00 = settingsJidNotificationActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsJidNotificationActivity settingsJidNotificationActivity = this.A00;
        AnonymousClass0BB r5 = settingsJidNotificationActivity.A05;
        AnonymousClass02N r1 = settingsJidNotificationActivity.A00;
        boolean equals = Boolean.TRUE.equals(obj);
        AnonymousClass0HI r3 = settingsJidNotificationActivity.A02;
        AnonymousClass0BG A08 = r5.A08(r1);
        if (equals != A08.A0H) {
            if (equals) {
                A08.A0D = A08.A0B();
                C007003k A09 = r5.A03.A09(r1);
                if (A09 != null) {
                    r3.A02(r5.A0A.A00, A09);
                }
            } else {
                r3.A08(r1);
            }
            A08.A0H = equals;
            r5.A0H(A08);
        }
        settingsJidNotificationActivity.A02();
        return true;
    }
}

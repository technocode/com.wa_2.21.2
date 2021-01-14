package X;

import android.content.Intent;
import android.preference.Preference;
import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsChatHistory;
import com.whatsapp.contact.picker.ContactPicker;

/* renamed from: X.1JB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JB implements Preference.OnPreferenceClickListener {
    public final /* synthetic */ SettingsChatHistory A00;

    public /* synthetic */ AnonymousClass1JB(SettingsChatHistory settingsChatHistory) {
        this.A00 = settingsChatHistory;
    }

    public final boolean onPreferenceClick(Preference preference) {
        SettingsChatHistory settingsChatHistory = this.A00;
        if (settingsChatHistory.A05.A07()) {
            boolean A01 = AnonymousClass00C.A01();
            int i = R.string.need_sd_card_shared_storage;
            if (A01) {
                i = R.string.need_sd_card;
            }
            settingsChatHistory.APo(i);
            return true;
        }
        Intent intent = new Intent(settingsChatHistory, ContactPicker.class);
        intent.putExtra("email_history", true);
        settingsChatHistory.startActivityForResult(intent, 10);
        return true;
    }
}

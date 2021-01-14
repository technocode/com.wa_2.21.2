package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0BB;
import X.AnonymousClass0BG;
import X.AnonymousClass0BS;
import X.AnonymousClass0HI;
import X.AnonymousClass0M9;
import X.AnonymousClass1JF;
import X.AnonymousClass1JG;
import X.AnonymousClass1JH;
import X.AnonymousClass1JI;
import X.AnonymousClass1JJ;
import X.AnonymousClass1JK;
import X.AnonymousClass1JL;
import X.AnonymousClass1JM;
import X.AnonymousClass1VY;
import X.AnonymousClass27X;
import X.C002001d;
import X.C02590Cr;
import X.C02780Dk;
import X.C26891Nb;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.TwoStatePreference;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.util.Log;

public class SettingsJidNotificationActivity extends AnonymousClass27X {
    public AnonymousClass02N A00;
    public final C02780Dk A01 = C02780Dk.A02();
    public final AnonymousClass0HI A02 = AnonymousClass0HI.A00();
    public final C02590Cr A03 = C02590Cr.A00();
    public final AnonymousClass0M9 A04 = AnonymousClass0M9.A01();
    public final AnonymousClass0BB A05 = AnonymousClass0BB.A00();

    public final void A01() {
        AnonymousClass0BG A08 = this.A05.A08(this.A00);
        addPreferencesFromResource(R.xml.preferences_jid_notifications);
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) findPreference("jid_message_tone");
        String A07 = A08.A07();
        waRingtonePreference.A00 = A07;
        AnonymousClass01X r3 = this.A0D;
        waRingtonePreference.setSummary(AnonymousClass0BS.A06(this, r3, A07));
        waRingtonePreference.setOnPreferenceChangeListener(new AnonymousClass1JG(this, waRingtonePreference));
        ListPreference listPreference = (ListPreference) findPreference("jid_message_vibrate");
        listPreference.setValue(A08.A08());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(new AnonymousClass1JI(this));
        ListPreference listPreference2 = (ListPreference) findPreference("jid_message_popup");
        if (Build.VERSION.SDK_INT >= 29) {
            int A06 = C002001d.A06(this, R.attr.settingsTextDisabled, R.color.settings_disabled_text);
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("notification");
            preferenceGroup.removePreference(listPreference2);
            C26891Nb r1 = new C26891Nb(this, this, A06);
            r1.setKey(listPreference2.getKey());
            r1.setPersistent(listPreference2.isPersistent());
            r1.setDefaultValue(listPreference2.getValue());
            r1.setEntries(listPreference2.getEntries());
            r1.setEntryValues(listPreference2.getEntryValues());
            r1.setSummary(listPreference2.getSummary());
            r1.setTitle(listPreference2.getTitle());
            r1.setOrder(listPreference2.getOrder());
            preferenceGroup.addPreference(r1);
            r1.setValue(listPreference2.getValue());
            r1.setSummary(r3.A06(R.string.popup_notification_not_available));
        } else {
            listPreference2.setValue(A08.A06());
            listPreference2.setSummary(listPreference2.getEntry());
            listPreference2.setOnPreferenceChangeListener(new AnonymousClass1JJ(this));
        }
        ListPreference listPreference3 = (ListPreference) findPreference("jid_message_light");
        listPreference3.setEntries(r3.A0N(SettingsNotifications.A0k));
        listPreference3.setValue(A08.A05());
        listPreference3.setSummary(listPreference3.getEntry());
        listPreference3.setOnPreferenceChangeListener(new AnonymousClass1JL(this));
        TwoStatePreference twoStatePreference = (TwoStatePreference) findPreference("jid_use_high_priority_notifications");
        if (Build.VERSION.SDK_INT < 21) {
            ((PreferenceGroup) findPreference("notification")).removePreference(twoStatePreference);
        } else {
            twoStatePreference.setChecked(!A08.A0B());
            twoStatePreference.setOnPreferenceChangeListener(new AnonymousClass1JM(this));
        }
        if (AnonymousClass1VY.A0Y(this.A00)) {
            Preference findPreference = findPreference("jid_call");
            if (findPreference != null) {
                getPreferenceScreen().removePreference(findPreference);
            }
        } else {
            WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) findPreference("jid_call_ringtone");
            String A032 = A08.A03();
            waRingtonePreference2.A00 = A032;
            waRingtonePreference2.setSummary(AnonymousClass0BS.A06(this, r3, A032));
            waRingtonePreference2.setOnPreferenceChangeListener(new AnonymousClass1JK(this, waRingtonePreference2));
            ListPreference listPreference4 = (ListPreference) findPreference("jid_call_vibrate");
            listPreference4.setValue(A08.A04());
            listPreference4.setSummary(listPreference4.getEntry());
            listPreference4.setOnPreferenceChangeListener(new AnonymousClass1JF(this));
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) findPreference("jid_use_custom");
        twoStatePreference2.setChecked(A08.A0H);
        twoStatePreference2.setOnPreferenceChangeListener(new AnonymousClass1JH(this));
        A02();
    }

    public final void A02() {
        boolean z = this.A05.A08(this.A00).A0H;
        findPreference("jid_message_tone").setEnabled(z);
        findPreference("jid_message_vibrate").setEnabled(z);
        findPreference("jid_message_popup").setEnabled(z);
        findPreference("jid_message_light").setEnabled(z);
        if (Build.VERSION.SDK_INT >= 21) {
            findPreference("jid_use_high_priority_notifications").setEnabled(z);
        }
        if (!AnonymousClass1VY.A0Y(this.A00)) {
            findPreference("jid_call_ringtone").setEnabled(z);
            findPreference("jid_call_vibrate").setEnabled(z);
        }
    }

    @Override // X.AnonymousClass27X, X.C39951sN
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
        if (A012 != null) {
            this.A00 = A012;
            setTitle(this.A0D.A06(R.string.settings_notifications));
            A01();
            return;
        }
        throw null;
    }

    @Override // X.C39951sN
    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        C02590Cr r2 = this.A03;
        C02780Dk r3 = this.A01;
        AnonymousClass0M9 r4 = this.A04;
        AnonymousClass01X r5 = this.A0D;
        return FAQLearnMoreDialogFragment.A00(this, r2, r3, r4, r5, "26000003", r5.A06(R.string.popup_notification_disabled_message), null, null);
    }

    @Override // X.AnonymousClass27X
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, this.A0D.A06(R.string.settings_notification_reset)).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.C39951sN
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass0BB r3 = this.A05;
        AnonymousClass0BG A08 = r3.A08(this.A00);
        AnonymousClass0BG A022 = A08.A02();
        A08.A0A = A022.A07();
        A08.A0B = A022.A08();
        A08.A09 = A022.A06();
        A08.A08 = A022.A05();
        A08.A06 = A022.A03();
        A08.A07 = A022.A04();
        A08.A0H = false;
        A08.A0D = false;
        r3.A0H(A08);
        getPreferenceScreen().removeAll();
        A01();
        return true;
    }

    public void onStart() {
        super.onStart();
        AnonymousClass0BB r1 = this.A05;
        AnonymousClass02N r0 = this.A00;
        if (r1 == null) {
            throw null;
        } else if (r1.A0P(r0.getRawString())) {
            Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
            getPreferenceScreen().removeAll();
            A01();
        }
    }
}

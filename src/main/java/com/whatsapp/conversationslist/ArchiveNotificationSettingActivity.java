package com.whatsapp.conversationslist;

import X.ActivityC004602e;
import X.AnonymousClass00D;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass2JI;
import X.AnonymousClass2JJ;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.WaSwitchView;

public class ArchiveNotificationSettingActivity extends ActivityC004602e {
    public final AnonymousClass00D A00 = AnonymousClass00D.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
        }
        setContentView(R.layout.archive_notification_activity);
        setTitle(R.string.archive_settings);
        WaSwitchView waSwitchView = (WaSwitchView) AnonymousClass0TX.A0A(this, R.id.notify_new_message_switch_view);
        SharedPreferences sharedPreferences = this.A00.A00;
        waSwitchView.setChecked(sharedPreferences.getBoolean("notify_new_message_for_archived_chats", false));
        waSwitchView.setOnCheckedChangeListener(new AnonymousClass2JJ(this));
        waSwitchView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(waSwitchView, 27));
        WaSwitchView waSwitchView2 = (WaSwitchView) AnonymousClass0TX.A0A(this, R.id.auto_hide_switch_view);
        waSwitchView2.setChecked(sharedPreferences.getBoolean("auto_archive_inactive_chats", false));
        waSwitchView2.setOnCheckedChangeListener(new AnonymousClass2JI(this));
        waSwitchView2.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(waSwitchView2, 26));
        waSwitchView2.setVisibility(8);
    }
}

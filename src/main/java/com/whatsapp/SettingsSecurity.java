package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.AnonymousClass0DH;
import X.AnonymousClass0M9;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass1JQ;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C002101e;
import X.C015808q;
import X.C02780Dk;
import X.C06210Sf;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;

public class SettingsSecurity extends ActivityC004602e {
    public final C06210Sf A00 = C06210Sf.A00();
    public final AnonymousClass0DH A01 = AnonymousClass0DH.A00();
    public final AnonymousClass0M9 A02 = AnonymousClass0M9.A01();
    public final C015808q A03 = C015808q.A00();
    public final AnonymousClass00T A04 = C002101e.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        Uri A022;
        super.onCreate(bundle);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.settings_security));
        setContentView(R.layout.settings_security);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            CompoundButton compoundButton = (CompoundButton) findViewById(R.id.security_notifications);
            compoundButton.setChecked(this.A0J.A00.getBoolean("security_notifications", false));
            compoundButton.setOnCheckedChangeListener(new AnonymousClass1JQ(this));
            AnonymousClass02M r11 = ((ActivityC004702f) this).A0F;
            C02780Dk r12 = ((ActivityC004602e) this).A04;
            AnonymousClass03P r13 = this.A0I;
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.settings_security_toggle_info);
            C015808q r2 = this.A03;
            if (r2.A01()) {
                i = R.string.settings_security_notifications_toggle_info_md;
            } else {
                boolean A0D = ((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0a);
                i = R.string.settings_security_notifications_toggle_info;
                if (A0D) {
                    i = R.string.settings_security_notifications_toggle_info_v2;
                }
            }
            String A0D2 = r6.A0D(i, "learn-more");
            if (r2.A01()) {
                A022 = this.A02.A03("general", "md-placeholder", null);
            } else {
                A022 = this.A02.A02("security-and-privacy", "security-code-change-notification");
            }
            C002001d.A2Q(this, r11, r12, r13, textEmojiLabel, A0D2, A022);
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.settings_security_info_text);
            boolean A0D3 = ((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0a);
            int i2 = R.string.settings_security_info_with_link;
            if (A0D3) {
                i2 = R.string.settings_security_info_with_link_v2;
            }
            C002001d.A2Q(this, r11, r12, r13, textEmojiLabel2, r6.A0D(i2, "learn-more"), this.A00.A01("https://www.whatsapp.com/security"));
            TextView textView = (TextView) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.settings_security_toggle_title);
            boolean A012 = r2.A01();
            int i3 = R.string.settings_security_notifications_toggle_title;
            if (A012) {
                i3 = R.string.settings_security_notifications_toggle_title_md;
            }
            textView.setText(i3);
            findViewById(R.id.security_notifications_group).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(compoundButton, 27));
            return;
        }
        throw null;
    }
}

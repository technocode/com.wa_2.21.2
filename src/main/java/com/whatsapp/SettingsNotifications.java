package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass0BB;
import X.AnonymousClass0BG;
import X.AnonymousClass0BS;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0SA;
import X.AnonymousClass0SB;
import X.AnonymousClass1JO;
import X.AnonymousClass2C0;
import X.C002001d;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.util.Log;

public class SettingsNotifications extends AnonymousClass0SA implements AnonymousClass0SB {
    public static final int[] A0k = {R.string.color_none, R.string.color_white, R.string.color_red, R.string.color_yellow, R.string.color_green, R.string.color_cyan, R.string.color_blue, R.string.color_purple};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public TextView A0S;
    public TextView A0T;
    public TextView A0U;
    public SwitchCompat A0V;
    public SwitchCompat A0W;
    public SwitchCompat A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public boolean A0b;
    public boolean A0c;
    public String[] A0d;
    public String[] A0e;
    public String[] A0f;
    public String[] A0g;
    public String[] A0h;
    public final AnonymousClass00D A0i = AnonymousClass00D.A00();
    public final AnonymousClass0BB A0j = AnonymousClass0BB.A00();

    public static int A04(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean A05(String str) {
        String str2 = Build.MODEL;
        return (str2.contains("Desire") || str2.contains("Wildfire")) && !str.equals("00FF00");
    }

    public final void A0V() {
        AnonymousClass0BB r0 = this.A0j;
        AnonymousClass0BG A052 = r0.A05();
        AnonymousClass0BG A042 = r0.A04();
        this.A0a = A052.A07();
        this.A06 = A04(A052.A08(), this.A0h);
        this.A05 = A04(A052.A06(), this.A0f);
        this.A04 = A04(A052.A05(), this.A0d);
        this.A0c = A052.A0B();
        this.A0Z = A042.A07();
        this.A03 = A04(A042.A08(), this.A0h);
        this.A02 = A04(A042.A06(), this.A0f);
        this.A01 = A04(A042.A05(), this.A0d);
        this.A0b = A042.A0B();
        this.A0Y = A052.A03();
        this.A00 = A04(A052.A04(), this.A0h);
        this.A09.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 4));
        this.A0V.setChecked(this.A0i.A00.getBoolean("conversation_sound", true));
        TextView textView = this.A0S;
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        textView.setText(AnonymousClass0BS.A06(this, r4, this.A0a));
        this.A0H.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 9));
        int i = this.A06;
        if (i != -1) {
            this.A0U.setText(this.A0g[i]);
        }
        this.A0J.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 14));
        if (Build.VERSION.SDK_INT >= 29) {
            int A062 = C002001d.A06(this, R.attr.settingsTextDisabled, R.color.settings_disabled_text);
            this.A0K.setTextColor(A062);
            this.A0T.setTextColor(A062);
            this.A0T.setText(r4.A06(R.string.popup_notification_not_available));
            this.A0I.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 16));
        } else {
            int i2 = this.A05;
            if (i2 != -1) {
                this.A0T.setText(this.A0e[i2]);
            }
            this.A0I.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 17));
        }
        int i3 = this.A04;
        if (i3 != -1) {
            this.A0R.setText(r4.A06(A0k[i3]));
        }
        this.A0G.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 5));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A0F.setVisibility(0);
            this.A0X.setChecked(Boolean.FALSE.equals(Boolean.valueOf(this.A0c)));
            this.A0F.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 8));
        } else {
            this.A0F.setVisibility(8);
        }
        this.A0O.setText(AnonymousClass0BS.A06(this, r4, this.A0Z));
        this.A0C.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 10));
        int i4 = this.A03;
        if (i4 != -1) {
            this.A0Q.setText(this.A0g[i4]);
        }
        this.A0E.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 15));
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0D.setVisibility(8);
        } else {
            int i5 = this.A02;
            if (i5 != -1) {
                this.A0P.setText(this.A0e[i5]);
            }
            this.A0D.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 11));
        }
        int i6 = this.A01;
        if (i6 != -1) {
            this.A0N.setText(r4.A06(A0k[i6]));
        }
        this.A0B.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 12));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A0A.setVisibility(0);
            this.A0W.setChecked(Boolean.FALSE.equals(Boolean.valueOf(this.A0b)));
            this.A0A.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 6));
        } else {
            this.A0A.setVisibility(8);
        }
        this.A0L.setText(AnonymousClass0BS.A06(this, r4, this.A0Y));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 7));
        int i7 = this.A00;
        if (i7 != -1) {
            this.A0M.setText(this.A0g[i7]);
        }
        this.A08.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 13));
    }

    public final void A0W(int i, String str, String str2, int i2) {
        Uri parse;
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TITLE", str);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        if (!(str2 == null || str2.equals("Silent") || (parse = Uri.parse(str2)) == null)) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parse);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        } else {
            intent.putExtra("android.intent.extra.ringtone.TYPE", i2);
        }
        startActivityForResult(Intent.createChooser(intent, null), i);
    }

    @Override // X.AnonymousClass0SB
    public void AKB(int i, int i2) {
        switch (i) {
            case 9:
                this.A06 = i2;
                this.A0j.A0L("individual_chat_defaults", String.valueOf(this.A0h[i2]));
                this.A0U.setText(this.A0g[i2]);
                return;
            case 10:
                this.A05 = i2;
                this.A0j.A0J("individual_chat_defaults", String.valueOf(this.A0f[i2]));
                this.A0T.setText(this.A0e[i2]);
                return;
            case 11:
                if (A05(this.A0d[i2])) {
                    C002001d.A2O(this, 7);
                    return;
                }
                this.A04 = i2;
                this.A0j.A0I("individual_chat_defaults", String.valueOf(this.A0d[i2]));
                this.A0R.setText(((AnonymousClass2C0) this).A01.A06(A0k[i2]));
                return;
            case 12:
                this.A03 = i2;
                this.A0j.A0L("group_chat_defaults", String.valueOf(this.A0h[i2]));
                this.A0Q.setText(this.A0g[i2]);
                return;
            case 13:
                this.A02 = i2;
                this.A0j.A0J("group_chat_defaults", String.valueOf(this.A0f[i2]));
                this.A0P.setText(this.A0e[i2]);
                return;
            case 14:
                if (A05(this.A0d[i2])) {
                    C002001d.A2O(this, 7);
                    return;
                }
                this.A01 = i2;
                this.A0j.A0I("group_chat_defaults", String.valueOf(this.A0d[i2]));
                this.A0N.setText(((AnonymousClass2C0) this).A01.A06(A0k[i2]));
                return;
            case 15:
                this.A00 = i2;
                AnonymousClass0BB r4 = this.A0j;
                String valueOf = String.valueOf(this.A0h[i2]);
                AnonymousClass0BG A092 = r4.A09("individual_chat_defaults");
                if (!TextUtils.equals(valueOf, A092.A07)) {
                    A092.A07 = valueOf;
                    r4.A0H(A092);
                }
                this.A0M.setText(this.A0g[i2]);
                return;
            default:
                return;
        }
    }

    public void lambda$initScreen$1399$SettingsNotifications(View view) {
        this.A0V.toggle();
        AnonymousClass008.A0n(this.A0i, "conversation_sound", this.A0V.isChecked());
    }

    public /* synthetic */ void lambda$initScreen$1400$SettingsNotifications(View view) {
        A0W(1, ((AnonymousClass2C0) this).A01.A06(R.string.settings_notification_sound), this.A0a, 7);
    }

    public /* synthetic */ void lambda$initScreen$1401$SettingsNotifications(View view) {
        A0T(9, R.string.settings_notification_vibrate, this.A06, R.array.vibrate_lengths);
    }

    public /* synthetic */ void lambda$initScreen$1402$SettingsNotifications(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("message_string_res_id", R.string.popup_notification_disabled_message);
        bundle.putString("faq_id", "26000003");
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("faq_section_name", null);
        }
        FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment = new FAQLearnMoreDialogFragment();
        fAQLearnMoreDialogFragment.A0N(bundle);
        APm(fAQLearnMoreDialogFragment);
    }

    public /* synthetic */ void lambda$initScreen$1403$SettingsNotifications(View view) {
        A0T(10, R.string.settings_notification_popup, this.A05, R.array.popup_mode);
    }

    public /* synthetic */ void lambda$initScreen$1404$SettingsNotifications(View view) {
        A0U(11, R.string.settings_notification_light, this.A04, ((AnonymousClass2C0) this).A01.A0N(A0k));
    }

    public void lambda$initScreen$1405$SettingsNotifications(View view) {
        this.A0X.toggle();
        boolean equals = Boolean.FALSE.equals(Boolean.valueOf(this.A0X.isChecked()));
        this.A0c = equals;
        AnonymousClass0BB r2 = this.A0j;
        AnonymousClass0BG A092 = r2.A09("individual_chat_defaults");
        if (equals != A092.A0D) {
            A092.A0D = equals;
            r2.A0H(A092);
        }
    }

    public /* synthetic */ void lambda$initScreen$1406$SettingsNotifications(View view) {
        A0W(2, ((AnonymousClass2C0) this).A01.A06(R.string.settings_notification_sound), this.A0Z, 7);
    }

    public /* synthetic */ void lambda$initScreen$1407$SettingsNotifications(View view) {
        A0T(12, R.string.settings_notification_vibrate, this.A03, R.array.vibrate_lengths);
    }

    public /* synthetic */ void lambda$initScreen$1408$SettingsNotifications(View view) {
        A0T(13, R.string.settings_notification_popup, this.A02, R.array.popup_mode);
    }

    public /* synthetic */ void lambda$initScreen$1409$SettingsNotifications(View view) {
        A0U(14, R.string.settings_notification_light, this.A01, ((AnonymousClass2C0) this).A01.A0N(A0k));
    }

    public void lambda$initScreen$1410$SettingsNotifications(View view) {
        this.A0W.toggle();
        boolean equals = Boolean.FALSE.equals(Boolean.valueOf(this.A0W.isChecked()));
        this.A0b = equals;
        AnonymousClass0BB r2 = this.A0j;
        AnonymousClass0BG A092 = r2.A09("group_chat_defaults");
        if (equals != A092.A0D) {
            A092.A0D = equals;
            r2.A0H(A092);
        }
    }

    public /* synthetic */ void lambda$initScreen$1411$SettingsNotifications(View view) {
        A0W(3, ((AnonymousClass2C0) this).A01.A06(R.string.settings_calls_ringtone), this.A0Y, 1);
    }

    public /* synthetic */ void lambda$initScreen$1412$SettingsNotifications(View view) {
        A0T(15, R.string.settings_notification_vibrate, this.A00, R.array.vibrate_lengths);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        String A062;
        String str;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2 || i == 3) && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A062 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A062 = AnonymousClass0BS.A06(this, ((AnonymousClass2C0) this).A01, null);
                str = "Silent";
            }
            if (i == 1) {
                this.A0a = str;
                this.A0j.A0K("individual_chat_defaults", str);
                this.A0S.setText(A062);
            } else if (i == 2) {
                this.A0Z = str;
                this.A0j.A0K("group_chat_defaults", str);
                this.A0O.setText(A062);
            } else if (i == 3) {
                this.A0Y = str;
                AnonymousClass0BB r2 = this.A0j;
                AnonymousClass0BG A092 = r2.A09("individual_chat_defaults");
                if (!TextUtils.equals(str, A092.A06)) {
                    A092.A06 = str;
                    r2.A0H(A092);
                }
                this.A0L.setText(A062);
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_notifications));
        setContentView(R.layout.preferences_notifications);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            this.A09 = findViewById(R.id.conversation_sound_setting);
            this.A0V = (SwitchCompat) findViewById(R.id.conversation_sound_switch);
            this.A0H = findViewById(R.id.notification_tone_setting);
            this.A0S = (TextView) findViewById(R.id.selected_notification_tone);
            this.A0J = findViewById(R.id.vibrate_setting);
            this.A0U = (TextView) findViewById(R.id.selected_vibrate_setting);
            this.A0I = findViewById(R.id.popup_notification_setting);
            this.A0K = (TextView) findViewById(R.id.popup_notification_setting_title);
            this.A0T = (TextView) findViewById(R.id.selected_popup_notification_setting);
            this.A0G = findViewById(R.id.notification_light_setting);
            this.A0R = (TextView) findViewById(R.id.selected_notification_light_setting);
            this.A0F = findViewById(R.id.high_priority_notifications_setting);
            this.A0X = (SwitchCompat) findViewById(R.id.high_priority_notifications_switch);
            this.A0C = findViewById(R.id.group_notification_tone_setting);
            this.A0O = (TextView) findViewById(R.id.selected_group_notification_tone);
            this.A0E = findViewById(R.id.group_vibrate_setting);
            this.A0Q = (TextView) findViewById(R.id.selected_group_vibrate_setting);
            this.A0D = findViewById(R.id.group_popup_notification_setting);
            this.A0P = (TextView) findViewById(R.id.selected_group_popup_notification_setting);
            this.A0B = findViewById(R.id.group_notification_light_setting);
            this.A0N = (TextView) findViewById(R.id.selected_group_notification_light_setting);
            this.A0A = findViewById(R.id.group_high_priority_notifications_setting);
            this.A0W = (SwitchCompat) findViewById(R.id.group_high_priority_notifications_switch);
            this.A07 = findViewById(R.id.call_tone_setting);
            this.A0L = (TextView) findViewById(R.id.selected_call_tone);
            this.A08 = findViewById(R.id.call_vibrate_setting);
            this.A0M = (TextView) findViewById(R.id.selected_call_vibrate_setting);
            Resources resources = getResources();
            this.A0g = resources.getStringArray(R.array.vibrate_lengths);
            this.A0h = resources.getStringArray(R.array.vibrate_values);
            this.A0e = resources.getStringArray(R.array.popup_mode);
            this.A0f = resources.getStringArray(R.array.popup_mode_values);
            this.A0d = resources.getStringArray(R.array.led_color_values);
            A0V();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 7) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r2.A06(R.string.led_support_green_only);
            r3.A07(r2.A06(R.string.ok), null);
            return r3.A00();
        } else if (i != 8) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
            r32.A01.A0E = r22.A06(R.string.settings_notification_reset_warning);
            r32.A07(r22.A06(R.string.reset_notifications), new AnonymousClass1JO(this));
            return AnonymousClass008.A03(r22, R.string.cancel, r32);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, ((AnonymousClass2C0) this).A01.A06(R.string.settings_notification_reset)).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        C002001d.A2O(this, 8);
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        AnonymousClass0BB r2 = this.A0j;
        if (r2 == null) {
            throw null;
        } else if (AnonymousClass0BB.A0Q) {
            boolean A0P2 = r2.A0P("individual_chat_defaults");
            boolean A0P3 = r2.A0P("group_chat_defaults");
            if (A0P2 || A0P3) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                A0V();
            }
        }
    }
}

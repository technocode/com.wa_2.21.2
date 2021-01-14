package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass08B;
import X.AnonymousClass09E;
import X.AnonymousClass09G;
import X.AnonymousClass09U;
import X.AnonymousClass0BP;
import X.AnonymousClass0ED;
import X.AnonymousClass0GG;
import X.AnonymousClass0I4;
import X.AnonymousClass0I5;
import X.AnonymousClass0S2;
import X.AnonymousClass0SA;
import X.AnonymousClass0SB;
import X.AnonymousClass1JP;
import X.AnonymousClass1Pw;
import X.AnonymousClass2C0;
import X.AnonymousClass2RT;
import X.AnonymousClass3LE;
import X.C000300f;
import X.C002101e;
import X.C01970Ad;
import X.C01980Ae;
import X.C02040Ak;
import X.C26911Nd;
import X.C39041qr;
import X.C40401tD;
import X.C40691tg;
import X.C40701th;
import X.C449222e;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Map;

public class SettingsPrivacy extends AnonymousClass0SA implements AnonymousClass0SB {
    public static SettingsPrivacy A0f;
    public static HashMap A0g = new HashMap();
    public static final int[] A0h = {R.string.privacy_everyone, R.string.privacy_contacts, R.string.privacy_nobody};
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public SwitchCompat A0I;
    public C39041qr A0J = new C39041qr(this);
    public final Handler A0K = new Handler(Looper.getMainLooper());
    public final AnonymousClass0GG A0L = AnonymousClass0GG.A00();
    public final AnonymousClass02M A0M = AnonymousClass02M.A00();
    public final AnonymousClass0I4 A0N = AnonymousClass0I4.A00();
    public final AnonymousClass09G A0O = AnonymousClass09G.A00();
    public final C000300f A0P = C000300f.A00();
    public final AnonymousClass1Pw A0Q = AnonymousClass1Pw.A00();
    public final AnonymousClass0BP A0R = new C40691tg(this);
    public final AnonymousClass08B A0S = AnonymousClass08B.A00;
    public final AnonymousClass04j A0T = AnonymousClass04j.A00();
    public final AnonymousClass00D A0U = AnonymousClass00D.A00();
    public final AnonymousClass09E A0V = AnonymousClass09E.A00();
    public final AnonymousClass09U A0W = AnonymousClass09U.A00();
    public final AnonymousClass2RT A0X = AnonymousClass2RT.A00();
    public final AnonymousClass0ED A0Y = new C40701th(this);
    public final AnonymousClass01S A0Z = AnonymousClass01S.A00();
    public final C01980Ae A0a = C01980Ae.A00();
    public final C02040Ak A0b = C02040Ak.A00();
    public final C01970Ad A0c = C01970Ad.A00();
    public final AnonymousClass00T A0d = C002101e.A00();
    public final Runnable A0e = new RunnableEBaseShape6S0100000_I1_1(this, 33);

    public static String A05(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "all" : "contact_blacklist" : "none" : "contacts";
    }

    public static int A04(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        return "contact_blacklist".equals(str) ? 3 : -1;
    }

    public static String A06(String str) {
        if ("privacy_last_seen".equals(str)) {
            return "last";
        }
        if ("privacy_profile_photo".equals(str)) {
            return "profile";
        }
        if ("privacy_status".equals(str)) {
            return "status";
        }
        if ("read_receipts_enabled".equals(str)) {
            return "readreceipts";
        }
        if ("privacy_groupadd".equals(str)) {
            return "groupadd";
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("Unrecognized preference: ", str));
    }

    public static void A07(AnonymousClass02M r8, AnonymousClass0I5 r9, AnonymousClass00D r10, AnonymousClass0I4 r11, Map map) {
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder("settingsprivacy/received ");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            Log.i(sb.toString());
            int A042 = A04(str2);
            if (A042 < 0 || (A042 == 3 && !"groupadd".equals(str))) {
                z = true;
            } else {
                C26911Nd r2 = (C26911Nd) A0g.get(str);
                if (r2 == null || r2.A00.equals(str2)) {
                    A0g.remove(str);
                    if ("last".equals(str)) {
                        int i = r10.A00.getInt("privacy_last_seen", 0);
                        AnonymousClass008.A0k(r10, "privacy_last_seen", A042);
                        if (i != A042) {
                            r8.A02.post(new RunnableEBaseShape6S0100000_I1_1(r9, 34));
                        }
                    } else if ("profile".equals(str)) {
                        AnonymousClass008.A0k(r10, "privacy_profile_photo", A042);
                    } else if ("status".equals(str)) {
                        AnonymousClass008.A0k(r10, "privacy_status", A042);
                    } else if ("readreceipts".equals(str)) {
                        boolean z2 = false;
                        if (r2 != null) {
                            z2 = true;
                        }
                        boolean A0k = r10.A0k();
                        boolean contentEquals = "all".contentEquals(str2);
                        if (!z2 && !A0k && contentEquals) {
                            new AnonymousClass3LE(r11.A03, new C40401tD(r11, null)).A01(str, "none");
                            contentEquals = false;
                        }
                        AnonymousClass008.A0n(r10, "read_receipts_enabled", contentEquals);
                    } else if ("groupadd".equals(str)) {
                        AnonymousClass008.A0k(r10, "privacy_groupadd", A042);
                    }
                }
            }
        }
        if (z) {
            r8.A02.post(new RunnableEBaseShape6S0100000_I1_1(r8, 36));
        }
        if (A0f != null) {
            r8.A02.post(AnonymousClass1JP.A00);
        }
    }

    public final int A0V(String str, int i) {
        boolean z;
        int i2;
        C26911Nd r0 = (C26911Nd) A0g.get(A06(str));
        boolean z2 = true;
        if (r0 == null) {
            z = true;
            z2 = false;
        } else {
            z = false;
            i = A04(r0.A00);
        }
        int max = Math.max(0, i);
        AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
        if (z2) {
            i2 = R.string.privacy_settings_loading;
        } else {
            i2 = A0h[max];
        }
        String A062 = r1.A06(i2);
        if (str.equals("privacy_last_seen")) {
            this.A03.setEnabled(z);
            this.A0E.setText(A062);
        } else if (str.equals("privacy_profile_photo")) {
            this.A05.setEnabled(z);
            this.A0G.setText(A062);
            return max;
        } else if (str.equals("privacy_status")) {
            this.A08.setEnabled(z);
            this.A0A.setText(A062);
            return max;
        } else if (str.equals("privacy_groupadd")) {
            this.A02.setEnabled(z);
            this.A0D.setText(A062);
            return max;
        }
        return max;
    }

    public final void A0W() {
        String str;
        boolean z;
        int size;
        C449222e A5X;
        boolean z2;
        int size2;
        AnonymousClass0GG r1 = this.A0L;
        if (r1.A0G()) {
            synchronized (r1) {
                z = r1.A01;
            }
            if (z) {
                synchronized (r1) {
                    size = r1.A0O.size();
                }
                if (this.A0b.A04() && this.A0a.A09() && (A5X = this.A0c.A03().A5X()) != null) {
                    synchronized (A5X) {
                        z2 = false;
                        if (A5X.A00 != -1) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        synchronized (A5X) {
                            size2 = A5X.A0B.size();
                        }
                        size += size2;
                    }
                }
                if (size > 0) {
                    str = String.valueOf(size);
                } else {
                    str = ((AnonymousClass2C0) this).A01.A06(R.string.none);
                }
                this.A0C.setText(str);
            }
        }
        str = ((AnonymousClass2C0) this).A01.A06(R.string.block_list_header);
        this.A0C.setText(str);
    }

    public final void A0X() {
        String A062;
        int i = this.A0U.A00.getInt("privacy_groupadd", 0);
        C26911Nd r0 = (C26911Nd) A0g.get("privacy_groupadd");
        boolean z = true;
        boolean z2 = false;
        if (r0 != null) {
            z = false;
            z2 = true;
            i = A04(r0.A00);
        }
        int max = Math.max(0, i);
        if (z2) {
            A062 = ((AnonymousClass2C0) this).A01.A06(R.string.privacy_settings_loading);
        } else if (max == 3) {
            int size = ((AbstractCollection) this.A0X.A03()).size();
            if (size == 0) {
                A062 = ((AnonymousClass2C0) this).A01.A06(R.string.privacy_contacts);
            } else {
                A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.group_add_blacklist_contacts_excluded, (long) size, Integer.valueOf(size));
            }
        } else {
            A062 = ((AnonymousClass2C0) this).A01.A06(A0h[max]);
        }
        this.A02.setEnabled(z);
        this.A0D.setText(A062);
    }

    public final void A0Y() {
        String A062;
        AbstractCollection abstractCollection = (AbstractCollection) this.A0Z.A0A();
        if (abstractCollection.size() > 0) {
            A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.live_location_currently_sharing, (long) abstractCollection.size(), Integer.valueOf(abstractCollection.size()));
        } else {
            A062 = ((AnonymousClass2C0) this).A01.A06(R.string.none);
        }
        TextView textView = this.A0F;
        if (textView != null) {
            textView.setText(A062);
        }
    }

    public final void A0Z() {
        A0a();
        AnonymousClass00D r4 = this.A0U;
        SharedPreferences sharedPreferences = r4.A00;
        A0V("privacy_last_seen", sharedPreferences.getInt("privacy_last_seen", 0));
        A0V("privacy_profile_photo", sharedPreferences.getInt("privacy_profile_photo", 0));
        A0V("privacy_status", sharedPreferences.getInt("privacy_status", 0));
        A0X();
        A0d(r4.A0k());
    }

    public final void A0a() {
        String A062;
        AnonymousClass09E r3 = this.A0V;
        int A042 = r3.A04();
        if (A042 == 0) {
            A062 = ((AnonymousClass2C0) this).A01.A06(R.string.privacy_contacts);
        } else if (A042 == 1) {
            int size = ((AbstractCollection) r3.A0A()).size();
            if (size == 0) {
                A062 = ((AnonymousClass2C0) this).A01.A06(R.string.no_contacts_selected);
            } else {
                A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.status_contacts_selected, (long) size, Integer.valueOf(size));
            }
        } else if (A042 == 2) {
            int size2 = ((AbstractCollection) r3.A09()).size();
            if (size2 == 0) {
                A062 = ((AnonymousClass2C0) this).A01.A06(R.string.privacy_contacts);
            } else {
                A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.status_contacts_excluded, (long) size2, Integer.valueOf(size2));
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        this.A0H.setText(A062);
    }

    public final void A0b(String str) {
        int i;
        int i2;
        int i3;
        if (str.equals("privacy_last_seen")) {
            i = 1;
            i2 = R.string.settings_privacy_last_seen;
            i3 = this.A0U.A00.getInt("privacy_last_seen", 0);
        } else if (str.equals("privacy_profile_photo")) {
            i = 2;
            i2 = R.string.settings_privacy_profile_photo;
            i3 = this.A0U.A00.getInt("privacy_profile_photo", 0);
        } else if (str.equals("privacy_status")) {
            i = 3;
            i2 = R.string.settings_privacy_info;
            i3 = this.A0U.A00.getInt("privacy_status", 0);
        } else {
            throw new IllegalArgumentException("Invalid pref key for privacy picker dialog");
        }
        A0U(i, i2, i3, ((AnonymousClass2C0) this).A01.A0N(A0h));
    }

    public final void A0c(String str, String str2) {
        A0g.put(str, new C26911Nd(str2));
        ((ActivityC004602e) this).A06.A02(true);
        AnonymousClass0I4 r3 = this.A0N;
        new AnonymousClass3LE(r3.A03, new C40401tD(r3, null)).A01(str, str2);
        Handler handler = this.A0K;
        Runnable runnable = this.A0e;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 20000);
    }

    public final void A0d(boolean z) {
        Object obj = A0g.get(A06("read_receipts_enabled"));
        View view = this.A06;
        int i = 0;
        boolean z2 = false;
        if (obj == null) {
            z2 = true;
        }
        view.setEnabled(z2);
        ProgressBar progressBar = this.A09;
        int i2 = 8;
        if (obj != null) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        SwitchCompat switchCompat = this.A0I;
        if (obj != null) {
            i = 8;
        }
        switchCompat.setVisibility(i);
        this.A0I.setChecked(z);
        AnonymousClass008.A0n(this.A0U, "read_receipts_enabled", z);
    }

    @Override // X.AnonymousClass0SB
    public void AKB(int i, int i2) {
        if (i == 1) {
            this.A0J.A00("privacy_last_seen", i2);
        } else if (i == 2) {
            this.A0J.A00("privacy_profile_photo", i2);
        } else if (i == 3) {
            this.A0J.A00("privacy_status", i2);
        }
    }

    public /* synthetic */ void lambda$onCreate$1420$SettingsPrivacy(View view) {
        A0b("privacy_last_seen");
    }

    public /* synthetic */ void lambda$onCreate$1421$SettingsPrivacy(View view) {
        A0b("privacy_profile_photo");
    }

    public /* synthetic */ void lambda$onCreate$1422$SettingsPrivacy(View view) {
        A0b("privacy_status");
    }

    public /* synthetic */ void lambda$onCreate$1423$SettingsPrivacy(View view) {
        startActivityForResult(new Intent(this, StatusPrivacyActivity.class), 0);
    }

    public /* synthetic */ void lambda$onCreate$1424$SettingsPrivacy(View view) {
        startActivity(new Intent(this, LiveLocationPrivacyActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$1425$SettingsPrivacy(View view) {
        startActivityForResult(new Intent(this, GroupAddPrivacyActivity.class), 1);
    }

    public /* synthetic */ void lambda$onCreate$1426$SettingsPrivacy(View view) {
        startActivity(new Intent(this, BlockList.class));
    }

    public void lambda$onCreate$1428$SettingsPrivacy(View view) {
        String str;
        if (!this.A0T.A05()) {
            this.A0M.A06(R.string.coldsync_no_network, 0);
            return;
        }
        boolean z = !this.A0I.isChecked();
        String A062 = A06("read_receipts_enabled");
        if (z) {
            str = "all";
        } else {
            str = "none";
        }
        A0c(A062, str);
        A0d(z);
        if (Boolean.TRUE.equals(Boolean.valueOf(z))) {
            this.A0d.ANF(new RunnableEBaseShape6S0100000_I1_1(this, 35));
        }
    }

    public /* synthetic */ void lambda$updateAppSecurityPreference$1429$SettingsPrivacy(View view) {
        startActivity(new Intent(this, AppAuthSettingsActivity.class));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    finish();
                } else {
                    return;
                }
            }
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("groupadd", 0);
                if (intExtra == 3) {
                    A0X();
                } else {
                    this.A0J.A00("privacy_groupadd", intExtra);
                }
            }
        } else {
            A0a();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        setTitle(r3.A06(R.string.settings_privacy));
        setContentView(R.layout.preferences_privacy);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A0f = this;
            this.A03 = findViewById(R.id.last_seen_privacy_preference);
            this.A0E = (TextView) findViewById(R.id.selected_last_seen_privacy_preference);
            this.A05 = findViewById(R.id.profile_photo_privacy_preference);
            this.A0G = (TextView) findViewById(R.id.selected_profile_photo_privacy_preference);
            this.A00 = findViewById(R.id.about_privacy_preference);
            this.A0A = (TextView) findViewById(R.id.selected_about_privacy_preference);
            this.A08 = findViewById(R.id.status_privacy_preference);
            this.A0H = (TextView) findViewById(R.id.selected_status_privacy_preference);
            this.A04 = findViewById(R.id.live_location_privacy_preference);
            this.A0F = (TextView) findViewById(R.id.selected_live_location_privacy_preference);
            this.A02 = findViewById(R.id.group_add_permission_privacy_preference);
            this.A0D = (TextView) findViewById(R.id.selected_group_add_permission_privacy_preference);
            this.A01 = findViewById(R.id.block_list_privacy_preference);
            this.A0C = (TextView) findViewById(R.id.selected_block_list_privacy_preference);
            this.A06 = findViewById(R.id.read_receipts_privacy_preference);
            this.A0I = (SwitchCompat) findViewById(R.id.read_receipts_privacy_switch);
            this.A09 = (ProgressBar) findViewById(R.id.read_receipts_progress_bar);
            this.A07 = findViewById(R.id.security_privacy_preference);
            TextView textView = (TextView) findViewById(R.id.security_privacy_preference_title);
            boolean A0E2 = this.A0Q.A04.A0E(266);
            int i = R.string.settings_privacy_security_section_title;
            if (A0E2) {
                i = R.string.settings_privacy_security_section_biometric_title;
            }
            textView.setText(r3.A06(i));
            this.A0B = (TextView) findViewById(R.id.security_privacy_preference_subtitle);
            A0Z();
            this.A03.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 25));
            this.A05.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 26));
            this.A00.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 18));
            this.A08.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 19));
            this.A04.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 24));
            if (this.A0P.A0D(AbstractC000400g.A19)) {
                this.A02.setVisibility(0);
                this.A02.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 22));
            } else {
                this.A02.setVisibility(8);
            }
            this.A01.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 23));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 20));
            AnonymousClass0I4 r32 = this.A0N;
            new AnonymousClass3LE(r32.A03, new C40401tD(r32, null)).A00();
            this.A0S.A01(this.A0R);
            this.A0Z.A0V(this.A0Y);
            String stringExtra = getIntent().getStringExtra("target_setting");
            if (stringExtra != null && stringExtra.hashCode() == 1626211481 && stringExtra.equals("privacy_groupadd")) {
                startActivityForResult(new Intent(this, GroupAddPrivacyActivity.class), 2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass01S r0 = this.A0Z;
        r0.A0W.remove(this.A0Y);
        this.A0S.A00(this.A0R);
        A0f = null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        String A062;
        super.onResume();
        A0W();
        A0Y();
        if (Build.VERSION.SDK_INT < 23 || !this.A0Q.A05()) {
            this.A07.setVisibility(8);
            return;
        }
        this.A07.setVisibility(0);
        SharedPreferences sharedPreferences = this.A0U.A00;
        if (sharedPreferences.getBoolean("privacy_fingerprint_enabled", false)) {
            long j = sharedPreferences.getLong("privacy_fingerprint_timeout", 60000);
            if (j == 0) {
                A062 = ((AnonymousClass2C0) this).A01.A06(R.string.app_auth_enabled_immediately);
            } else if (j == 60000) {
                A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.app_auth_enabled_values, 1, 1);
            } else if (j == 1800000) {
                A062 = ((AnonymousClass2C0) this).A01.A0A(R.plurals.app_auth_enabled_values, 30, 30);
            } else {
                A062 = ((AnonymousClass2C0) this).A01.A06(R.string.app_auth_enabled_immediately);
            }
        } else {
            A062 = ((AnonymousClass2C0) this).A01.A06(R.string.app_auth_disabled);
        }
        this.A0B.setText(A062);
        this.A07.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 21));
    }
}

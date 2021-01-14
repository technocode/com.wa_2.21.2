package com.whatsapp.authentication;

import X.AbstractC41241ui;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass0FE;
import X.AnonymousClass0LW;
import X.AnonymousClass0S2;
import X.AnonymousClass1Pp;
import X.AnonymousClass1Pw;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C13690kf;
import X.C13700kg;
import X.C13710kh;
import X.C27331Pi;
import X.C41201ue;
import X.C459627f;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class AppAuthSettingsActivity extends ActivityC004602e {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public SwitchCompat A05;
    public SwitchCompat A06;
    public C13700kg A07;
    public C13710kh A08;
    public FingerprintBottomSheet A09;
    public final C27331Pi A0A = C27331Pi.A00();
    public final AbstractC41241ui A0B = new C459627f(this);
    public final AnonymousClass03C A0C = AnonymousClass03C.A00();
    public final AnonymousClass0FE A0D = AnonymousClass0FE.A00();

    public final void A0T() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        AnonymousClass1Pw r3 = ((ActivityC004602e) this).A0A;
        r3.A02(true);
        AnonymousClass008.A0n(this.A0J, "privacy_fingerprint_enabled", false);
        this.A0D.A04();
        A0V(false);
        this.A05.setChecked(false);
        C27331Pi.A00().A02();
        r3.A01(this);
    }

    public /* synthetic */ void A0U(long j) {
        AnonymousClass008.A0l(this.A0J, "privacy_fingerprint_timeout", j);
    }

    public final void A0V(boolean z) {
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        View view = this.A01;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.A00;
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    public void lambda$onCreate$1527$AppAuthSettingsActivity(View view) {
        if (!this.A05.isChecked()) {
            AnonymousClass1Pw r1 = ((ActivityC004602e) this).A0A;
            if (r1.A03()) {
                Log.i("AppAuthSettingsActivity/show-bottom-sheet");
                if (r1.A04.A0E(266)) {
                    this.A08.A02(this.A07);
                    return;
                }
                FingerprintBottomSheet A002 = FingerprintBottomSheet.A00(R.string.fingerprint_bottom_sheet_title, R.string.fingerprint_bottom_sheet_negative_button, 0, 0);
                this.A09 = A002;
                A002.A04 = this.A0B;
                APm(A002);
                return;
            }
            Log.i("AppAuthSettingsActivity/setup");
            APm(new SetupDeviceAuthDialog());
            return;
        }
        A0T();
    }

    public void lambda$onCreate$1528$AppAuthSettingsActivity(View view) {
        boolean z = !this.A06.isChecked();
        AnonymousClass008.A0n(this.A0J, "privacy_fingerprint_show_notification_content", z);
        this.A06.setChecked(z);
        this.A0C.A04(null, 1, "AppAuthSettingsActivity");
        this.A0D.A04();
        this.A0A.A02();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass01X r3;
        super.onCreate(bundle);
        setContentView(R.layout.app_auth_settings);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            TextView textView = (TextView) findViewById(R.id.security_settings_title);
            TextView textView2 = (TextView) findViewById(R.id.security_settings_desc);
            if (((ActivityC004602e) this).A0A.A04.A0E(266)) {
                r3 = ((AnonymousClass2C0) this).A01;
                setTitle(r3.A06(R.string.settings_privacy_security_section_biometric_title));
                textView.setText(r3.A06(R.string.settings_privacy_biometric));
                textView2.setText(r3.A06(R.string.settings_privacy_biometric_message));
                this.A08 = new C13710kh(this, C004302a.A05(this), new C41201ue(this));
                C13690kf r6 = new C13690kf();
                String A062 = r3.A06(R.string.biometric_prompt_negative_button);
                Bundle bundle2 = r6.A00;
                bundle2.putCharSequence("negative_text", A062);
                bundle2.putCharSequence("title", r3.A06(R.string.biometric_prompt_title));
                bundle2.putBoolean("allow_device_credential", false);
                bundle2.putBoolean("require_confirmation", false);
                this.A07 = r6.A00();
            } else {
                r3 = ((AnonymousClass2C0) this).A01;
                setTitle(r3.A06(R.string.settings_privacy_security_section_title));
                textView.setText(r3.A06(R.string.settings_privacy_fingerprint));
                textView2.setText(r3.A06(R.string.settings_privacy_fingerprint_message));
                if (bundle != null) {
                    AnonymousClass0LW A042 = A04();
                    FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) A042.A0Q.A01(FingerprintBottomSheet.class.getName());
                    this.A09 = fingerprintBottomSheet;
                    if (fingerprintBottomSheet != null) {
                        fingerprintBottomSheet.A04 = this.A0B;
                    }
                }
            }
            this.A01 = findViewById(R.id.timeout);
            this.A05 = (SwitchCompat) findViewById(R.id.app_auth_settings_switch);
            this.A00 = findViewById(R.id.notification_preference);
            this.A06 = (SwitchCompat) findViewById(R.id.notification_content_switch);
            findViewById(R.id.app_auth_settings_preference).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 48));
            this.A00.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 49));
            this.A02 = (RadioButton) findViewById(R.id.timeout_immediately);
            this.A03 = (RadioButton) findViewById(R.id.timeout_one_min);
            this.A04 = (RadioButton) findViewById(R.id.timeout_thirty_min);
            this.A02.setText(r3.A06(R.string.app_auth_timeout_immediately));
            this.A03.setText(r3.A0A(R.plurals.app_auth_timeout_values, 1, 1));
            this.A04.setText(r3.A0A(R.plurals.app_auth_timeout_values, 30, 30));
            this.A02.setOnClickListener(new AnonymousClass1Pp(this, 0));
            this.A03.setOnClickListener(new AnonymousClass1Pp(this, 60000));
            this.A04.setOnClickListener(new AnonymousClass1Pp(this, 1800000));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        if (((ActivityC004602e) this).A0A.A04.A0E(266)) {
            this.A08.A01();
            return;
        }
        FingerprintBottomSheet fingerprintBottomSheet = this.A09;
        if (fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A04 = null;
            this.A09 = null;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        SharedPreferences sharedPreferences = this.A0J.A00;
        boolean z = sharedPreferences.getBoolean("privacy_fingerprint_enabled", false);
        long j = sharedPreferences.getLong("privacy_fingerprint_timeout", 60000);
        boolean z2 = true;
        boolean z3 = sharedPreferences.getBoolean("privacy_fingerprint_show_notification_content", true);
        A0V(z);
        StringBuilder sb = new StringBuilder("AppAuthSettingsActivity/update-timeout: ");
        sb.append(j);
        Log.i(sb.toString());
        RadioButton radioButton = this.A02;
        boolean z4 = false;
        if (j == 0) {
            z4 = true;
        }
        radioButton.setChecked(z4);
        RadioButton radioButton2 = this.A03;
        boolean z5 = false;
        if (j == 60000) {
            z5 = true;
        }
        radioButton2.setChecked(z5);
        RadioButton radioButton3 = this.A04;
        if (j != 1800000) {
            z2 = false;
        }
        radioButton3.setChecked(z2);
        this.A05.setChecked(z);
        this.A06.setChecked(z3);
    }
}

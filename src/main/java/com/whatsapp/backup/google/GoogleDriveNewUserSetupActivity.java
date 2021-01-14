package com.whatsapp.backup.google;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass0JJ;
import X.AnonymousClass2C0;
import X.C06470Tj;
import X.C27581Qo;
import X.ViewTreeObserver$OnGlobalLayoutListenerC27571Qn;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.facebook.redex.ViewOnClickEBaseShape0S1200000_I1;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class GoogleDriveNewUserSetupActivity extends SettingsGoogleDrive {
    public int A00 = -1;
    public View A01;
    public Button A02;
    public RadioGroup A03;
    public AppCompatSpinner A04;
    public List A05;
    public RadioButton[] A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new ViewTreeObserver$OnGlobalLayoutListenerC27571Qn(this);

    public final void A0e() {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = point.x - getResources().getDimensionPixelSize(R.dimen.gdrive_view_left_padding);
        for (RadioButton radioButton : this.A06) {
            radioButton.setWidth(dimensionPixelSize);
        }
    }

    public final void A0f() {
        this.A03.clearCheck();
        this.A04.setSelection(this.A05.size() - 1, true);
    }

    public final void A0g(String str, RadioButton radioButton) {
        int i = 2;
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", str, radioButton);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        if (r3.A06(R.string.settings_gdrive_backup_frequency_option_daily).equals(str)) {
            i = 1;
        } else if (!r3.A06(R.string.settings_gdrive_backup_frequency_option_weekly).equals(str)) {
            if (r3.A06(R.string.settings_gdrive_backup_frequency_option_monthly).equals(str)) {
                i = 3;
            } else if (r3.A06(R.string.settings_gdrive_backup_frequency_option_off).equals(str)) {
                i = 0;
            } else {
                AnonymousClass008.A18("gdrive-new-user-setup/create/unexpected-backup-frequency/", str);
                i = -1;
            }
        }
        int i2 = this.A00;
        this.A00 = i;
        if (radioButton != null) {
            A0f();
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
        }
        A0h(true);
        if ((i2 == -1 || i2 == 0 || ((ActivityC004702f) this).A0J.A0D() == null) && i != 0 && i != -1) {
            this.A01.performClick();
        }
    }

    public final void A0h(boolean z) {
        if (this.A02 == null) {
            Log.e("gdrive-new-user-setup/update-setup-btn/setup-btn-is-null");
            return;
        }
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        C06470Tj r2 = new C06470Tj(r3, getResources().getDrawable(R.drawable.chevron));
        if (z) {
            this.A02.setTextColor(getResources().getColor(R.color.primary_light));
            r2.setColorFilter(getResources().getColor(R.color.primary_light), PorterDuff.Mode.SRC_ATOP);
            r2.setAlpha(255);
        } else {
            int color = getResources().getColor(R.color.settings_disabled_text);
            this.A02.setTextColor(color);
            r2.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            r2.setAlpha(color >>> 24);
        }
        if (r3.A0M()) {
            this.A02.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r2, (Drawable) null);
        } else {
            this.A02.setCompoundDrawablesWithIntrinsicBounds(r2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.whatsapp.backup.google.SettingsGoogleDrive, X.AbstractC005802u
    public void AF7(int i) {
        if (i == 14) {
            this.A00 = 0;
            this.A02.performClick();
            return;
        }
        super.AF7(i);
    }

    public /* synthetic */ void lambda$onCreate$1630$GoogleDriveNewUserSetupActivity(View view) {
        AnonymousClass00D r4 = ((ActivityC004702f) this).A0J;
        String A0D = r4.A0D();
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-new-user-setup/done-clicked account is ");
        A0S.append(AnonymousClass0JJ.A0B(A0D));
        A0S.append(" and backup frequency is ");
        AnonymousClass008.A1L(A0S, this.A00);
        int i = this.A00;
        if (i == -1) {
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            Log.i(String.format("gdrive-new-user-setup/done-clicked/show-toast \"%s\"", r3.A06(R.string.gdrive_new_user_setup_button_toast_no_freq_selected)));
            ((ActivityC004702f) this).A0F.A0C(r3.A06(R.string.gdrive_new_user_setup_button_toast_no_freq_selected), 1);
        } else if (i == 0 || A0D != null) {
            Log.i("gdrive-new-user-setup/done-clicked/setup-finished");
            r4.A0m(this.A00);
            this.A0g.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 10));
            setResult(-1);
            finish();
        } else {
            Log.i("gdrive-new-user-setup/done-clicked/show-account-selector");
            A0V();
        }
    }

    @Override // com.whatsapp.backup.google.SettingsGoogleDrive, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("gdrive-new-user-setup/back-pressed", e);
            ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A06(R.string.gdrive_new_user_setup_button_toast_no_freq_selected), 1);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        int indexOf;
        super.onConfigurationChanged(configuration);
        A0e();
        int i = this.A00;
        if (i == 0) {
            indexOf = this.A05.indexOf(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_frequency_option_off));
        } else if (i == 1) {
            indexOf = this.A05.indexOf(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_frequency_option_daily));
        } else if (i != 2) {
            if (i == 3) {
                indexOf = this.A05.indexOf(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_frequency_option_monthly));
            }
            A0f();
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
        } else {
            indexOf = this.A05.indexOf(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_frequency_option_weekly));
        }
        if (indexOf >= 0) {
            RadioButton radioButton = this.A06[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
            this.A04.setSelection(indexOf);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
        }
        A0f();
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v77, resolved type: android.widget.RadioButton[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass2C0, com.whatsapp.backup.google.SettingsGoogleDrive, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A0R.A07()) {
            Log.i("gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting.");
            setResult(-1);
            finish();
            return;
        }
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        setTitle(r7.A06(R.string.gdrive_new_user_setup_title));
        A09().A0A(false);
        findViewById(R.id.settings_gdrive_backup_info_box).setVisibility(8);
        findViewById(R.id.settings_gdrive_gdrive_category_title).setVisibility(8);
        findViewById(R.id.settings_gdrive_change_frequency_view).setVisibility(8);
        findViewById(R.id.settings_gdrive_network_settings_view).setVisibility(8);
        findViewById(R.id.include_video_settings_summary).setVisibility(8);
        findViewById(R.id.gdrive_new_user_setup_message).setVisibility(0);
        findViewById(R.id.gdrive_new_user_setup_select_frequency_message).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.gdrive_new_user_setup_footer_info);
        textView.setText(r7.A0D(R.string.gdrive_new_user_setup_footer_info, r7.A06(R.string.settings_general), r7.A06(R.string.settings_chat), r7.A06(R.string.settings_backup)));
        textView.setVisibility(0);
        findViewById(R.id.backup_settings_icon).setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.settings_gdrive_backup_now_category_title);
        textView2.setVisibility(0);
        textView2.setText(r7.A06(R.string.gdrive_new_user_setup_category_title));
        ((TextView) findViewById(R.id.settings_gdrive_change_account_title)).setText(r7.A06(R.string.gdrive_new_user_setup_account_title));
        this.A01 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A03 = (RadioGroup) findViewById(R.id.gdrive_new_user_setup_freq_options);
        this.A05 = new ArrayList();
        int[] iArr = SettingsGoogleDrive.A0i;
        for (int i : iArr) {
            if (!(i == R.string.settings_gdrive_backup_frequency_option_manual || i == R.string.settings_gdrive_backup_frequency_option_off)) {
                this.A05.add(r7.A06(i));
            }
        }
        this.A05.add(r7.A06(R.string.settings_gdrive_backup_frequency_option_off));
        this.A05.add(r7.A06(R.string.gdrive_new_user_setup_select_a_backup_frequency));
        this.A03.setVisibility(0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.A05);
        arrayAdapter.setDropDownViewResource(17367049);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(R.id.gdrive_new_user_setup_freq_options_spinner);
        this.A04 = appCompatSpinner;
        appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this.A04.setSelection(this.A05.size() - 1);
        this.A04.setOnItemSelectedListener(new C27581Qo(this));
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        if (layoutInflater != null) {
            this.A06 = new RadioButton[(this.A05.size() - 1)];
            this.A03.addView(layoutInflater.inflate(R.layout.google_drive_new_user_setup_divider, (ViewGroup) null));
            for (int i2 = 0; i2 < this.A06.length; i2++) {
                String str = (String) this.A05.get(i2);
                TextView textView3 = (TextView) layoutInflater.inflate(R.layout.google_drive_new_user_setup_frequency_option, (ViewGroup) null);
                textView3.setText(str);
                this.A03.addView(textView3);
                this.A03.addView(layoutInflater.inflate(R.layout.google_drive_new_user_setup_divider, (ViewGroup) null));
                this.A06[i2] = textView3;
                textView3.setOnClickListener(new ViewOnClickEBaseShape0S1200000_I1(this, str, textView3, 0));
            }
            A0e();
            Button button = (Button) findViewById(R.id.gdrive_new_user_setup_btn);
            this.A02 = button;
            button.setVisibility(0);
            A0h(false);
            this.A02.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 3));
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
            return;
        }
        throw null;
    }
}

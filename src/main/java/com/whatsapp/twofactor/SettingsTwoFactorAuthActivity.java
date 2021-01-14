package com.whatsapp.twofactor;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0Z2;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C004302a;
import X.C04530Ks;
import X.DialogInterface$OnClickListenerC664434i;
import X.ViewTreeObserver$OnPreDrawListenerC664634k;
import X.ViewTreeObserver$OnScrollChangedListenerC664534j;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

public class SettingsTwoFactorAuthActivity extends ActivityC004602e implements AnonymousClass0Z2 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public final Handler A0A = new Handler(Looper.getMainLooper());
    public final C04530Ks A0B = C04530Ks.A00();
    public final Runnable A0C = new RunnableEBaseShape13S0100000_I1_8(this, 15);

    public final void A0T() {
        if (this.A05.canScrollVertically(1)) {
            this.A03.setElevation((float) this.A00);
        } else {
            this.A03.setElevation(0.0f);
        }
    }

    public final void A0U() {
        int i;
        SharedPreferences sharedPreferences = this.A0B.A00;
        boolean z = !sharedPreferences.getString("two_factor_auth_code", "").isEmpty();
        int i2 = R.dimen.settings_2fa_disabled_logo_margin_top;
        if (z) {
            i2 = R.dimen.settings_2fa_enabled_logo_margin_top;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, getResources().getDimensionPixelSize(i2), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        ImageView imageView = this.A04;
        if (z) {
            boolean z2 = ((AnonymousClass2C0) this).A01.A02().A06;
            i = R.drawable.settings_2fa_done;
            if (z2) {
                i = R.drawable.settings_2fa_done_rtl;
            }
        } else {
            i = R.drawable.settings_2fa;
        }
        imageView.setImageDrawable(C004302a.A03(this, i));
        View view = this.A03;
        int i3 = 0;
        int i4 = 0;
        if (z) {
            i4 = 8;
        }
        view.setVisibility(i4);
        View view2 = this.A02;
        int i5 = 8;
        if (z) {
            i5 = 0;
        }
        view2.setVisibility(i5);
        View view3 = this.A01;
        if (!z) {
            i3 = 8;
        }
        view3.setVisibility(i3);
        TextView textView = this.A08;
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        int i6 = R.string.settings_two_factor_auth_info_disabled;
        if (z) {
            i6 = R.string.settings_two_factor_auth_info_enabled;
        }
        textView.setText(r3.A06(i6));
        TextView textView2 = this.A07;
        int i7 = sharedPreferences.getInt("two_factor_auth_email_set", 0);
        int i8 = R.string.settings_two_factor_auth_add_email;
        if (i7 == 1) {
            i8 = R.string.settings_two_factor_auth_change_email;
        }
        textView2.setText(r3.A06(i8));
    }

    @Override // X.AnonymousClass0Z2
    public void ALK() {
        Log.d("settingstwofactorauthactivity/on-two-factor-auth-settings-refresh-error");
        this.A0A.removeCallbacks(this.A0C);
        this.A0K.A00();
        APo(R.string.two_factor_auth_save_error);
        A0U();
    }

    @Override // X.AnonymousClass0Z2
    public void ALL() {
        Log.d("settingstwofactorauthactivity/on-two-factor-auth-settings-refreshed");
        this.A0A.removeCallbacks(this.A0C);
        this.A0K.A00();
        A0U();
        ((ActivityC004702f) this).A0F.A06(R.string.two_factor_auth_disabled, 1);
    }

    public /* synthetic */ void lambda$onCreate$2640$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{1, 2});
        startActivity(intent);
    }

    public void lambda$onCreate$2641$SettingsTwoFactorAuthActivity(View view) {
        APl(new ConfirmDisableDialog(), null);
    }

    public /* synthetic */ void lambda$onCreate$2642$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{1});
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$2643$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{2});
        startActivity(intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC664634k(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_two_factor_auth));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
        }
        setContentView(R.layout.settings_two_factor_auth);
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        this.A04 = (ImageView) findViewById(R.id.logo);
        this.A03 = findViewById(R.id.enable_panel);
        this.A02 = findViewById(R.id.disable_panel_divider);
        this.A01 = findViewById(R.id.disable_panel);
        this.A08 = (TextView) findViewById(R.id.description);
        this.A09 = (TextView) findViewById(R.id.disable_button);
        this.A06 = (TextView) findViewById(R.id.change_code_button);
        this.A07 = (TextView) findViewById(R.id.change_email_button);
        findViewById(R.id.enable_button).setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 5));
        this.A09.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 3));
        this.A06.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 6));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 4));
        if (Build.VERSION.SDK_INT < 23) {
            int A062 = C002001d.A06(this, R.attr.settingsIconColor, R.color.settings_icon);
            C002001d.A2n(this.A09, A062);
            C002001d.A2n(this.A06, A062);
            C002001d.A2n(this.A07, A062);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A05.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC664534j(this));
            this.A05.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC664634k(this));
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        List list = this.A0B.A05;
        AnonymousClass00E.A07(list.contains(this));
        list.remove(this);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        List list = this.A0B.A05;
        AnonymousClass00E.A07(!list.contains(this));
        list.add(this);
        A0U();
    }

    public class ConfirmDisableDialog extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A00());
            AnonymousClass01X r2 = this.A00;
            r3.A01.A0E = r2.A06(R.string.settings_two_factor_auth_disable_confirm);
            r3.A07(r2.A06(R.string.settings_two_factor_auth_disable), new DialogInterface$OnClickListenerC664434i(this));
            return AnonymousClass008.A03(r2, R.string.cancel, r3);
        }
    }
}

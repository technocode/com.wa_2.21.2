package com.whatsapp.registration;

import X.AbstractC000900m;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0HM;
import X.AnonymousClass0HP;
import X.AnonymousClass0JE;
import X.AnonymousClass0JW;
import X.AnonymousClass0KP;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass2O4;
import X.AnonymousClass2OC;
import X.AnonymousClass30C;
import X.AnonymousClass30L;
import X.AnonymousClass30X;
import X.AnonymousClass324;
import X.AnonymousClass3MZ;
import X.C002001d;
import X.C002101e;
import X.C003301q;
import X.C02660Cy;
import X.C04530Ks;
import X.C05710Pt;
import X.C05720Pu;
import X.C09890dh;
import X.C09900di;
import X.C38451pt;
import X.C70803Ml;
import X.DialogInterface$OnClickListenerC65502zx;
import X.DialogInterface$OnClickListenerC65512zy;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.util.concurrent.TimeUnit;

public class VerifyTwoFactorAuth extends ActivityC004602e {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public CountDownTimer A04;
    public ProgressBar A05;
    public TextView A06;
    public CodeInputField A07;
    public AnonymousClass30C A08;
    public AnonymousClass30L A09;
    public C09900di A0A;
    public C09890dh A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final AbstractC000900m A0J = new AnonymousClass3MZ(this);
    public final C003301q A0K = C003301q.A02;
    public final AnonymousClass04j A0L = AnonymousClass04j.A00();
    public final AnonymousClass03P A0M = AnonymousClass03P.A00();
    public final AnonymousClass00S A0N = AnonymousClass00S.A00();
    public final AnonymousClass00G A0O = AnonymousClass00G.A01;
    public final AnonymousClass03C A0P = AnonymousClass03C.A00();
    public final AnonymousClass03S A0Q = AnonymousClass03S.A00();
    public final AnonymousClass0M9 A0R = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0S = AnonymousClass2OC.A00();
    public final C02660Cy A0T = C02660Cy.A00();
    public final AnonymousClass0KP A0U = AnonymousClass0KP.A00();
    public final AnonymousClass0HM A0V = AnonymousClass0HM.A00();
    public final AnonymousClass0HP A0W = AnonymousClass0HP.A00();
    public final AnonymousClass324 A0X = AnonymousClass324.A00();
    public final C04530Ks A0Y = C04530Ks.A00();
    public final AnonymousClass00T A0Z = C002101e.A00();
    public final Runnable A0a = new RunnableEBaseShape12S0100000_I1_7(this, 29);

    public final int A0T() {
        if (((this.A03 * 1000) + this.A01) - this.A0N.A05() > 0) {
            return 1;
        }
        String str = this.A0F;
        if ("offline".equals(str)) {
            return 2;
        }
        if ("full".equals(str)) {
            return 3;
        }
        return 1;
    }

    public final Dialog A0U(int i) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(i));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public final void A0V(long j) {
        Log.d("verifytwofactorauth/do-check-if-exists");
        this.A0I.postDelayed(this.A0a, j);
    }

    public final void A0W(long j) {
        if (j < 1000) {
            getPreferences(0).edit().remove("code_retry_time").apply();
            CountDownTimer countDownTimer = this.A04;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.A04 = null;
                return;
            }
            return;
        }
        getPreferences(0).edit().putLong("code_retry_time", this.A0N.A05() + j).apply();
        ((ActivityC004602e) this).A0H.A02(this.A07);
        this.A07.setEnabled(false);
        this.A05.setProgress(0);
        this.A06.setText(((AnonymousClass2C0) this).A01.A06(R.string.two_factor_auth_code_guessed_too_fast_message));
        this.A06.setVisibility(0);
        this.A04 = new AnonymousClass30X(this, j, j).start();
    }

    public void A0X(AnonymousClass2O4 r12) {
        this.A0F = r12.A08;
        this.A0E = r12.A07;
        this.A03 = r12.A02;
        this.A00 = r12.A01;
        this.A02 = r12.A00;
        this.A01 = this.A0N.A05();
        StringBuilder A0S2 = AnonymousClass008.A0S("verifytwofactorauth/update-wipe-info type=");
        A0S2.append(this.A0F);
        A0S2.append(" token=");
        A0S2.append(this.A0E);
        A0S2.append(" wait=");
        A0S2.append(this.A03);
        A0S2.append(" expire=");
        A0S2.append(this.A00);
        A0S2.append(" servertime=");
        A0S2.append(this.A02);
        Log.d(A0S2.toString());
        super.A0J.A0a(this.A0F, this.A0E, this.A03, this.A00, this.A02, this.A01);
    }

    public final void A0Y(String str, int i, boolean z) {
        AnonymousClass00T r1 = this.A0Z;
        C09890dh r2 = new C09890dh(((AnonymousClass2C0) this).A01, super.A0J, this.A0U, this.A0D, this.A0C, str, this.A0E, i, z, this);
        this.A0B = r2;
        r1.ANC(r2, new String[0]);
    }

    public void A0Z(String str, String str2) {
        AnonymousClass0HM r3 = this.A0V;
        r3.A0E(this.A0C, this.A0D, str2);
        this.A0Y.A02(str, null, 5);
        if (this.A08.A02) {
            AnonymousClass0JE.A0F(this, r3, this.A0P, false);
            finish();
        } else if (!this.A0G) {
            r3.A0C(2);
            A0I(new Intent(this, RegisterName.class), true);
        } else {
            r3.A0F();
            finish();
        }
    }

    public final void A0a(boolean z) {
        Log.d("verifytwofactorauth/stop-checking-if-exists");
        C09900di r0 = this.A0A;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        if (z) {
            this.A00 = -1;
            super.A0J.A0a(this.A0F, this.A0E, this.A03, -1, this.A02, this.A01);
        }
        this.A0I.removeCallbacks(this.A0a);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00T r1 = this.A0Z;
        AnonymousClass0M9 r2 = this.A0R;
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        this.A09 = new AnonymousClass30L(r1, r2, r3, this.A0S, this.A0T);
        setTitle(r3.A06(R.string.two_factor_auth_verify_title));
        AnonymousClass00D r22 = super.A0J;
        this.A08 = new AnonymousClass30C(this, r22);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getBooleanExtra("changenumber", false)) {
            Log.d("verifytwofactorauth/on-create/changenumber");
            this.A0G = true;
        }
        setContentView(R.layout.activity_two_factor_auth_verify);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0C(toolbar);
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(false);
                A092.A0D(false);
            }
        }
        CodeInputField codeInputField = (CodeInputField) findViewById(R.id.code);
        this.A07 = codeInputField;
        codeInputField.A05(new C70803Ml(this), 6, '*', '*', null, new C38451pt(this));
        this.A07.setPasswordTransformationEnabled(true);
        this.A05 = (ProgressBar) findViewById(R.id.progress_bar_code_input_blocked);
        this.A07.setEnabled(true);
        this.A05.setProgress(100);
        this.A06 = (TextView) findViewById(R.id.description_bottom);
        this.A0C = r22.A0F();
        this.A0D = r22.A0H();
        SharedPreferences sharedPreferences = r22.A00;
        this.A0F = sharedPreferences.getString("registration_wipe_type", null);
        this.A0E = sharedPreferences.getString("registration_wipe_token", null);
        this.A03 = sharedPreferences.getLong("registration_wipe_wait", -1);
        this.A00 = sharedPreferences.getLong("registration_wipe_expiry", -1);
        this.A02 = sharedPreferences.getLong("registration_wipe_server_time", -1);
        this.A01 = sharedPreferences.getLong("registration_wipe_info_timestamp", -1);
        if (this.A00 > 0) {
            A0a(false);
            A0V(0);
        }
        if (bundle != null && !bundle.getBoolean("shouldShowTheForgetPinDialog", false)) {
            A0J("forgotPinDialogTag");
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 109) {
            return AnonymousClass0JE.A05(this, this.A0Z, this.A0M, ((AnonymousClass2C0) this).A01, this.A0L, this.A0Q, this.A0U);
        }
        if (i == 124) {
            return AnonymousClass0JE.A04(this, ((AnonymousClass2C0) this).A01, this.A0C, this.A0D, new RunnableEBaseShape12S0100000_I1_7(this, 27));
        }
        if (i == 125) {
            return AnonymousClass0JE.A03(this, ((AnonymousClass2C0) this).A01, this.A0C, this.A0D);
        }
        switch (i) {
            case 31:
                return A0U(R.string.register_voice_verifying);
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                AnonymousClass0MB r5 = new AnonymousClass0MB(this);
                AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
                r5.A01.A0E = r4.A0D(R.string.register_check_connectivity, r4.A06(R.string.connectivity_self_help_instructions));
                r5.A07(r4.A06(R.string.ok), new DialogInterface$OnClickListenerC65512zy(this));
                return r5.A00();
            case 33:
                return A0U(R.string.two_factor_auth_sending_email);
            case 34:
                return A0U(R.string.two_factor_auth_resetting_account);
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A06(R.string.registration_help));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        C09890dh r0 = this.A0B;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        A0a(false);
        CountDownTimer countDownTimer = this.A04;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A04 = null;
        }
        this.A0H = false;
        this.A0K.A00(this.A0J);
        this.A09.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0S2 = AnonymousClass008.A0S("register-2fa +");
        A0S2.append(this.A0C);
        A0S2.append(this.A0D);
        String obj = A0S2.toString();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AnonymousClass0HP r1 = this.A0W;
            r1.A02("verify-2fa");
            this.A09.A01(this, r1, obj);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0V.A0B();
            startActivity(EULA.A04(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A04 == null) {
            long j = getPreferences(0).getLong("code_retry_time", -1);
            if (j != -1) {
                A0W(j - this.A0N.A05());
            }
        }
        this.A07.requestFocus();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.description);
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(AnonymousClass0JE.A06(((AnonymousClass2C0) this).A01.A06(R.string.two_factor_auth_verify_code_info), "forgot-pin", new RunnableEBaseShape12S0100000_I1_7(this, 26)));
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        boolean z = false;
        if (A04().A0Q.A01("forgotPinDialogTag") != null) {
            z = true;
        }
        bundle.putBoolean("shouldShowTheForgetPinDialog", z);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        if (this.A0H) {
            this.A0H = true;
            try {
                this.A0K.A01(this.A0J);
            } catch (IllegalStateException unused) {
                Log.d("verifytwofactorauth/register-connectivity-observer already registered");
            }
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A0H = true;
        this.A0K.A00(this.A0J);
    }

    public class ConfirmWipe extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            int i = ((AnonymousClass037) this).A06.getInt("wipeStatus");
            VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) A0A();
            AnonymousClass0MB r2 = new AnonymousClass0MB(verifyTwoFactorAuth);
            AnonymousClass01X r3 = this.A00;
            r2.A07(r3.A06(R.string.two_factor_auth_reset_account_label), new DialogInterface$OnClickListenerC65502zx(this, verifyTwoFactorAuth));
            r2.A05(r3.A06(R.string.cancel), null);
            if (i == 1 || i == 2) {
                r2.A01.A0E = r3.A06(R.string.two_factor_auth_reset_wipe_offline_info);
            } else if (i == 3) {
                r2.A01.A0E = r3.A06(R.string.two_factor_auth_reset_wipe_full_info);
            }
            return r2.A00();
        }
    }

    public class ConfirmResetCode extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r3;
            String A1S;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            int i = bundle2.getInt("wipeStatus");
            long j = bundle2.getLong("timeToWaitInMillis");
            AnonymousClass0MB r10 = new AnonymousClass0MB(A00());
            View inflate = LayoutInflater.from(A00()).inflate(R.layout.two_fa_help_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.two_fa_help_dialog_text);
            View findViewById = inflate.findViewById(16908313);
            View findViewById2 = inflate.findViewById(16908314);
            View findViewById3 = inflate.findViewById(16908315);
            View findViewById4 = inflate.findViewById(R.id.spacer);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 27));
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 28));
            if (i == 1) {
                long millis = TimeUnit.DAYS.toMillis(1);
                if (j > millis) {
                    r3 = this.A00;
                    A1S = C002001d.A1S(r3, (int) (j / millis), 3);
                } else {
                    long millis2 = TimeUnit.HOURS.toMillis(1);
                    if (j > millis2) {
                        r3 = this.A00;
                        A1S = C002001d.A1S(r3, (int) (j / millis2), 2);
                    } else {
                        long millis3 = TimeUnit.MINUTES.toMillis(1);
                        if (j > millis3) {
                            r3 = this.A00;
                            A1S = C002001d.A1S(r3, (int) (j / millis3), 1);
                        } else {
                            r3 = this.A00;
                            A1S = C002001d.A1S(r3, (int) (j / TimeUnit.SECONDS.toMillis(1)), 0);
                        }
                    }
                }
                textView.setText(r3.A0D(R.string.two_factor_auth_forgot_code_info_with_time, A1S));
            } else if (i == 2 || i == 3) {
                textView.setText(this.A00.A06(R.string.two_factor_auth_reset_info));
                findViewById3.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 26));
                findViewById3.setVisibility(0);
                findViewById4.setVisibility(0);
            }
            AnonymousClass0MC r0 = r10.A01;
            r0.A0C = inflate;
            r0.A01 = 0;
            return r10.A00();
        }
    }
}

package com.whatsapp.authentication;

import X.AbstractC27431Py;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass1Pw;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C04080Iy;
import X.C13690kf;
import X.C13700kg;
import X.C13710kh;
import X.C27331Pi;
import X.C41211uf;
import X.C41221ug;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class AppAuthenticationActivity extends ActivityC004702f implements AbstractC27431Py {
    public int A00;
    public C13700kg A01;
    public C13710kh A02;
    public C04080Iy A03;
    public FingerprintView A04;
    public Runnable A05;
    public final C27331Pi A06 = C27331Pi.A00();
    public final AnonymousClass1Pw A07 = AnonymousClass1Pw.A00();

    public static Intent A04(Context context) {
        Intent intent = new Intent(context, AppAuthenticationActivity.class);
        intent.setFlags(131072);
        return intent;
    }

    public final void A0R() {
        if (this.A00 != 0) {
            this.A06.A02();
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", this.A00);
            setResult(-1, intent);
            return;
        }
        setResult(-1);
    }

    public final void A0S() {
        Log.i("AuthenticationActivity/start-listening");
        AnonymousClass1Pw r2 = this.A07;
        if (r2.A04.A0E(266)) {
            this.A02.A02(this.A01);
            return;
        }
        this.A04.removeCallbacks(this.A05);
        C04080Iy r1 = new C04080Iy();
        this.A03 = r1;
        AnonymousClass00E.A07(r2.A05());
        r2.A01.A29(r1, this);
        this.A04.A00();
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-error");
        this.A07.A02(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            charSequence = ((AnonymousClass2C0) this).A01.A0D(R.string.fingerprint_lockout_error, 30);
            this.A04.removeCallbacks(this.A05);
            this.A04.postDelayed(this.A05, 30000);
        }
        this.A04.A03(charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A04;
        fingerprintView.A04(fingerprintView.A07.A06(R.string.fingerprint_not_recognized));
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-help");
        this.A04.A04(charSequence.toString());
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        this.A07.A02(false);
        this.A04.A02();
    }

    public /* synthetic */ void lambda$onCreate$1530$AppAuthenticationActivity(View view) {
        this.A02.A02(this.A01);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        ActivityManager A012 = this.A0I.A01();
        if (A012 == null || A012.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.A00 = extras.getInt("appWidgetId", 0);
        }
        AnonymousClass1Pw r2 = this.A07;
        if (!r2.A04()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A0R();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(R.layout.activity_authentication);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        ((TextView) findViewById(R.id.auth_title)).setText(r6.A06(R.string.app_auth_locked_title));
        View findViewById = findViewById(R.id.app_unlock);
        this.A04 = (FingerprintView) findViewById(R.id.fingerprint_view);
        if (r2.A04.A0E(266)) {
            findViewById.setVisibility(0);
            this.A04.setVisibility(8);
            this.A02 = new C13710kh(this, C004302a.A05(this), new C41211uf(this));
            C13690kf r3 = new C13690kf();
            String A062 = r6.A06(R.string.app_locked_biometric_prompt_title);
            Bundle bundle2 = r3.A00;
            bundle2.putCharSequence("title", A062);
            bundle2.putBoolean("allow_device_credential", true);
            bundle2.putBoolean("require_confirmation", false);
            this.A01 = r3.A00();
            findViewById.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 0));
            return;
        }
        findViewById.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.A00 = new C41221ug(this);
        this.A05 = new RunnableEBaseShape7S0100000_I1_2(this, 4);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        if (this.A07.A04.A0E(266)) {
            this.A02.A01();
            return;
        }
        this.A04.removeCallbacks(this.A05);
        C04080Iy r0 = this.A03;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("AuthenticationActivity/stop-listening exception=");
                sb.append(e.getMessage());
                Log.d(sb.toString());
            } catch (Throwable th) {
                this.A03 = null;
                throw th;
            }
            this.A03 = null;
        }
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        AnonymousClass1Pw r2 = this.A07;
        if (!r2.A03()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            setResult(-1);
            finish();
            return;
        }
        Log.i("AuthenticationActivity/start-listening");
        if (r2.A04.A0E(266)) {
            this.A02.A02(this.A01);
            return;
        }
        this.A04.removeCallbacks(this.A05);
        C04080Iy r1 = new C04080Iy();
        this.A03 = r1;
        AnonymousClass00E.A07(r2.A05());
        r2.A01.A29(r1, this);
        this.A04.A00();
    }
}

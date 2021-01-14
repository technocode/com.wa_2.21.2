package com.whatsapp;

import X.AbstractC27431Py;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass1Pw;
import X.AnonymousClass2C0;
import X.C04080Iy;
import X.C39381rP;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.util.Log;

public class AuthenticationActivity extends ActivityC004702f implements AbstractC27431Py {
    public C04080Iy A00;
    public FingerprintView A01;
    public Runnable A02;
    public final AnonymousClass1Pw A03 = AnonymousClass1Pw.A00();

    public final void A0R() {
        Log.i("AuthenticationActivity/start-listening");
        this.A01.removeCallbacks(this.A02);
        C04080Iy r2 = new C04080Iy();
        this.A00 = r2;
        AnonymousClass1Pw r1 = this.A03;
        AnonymousClass00E.A07(r1.A05());
        r1.A01.A29(r2, this);
        this.A01.A00();
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-error");
        if (i == 7) {
            Log.i("AuthenticationActivity/fingerprint-error-too-many-attempts");
            charSequence = ((AnonymousClass2C0) this).A01.A0D(R.string.fingerprint_lockout_error, 30);
            this.A01.removeCallbacks(this.A02);
            this.A01.postDelayed(this.A02, 30000);
        }
        this.A01.A03(charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        Log.i("AuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A01;
        fingerprintView.A04(fingerprintView.A07.A06(R.string.fingerprint_not_recognized));
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-help");
        this.A01.A04(charSequence.toString());
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        Log.i("AuthenticationActivity/fingerprint-success");
        this.A01.A02();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A03.A03()) {
            Log.i("AuthenticationActivity/onCreate: setting not enabled");
            setResult(-1);
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(R.layout.activity_authentication);
        ((TextView) findViewById(R.id.auth_title)).setText(getIntent().getStringExtra("extra_auth_title"));
        FingerprintView fingerprintView = (FingerprintView) findViewById(R.id.fingerprint_view);
        this.A01 = fingerprintView;
        fingerprintView.A00 = new C39381rP(this);
        this.A02 = new RunnableEBaseShape6S0100000_I1_1(this, 8);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A01;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        this.A01.removeCallbacks(this.A02);
        C04080Iy r0 = this.A00;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("AuthenticationActivity/stop-listening exception=");
                sb.append(e.getMessage());
                Log.d(sb.toString());
            } catch (Throwable th) {
                this.A00 = null;
                throw th;
            }
            this.A00 = null;
        }
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        AnonymousClass1Pw r2 = this.A03;
        if (!r2.A03()) {
            Log.i("AuthenticationActivity/not-enrolled");
            setResult(-1);
            finish();
            return;
        }
        Log.i("AuthenticationActivity/start-listening");
        this.A01.removeCallbacks(this.A02);
        C04080Iy r1 = new C04080Iy();
        this.A00 = r1;
        AnonymousClass00E.A07(r2.A05());
        r2.A01.A29(r1, this);
        this.A01.A00();
    }
}

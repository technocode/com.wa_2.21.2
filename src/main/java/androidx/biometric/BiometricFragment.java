package androidx.biometric;

import X.AbstractC13660kc;
import X.ActivityC004902h;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.C13620kY;
import X.DialogInterface$OnClickListenerC13630kZ;
import X.DialogInterface$OnClickListenerC13640ka;
import X.ExecutorC13580kU;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.concurrent.Executor;

public class BiometricFragment extends AnonymousClass037 {
    public Context A00;
    public DialogInterface.OnClickListener A01;
    public BiometricPrompt A02;
    public Bundle A03;
    public CancellationSignal A04;
    public AbstractC13660kc A05;
    public CharSequence A06;
    public Executor A07;
    public boolean A08;
    public boolean A09;
    public final DialogInterface.OnClickListener A0A = new DialogInterface$OnClickListenerC13640ka(this);
    public final DialogInterface.OnClickListener A0B = new DialogInterface$OnClickListenerC13630kZ(this);
    public final BiometricPrompt.AuthenticationCallback A0C = new C13620kY(this);
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public final Executor A0E = new ExecutorC13580kU(this);

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!this.A08 && (bundle2 = this.A03) != null) {
            this.A06 = bundle2.getCharSequence("negative_text");
            BiometricPrompt.Builder builder = new BiometricPrompt.Builder(A00());
            builder.setTitle(this.A03.getCharSequence("title")).setSubtitle(this.A03.getCharSequence("subtitle")).setDescription(this.A03.getCharSequence("description"));
            boolean z = this.A03.getBoolean("allow_device_credential");
            if (z && Build.VERSION.SDK_INT <= 28) {
                String A0F = A0F(R.string.confirm_device_credential_password);
                this.A06 = A0F;
                builder.setNegativeButton(A0F, this.A07, this.A0A);
            } else if (!TextUtils.isEmpty(this.A06)) {
                builder.setNegativeButton(this.A06, this.A07, this.A0B);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setConfirmationRequired(this.A03.getBoolean("require_confirmation", true));
                builder.setDeviceCredentialAllowed(z);
            }
            if (z) {
                this.A09 = false;
                this.A0D.postDelayed(new RunnableEBaseShape5S0100000_I1_0(this, 8), 250);
            }
            this.A02 = builder.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.A04 = cancellationSignal;
            this.A02.authenticate(cancellationSignal, this.A0E, this.A0C);
        }
        this.A08 = true;
        return null;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A00 = context;
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A0i = true;
        AnonymousClass0LW r0 = this.A0H;
        if (r0 != null) {
            r0.A0Q(this);
        } else {
            this.A0j = true;
        }
    }

    public void A0n() {
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 29 || (bundle = this.A03) == null || !bundle.getBoolean("allow_device_credential", false) || this.A09) {
            CancellationSignal cancellationSignal = this.A04;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            A0o();
            return;
        }
        Log.w("BiometricFragment", "Ignoring fast cancel signal");
    }

    public void A0o() {
        this.A08 = false;
        ActivityC004902h A0A2 = A0A();
        AnonymousClass0LW r1 = this.A0H;
        if (r1 != null) {
            AnonymousClass0QB r0 = new AnonymousClass0QB(r1);
            r0.A02(this);
            r0.A01();
        }
        if ((A0A2 instanceof DeviceCredentialHandlerActivity) && !A0A2.isFinishing()) {
            A0A2.finish();
        }
    }

    public void A0p(Executor executor, DialogInterface.OnClickListener onClickListener, AbstractC13660kc r3) {
        this.A07 = executor;
        this.A01 = onClickListener;
        this.A05 = r3;
    }
}

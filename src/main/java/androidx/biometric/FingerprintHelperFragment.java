package androidx.biometric;

import X.AbstractC04060Iw;
import X.AbstractC13660kc;
import X.ActivityC004902h;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0WP;
import X.C04050Iv;
import X.C04080Iy;
import X.C13750kl;
import X.C29691a1;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.concurrent.Executor;

public class FingerprintHelperFragment extends AnonymousClass037 {
    public int A00;
    public Context A01;
    public Handler A02;
    public AbstractC13660kc A03;
    public C13750kl A04;
    public C04080Iy A05;
    public Executor A06;
    public boolean A07;
    public final AbstractC04060Iw A08 = new C29691a1(this);

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FingerprintManager A022;
        FingerprintManager A023;
        FingerprintManager A024;
        CancellationSignal cancellationSignal;
        if (!this.A07) {
            this.A05 = new C04080Iy();
            this.A00 = 0;
            Context context = this.A01;
            if (Build.VERSION.SDK_INT < 23 || (A022 = C04050Iv.A02(context)) == null || !A022.isHardwareDetected()) {
                A0p(12);
            } else if (Build.VERSION.SDK_INT < 23 || (A023 = C04050Iv.A02(context)) == null || !A023.hasEnrolledFingerprints()) {
                A0p(11);
            } else {
                C04080Iy r2 = this.A05;
                AbstractC04060Iw r1 = this.A08;
                if (Build.VERSION.SDK_INT >= 23 && (A024 = C04050Iv.A02(context)) != null) {
                    if (r2 != null) {
                        cancellationSignal = (CancellationSignal) r2.A00();
                    } else {
                        cancellationSignal = null;
                    }
                    A024.authenticate(C04050Iv.A01(null), cancellationSignal, 0, C04050Iv.A00(r1), null);
                }
                this.A07 = true;
            }
            this.A04.A00.obtainMessage(3).sendToTarget();
            A0n();
            return null;
        }
        return null;
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
        this.A01 = A00();
    }

    public final void A0n() {
        this.A07 = false;
        ActivityC004902h A0A = A0A();
        AnonymousClass0LW r1 = this.A0H;
        if (r1 != null) {
            AnonymousClass0QB r0 = new AnonymousClass0QB(r1);
            r0.A02(this);
            r0.A01();
        }
        AnonymousClass0WP r02 = AnonymousClass0WP.A09;
        if ((r02 == null || !r02.A08) && (A0A instanceof DeviceCredentialHandlerActivity) && !A0A.isFinishing()) {
            A0A.finish();
        }
    }

    public void A0o(int i) {
        this.A00 = i;
        if (i == 1) {
            A0p(10);
        }
        C04080Iy r0 = this.A05;
        if (r0 != null) {
            r0.A01();
        }
        A0n();
    }

    public final void A0p(int i) {
        String string;
        AnonymousClass0WP r0 = AnonymousClass0WP.A09;
        if (r0 == null || !r0.A08) {
            AbstractC13660kc r3 = this.A03;
            Context context = this.A01;
            if (i != 1) {
                switch (i) {
                    case 10:
                        string = context.getString(R.string.fingerprint_error_user_canceled);
                        break;
                    case 11:
                        string = context.getString(R.string.fingerprint_error_no_fingerprints);
                        break;
                    case 12:
                        string = context.getString(R.string.fingerprint_error_hw_not_present);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown error code: ");
                        sb.append(i);
                        Log.e("FingerprintHelperFrag", sb.toString());
                        string = context.getString(R.string.default_error_msg);
                        break;
                }
            } else {
                string = context.getString(R.string.fingerprint_error_hw_not_available);
            }
            r3.A00(i, string);
        }
    }
}

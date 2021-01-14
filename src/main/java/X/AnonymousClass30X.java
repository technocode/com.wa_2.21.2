package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.30X  reason: invalid class name */
public class AnonymousClass30X extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VerifyTwoFactorAuth A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass30X(VerifyTwoFactorAuth verifyTwoFactorAuth, long j, long j2) {
        super(j, 1000);
        this.A01 = verifyTwoFactorAuth;
        this.A00 = j2;
    }

    public void onFinish() {
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A01;
        CountDownTimer countDownTimer = verifyTwoFactorAuth.A04;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            verifyTwoFactorAuth.A04 = null;
        }
        verifyTwoFactorAuth.A07.setEnabled(true);
        verifyTwoFactorAuth.A05.setProgress(100);
        verifyTwoFactorAuth.A06.setVisibility(4);
        verifyTwoFactorAuth.A06.setText(((AnonymousClass2C0) verifyTwoFactorAuth).A01.A0D(R.string.two_factor_auth_enter_code_description_with_placeholder, 6));
        verifyTwoFactorAuth.getPreferences(0).edit().remove("code_retry_time").apply();
    }

    public void onTick(long j) {
        ProgressBar progressBar = this.A01.A05;
        long j2 = this.A00;
        progressBar.setProgress((int) ((((double) (j2 - j)) * 100.0d) / ((double) j2)));
    }
}

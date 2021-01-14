package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.1Q1  reason: invalid class name */
public class AnonymousClass1Q1 extends Handler {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Q1(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment, Looper looper) {
        super(looper);
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
            if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                Object obj = message.obj;
                C04530Ks r2 = verifyTwoFactorAuthCodeDialogFragment.A07;
                if (r2.A00.getString("two_factor_auth_code", "").equals(obj)) {
                    verifyTwoFactorAuthCodeDialogFragment.A00 = 2;
                    r2.A03(true);
                    verifyTwoFactorAuthCodeDialogFragment.A0y();
                    return;
                }
                r2.A03(false);
                verifyTwoFactorAuthCodeDialogFragment.A02.setText(verifyTwoFactorAuthCodeDialogFragment.A06.A06(R.string.two_factor_auth_wrong_code_message));
                verifyTwoFactorAuthCodeDialogFragment.A03.setCode("");
                verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(true);
                verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(100);
                AnonymousClass02M r22 = verifyTwoFactorAuthCodeDialogFragment.A05;
                r22.A02.post(new RunnableEBaseShape7S0100000_I1_2(verifyTwoFactorAuthCodeDialogFragment, 3));
            }
        }
    }
}

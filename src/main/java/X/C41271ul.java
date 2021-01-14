package X;

import android.os.Handler;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.1ul  reason: invalid class name and case insensitive filesystem */
public class C41271ul implements AbstractC26321Kk {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    public C41271ul(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    @Override // X.AbstractC26321Kk
    public void AEJ(String str) {
        VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
        verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(false);
        verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(0);
        Handler handler = verifyTwoFactorAuthCodeDialogFragment.A04;
        handler.removeMessages(0);
        handler.sendMessageDelayed(handler.obtainMessage(0, str), 400);
    }

    @Override // X.AbstractC26321Kk
    public void AI2(String str) {
        this.A00.A02.setText("");
    }
}

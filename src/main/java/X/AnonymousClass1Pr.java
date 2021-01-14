package X;

import android.content.DialogInterface;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.1Pr  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1Pr implements DialogInterface.OnShowListener {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    public /* synthetic */ AnonymousClass1Pr(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    public final void onShow(DialogInterface dialogInterface) {
        VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
        AnonymousClass02M r2 = verifyTwoFactorAuthCodeDialogFragment.A05;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(verifyTwoFactorAuthCodeDialogFragment, 3));
    }
}

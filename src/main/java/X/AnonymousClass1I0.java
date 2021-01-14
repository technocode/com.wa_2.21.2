package X;

import android.content.DialogInterface;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

/* renamed from: X.1I0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DisplayExceptionDialogFactory$LoginFailedDialogFragment A00;

    public /* synthetic */ AnonymousClass1I0(DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment) {
        this.A00 = displayExceptionDialogFactory$LoginFailedDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = this.A00;
        Log.i("loggedout/ok/tos");
        AnonymousClass0HM r0 = displayExceptionDialogFactory$LoginFailedDialogFragment.A03;
        r0.A02();
        ActivityC004902h A0A = displayExceptionDialogFactory$LoginFailedDialogFragment.A0A();
        if (A0A != null) {
            r0.A0C(0);
            A0A.startActivity(EULA.A04(A0A));
            A0A.setResult(0);
            A0A.finishAffinity();
        }
    }
}

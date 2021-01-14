package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

/* renamed from: X.1I1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DisplayExceptionDialogFactory$LoginFailedDialogFragment A00;

    public /* synthetic */ AnonymousClass1I1(DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment) {
        this.A00 = displayExceptionDialogFactory$LoginFailedDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = this.A00;
        Log.i("loggedout/verify/tos");
        ActivityC004902h A0A = displayExceptionDialogFactory$LoginFailedDialogFragment.A0A();
        if (A0A != null) {
            AnonymousClass00D r1 = displayExceptionDialogFactory$LoginFailedDialogFragment.A01;
            String A0H = r1.A0H();
            String A0F = r1.A0F();
            Intent A04 = EULA.A04(A0A);
            if (displayExceptionDialogFactory$LoginFailedDialogFragment.A00.A05() < r1.A00.getLong("post_reg_notification_time", 0) + 1800000) {
                Log.i("loggedout/verify/tos/reregister/pref-fill");
                A04.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0H);
                A04.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0F);
                A04.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            }
            AnonymousClass0HM r0 = displayExceptionDialogFactory$LoginFailedDialogFragment.A03;
            r0.A02();
            r0.A0C(0);
            A0A.startActivity(A04);
            A0A.finishAffinity();
        }
    }
}

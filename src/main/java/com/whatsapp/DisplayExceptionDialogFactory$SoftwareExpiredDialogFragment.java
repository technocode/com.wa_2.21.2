package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass03B;
import X.AnonymousClass0GZ;
import X.AnonymousClass18B;
import X.C02780Dk;
import X.DialogC40171sk;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass03B A01 = AnonymousClass03B.A00();
    public final AnonymousClass0GZ A02 = AnonymousClass0GZ.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Log.w("home/dialog software-expired");
        AnonymousClass01X r3 = this.A03;
        ActivityC004902h A0A = A0A();
        DialogC40171sk r1 = new DialogC40171sk(A0A, r3, this.A01, this.A00, A0A, this.A02);
        r1.setOnCancelListener(new AnonymousClass18B(A0A));
        return r1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            A0A.finish();
        }
    }
}

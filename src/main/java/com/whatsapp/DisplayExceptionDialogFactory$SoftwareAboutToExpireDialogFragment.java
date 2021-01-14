package com.whatsapp;

import X.AnonymousClass03B;
import X.AnonymousClass0GZ;
import X.AnonymousClass0XP;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment extends WaDialogFragment {
    public final AnonymousClass03B A00 = AnonymousClass03B.A00();
    public final AnonymousClass0XP A01 = AnonymousClass0XP.A01();
    public final AnonymousClass0GZ A02 = AnonymousClass0GZ.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Log.i("home/dialog software-about-to-expire");
        return this.A01.A03(A0A(), this.A02, this.A00);
    }
}

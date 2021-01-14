package com.whatsapp.authentication;

import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1Pw;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class SetupDeviceAuthDialog extends WaDialogFragment {
    public final AnonymousClass1Pw A00 = AnonymousClass1Pw.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        boolean A0E = this.A00.A04.A0E(266);
        AnonymousClass0MB r2 = new AnonymousClass0MB(A01());
        int i = R.string.fingerprint_setup_dialog_title;
        if (A0E) {
            i = R.string.app_auth_setup_dialog_title;
        }
        String A0F = A0F(i);
        AnonymousClass0MC r1 = r2.A01;
        r1.A0I = A0F;
        int i2 = R.string.fingerprint_setup_dialog_message;
        if (A0E) {
            i2 = R.string.app_auth_setup_dialog_message;
        }
        r1.A0E = A0F(i2);
        r2.A07(A0F(R.string.ok), null);
        return r2.A00();
    }
}

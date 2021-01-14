package com.whatsapp.companiondevice.optin;

import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class FirstTimeExperienceDialogFragment extends WaDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass0MC r0 = r3.A01;
        r0.A0C = null;
        r0.A01 = R.layout.md_opt_in_first_time_dialog;
        r3.A07(A0F(R.string.got_it), null);
        return r3.A00();
    }
}

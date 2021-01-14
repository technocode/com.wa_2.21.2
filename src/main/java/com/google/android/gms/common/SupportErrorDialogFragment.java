package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog A00 = null;
    public DialogInterface.OnCancelListener A01 = null;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog == null) {
            ((DialogFragment) this).A0B = false;
        }
        return dialog;
    }
}

package com.whatsapp;

import X.AnonymousClass01X;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ConnectionProgressDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A0A());
        progressDialog.setMessage(this.A00.A06(R.string.register_connecting));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}

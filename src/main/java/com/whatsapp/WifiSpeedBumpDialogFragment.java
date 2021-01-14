package com.whatsapp;

import X.AbstractC27271Ow;
import X.AnonymousClass1KF;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class WifiSpeedBumpDialogFragment extends WaDialogFragment {
    public final AbstractC27271Ow A00;

    public WifiSpeedBumpDialogFragment(AbstractC27271Ow r1) {
        this.A00 = r1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        return new AlertDialog.Builder(A00()).setTitle(R.string.wifi_speed_bump_dialog_title).setMessage(R.string.wifi_speed_bump_dialog_body).setPositiveButton(R.string.wifi_speed_bump_dialog_use_data_button_text, new AnonymousClass1KF(this)).setNegativeButton(R.string.wifi_speed_bump_dialog_cancel_button_text, (DialogInterface.OnClickListener) null).create();
    }
}

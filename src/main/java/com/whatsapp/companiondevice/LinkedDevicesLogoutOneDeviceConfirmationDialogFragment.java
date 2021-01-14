package com.whatsapp.companiondevice;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass2F5;
import X.C51052Xd;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class LinkedDevicesLogoutOneDeviceConfirmationDialogFragment extends WaDialogFragment {
    public final C51052Xd A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(C51052Xd r2) {
        this.A00 = r2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A01;
        r3.A01.A0E = r2.A06(R.string.confirmation_delete_qr);
        r3.A05(r2.A06(R.string.cancel), null);
        r3.A07(r2.A06(R.string.log_out), new AnonymousClass2F5(this));
        return r3.A00();
    }
}

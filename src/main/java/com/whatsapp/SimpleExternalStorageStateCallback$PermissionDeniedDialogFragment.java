package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1JR;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A00;
        String A06 = r2.A06(R.string.alert);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A06;
        r1.A0E = r2.A06(R.string.permission_storage_need_access);
        r3.A07(r2.A06(R.string.ok), AnonymousClass1JR.A00);
        return r3.A00();
    }
}

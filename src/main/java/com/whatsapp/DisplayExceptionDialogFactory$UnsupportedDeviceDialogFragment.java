package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A00;
        String A06 = r2.A06(R.string.app_name);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A06;
        r1.A0E = r2.A06(R.string.device_unsupported);
        r1.A0J = false;
        r3.A07(r2.A06(R.string.ok), null);
        return r3.A00();
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

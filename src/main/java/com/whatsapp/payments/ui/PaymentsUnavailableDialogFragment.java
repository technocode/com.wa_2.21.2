package com.whatsapp.payments.ui;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC62912vY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class PaymentsUnavailableDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        boolean z;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("arg_is_underage_unavailability");
        } else {
            z = false;
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A00;
        String A06 = r2.A06(R.string.payments_unavailable_title);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A06;
        int i = R.string.payments_unavailable_generic_description;
        if (z) {
            i = R.string.payments_unavailable_underage_description;
        }
        r1.A0E = r2.A06(i);
        r1.A0J = false;
        int i2 = R.string.ok;
        if (z) {
            i2 = R.string.cancel;
        }
        r3.A07(r2.A06(i2), null);
        if (z) {
            r3.A06(r2.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC62912vY(this));
        }
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

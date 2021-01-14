package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.C02780Dk;
import X.DialogInterface$OnClickListenerC25701Hz;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final AnonymousClass0M9 A02 = AnonymousClass0M9.A01();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
            AnonymousClass01X r2 = this.A01;
            String A06 = r2.A06(R.string.pre_registration_do_not_share_code_dialog_title);
            AnonymousClass0MC r1 = r3.A01;
            r1.A0I = A06;
            r1.A0E = r2.A06(R.string.pre_registration_do_not_share_code_dialog_message);
            r1.A0J = true;
            r3.A07(r2.A06(R.string.ok), null);
            r3.A05(r2.A06(R.string.learn_more), new DialogInterface$OnClickListenerC25701Hz(this, A0A));
            return r3.A00();
        }
        throw null;
    }
}

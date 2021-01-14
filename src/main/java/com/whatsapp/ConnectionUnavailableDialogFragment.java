package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0KP;
import X.AnonymousClass0MB;
import X.C002101e;
import X.DialogInterface$OnClickListenerC25541Hj;
import X.DialogInterface$OnClickListenerC25551Hk;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ConnectionUnavailableDialogFragment extends WaDialogFragment {
    public final AnonymousClass04j A00 = AnonymousClass04j.A00();
    public final AnonymousClass03P A01 = AnonymousClass03P.A00();
    public final AnonymousClass03S A02 = AnonymousClass03S.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass0KP A04 = AnonymousClass0KP.A00();
    public final AnonymousClass00T A05 = C002101e.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004602e r4 = (ActivityC004602e) A0A();
        if (r4 != null) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(r4);
            AnonymousClass01X r2 = this.A03;
            r3.A01.A0E = r2.A06(R.string.register_try_again_later);
            r3.A07(r2.A06(R.string.check_system_status), new DialogInterface$OnClickListenerC25551Hk(this, r4));
            r3.A05(r2.A06(R.string.cancel), new DialogInterface$OnClickListenerC25541Hj(this));
            return r3.A00();
        }
        throw null;
    }
}

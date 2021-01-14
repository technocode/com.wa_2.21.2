package com.whatsapp.invites;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass2RQ;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class NobodyDeprecatedDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A00());
        AnonymousClass01X r2 = this.A00;
        r3.A01.A0E = r2.A06(R.string.group_add_nobody_is_discontinued_dialog_text);
        r3.A07(r2.A06(R.string.btn_continue), new AnonymousClass2RQ(this));
        return AnonymousClass008.A03(r2, R.string.cancel, r3);
    }
}

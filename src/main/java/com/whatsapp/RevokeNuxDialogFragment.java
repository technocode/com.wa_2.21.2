package com.whatsapp;

import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass0M9;
import X.C002001d;
import X.C02780Dk;
import X.C38961qj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;

public class RevokeNuxDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass00D A01 = AnonymousClass00D.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass0M9 A03 = AnonymousClass0M9.A01();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        return C002001d.A0M(A00(), this.A00, this.A03, this.A02, this.A01, new C38961qj(this));
    }
}

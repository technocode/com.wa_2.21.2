package com.whatsapp.util;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00T;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0BW;
import X.AnonymousClass0MB;
import X.AnonymousClass35B;
import X.C000300f;
import X.C002101e;
import X.C02780Dk;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class DocumentWarningDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass009 A01 = AnonymousClass009.A00();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final C000300f A03 = C000300f.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass01K A05 = AnonymousClass01K.A00();
    public final AnonymousClass0BW A06 = AnonymousClass0BW.A00();
    public final AnonymousClass00T A07 = C002101e.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r4 = new AnonymousClass0MB(A00());
        AnonymousClass01X r3 = this.A04;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            r4.A01.A0E = r3.A06(bundle2.getInt("warning_id", R.string.warning_opening_document));
            r4.A07(r3.A06(R.string.open), new AnonymousClass35B(this));
            return AnonymousClass008.A03(r3, R.string.cancel, r4);
        }
        throw null;
    }
}

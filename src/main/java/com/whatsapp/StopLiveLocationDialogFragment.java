package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.DialogInterface$OnClickListenerC26021Jf;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StopLiveLocationDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();
    public final AnonymousClass01S A01 = AnonymousClass01S.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String string = ((AnonymousClass037) this).A06.getString("id");
        if (string != null) {
            String string2 = ((AnonymousClass037) this).A06.getString("jid");
            if (string2 != null) {
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
                AnonymousClass01X r2 = this.A00;
                r3.A01.A0E = r2.A06(R.string.live_location_stop_sharing_dialog);
                r3.A07(r2.A06(R.string.live_location_stop), new DialogInterface$OnClickListenerC26021Jf(this, string, string2));
                return AnonymousClass008.A03(r2, R.string.cancel, r3);
            }
            throw null;
        }
        throw null;
    }
}

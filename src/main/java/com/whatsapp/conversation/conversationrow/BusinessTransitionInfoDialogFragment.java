package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2Hg;
import X.C002001d;
import X.C02590Cr;
import X.C02780Dk;
import X.DialogInterface$OnClickListenerC47292Hf;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class BusinessTransitionInfoDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C02590Cr A02 = C02590Cr.A00();
    public final AnonymousClass0M9 A03 = AnonymousClass0M9.A01();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("message");
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
            CharSequence A1J = C002001d.A1J(string, A00(), this.A02);
            AnonymousClass0MC r1 = r3.A01;
            r1.A0E = A1J;
            r1.A0J = true;
            AnonymousClass01X r2 = this.A01;
            r3.A06(r2.A06(R.string.learn_more), new AnonymousClass2Hg(this));
            r3.A05(r2.A06(R.string.ok), new DialogInterface$OnClickListenerC47292Hf(this));
            return r3.A00();
        }
        throw null;
    }
}

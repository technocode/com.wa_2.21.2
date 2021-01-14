package com.whatsapp.gif_search;

import X.ActivityC004902h;
import X.AnonymousClass00S;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C03400Ga;
import X.C49232Po;
import X.DialogInterface$OnClickListenerC49142Pe;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StarOrRemoveFromRecentGifsDialogFragment extends WaDialogFragment {
    public C49232Po A00;
    public final AnonymousClass00S A01 = AnonymousClass00S.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final C03400Ga A03 = C03400Ga.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                C49232Po r0 = (C49232Po) bundle2.getParcelable("gif");
                if (r0 != null) {
                    this.A00 = r0;
                    DialogInterface$OnClickListenerC49142Pe r4 = new DialogInterface$OnClickListenerC49142Pe(this);
                    AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                    AnonymousClass01X r2 = this.A02;
                    r3.A01.A0E = r2.A06(R.string.gif_save_to_picker_title);
                    r3.A07(r2.A06(R.string.gif_save_to_favorites), r4);
                    r3.A06(r2.A06(R.string.gif_remove_from_recents_option), r4);
                    r3.A05(r2.A06(R.string.cancel), r4);
                    return r3.A00();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

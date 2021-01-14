package com.whatsapp.gif_search;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C03400Ga;
import X.C49232Po;
import X.DialogInterface$OnClickListenerC49122Pc;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class RemoveGifFromFavoritesDialogFragment extends WaDialogFragment {
    public C49232Po A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C03400Ga A02 = C03400Ga.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                this.A00 = (C49232Po) bundle2.getParcelable("gif");
                DialogInterface$OnClickListenerC49122Pc r4 = new DialogInterface$OnClickListenerC49122Pc(this);
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                AnonymousClass01X r2 = this.A01;
                r3.A01.A0E = r2.A06(R.string.gif_remove_from_title_tray);
                r3.A07(r2.A06(R.string.gif_remove_from_tray), r4);
                return AnonymousClass008.A03(r2, R.string.cancel, r3);
            }
            throw null;
        }
        throw null;
    }
}

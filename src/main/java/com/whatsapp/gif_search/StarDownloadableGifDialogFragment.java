package com.whatsapp.gif_search;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C49182Pi;
import X.C49262Ps;
import X.DialogInterface$OnClickListenerC49132Pd;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StarDownloadableGifDialogFragment extends WaDialogFragment {
    public C49262Ps A00;
    public final AnonymousClass00S A01 = AnonymousClass00S.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final C49182Pi A03 = C49182Pi.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                C49262Ps r0 = (C49262Ps) bundle2.getParcelable("gif");
                if (r0 != null) {
                    this.A00 = r0;
                    DialogInterface$OnClickListenerC49132Pd r4 = new DialogInterface$OnClickListenerC49132Pd(this);
                    AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                    AnonymousClass01X r2 = this.A02;
                    r3.A01.A0E = r2.A06(R.string.gif_save_to_picker_title);
                    r3.A07(r2.A06(R.string.gif_save_to_favorites), r4);
                    return AnonymousClass008.A03(r2, R.string.cancel, r3);
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

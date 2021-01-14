package com.whatsapp.stickers;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C03570Gt;
import X.C29241Xq;
import X.DialogInterface$OnClickListenerC660732t;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class RemoveStickerFromFavoritesDialogFragment extends WaDialogFragment {
    public C29241Xq A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C03570Gt A02 = C03570Gt.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                this.A00 = (C29241Xq) bundle2.getParcelable("sticker");
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                AnonymousClass01X r2 = this.A01;
                r3.A01.A0E = r2.A06(R.string.sticker_remove_from_tray_title);
                r3.A07(r2.A06(R.string.sticker_remove_from_tray), new DialogInterface$OnClickListenerC660732t(this));
                return AnonymousClass008.A03(r2, R.string.cancel, r3);
            }
            throw null;
        }
        throw null;
    }
}

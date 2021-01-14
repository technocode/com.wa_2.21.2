package com.whatsapp.stickers;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C03570Gt;
import X.C04230Jo;
import X.C29241Xq;
import X.DialogInterface$OnClickListenerC660832u;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StarOrRemoveFromRecentsStickerDialogFragment extends WaDialogFragment {
    public C29241Xq A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C04230Jo A02 = C04230Jo.A00();
    public final C03570Gt A03 = C03570Gt.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                C29241Xq r0 = (C29241Xq) bundle2.getParcelable("sticker");
                if (r0 != null) {
                    this.A00 = r0;
                    DialogInterface$OnClickListenerC660832u r4 = new DialogInterface$OnClickListenerC660832u(this);
                    AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                    AnonymousClass01X r2 = this.A01;
                    r3.A01.A0E = r2.A06(R.string.sticker_save_to_picker_title);
                    r3.A07(r2.A06(R.string.sticker_save_to_picker), r4);
                    r3.A06(r2.A06(R.string.sticker_remove_from_recents_option), r4);
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

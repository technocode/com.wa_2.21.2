package com.whatsapp.stickers;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.C03570Gt;
import X.DialogInterface$OnClickListenerC660632s;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ConfirmPackDeleteDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();
    public final C03570Gt A01 = C03570Gt.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        String string = ((AnonymousClass037) this).A06.getString("pack_id");
        if (string != null) {
            String string2 = ((AnonymousClass037) this).A06.getString("pack_name");
            if (string2 != null) {
                DialogInterface$OnClickListenerC660632s r6 = new DialogInterface$OnClickListenerC660632s(this, string);
                AnonymousClass0MB r5 = new AnonymousClass0MB(A0A);
                AnonymousClass01X r4 = this.A00;
                r5.A01.A0E = r4.A0D(R.string.sticker_pack_removal_confirmation, string2);
                r5.A07(r4.A06(R.string.delete), r6);
                r5.A05(r4.A06(R.string.cancel), null);
                AnonymousClass0MD A002 = r5.A00();
                A002.setCanceledOnTouchOutside(true);
                return A002;
            }
            throw null;
        }
        throw null;
    }
}

package com.whatsapp.stickers.picker.pages;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC662833p;
import X.DialogInterface$OnClickListenerC662933q;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ThirdPartyPackPage$StickerBlockedDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 == null) {
            throw null;
        } else if (A00() != null) {
            String string = bundle2.getString("sticker_pack_name");
            if (string != null) {
                AnonymousClass0MB r4 = new AnonymousClass0MB(A00());
                AnonymousClass01X r5 = this.A00;
                String A06 = r5.A06(R.string.stickers_picker_blocked_dialog_title);
                AnonymousClass0MC r3 = r4.A01;
                r3.A0I = A06;
                r3.A0E = Html.fromHtml(r5.A0D(R.string.stickers_picker_blocked_dialog_message, string));
                r4.A07(r5.A06(R.string.stickers_picker_blocked_dialog_button_positive), new DialogInterface$OnClickListenerC662933q(this));
                r4.A05(r5.A06(R.string.cancel), new DialogInterface$OnClickListenerC662833p(this));
                return r4.A00();
            }
            throw null;
        } else {
            throw null;
        }
    }
}

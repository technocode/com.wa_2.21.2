package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC64812yq;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class BaseQrActivity$RevokeCodeDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A00;
        String A06 = r2.A06(R.string.contact_qr_revoke_title);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A06;
        r1.A0E = r2.A06(R.string.contact_qr_revoke_subtitle);
        r3.A07(r2.A06(R.string.contact_qr_revoke_ok_button), new DialogInterface$OnClickListenerC64812yq(this));
        return AnonymousClass008.A03(r2, R.string.contact_qr_revoke_cancel_button, r3);
    }
}

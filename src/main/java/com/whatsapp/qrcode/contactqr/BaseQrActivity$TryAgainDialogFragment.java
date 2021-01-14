package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.DialogInterface$OnClickListenerC64822yr;
import X.DialogInterface$OnClickListenerC64832ys;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class BaseQrActivity$TryAgainDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass01X r2 = this.A00;
        r3.A01.A0E = r2.A06(R.string.contact_qr_failed_title);
        r3.A07(r2.A06(R.string.contact_qr_try_again), new DialogInterface$OnClickListenerC64822yr(this));
        r3.A05(r2.A06(R.string.contact_qr_failed_go_back), new DialogInterface$OnClickListenerC64832ys(this));
        return r3.A00();
    }
}

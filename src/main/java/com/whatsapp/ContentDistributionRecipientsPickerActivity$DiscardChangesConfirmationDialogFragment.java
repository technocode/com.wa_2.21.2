package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.DialogInterface$OnClickListenerC25561Hl;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment extends WaDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        DialogInterface$OnClickListenerC25561Hl r4 = new DialogInterface$OnClickListenerC25561Hl(this);
        AnonymousClass01X A00 = AnonymousClass01X.A00();
        AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
        r2.A01.A0E = A00.A06(R.string.discard_changes);
        r2.A07(A00.A06(R.string.discard_status_privacy_changes), r4);
        return AnonymousClass008.A03(A00, R.string.cancel_discarding_status_privacy_changes, r2);
    }
}

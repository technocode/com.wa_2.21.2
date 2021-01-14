package com.whatsapp;

import X.AbstractC26811Mr;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC25721Ib;
import X.DialogInterface$OnClickListenerC25741Id;
import X.DialogInterface$OnMultiChoiceClickListenerC25731Ic;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class MultiSelectionDialogFragment extends WaDialogFragment {
    public int A00;
    public AbstractC26811Mr A01;
    public String A02;
    public String[] A03;
    public boolean[] A04;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        if (A0A() instanceof AbstractC26811Mr) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            this.A00 = bundle2.getInt("dialogId");
            this.A02 = this.A05.A06(bundle2.getInt("dialogTitleResId"));
            this.A03 = A02().getStringArray(bundle2.getInt("itemsResId"));
            this.A04 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (AbstractC26811Mr) A0A();
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Activity must implement ");
        A0S.append("MultiSelectionDialogFragment$MultiSelectionDialogListener");
        throw new IllegalStateException(A0S.toString());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
        String str = this.A02;
        AnonymousClass0MC r3 = r4.A01;
        r3.A0I = str;
        String[] strArr = this.A03;
        boolean[] zArr = this.A04;
        DialogInterface$OnMultiChoiceClickListenerC25731Ic r0 = new DialogInterface$OnMultiChoiceClickListenerC25731Ic(this);
        r3.A0M = strArr;
        r3.A09 = r0;
        r3.A0N = zArr;
        r3.A0K = true;
        AnonymousClass01X r2 = this.A05;
        r4.A07(r2.A06(R.string.ok), new DialogInterface$OnClickListenerC25721Ib(this));
        r4.A05(r2.A06(R.string.cancel), DialogInterface$OnClickListenerC25741Id.A00);
        return r4.A00();
    }
}

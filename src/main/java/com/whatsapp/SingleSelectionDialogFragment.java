package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0SB;
import X.AnonymousClass1JT;
import X.AnonymousClass1JU;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class SingleSelectionDialogFragment extends WaDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public String[] A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public static Bundle A00(int i, int i2, int i3, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        bundle.putStringArray("items", strArr);
        return bundle;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        if (A0A() instanceof AnonymousClass0SB) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            this.A01 = bundle2.getInt("dialogId");
            this.A00 = bundle2.getInt("currentIndex");
            if (bundle2.containsKey("dialogTitleResId")) {
                this.A03 = this.A06.A06(bundle2.getInt("dialogTitleResId"));
            } else {
                this.A03 = bundle2.getString("dialogTitle");
            }
            if (bundle2.containsKey("itemsArrayResId")) {
                this.A05 = A02().getStringArray(bundle2.getInt("itemsArrayResId"));
            } else {
                this.A05 = bundle2.getStringArray("items");
            }
            this.A04 = bundle2.getBoolean("showConfirmation", false);
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Activity must implement ");
        A0S.append("SingleSelectionDialogFragment$SingleSelectionDialogListener");
        throw new IllegalStateException(A0S.toString());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        return A0x().A00();
    }

    public AnonymousClass0MB A0x() {
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
        String str = this.A03;
        AnonymousClass0MC r3 = r4.A01;
        r3.A0I = str;
        int i = this.A00;
        this.A02 = i;
        String[] strArr = this.A05;
        AnonymousClass1JU r0 = new AnonymousClass1JU(this);
        r3.A0M = strArr;
        r3.A05 = r0;
        r3.A00 = i;
        r3.A0L = true;
        if (this.A04) {
            AnonymousClass01X r2 = this.A06;
            r4.A07(r2.A06(R.string.ok), new AnonymousClass1JT(this));
            r4.A05(r2.A06(R.string.cancel), null);
        }
        return r4;
    }
}

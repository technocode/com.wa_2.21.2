package com.whatsapp.picker.search;

import X.AbstractC03660Hd;
import X.AbstractC49282Pv;
import X.AnonymousClass0JW;
import X.AnonymousClass3R1;
import X.C28051Sr;
import X.C59842oN;
import X.C662733o;
import X.C69873Iw;
import X.DialogInterface$OnKeyListenerC63972xJ;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public abstract class PickerSearchDialogFragment extends WaDialogFragment {
    public C69873Iw A00;

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AbstractC03660Hd) {
            ((AbstractC03660Hd) context).ACz(this);
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(0, R.style.PickerSearchDialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Dialog A0p = super.A0p(bundle);
        A0p.setOnKeyListener(new DialogInterface$OnKeyListenerC63972xJ(this));
        return A0p;
    }

    public void A0x() {
        if (!(this instanceof StickerSearchDialogFragment)) {
            GifSearchDialogFragment gifSearchDialogFragment = (GifSearchDialogFragment) this;
            gifSearchDialogFragment.A0E.A02(gifSearchDialogFragment.A04);
            AbstractC49282Pv r1 = gifSearchDialogFragment.A06;
            if (r1 != null) {
                C28051Sr.A1a(gifSearchDialogFragment.A0B, r1);
            }
            gifSearchDialogFragment.A06 = null;
            gifSearchDialogFragment.A0w(false, false);
            return;
        }
        A0w(false, false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        C59842oN r0;
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        C69873Iw r2 = this.A00;
        if (r2 != null) {
            r2.A07 = false;
            if (r2.A06 && (r0 = r2.A00) != null) {
                r0.A07();
            }
            r2.A03 = null;
            C662733o r02 = r2.A08;
            r02.A00 = null;
            AnonymousClass3R1 r03 = r02.A01;
            if (r03 != null) {
                ((AnonymousClass0JW) r03).A00.cancel(true);
            }
            this.A00 = null;
        }
    }
}

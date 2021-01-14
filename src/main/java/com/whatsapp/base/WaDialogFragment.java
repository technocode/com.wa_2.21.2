package com.whatsapp.base;

import X.AnonymousClass0MD;
import X.C001901c;
import android.app.Dialog;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;

public class WaDialogFragment extends DialogFragment {
    public final C001901c A00 = C001901c.A00();

    @Override // X.AnonymousClass037
    public void A0T(boolean z) {
        super.A0T(z);
        if (z) {
            this.A00.A03(this, "visible");
        } else {
            this.A00.A03(this, "invisible");
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0f() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        this.A0U = true;
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            ((DialogFragment) this).A0C = false;
            dialog.show();
        }
        Dialog dialog2 = ((DialogFragment) this).A03;
        if (dialog2 instanceof AnonymousClass0MD) {
            AnonymousClass0MD r2 = (AnonymousClass0MD) dialog2;
            Button A02 = r2.A02(-1);
            if (!(A02 == null || (text3 = A02.getText()) == null)) {
                A02.setContentDescription(text3);
            }
            Button A022 = r2.A02(-2);
            if (!(A022 == null || (text2 = A022.getText()) == null)) {
                A022.setContentDescription(text2);
            }
            Button A023 = r2.A02(-3);
            if (A023 != null && (text = A023.getText()) != null) {
                A023.setContentDescription(text);
            }
        }
    }
}

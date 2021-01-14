package com.whatsapp.dialogs;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.C06090Rr;
import X.ProgressDialogC48312Ls;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.base.WaDialogFragment;

public class ProgressDialogFragment extends WaDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public boolean A01 = false;

    public static ProgressDialogFragment A00(int i, int i2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        bundle.putInt("message_id", i2);
        progressDialogFragment.A0N(bundle);
        return progressDialogFragment;
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        if (this.A01) {
            A0w(false, false);
            this.A01 = false;
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0j(Bundle bundle) {
        CharSequence charSequence;
        super.A0j(bundle);
        ProgressDialogC48312Ls r0 = (ProgressDialogC48312Ls) ((DialogFragment) this).A03;
        if (r0 != null && (charSequence = r0.A00) != null) {
            bundle.putString("previous_message_text", charSequence.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        if (bundle != null) {
            this.A01 = !C06090Rr.A02;
        }
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 == null) {
            throw null;
        } else if (bundle2 != null) {
            int i = bundle2.getInt("title_id");
            int i2 = ((AnonymousClass037) this).A06.getInt("message_id");
            String str = null;
            if (bundle != null) {
                str = bundle.getString("previous_message_text");
            }
            ProgressDialogC48312Ls r3 = new ProgressDialogC48312Ls(A0A());
            AnonymousClass01X A002 = AnonymousClass01X.A00();
            String string = ((AnonymousClass037) this).A06.getString("title");
            if (!(string == null && (i == 0 || (string = A002.A06(i)) == null))) {
                r3.setTitle(string);
            }
            if (!(str == null && (str = ((AnonymousClass037) this).A06.getString("message")) == null && (i2 == 0 || (str = A002.A06(i2)) == null))) {
                r3.setMessage(str);
            }
            r3.setIndeterminate(true);
            A0v(false);
            DialogInterface.OnKeyListener onKeyListener = this.A00;
            if (onKeyListener != null) {
                r3.setOnKeyListener(onKeyListener);
            }
            return r3;
        } else {
            throw null;
        }
    }
}

package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass1O8;
import X.DialogInterface$OnClickListenerC26101Jn;
import X.DialogInterface$OnClickListenerC26111Jo;
import X.DialogInterface$OnKeyListenerC26121Jp;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class UnblockDialogFragment extends WaDialogFragment {
    public AnonymousClass1O8 A00;
    public boolean A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public static UnblockDialogFragment A00(String str, int i, boolean z, AnonymousClass1O8 r6) {
        UnblockDialogFragment unblockDialogFragment = new UnblockDialogFragment();
        unblockDialogFragment.A00 = r6;
        unblockDialogFragment.A01 = z;
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putInt("title", i);
        unblockDialogFragment.A0N(bundle);
        return unblockDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        DialogInterface$OnClickListenerC26101Jn r5;
        ActivityC004902h A0A = A0A();
        String string = ((AnonymousClass037) this).A06.getString("message");
        if (string != null) {
            int i = ((AnonymousClass037) this).A06.getInt("title");
            if (this.A00 == null) {
                r5 = null;
            } else {
                r5 = new DialogInterface$OnClickListenerC26101Jn(this);
            }
            DialogInterface$OnClickListenerC26111Jo r4 = new DialogInterface$OnClickListenerC26111Jo(this, A0A);
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
            AnonymousClass0MC r2 = r3.A01;
            r2.A0E = string;
            if (i != 0) {
                r2.A0I = this.A02.A06(i);
            }
            AnonymousClass01X r1 = this.A02;
            r3.A07(r1.A06(R.string.unblock), r5);
            r3.A05(r1.A06(R.string.cancel), r4);
            if (this.A01) {
                r2.A08 = new DialogInterface$OnKeyListenerC26121Jp(A0A);
            }
            AnonymousClass0MD A002 = r3.A00();
            A002.setCanceledOnTouchOutside(!this.A01);
            return A002;
        }
        throw null;
    }
}

package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0GG;
import X.AnonymousClass0MB;
import X.AnonymousClass18G;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends WaDialogFragment {
    public final AnonymousClass0GG A00 = AnonymousClass0GG.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("message");
            if (string != null) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("jids");
                if (parcelableArrayList != null) {
                    AnonymousClass01X r5 = this.A01;
                    ActivityC004902h A0B = A0B();
                    AnonymousClass0GG r3 = this.A00;
                    AnonymousClass0MB r2 = new AnonymousClass0MB(A0B);
                    r2.A01.A0E = string;
                    r2.A07(r5.A06(R.string.unblock), new AnonymousClass18G(parcelableArrayList, r3, A0B));
                    return AnonymousClass008.A03(r5, R.string.cancel, r2);
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

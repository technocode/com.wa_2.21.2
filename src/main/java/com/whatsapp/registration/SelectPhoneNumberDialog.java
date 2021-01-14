package com.whatsapp.registration;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0HW;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass30T;
import X.C65272za;
import X.DialogInterface$OnClickListenerC65262zZ;
import X.DialogInterface$OnClickListenerC65282zb;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class SelectPhoneNumberDialog extends WaDialogFragment {
    public AnonymousClass0HW A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A00 = null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AnonymousClass0HW) {
            this.A00 = (AnonymousClass0HW) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("deviceSimInfoList");
            if (parcelableArrayList != null) {
                StringBuilder A0S = AnonymousClass008.A0S("select-phone-number-dialog/number-of-suggestions: ");
                A0S.append(parcelableArrayList.size());
                Log.i(A0S.toString());
                Context A002 = A00();
                if (A002 != null) {
                    AnonymousClass30T r3 = new AnonymousClass30T(A002, parcelableArrayList);
                    AnonymousClass0MB r4 = new AnonymousClass0MB(A002);
                    AnonymousClass01X r2 = this.A01;
                    String A06 = r2.A06(R.string.select_phone_number_dialog_title);
                    AnonymousClass0MC r1 = r4.A01;
                    r1.A0I = A06;
                    r1.A0D = r3;
                    r1.A05 = null;
                    r4.A07(r2.A06(R.string.use), new DialogInterface$OnClickListenerC65262zZ(this, parcelableArrayList, r3));
                    r4.A05(r2.A06(R.string.cancel), new DialogInterface$OnClickListenerC65282zb(this));
                    AnonymousClass0MD A003 = r4.A00();
                    A003.A00.A0L.setOnItemClickListener(new C65272za(r3));
                    return A003;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

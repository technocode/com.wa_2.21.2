package com.whatsapp;

import X.AnonymousClass01A;
import X.AnonymousClass02U;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1J0;
import X.C014308b;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class RevokeLinkConfirmationDialogFragment extends WaDialogFragment {
    public final AnonymousClass01A A00 = AnonymousClass01A.A00();
    public final C014308b A01 = C014308b.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle A03 = A03();
        boolean z = A03.getBoolean("from_qr");
        AnonymousClass0MB r4 = new AnonymousClass0MB(A01());
        int i = R.string.revoke_invite_link;
        if (z) {
            i = R.string.contact_qr_revoke_ok_button;
        }
        r4.A07(A0F(i), new AnonymousClass1J0(this));
        r4.A05(A0F(R.string.cancel), null);
        if (z) {
            String A0F = A0F(R.string.contact_qr_revoke_title);
            AnonymousClass0MC r1 = r4.A01;
            r1.A0I = A0F;
            r1.A0E = A0F(R.string.reset_group_invite_link_and_qr_code_confirmation);
        } else {
            Object[] objArr = new Object[1];
            C014308b r2 = this.A01;
            AnonymousClass01A r12 = this.A00;
            String string = A03.getString("jid");
            if (string != null) {
                AnonymousClass02U A032 = AnonymousClass02U.A03(string);
                if (A032 != null) {
                    objArr[0] = r2.A08(r12.A0A(A032), false);
                    r4.A01.A0E = A02().getString(R.string.reset_link_confirmation, objArr);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return r4.A00();
    }
}

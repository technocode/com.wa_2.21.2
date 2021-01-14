package com.whatsapp;

import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0XM;
import X.AnonymousClass0Y8;
import X.AnonymousClass1JX;
import X.AnonymousClass1JY;
import X.C007003k;
import X.C014308b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class StatusConfirmMuteDialogFragment extends WaDialogFragment {
    public AnonymousClass0Y8 A00;
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass0XM A04 = AnonymousClass0XM.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        try {
            AnonymousClass037 r0 = this.A0D;
            if (r0 != null) {
                this.A00 = (AnonymousClass0Y8) r0;
                return;
            }
            throw null;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        this.A00.AF4(this, true);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            UserJid nullable = UserJid.getNullable(bundle2.getString("jid"));
            if (nullable != null) {
                C007003k A0A = this.A01.A0A(nullable);
                Context A002 = A00();
                if (A002 != null) {
                    AnonymousClass0MB r5 = new AnonymousClass0MB(A002);
                    AnonymousClass01X r7 = this.A03;
                    C014308b r8 = this.A02;
                    String A0D = r7.A0D(R.string.mute_status_confirmation_title, r8.A04(A0A));
                    AnonymousClass0MC r3 = r5.A01;
                    r3.A0I = A0D;
                    r3.A0E = r7.A0D(R.string.mute_status_confirmation_message, r8.A08(A0A, false));
                    r5.A05(r7.A06(R.string.cancel), new AnonymousClass1JX(this));
                    r5.A07(r7.A06(R.string.mute_status), new AnonymousClass1JY(this, nullable));
                    return r5.A00();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        this.A00.AF4(this, false);
    }
}

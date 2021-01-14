package com.whatsapp;

import X.AbstractC007503q;
import X.AbstractC40751tm;
import X.ActivityC004902h;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.C006803i;
import X.C008805h;
import X.C02590Cr;
import X.C04360Kb;
import X.C39061qt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.Collections;
import java.util.List;

public class StatusDeleteDialogFragment extends WaDialogFragment {
    public AbstractC40751tm A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final C04360Kb A02 = C04360Kb.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass01K A04 = AnonymousClass01K.A00();
    public final C02590Cr A05 = C02590Cr.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        try {
            AnonymousClass037 r0 = this.A0D;
            if (r0 != null) {
                this.A00 = (AbstractC40751tm) r0;
                return;
            }
            throw null;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        List singletonList;
        this.A00.AF4(this, true);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            AbstractC007503q A052 = this.A04.A0J.A05(C006803i.A09(bundle2, ""));
            ActivityC004902h A0A = A0A();
            AnonymousClass02M r2 = this.A01;
            C02590Cr r3 = this.A05;
            C04360Kb r4 = this.A02;
            AnonymousClass01X r5 = this.A03;
            if (A052 == null) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(A052);
            }
            Dialog A07 = C008805h.A07(A0A, r2, r3, r4, r5, singletonList, C39061qt.A00);
            if (A07 != null) {
                return A07;
            }
            AnonymousClass0MB r22 = new AnonymousClass0MB(A0A());
            r22.A01.A0E = r5.A06(R.string.status_deleted);
            return r22.A00();
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

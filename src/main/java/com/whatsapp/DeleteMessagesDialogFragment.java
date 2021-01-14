package com.whatsapp;

import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass09V;
import X.AnonymousClass0MF;
import X.AnonymousClass0MG;
import X.C002001d;
import X.C002101e;
import X.C006803i;
import X.C007303n;
import X.C014308b;
import X.C02590Cr;
import X.C04360Kb;
import X.C38621qB;
import X.C39931sL;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;
import java.util.List;

public class DeleteMessagesDialogFragment extends WaDialogFragment {
    public AnonymousClass0MF A00 = new C39931sL(this);
    public AnonymousClass0MG A01 = new C38621qB(this);
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final C04360Kb A03 = C04360Kb.A00();
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final C014308b A05 = C014308b.A00();
    public final AnonymousClass00S A06 = AnonymousClass00S.A00();
    public final AnonymousClass00D A07 = AnonymousClass00D.A00();
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final AnonymousClass09V A09 = AnonymousClass09V.A00();
    public final C02590Cr A0A = C02590Cr.A00();
    public final AnonymousClass00T A0B = C002101e.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 == null || A00() == null) {
            A0r();
            return super.A0p(bundle);
        }
        List<C007303n> A0N = C006803i.A0N(bundle2);
        if (A0N == null) {
            A0r();
            return super.A0p(bundle);
        }
        ArrayList arrayList = new ArrayList();
        for (C007303n r1 : A0N) {
            arrayList.add(this.A09.A05(r1));
        }
        AnonymousClass02N A012 = AnonymousClass02N.A01(bundle2.getString("jid"));
        boolean z = bundle2.getBoolean("is_revokable");
        AnonymousClass01A r12 = this.A04;
        C014308b r0 = this.A05;
        AnonymousClass01X r6 = this.A08;
        Dialog A0N2 = C002001d.A0N(A00(), this.A02, this.A06, this.A0B, this.A0A, this.A03, r6, this.A07, arrayList, this.A00, z, this.A01, C002001d.A1t(arrayList, r12, r0, A012, r6));
        if (A0N2 != null) {
            return A0N2;
        }
        A0r();
        return super.A0p(bundle);
    }
}

package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00E;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0AR;
import X.AnonymousClass0HM;
import X.AnonymousClass1MR;
import X.AnonymousClass1MS;
import X.AnonymousClass30O;
import X.C40281sw;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MatchPhoneNumberFragment extends CountryAndPhoneNumberFragment {
    public AnonymousClass1MR A00;
    public ActivityC004602e A01;
    public final AnonymousClass01I A02 = AnonymousClass01I.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass0AR A04 = AnonymousClass0AR.A00();
    public final AnonymousClass30O A05 = new C40281sw(this);
    public final AnonymousClass0HM A06 = AnonymousClass0HM.A00();

    public static void A01(ActivityC004602e r1) {
        DialogFragment dialogFragment = (DialogFragment) r1.A04().A0Q.A01("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A0r();
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.CountryAndPhoneNumberFragment
    public void A0a(Context context) {
        super.A0a(context);
        ActivityC004602e r4 = (ActivityC004602e) context;
        this.A01 = r4;
        AnonymousClass00E.A08(r4 instanceof AnonymousClass1MS, "activity needs to implement PhoneNumberMatchingCallback");
        ActivityC004602e r2 = this.A01;
        AnonymousClass1MS r1 = (AnonymousClass1MS) r2;
        if (this.A00 == null) {
            this.A00 = new AnonymousClass1MR(r2, r1);
        }
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        AnonymousClass0HM r0 = this.A06;
        r0.A0n.remove(this.A05);
        this.A00.removeMessages(4);
        ((CountryAndPhoneNumberFragment) this).A07 = null;
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        AnonymousClass0HM r0 = this.A06;
        r0.A0n.add(this.A05);
        ((CountryAndPhoneNumberFragment) this).A07 = this;
    }
}

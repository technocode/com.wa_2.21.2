package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass01X;
import X.AnonymousClass0HM;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1I0;
import X.AnonymousClass1I1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends WaDialogFragment {
    public final AnonymousClass00S A00 = AnonymousClass00S.A00();
    public final AnonymousClass00D A01 = AnonymousClass00D.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass0HM A03 = AnonymousClass0HM.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
            AnonymousClass01X r2 = this.A02;
            String A06 = r2.A06(R.string.post_registration_logout_dialog_message);
            AnonymousClass0MC r1 = r3.A01;
            r1.A0E = A06;
            r1.A0J = false;
            r3.A07(r2.A06(R.string.ok), new AnonymousClass1I0(this));
            r3.A05(r2.A06(R.string.post_registration_logout_dialog_negative_button), new AnonymousClass1I1(this));
            return r3.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            A0A.finish();
        }
    }
}

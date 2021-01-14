package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass03B;
import X.AnonymousClass18C;
import X.DialogC40161sj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends WaDialogFragment {
    public boolean A00 = true;
    public final AnonymousClass03B A01 = AnonymousClass03B.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        if (!this.A01.A04()) {
            A0w(false, false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        AnonymousClass01X r3 = this.A02;
        ActivityC004902h A0A = A0A();
        DialogC40161sj r1 = new DialogC40161sj(A0A, r3, this.A01, A0A);
        r1.setOnCancelListener(new AnonymousClass18C(A0A));
        return r1;
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        this.A00 = false;
        A0w(false, false);
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A0u(A0A().A04(), DisplayExceptionDialogFactory$ClockWrongDialogFragment.class.getName());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC004902h A0A;
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        if (this.A00 && (A0A = A0A()) != null) {
            A0A.finish();
        }
    }
}

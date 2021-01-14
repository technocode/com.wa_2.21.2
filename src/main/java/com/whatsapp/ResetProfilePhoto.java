package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2C0;
import X.DialogInterface$OnClickListenerC25951Iy;
import X.DialogInterface$OnClickListenerC25961Iz;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ResetProfilePhoto extends AnonymousClass2C0 {

    public class ConfirmDialogFragment extends WaDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X A00 = AnonymousClass01X.A00();
            Context A002 = A00();
            if (A002 != null) {
                AnonymousClass0MB r2 = new AnonymousClass0MB(A002);
                String A06 = A00.A06(R.string.remove_profile_photo_confirmation);
                AnonymousClass0MC r1 = r2.A01;
                r1.A0E = A06;
                r1.A0J = true;
                r2.A05(A00.A06(R.string.cancel), new DialogInterface$OnClickListenerC25961Iz(this));
                r2.A07(A00.A06(R.string.remove), new DialogInterface$OnClickListenerC25951Iy(this));
                return r2.A00();
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
                A0A.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.remove_profile_photo));
        if (bundle == null) {
            new ConfirmDialogFragment().A0u(A04(), null);
        }
    }
}

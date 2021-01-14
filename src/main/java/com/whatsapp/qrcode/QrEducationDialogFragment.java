package com.whatsapp.qrcode;

import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

public class QrEducationDialogFragment extends WaDialogFragment {
    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.qr_education_dialog_fragment, viewGroup, false);
        ((QrEducationView) inflate.findViewById(R.id.education)).A0C = false;
        inflate.findViewById(R.id.ok).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 12));
        return inflate;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(2, 2131952165);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        AnonymousClass037 r5 = this.A0D;
        if (r5 instanceof QrScanCodeFragment) {
            QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) r5;
            if (qrScanCodeFragment.A08) {
                qrScanCodeFragment.A08 = false;
                AnonymousClass008.A0n(qrScanCodeFragment.A0E, "contact_qr_education", false);
                AnonymousClass02M r0 = qrScanCodeFragment.A0D;
                r0.A02.postDelayed(qrScanCodeFragment.A0H, 15000);
            }
            qrScanCodeFragment.A07 = false;
        }
    }
}

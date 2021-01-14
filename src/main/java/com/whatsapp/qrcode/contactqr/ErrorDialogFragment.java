package com.whatsapp.qrcode.contactqr;

import X.AbstractC07290Ww;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ErrorDialogFragment extends WaDialogFragment {
    public AbstractC07290Ww A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public static ErrorDialogFragment A00(int i) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_ERROR_CODE", i);
        errorDialogFragment.A0N(bundle);
        return errorDialogFragment;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A00 = null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AbstractC07290Ww) {
            this.A00 = (AbstractC07290Ww) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("ARG_ERROR_CODE");
            AnonymousClass0MB r2 = new AnonymousClass0MB(A01());
            AnonymousClass01X r3 = this.A01;
            r2.A07(r3.A06(R.string.ok), null);
            if (i == 2) {
                String A06 = r3.A06(R.string.contact_qr_valid_unsupported_title);
                AnonymousClass0MC r1 = r2.A01;
                r1.A0I = A06;
                r1.A0E = r3.A06(R.string.contact_qr_valid_unsupported_subtitle_market);
            } else if (i == 3) {
                r2.A01.A0E = r3.A06(R.string.contact_qr_scan_no_connection);
            } else if (i == 4) {
                r2.A01.A0E = r3.A06(R.string.qr_scan_with_web_scanner);
            } else if (i == 5) {
                r2.A01.A0E = r3.A06(R.string.qr_scan_with_payments_scanner);
            } else if (i != 6) {
                r2.A01.A0E = r3.A06(R.string.contact_qr_scan_invalid_dialog);
            } else {
                r2.A01.A0E = r3.A06(R.string.contact_qr_scan_toast_no_valid_code);
            }
            return r2.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        AbstractC07290Ww r0 = this.A00;
        if (r0 != null) {
            r0.AIx();
        }
    }
}

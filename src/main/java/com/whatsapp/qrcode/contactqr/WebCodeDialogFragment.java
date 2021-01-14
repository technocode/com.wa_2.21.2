package com.whatsapp.qrcode.contactqr;

import X.AbstractC07290Ww;
import X.AnonymousClass0MB;
import X.C000300f;
import X.C015808q;
import X.DialogInterface$OnClickListenerC64842yt;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class WebCodeDialogFragment extends WaDialogFragment {
    public AbstractC07290Ww A00;
    public final C000300f A01 = C000300f.A00();
    public final C015808q A02 = C015808q.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        this.A00 = null;
        super.A0Y();
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
        AnonymousClass0MB r2 = new AnonymousClass0MB(A01());
        r2.A02(R.string.qr_dialog_title);
        r2.A01(R.string.qr_dialog_content);
        r2.A04(R.string.btn_continue, new DialogInterface$OnClickListenerC64842yt(this));
        r2.A03(R.string.cancel, null);
        return r2.A00();
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

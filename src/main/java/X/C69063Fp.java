package X;

import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;

/* renamed from: X.3Fp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69063Fp implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YI A00;

    public /* synthetic */ C69063Fp(AnonymousClass3YI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C63902xC r4 = (C63902xC) obj;
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00.A00;
        indiaUpiQrCodeScannedDialogFragment.A04.setVisibility(r4.A00);
        if (r4.A00 == 0) {
            ((TextView) indiaUpiQrCodeScannedDialogFragment.A01.findViewById(R.id.payment_amount_field)).setText(r4.A01);
        }
    }
}

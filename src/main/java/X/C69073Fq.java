package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.3Fq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69073Fq implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YI A00;

    public /* synthetic */ C69073Fq(AnonymousClass3YI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C63862x8 r5 = (C63862x8) obj;
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00.A00;
        if (indiaUpiQrCodeScannedDialogFragment != null) {
            int i = r5.A00;
            if (i == 0) {
                Intent intent = new Intent(indiaUpiQrCodeScannedDialogFragment.A0A(), IndiaUpiPaymentsAccountSetupActivity.class);
                intent.putExtra("extra_setup_mode", 1);
                Object A01 = indiaUpiQrCodeScannedDialogFragment.A0A.A06.A01();
                if (A01 != null) {
                    C28051Sr.A1M(intent, (C61992u4) A01);
                    indiaUpiQrCodeScannedDialogFragment.A0h(intent);
                    AnonymousClass037 r1 = ((AnonymousClass037) indiaUpiQrCodeScannedDialogFragment).A0D;
                    if (r1 instanceof DialogFragment) {
                        ((DialogFragment) r1).A0q();
                        return;
                    }
                    return;
                }
                throw null;
            } else if (i == 1) {
                Intent intent2 = new Intent(indiaUpiQrCodeScannedDialogFragment.A0A(), IndiaUpiQrCodeUrlValidationActivity.class);
                intent2.putExtra("ARG_URL", r5.A01);
                intent2.putExtra("external_payment_source", r5.A02);
                indiaUpiQrCodeScannedDialogFragment.A0h(intent2);
                AnonymousClass037 r12 = ((AnonymousClass037) indiaUpiQrCodeScannedDialogFragment).A0D;
                if (r12 instanceof DialogFragment) {
                    ((DialogFragment) r12).A0q();
                }
            } else if (i == 10) {
                indiaUpiQrCodeScannedDialogFragment.A02.setVisibility(8);
                indiaUpiQrCodeScannedDialogFragment.A09.setVisibility(0);
            }
        } else {
            throw null;
        }
    }
}

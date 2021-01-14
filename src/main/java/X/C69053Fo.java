package X;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69053Fo implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YI A00;

    public /* synthetic */ C69053Fo(AnonymousClass3YI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00.A00;
        int intValue = ((Number) obj).intValue();
        ProgressBar progressBar = indiaUpiQrCodeScannedDialogFragment.A06;
        int i = 0;
        int i2 = 8;
        if (intValue == 0) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        LinearLayout linearLayout = indiaUpiQrCodeScannedDialogFragment.A03;
        int i3 = 8;
        if (intValue == 1) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        TextView textView = indiaUpiQrCodeScannedDialogFragment.A09;
        if (intValue != 3) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}

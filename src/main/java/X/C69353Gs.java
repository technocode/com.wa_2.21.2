package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;

/* renamed from: X.3Gs  reason: invalid class name and case insensitive filesystem */
public class C69353Gs implements AbstractC64792yn {
    public final /* synthetic */ IndiaUpiQrCodeScanActivity A00;

    public C69353Gs(IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity) {
        this.A00 = indiaUpiQrCodeScanActivity;
    }

    @Override // X.AbstractC64792yn
    public void ADi(int i) {
        IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = this.A00;
        if (indiaUpiQrCodeScanActivity.A01.A04()) {
            ((ActivityC004702f) indiaUpiQrCodeScanActivity).A0F.A06(R.string.error_camera_disabled_during_video_call, 1);
        } else if (i != 2) {
            ((ActivityC004702f) indiaUpiQrCodeScanActivity).A0F.A06(R.string.cannot_start_camera, 1);
        }
        indiaUpiQrCodeScanActivity.finish();
    }

    @Override // X.AbstractC64792yn
    public void AIo() {
        IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = this.A00;
        indiaUpiQrCodeScanActivity.A00.A07(null, "indiaupiqractivity/previewready", null);
        ((AbstractActivityC29861aJ) indiaUpiQrCodeScanActivity).A07 = true;
        ((AbstractActivityC29861aJ) indiaUpiQrCodeScanActivity).A04.A04.setOneShotPreviewCallback(((AbstractActivityC29861aJ) indiaUpiQrCodeScanActivity).A08);
    }
}

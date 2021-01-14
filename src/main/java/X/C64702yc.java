package X;

import android.hardware.Camera;
import com.whatsapp.qrcode.QrScannerView;

/* renamed from: X.2yc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64702yc implements Camera.PreviewCallback {
    public final /* synthetic */ QrScannerView A00;

    public /* synthetic */ C64702yc(QrScannerView qrScannerView) {
        this.A00 = qrScannerView;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        QrScannerView qrScannerView = this.A00;
        Camera.PreviewCallback previewCallback = qrScannerView.A02;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        if (qrScannerView.A04 != null && bArr == qrScannerView.A0E) {
            qrScannerView.A04.addCallbackBuffer(bArr);
        }
    }
}

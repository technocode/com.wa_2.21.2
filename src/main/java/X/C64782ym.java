package X;

import android.hardware.Camera;
import android.os.Handler;
import com.whatsapp.qrcode.QrScannerView;

/* renamed from: X.2ym  reason: invalid class name and case insensitive filesystem */
public class C64782ym implements Camera.AutoFocusCallback {
    public final /* synthetic */ QrScannerView A00;

    public C64782ym(QrScannerView qrScannerView) {
        this.A00 = qrScannerView;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        AnonymousClass008.A1G("qrview/onAutoFocus ", z);
        QrScannerView qrScannerView = this.A00;
        Handler handler = qrScannerView.A05;
        if (handler != null) {
            handler.postDelayed(qrScannerView.A0D, 2000);
        } else {
            qrScannerView.postDelayed(qrScannerView.A0D, 2000);
        }
    }
}

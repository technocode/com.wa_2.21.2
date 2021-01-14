package X;

import android.hardware.Camera;
import com.whatsapp.qrcode.QrScannerView;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2yb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64692yb implements Camera.ErrorCallback {
    public final /* synthetic */ QrScannerView A00;

    public /* synthetic */ C64692yb(QrScannerView qrScannerView) {
        this.A00 = qrScannerView;
    }

    public final void onError(int i, Camera camera) {
        QrScannerView qrScannerView = this.A00;
        AnonymousClass008.A0w("qrview/startcamera camera error:", i);
        if (i == 100) {
            qrScannerView.A04();
            qrScannerView.A02();
            if (qrScannerView.A05 == null) {
                try {
                    qrScannerView.A04.setPreviewDisplay(qrScannerView.A0C);
                    qrScannerView.A00();
                } catch (IOException | RuntimeException e) {
                    Log.e("qrview/startcamera ", e);
                    Camera camera2 = qrScannerView.A04;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    qrScannerView.A04 = null;
                    qrScannerView.A01();
                }
            }
        } else if (i == 2) {
            qrScannerView.A04 = null;
            AbstractC64792yn r0 = qrScannerView.A06;
            if (r0 != null) {
                r0.ADi(i);
            }
        }
    }
}

package X;

import android.hardware.Camera;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.2yu  reason: invalid class name and case insensitive filesystem */
public class C64852yu implements Camera.PreviewCallback {
    public final /* synthetic */ QrScanCodeFragment A00;

    public C64852yu(QrScanCodeFragment qrScanCodeFragment) {
        this.A00 = qrScanCodeFragment;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.A00.A00.post(new RunnableEBaseShape9S0200000_I1_4(this, bArr, 7));
    }
}

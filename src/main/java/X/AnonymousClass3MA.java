package X;

import android.os.Vibrator;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;

/* renamed from: X.3MA  reason: invalid class name */
public class AnonymousClass3MA {
    public final /* synthetic */ DevicePairQrScannerActivity A00;

    public AnonymousClass3MA(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        this.A00 = devicePairQrScannerActivity;
    }

    public void A00() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A0D.A0F.A01()) {
            devicePairQrScannerActivity.A0G(R.string.logging_in_device);
        } else {
            devicePairQrScannerActivity.A0O(true);
        }
        Runnable runnable = devicePairQrScannerActivity.A01;
        if (runnable != null) {
            ((ActivityC004702f) devicePairQrScannerActivity).A04.removeCallbacks(runnable);
        }
        View view = ((ActivityC004702f) devicePairQrScannerActivity).A04;
        Runnable runnable2 = devicePairQrScannerActivity.A01;
        if (runnable2 == null) {
            runnable2 = new RunnableEBaseShape12S0100000_I1_7(devicePairQrScannerActivity, 8);
            devicePairQrScannerActivity.A01 = runnable2;
        }
        view.postDelayed(runnable2, 32000);
    }

    public void A01() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A0D.A0F.A01() || C28051Sr.A1p(((ActivityC004702f) devicePairQrScannerActivity).A0G)) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(devicePairQrScannerActivity);
            AnonymousClass01X r3 = devicePairQrScannerActivity.A09;
            String A06 = r3.A06(R.string.invalid_qr_code_title);
            AnonymousClass0MC r2 = r4.A01;
            r2.A0I = A06;
            r4.A07(r3.A06(R.string.ok), null);
            r2.A07 = new DialogInterface$OnDismissListenerC64682ya(this);
            r2.A0E = r3.A06(R.string.invalid_qr_code_description);
            r4.A00().show();
            return;
        }
        devicePairQrScannerActivity.A03.A0C(devicePairQrScannerActivity.A09.A0D(R.string.invalid_qr_code, "web.whatsapp.com"), 0);
        ((AbstractActivityC29861aJ) devicePairQrScannerActivity).A04.postDelayed(new RunnableEBaseShape12S0100000_I1_7(devicePairQrScannerActivity, 9), 3000);
    }

    public void A02() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A00.A00().A63() == null) {
            devicePairQrScannerActivity.A0V();
            ((Vibrator) devicePairQrScannerActivity.getSystemService("vibrator")).vibrate(75);
            devicePairQrScannerActivity.finish();
        }
    }

    public final void A03() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A0D.A0F.A01() || C28051Sr.A1p(((ActivityC004702f) devicePairQrScannerActivity).A0G)) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(devicePairQrScannerActivity);
            AnonymousClass01X r3 = devicePairQrScannerActivity.A09;
            String A06 = r3.A06(R.string.device_linking_failed_title);
            AnonymousClass0MC r2 = r4.A01;
            r2.A0I = A06;
            r4.A07(r3.A06(R.string.ok), null);
            r2.A07 = new DialogInterface$OnDismissListenerC64672yZ(this);
            r2.A0E = r3.A06(R.string.device_linking_failed_message);
            r4.A00().show();
            return;
        }
        devicePairQrScannerActivity.A03.A0C(devicePairQrScannerActivity.A09.A0D(R.string.invalid_qr_code, "web.whatsapp.com"), 1);
        devicePairQrScannerActivity.finish();
    }

    public void A04(int i) {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        AnonymousClass02M r4 = devicePairQrScannerActivity.A03;
        if (r4 != null) {
            devicePairQrScannerActivity.A0V();
            if (i != 403) {
                if (i == 419) {
                    r4.A0C(devicePairQrScannerActivity.A09.A06(R.string.error_message_max_device_paired), 1);
                    devicePairQrScannerActivity.finish();
                    return;
                } else if (i != 450) {
                    A03();
                    return;
                }
            }
            devicePairQrScannerActivity.A0U();
            r4.A02.postDelayed(devicePairQrScannerActivity.A0L, DevicePairQrScannerActivity.A0M);
            return;
        }
        throw null;
    }
}

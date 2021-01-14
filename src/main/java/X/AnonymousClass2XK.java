package X;

import android.content.Intent;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;

/* renamed from: X.2XK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2XK implements AnonymousClass1RJ {
    public final /* synthetic */ LinkedDevicesActivity A00;

    public /* synthetic */ AnonymousClass2XK(LinkedDevicesActivity linkedDevicesActivity) {
        this.A00 = linkedDevicesActivity;
    }

    @Override // X.AnonymousClass1RJ
    public final void AD9(boolean z) {
        LinkedDevicesActivity linkedDevicesActivity = this.A00;
        if (z) {
            linkedDevicesActivity.startActivity(new Intent(linkedDevicesActivity, DevicePairQrScannerActivity.class));
        }
    }
}

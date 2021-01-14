package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Gj  reason: invalid class name and case insensitive filesystem */
public final class C69263Gj implements AbstractC60932sE {
    @Override // X.AbstractC60932sE
    public void AGR() {
        Log.e(C018809u.A01("IndiaUpiDeviceBindActivity", "onGetChallengeFailure"));
    }

    @Override // X.AbstractC60932sE
    public void AGX(boolean z, C61072sS r4) {
        StringBuilder sb = new StringBuilder("onToken success: ");
        sb.append(z);
        sb.append(" error: ");
        sb.append(r4);
        Log.i(C018809u.A01("IndiaUpiDeviceBindActivity", sb.toString()));
    }

    @Override // X.AbstractC60932sE
    public void AJD(boolean z) {
        StringBuilder sb = new StringBuilder("/onRegisterApp registered: ");
        sb.append(z);
        Log.i(C018809u.A01("IndiaUpiDeviceBindActivity", sb.toString()));
    }
}

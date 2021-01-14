package X;

import android.content.DialogInterface;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC62132uI implements DialogInterface.OnDismissListener {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C69203Gd A01;

    public /* synthetic */ DialogInterface$OnDismissListenerC62132uI(C69203Gd r1, FingerprintBottomSheet fingerprintBottomSheet) {
        this.A01 = r1;
        this.A00 = fingerprintBottomSheet;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C69203Gd r0 = this.A01;
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        if (r0.A03.A0F.A02("FB", "PIN", false) != null) {
            if (fingerprintBottomSheet.A0U()) {
                C04080Iy r1 = new C04080Iy();
                fingerprintBottomSheet.A03 = r1;
                AbstractC41241ui r02 = fingerprintBottomSheet.A04;
                if (r02 != null) {
                    r02.A01(r1, fingerprintBottomSheet);
                }
            }
        } else if (fingerprintBottomSheet.A0U()) {
            fingerprintBottomSheet.A0r();
        }
    }
}

package X;

import android.content.DialogInterface;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.2uJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC62142uJ implements DialogInterface.OnDismissListener {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C69203Gd A01;

    public /* synthetic */ DialogInterface$OnDismissListenerC62142uJ(C69203Gd r1, FingerprintBottomSheet fingerprintBottomSheet) {
        this.A01 = r1;
        this.A00 = fingerprintBottomSheet;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C69203Gd r0 = this.A01;
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        r0.A03.A04.A0N.setText((CharSequence) null);
        if (fingerprintBottomSheet.A0U()) {
            fingerprintBottomSheet.A0r();
        }
    }
}

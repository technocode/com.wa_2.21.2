package X;

import android.content.DialogInterface;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.2uH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC62122uH implements DialogInterface.OnDismissListener {
    public final /* synthetic */ FingerprintBottomSheet A00;

    public /* synthetic */ DialogInterface$OnDismissListenerC62122uH(FingerprintBottomSheet fingerprintBottomSheet) {
        this.A00 = fingerprintBottomSheet;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        if (fingerprintBottomSheet.A0U()) {
            fingerprintBottomSheet.A0r();
        }
    }
}

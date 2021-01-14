package X;

import android.content.DialogInterface;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.2vt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC63122vt implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    public /* synthetic */ DialogInterface$OnDismissListenerC63122vt(PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A00 = pinBottomSheetDialogFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.A05.setText((CharSequence) null);
    }
}

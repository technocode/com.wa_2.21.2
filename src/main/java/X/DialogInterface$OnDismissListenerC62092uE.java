package X;

import android.content.DialogInterface;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.2uE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC62092uE implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ C69183Gb A01;

    public /* synthetic */ DialogInterface$OnDismissListenerC62092uE(C69183Gb r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = r1;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C69183Gb r0 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        r0.A00.A03.A04.A0N.setText((CharSequence) null);
        pinBottomSheetDialogFragment.A0r();
    }
}

package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3F1  reason: invalid class name */
public class AnonymousClass3F1 implements AbstractC26321Kk {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    public AnonymousClass3F1(PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A00 = pinBottomSheetDialogFragment;
    }

    @Override // X.AbstractC26321Kk
    public void AEJ(String str) {
        if (str.length() == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
            if (pinBottomSheetDialogFragment.A08 != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A0A.A05()) {
                pinBottomSheetDialogFragment.A08.AES(str);
            }
        }
    }

    @Override // X.AbstractC26321Kk
    public void AI2(String str) {
        if (str.length() == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
            if (pinBottomSheetDialogFragment.A08 != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A0A.A05()) {
                pinBottomSheetDialogFragment.A08.AES(str);
            }
        }
    }
}

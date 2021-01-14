package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3HN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HN implements AbstractC61922tx {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AnonymousClass3HO A01;

    public /* synthetic */ AnonymousClass3HN(AnonymousClass3HO r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = r1;
        this.A00 = pinBottomSheetDialogFragment;
    }

    @Override // X.AbstractC61922tx
    public final void AJZ(C61072sS r6) {
        AnonymousClass3HO r2 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A0z();
        if (r6 == null) {
            r2.A01.A06.ANy(false);
            pinBottomSheetDialogFragment.A0w(false, false);
            return;
        }
        int i = r6.code;
        if (i == 1440) {
            pinBottomSheetDialogFragment.A11(r6.remainingRetries);
        } else if (i == 1441) {
            pinBottomSheetDialogFragment.A12(r6.nextAttemptTs * 1000, true);
        } else {
            r2.A01.A00(pinBottomSheetDialogFragment, i).show();
        }
    }
}

package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3Gb  reason: invalid class name and case insensitive filesystem */
public class C69183Gb implements AbstractC61542tL {
    public final /* synthetic */ C69193Gc A00;

    public C69183Gb(C69193Gc r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC61542tL
    public void AFb(C61072sS r12) {
        C69193Gc r1 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r1.A02;
        pinBottomSheetDialogFragment.A0z();
        int i = r12.code;
        if (i == 454) {
            BrazilPaymentActivity brazilPaymentActivity = r1.A03;
            BrazilPaymentActivity.A07(brazilPaymentActivity, r12);
            BrazilPaymentActivity.A05(brazilPaymentActivity, pinBottomSheetDialogFragment);
        } else if (i == 1440) {
            pinBottomSheetDialogFragment.A11(r12.remainingRetries);
        } else if (i != 1441) {
            BrazilPaymentActivity brazilPaymentActivity2 = r1.A03;
            new AnonymousClass3DQ(((AnonymousClass2C0) brazilPaymentActivity2).A01, brazilPaymentActivity2.A0E).A02(brazilPaymentActivity2, i, brazilPaymentActivity2.A05.A08(brazilPaymentActivity2.A07.A02(((AbstractActivityC34761jB) brazilPaymentActivity2).A03), false), new DialogInterface$OnDismissListenerC62092uE(this, pinBottomSheetDialogFragment), new DialogInterface$OnDismissListenerC62112uG(pinBottomSheetDialogFragment), new DialogInterface$OnDismissListenerC62102uF(pinBottomSheetDialogFragment)).show();
        } else {
            pinBottomSheetDialogFragment.A12(r12.nextAttemptTs * 1000, true);
        }
    }

    @Override // X.AbstractC61542tL
    public void AJc(String str) {
        C69193Gc r1 = this.A00;
        r1.A02.A0z();
        BrazilPaymentActivity.A08(r1.A03, r1.A04, r1.A00, r1.A01, str, r1.A05);
    }
}

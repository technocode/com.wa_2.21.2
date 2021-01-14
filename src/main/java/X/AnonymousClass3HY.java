package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.3HY  reason: invalid class name */
public class AnonymousClass3HY {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AbstractC63192w0 A01;

    public AnonymousClass3HY(AbstractC63192w0 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = r1;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void A00(C61072sS r6) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A0z();
        }
        StringBuilder sb = new StringBuilder("PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ");
        sb.append(r6);
        Log.e(sb.toString());
        int i = r6.code;
        if (i == 1441) {
            AbstractC63192w0 r3 = this.A01;
            r3.A0G.A03(r6.nextAttemptTs);
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A12(r6.nextAttemptTs * 1000, true);
            } else {
                AbstractC63192w0.A00(r3);
            }
        } else if (i == 1440) {
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A11(r6.remainingRetries);
            } else {
                AbstractC63192w0.A00(this.A01);
            }
        } else if (i == 455) {
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A0r();
            }
            this.A01.A01();
        } else {
            if (i == 1448) {
                this.A01.A0E.A04("FB", "PIN", r6);
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A0r();
            }
            AbstractC63192w0.A00(this.A01);
        }
    }
}

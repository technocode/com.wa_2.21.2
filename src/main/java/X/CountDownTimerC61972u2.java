package X;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.2u2  reason: invalid class name and case insensitive filesystem */
public class CountDownTimerC61972u2 extends CountDownTimer {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownTimerC61972u2(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        super(j, 1000);
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void onFinish() {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A01 = null;
        pinBottomSheetDialogFragment.A04.setVisibility(4);
        pinBottomSheetDialogFragment.A05.setErrorState(false);
        pinBottomSheetDialogFragment.A05.setEnabled(true);
    }

    public void onTick(long j) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        TextView textView = pinBottomSheetDialogFragment.A04;
        AnonymousClass01X r4 = pinBottomSheetDialogFragment.A0B;
        textView.setText(r4.A0D(R.string.payment_pin_timeout, C002001d.A1W(r4, j / 1000)));
    }
}

package X;

import android.os.CountDownTimer;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.FingerprintView;

/* renamed from: X.1Px  reason: invalid class name */
public class AnonymousClass1Px extends CountDownTimer {
    public final /* synthetic */ int A00 = R.string.payment_pin_timeout;
    public final /* synthetic */ long A01;
    public final /* synthetic */ FingerprintBottomSheet A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Px(FingerprintBottomSheet fingerprintBottomSheet, long j, long j2) {
        super(j, 1000);
        this.A02 = fingerprintBottomSheet;
        this.A01 = j2;
    }

    public void onFinish() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        if (this.A01 <= fingerprintBottomSheet.A07.A05()) {
            fingerprintBottomSheet.A0z();
        }
    }

    public void onTick(long j) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        FingerprintView fingerprintView = fingerprintBottomSheet.A05;
        if (fingerprintView != null) {
            AnonymousClass01X r5 = fingerprintBottomSheet.A08;
            fingerprintView.A03(r5.A0D(this.A00, C002001d.A1W(r5, j / 1000)));
        }
    }
}

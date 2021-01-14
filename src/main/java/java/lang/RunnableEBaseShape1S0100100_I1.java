package java.lang;

import X.AnonymousClass0JW;
import X.AnonymousClass2FF;
import X.AnonymousClass2X5;
import X.AnonymousClass2XP;
import X.AnonymousClass2XR;
import X.AnonymousClass2XS;
import X.AnonymousClass34P;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;

public class RunnableEBaseShape1S0100100_I1 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape1S0100100_I1(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    public final void run() {
        switch (this.A02) {
            case 0:
                AnonymousClass2X5 r4 = (AnonymousClass2X5) this.A01;
                long j = this.A00;
                ChatInfoActivity chatInfoActivity = (ChatInfoActivity) r4.A09.get();
                if (chatInfoActivity != null && !((AnonymousClass0JW) r4).A00.isCancelled()) {
                    chatInfoActivity.A0a(j);
                    return;
                }
                return;
            case 1:
                AnonymousClass2X5 r42 = (AnonymousClass2X5) this.A01;
                long j2 = this.A00;
                ChatInfoActivity chatInfoActivity2 = (ChatInfoActivity) r42.A09.get();
                if (chatInfoActivity2 != null && !((AnonymousClass0JW) r42).A00.isCancelled()) {
                    chatInfoActivity2.A0b(j2);
                    return;
                }
                return;
            case 2:
                AnonymousClass2XS r0 = (AnonymousClass2XS) this.A01;
                long j3 = this.A00;
                AnonymousClass2XP r6 = r0.A05;
                AnonymousClass2FF r7 = r0.A00;
                AnonymousClass2XR r2 = r6.A00;
                if (j3 <= r2.A03.A00() + 86400) {
                    r2.A0D.A00();
                    r2.A0E.ANF(new RunnableEBaseShape1S0200100_I1(r6, r7, j3, 0));
                    return;
                }
                DevicePairQrScannerActivity devicePairQrScannerActivity = r2.A0D.A00;
                devicePairQrScannerActivity.A03.A0C(devicePairQrScannerActivity.A09.A06(R.string.companion_device_time_incorrect_error), 1);
                return;
            case 3:
                AnonymousClass34P r22 = (AnonymousClass34P) this.A01;
                long j4 = this.A00;
                synchronized (r22) {
                    r22.A00 = j4;
                }
                return;
            default:
                return;
        }
    }
}

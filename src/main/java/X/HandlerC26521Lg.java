package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1Lg  reason: invalid class name and case insensitive filesystem */
public class HandlerC26521Lg extends Handler {
    public final /* synthetic */ C26621Lq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC26521Lg(C26621Lq r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        AbstractC26561Lk r0 = this.A00.A0B;
        if (r0 != null) {
            r0.ADI();
            sendEmptyMessageDelayed(0, (long) C26621Lq.A0V);
        }
    }
}

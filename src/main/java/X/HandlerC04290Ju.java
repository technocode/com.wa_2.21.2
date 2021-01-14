package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Ju  reason: invalid class name and case insensitive filesystem */
public class HandlerC04290Ju extends Handler {
    public final /* synthetic */ C04260Jr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC04290Ju(C04260Jr r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        this.A00.A01();
    }
}

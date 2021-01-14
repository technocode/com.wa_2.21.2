package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Wc  reason: invalid class name and case insensitive filesystem */
public class HandlerC07150Wc extends Handler {
    public final AnonymousClass0JQ A00;
    public final AnonymousClass0IY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC07150Wc(Looper looper, AnonymousClass0JQ r3, AnonymousClass0IY r4) {
        super(looper);
        if (looper != null) {
            this.A00 = r3;
            this.A01 = r4;
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        if (!this.A01.A00) {
            this.A00.A02(true);
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Ca  reason: invalid class name and case insensitive filesystem */
public class HandlerC02440Ca extends Handler {
    public final /* synthetic */ AnonymousClass0CT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC02440Ca(AnonymousClass0CT r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 0) {
            this.A00.A04();
        }
    }
}

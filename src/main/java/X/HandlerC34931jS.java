package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jS  reason: invalid class name and case insensitive filesystem */
public final class HandlerC34931jS extends HandlerC04640Ld {
    public final /* synthetic */ C34881jN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC34931jS(C34881jN r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C34881jN r3 = this.A00;
            Lock lock = r3.A0L;
            lock.lock();
            try {
                if (r3.A07()) {
                    r3.A0G.A08 = true;
                    r3.A03.connect();
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C34881jN.A01(this.A00);
        }
    }
}

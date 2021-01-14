package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0mt  reason: invalid class name and case insensitive filesystem */
public class C14790mt implements Handler.Callback {
    public final /* synthetic */ AnonymousClass0NP A00;

    public C14790mt(AnonymousClass0NP r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            AnonymousClass0NP r2 = this.A00;
            synchronized (r2.A06) {
                if (r2.A02.hasMessages(1)) {
                    return true;
                }
                r2.A03.quit();
                r2.A03 = null;
                r2.A02 = null;
                return true;
            }
        } else if (i != 1) {
            return true;
        } else {
            AnonymousClass0NP r6 = this.A00;
            Runnable runnable = (Runnable) message.obj;
            if (r6 != null) {
                runnable.run();
                synchronized (r6.A06) {
                    r6.A02.removeMessages(0);
                    Handler handler = r6.A02;
                    handler.sendMessageDelayed(handler.obtainMessage(0), (long) r6.A04);
                }
                return true;
            }
            throw null;
        }
    }
}

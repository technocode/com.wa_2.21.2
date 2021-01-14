package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.0oV  reason: invalid class name and case insensitive filesystem */
public class HandlerC15690oV extends Handler {
    public HandlerC15690oV() {
        super(Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        C15680oU r2 = (C15680oU) message.obj;
        int i = message.what;
        if (i == 1) {
            AbstractC15710oX r5 = r2.A00;
            Object obj = r2.A01[0];
            if (r5.A02.get()) {
                RunnableC30321b8 r22 = (RunnableC30321b8) r5;
                try {
                    r22.A01.A07(r22, obj);
                } finally {
                    r22.A00.countDown();
                }
            } else {
                RunnableC30321b8 r3 = (RunnableC30321b8) r5;
                try {
                    AbstractC30331b9 r23 = r3.A01;
                    if (r23.A03 != r3) {
                        r23.A07(r3, obj);
                    } else if (((C15650oR) r23).A02) {
                        r23.A08(obj);
                    } else {
                        r23.A04 = false;
                        r23.A00 = SystemClock.uptimeMillis();
                        r23.A03 = null;
                        r23.A03(obj);
                    }
                } finally {
                    r3.A00.countDown();
                }
            }
            r5.A04 = EnumC15700oW.FINISHED;
        } else if (i == 2 && r2.A00 == null) {
            throw null;
        }
    }
}

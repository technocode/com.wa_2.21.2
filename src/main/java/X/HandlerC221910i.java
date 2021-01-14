package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* renamed from: X.10i  reason: invalid class name and case insensitive filesystem */
public class HandlerC221910i extends Handler {
    public final /* synthetic */ SystemCounterThread A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC221910i(SystemCounterThread systemCounterThread, Looper looper) {
        super(looper);
        this.A00 = systemCounterThread;
    }

    public void handleMessage(Message message) {
        SystemCounterThread systemCounterThread = this.A00;
        int i = message.what;
        int i2 = message.arg1;
        synchronized (systemCounterThread) {
            if (systemCounterThread.mEnabled) {
                if (i == 1) {
                    systemCounterThread.mSystemCounterLogger.A02();
                    systemCounterThread.logCounters();
                } else if (i == 2) {
                    systemCounterThread.logHighFrequencyThreadCounters();
                } else {
                    throw new IllegalArgumentException("Unknown message type");
                }
                systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i, i2, 0), (long) i2);
            }
        }
    }
}

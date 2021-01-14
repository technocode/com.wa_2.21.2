package X;

import android.os.MessageQueue;
import com.facebook.msys.mci.ExecutionIdle;

/* renamed from: X.0MZ  reason: invalid class name */
public final class AnonymousClass0MZ implements MessageQueue.IdleHandler {
    public boolean queueIdle() {
        ExecutionIdle.nativeMaybeDelayIdleQueueAdvanceCallback();
        return true;
    }
}

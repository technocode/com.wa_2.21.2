package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.09B  reason: invalid class name */
public class AnonymousClass09B extends Handler {
    public AnonymousClass09B(Looper looper) {
        super(looper);
    }

    public void dispatchMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        super.dispatchMessage(message);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 > 1000) {
            StringBuilder A0S = AnonymousClass008.A0S("AsyncCommitManager/dispatching id: ");
            A0S.append(message.arg1);
            A0S.append(" msg:");
            A0S.append(message.getCallback());
            A0S.append(" took:");
            AnonymousClass008.A1P(A0S, uptimeMillis2);
        }
    }
}

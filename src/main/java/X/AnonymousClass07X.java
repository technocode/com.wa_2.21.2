package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.07X  reason: invalid class name */
public class AnonymousClass07X implements Executor {
    public final Handler A00;

    public AnonymousClass07X(Handler handler) {
        this.A00 = handler;
    }

    public void execute(Runnable runnable) {
        Handler handler = this.A00;
        if (!handler.post(runnable)) {
            StringBuilder sb = new StringBuilder();
            sb.append(handler);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }
}

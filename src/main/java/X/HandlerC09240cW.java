package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0cW  reason: invalid class name and case insensitive filesystem */
public class HandlerC09240cW extends Handler {
    public final /* synthetic */ C09200cS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC09240cW(C09200cS r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            C09200cS r5 = this.A00;
            C09250cY r6 = r5.A0L;
            StringBuilder sb = new StringBuilder("app/startOutgoingCall/WHAT_START_PENDING_INTENT ");
            sb.append(r6);
            Log.i(sb.toString());
            if (r6 != null) {
                long j = r5.A00;
                if (j > 0) {
                    r6.A00 = SystemClock.elapsedRealtime() - j;
                }
                r5.A0I.ANF(new RunnableEBaseShape4S0200000_I0_3(r5, r6, 19));
                r5.A0L = null;
            }
        }
    }
}

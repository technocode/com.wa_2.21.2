package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.389  reason: invalid class name */
public final /* synthetic */ class AnonymousClass389 implements Handler.Callback {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public /* synthetic */ AnonymousClass389(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass3U7 r2 = this.A00;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            if (AnonymousClass0Fh.A01()) {
                return true;
            }
            r2.A0N();
            return true;
        } else if (AnonymousClass0Fh.A01()) {
            return true;
        } else {
            if (AnonymousClass3U7.A2I.get() > 0) {
                r2.A0G();
                return true;
            }
            Log.i("voip/service/stopSelfHandler stopSelf now");
            r2.A15 = true;
            r2.A1y.A00.obtainMessage(2).sendToTarget();
            return true;
        }
    }
}

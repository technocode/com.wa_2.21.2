package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0Wi  reason: invalid class name and case insensitive filesystem */
public final class HandlerC07210Wi extends Handler {
    public final WeakReference A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC07210Wi(Looper looper, WeakReference weakReference) {
        super(looper);
        if (looper != null) {
            this.A00 = weakReference;
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A00.get();
        if (activity == null) {
            removeMessages(1);
        } else if (message.what == 1) {
            Log.e("verifymsgstorehelper/timeout");
            removeMessages(1);
            C002001d.A2O(activity, 200);
        }
    }
}

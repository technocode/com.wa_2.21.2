package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.1j7  reason: invalid class name and case insensitive filesystem */
public class HandlerC34731j7 extends HandlerC04640Ld {
    public HandlerC34731j7(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            try {
                ((AnonymousClass17D) pair.first).AJX((AnonymousClass17C) pair.second);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", AnonymousClass008.A08(45, "Don't know how to handle message: ", i), new Exception());
        } else {
            ((BasePendingResult) message.obj).A08(Status.A08);
        }
    }
}

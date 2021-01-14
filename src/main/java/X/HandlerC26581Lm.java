package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.SoftReference;

/* renamed from: X.1Lm  reason: invalid class name and case insensitive filesystem */
public final class HandlerC26581Lm extends Handler {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC26581Lm(Looper looper) {
        super(looper);
        if (looper != null) {
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            int i = message.arg1;
            if (obj instanceof Drawable) {
                C26621Lq.A0X.put(i, new SoftReference(obj));
                return;
            }
            C26571Ll r4 = (C26571Ll) obj;
            Drawable drawable = (Drawable) r4.getTag();
            C26621Lq.A0X.put(i, new SoftReference(drawable));
            if (r4.A00 == i) {
                r4.A03 = drawable;
                r4.invalidate();
            }
        }
    }
}

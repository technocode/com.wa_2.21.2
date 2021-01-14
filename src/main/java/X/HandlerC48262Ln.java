package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.2Ln  reason: invalid class name and case insensitive filesystem */
public final class HandlerC48262Ln extends Handler {
    public final /* synthetic */ DeepLinkActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC48262Ln(DeepLinkActivity deepLinkActivity, Looper looper) {
        super(looper);
        this.A00 = deepLinkActivity;
        if (looper != null) {
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        int i = message.arg1;
        if (i != 0) {
            this.A00.APv(0, i);
        }
    }
}

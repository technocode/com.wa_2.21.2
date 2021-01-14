package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0ay  reason: invalid class name and case insensitive filesystem */
public class HandlerC08360ay extends Handler {
    public final /* synthetic */ AnonymousClass0YW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC08360ay(AnonymousClass0YW r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        AnonymousClass0YW r1 = this.A00;
        if (r1.A0N.AB7() && !r1.A0N.ABT() && !r1.A0L.AB1()) {
            r1.A08();
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.117  reason: invalid class name */
public class AnonymousClass117 extends Handler {
    public final /* synthetic */ AnonymousClass118 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass117(AnonymousClass118 r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 99) {
            this.A00.A00();
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Unknown message: ");
        A0S.append(i);
        throw new RuntimeException(A0S.toString());
    }
}

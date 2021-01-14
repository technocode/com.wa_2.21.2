package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.1Dt  reason: invalid class name */
public class AnonymousClass1Dt implements Handler.Callback {
    public final /* synthetic */ AnonymousClass1Dw A00;

    public AnonymousClass1Dt(AnonymousClass1Dw r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        AnonymousClass1Dw r3 = this.A00;
        AnonymousClass1Dv r2 = (AnonymousClass1Dv) message.obj;
        synchronized (r3.A03) {
            if (r3.A00 == r2 || r3.A01 == r2) {
                r3.A06(r2, 2);
            }
        }
        return true;
    }
}

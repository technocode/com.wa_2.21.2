package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.32Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32Q implements Handler.Callback {
    public final /* synthetic */ AnonymousClass3PV A00;

    public /* synthetic */ AnonymousClass32Q(AnonymousClass3PV r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass3PV r1 = this.A00;
        r1.A02.A02();
        AnonymousClass37I r0 = ((AnonymousClass37M) r1).A01;
        if (r0 == null) {
            return true;
        }
        r0.AEU(r1);
        return true;
    }
}

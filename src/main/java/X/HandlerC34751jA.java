package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.1jA  reason: invalid class name and case insensitive filesystem */
public final class HandlerC34751jA extends HandlerC04640Ld {
    public final /* synthetic */ AnonymousClass17O A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC34751jA(AnonymousClass17O r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        C001801b.A1Y(z);
        AnonymousClass17O r0 = this.A00;
        AnonymousClass17N r1 = (AnonymousClass17N) message.obj;
        Object obj = r0.A02;
        if (obj != null) {
            try {
                r1.ACV(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }
}

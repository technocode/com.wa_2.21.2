package X;

import android.os.MessageQueue;
import com.whatsapp.AbstractAppShell;

/* renamed from: X.01o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C003101o implements MessageQueue.IdleHandler {
    public final /* synthetic */ AbstractAppShell A00;

    public /* synthetic */ C003101o(AbstractAppShell abstractAppShell) {
        this.A00 = abstractAppShell;
    }

    public final boolean queueIdle() {
        return this.A00.lambda$onCreate$4$AbstractAppShell();
    }
}

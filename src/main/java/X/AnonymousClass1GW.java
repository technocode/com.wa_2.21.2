package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: X.1GW  reason: invalid class name */
public class AnonymousClass1GW extends Handler {
    public final /* synthetic */ AnonymousClass276 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1GW(AnonymousClass276 r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        AbstractC009505y r4 = (AbstractC009505y) message.obj;
        ArrayList arrayList = new ArrayList();
        AnonymousClass276 r2 = this.A00;
        AnonymousClass2AX r1 = r2.A03;
        if (arrayList.size() == 0) {
            arrayList.add(C008805h.A0T(r1));
            C008805h.A0P(r4, new C010106g(arrayList), r2.A06);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}

package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.1Uf  reason: invalid class name and case insensitive filesystem */
public class CallableC28411Uf implements Callable {
    public final C001000o A00;
    public final DeviceJid A01;

    public CallableC28411Uf(DeviceJid deviceJid, C001000o r2) {
        this.A01 = deviceJid;
        this.A00 = r2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.A00.A0A(C001801b.A0A(this.A01));
    }
}

package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.01q  reason: invalid class name and case insensitive filesystem */
public class C003301q extends AbstractC003401r {
    public static final C003301q A02 = new C003301q();
    public AnonymousClass0JF A00;
    public final Object A01 = new Object();

    public AnonymousClass0JF A02() {
        AnonymousClass0JF r0;
        synchronized (this.A01) {
            r0 = this.A00;
        }
        return r0;
    }

    public void A03(AnonymousClass0JF r4) {
        Log.d("ConnectivityStateProvider/notifyConnectivityChanged");
        AnonymousClass00E.A01();
        synchronized (this.A01) {
            this.A00 = r4;
        }
        Iterator it = super.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AbstractC000900m) r1.next()).AEa(r4);
            } else {
                return;
            }
        }
    }
}

package X;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.1So  reason: invalid class name and case insensitive filesystem */
public class C28031So {
    public boolean A00 = true;
    public final Queue A01 = new LinkedList();

    public void A00(Runnable runnable) {
        AnonymousClass008.A1Z(AnonymousClass008.A0S("BloksCallbackQueue/run/active="), this.A00);
        if (this.A00) {
            runnable.run();
        } else {
            this.A01.add(runnable);
        }
    }
}

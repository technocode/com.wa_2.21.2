package X;

import java.util.concurrent.Callable;

/* renamed from: X.0ys  reason: invalid class name and case insensitive filesystem */
public class CallableC21520ys implements Callable {
    public final /* synthetic */ C33171gJ A00;

    public CallableC21520ys(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        int i;
        C33171gJ r4 = this.A00;
        if (r4.isConnected()) {
            r4.A07();
            if (r4.A0g != null) {
                C32451ey r3 = r4.A0g;
                int i2 = r4.A00;
                if (i2 == 1) {
                    i = 90;
                } else if (i2 != 2) {
                    i = 270;
                    if (i2 != 3) {
                        i = 0;
                    }
                } else {
                    i = 180;
                }
                r3.A02(i);
            }
            return new C21960zc(r4.A0E, r4.A5B(), r4.A04());
        }
        throw new C21100yB("Can not update preview display rotation");
    }
}

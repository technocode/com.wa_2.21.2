package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.1eT  reason: invalid class name and case insensitive filesystem */
public class C32181eT {
    public static final AbstractRunnableC19430v0 A02 = new C32171eS();
    public final BlockingQueue A00 = new DelayQueue();
    public final C19420uz[] A01;

    public C32181eT(int i) {
        this.A01 = new C19420uz[i];
        int i2 = 0;
        while (true) {
            C19420uz[] r1 = this.A01;
            if (i2 < r1.length) {
                r1[i2] = new C19420uz(this);
                C19420uz r2 = this.A01[i2];
                StringBuilder sb = new StringBuilder("GCD-Thread #");
                sb.append(i2);
                r2.setName(sb.toString());
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}

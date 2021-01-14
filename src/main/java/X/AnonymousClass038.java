package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.038  reason: invalid class name */
public class AnonymousClass038 {
    public static volatile AnonymousClass038 A04;
    public final AnonymousClass03M A00 = new AnonymousClass03M();
    public final AnonymousClass03M A01 = new AnonymousClass03M();
    public final AnonymousClass03J A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public AnonymousClass038(AnonymousClass03J r3) {
        this.A02 = r3;
    }

    public static AnonymousClass038 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass038.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass038(AnonymousClass03J.A00());
                }
            }
        }
        return A04;
    }

    public void A01(int i) {
        if (i != 2) {
            this.A02.A01.A00();
        } else {
            this.A02.A02.A00();
        }
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A02(int i, Object obj, int i2) {
        if (i2 == 1 || i2 == 0) {
            this.A00.A01(i, obj);
        } else {
            this.A01.A01(i, obj);
        }
    }

    public void A03(int i, Object obj, int i2) {
        AnonymousClass03J r5 = this.A02;
        if (r5.A00.A05 == Thread.currentThread().getId()) {
            A02(i, obj, i2);
        } else if (i2 != 2) {
            r5.A01.execute(new RunnableEBaseShape0S0202000_I0(this, i2, i, obj, 0));
        } else {
            r5.A02.execute(new RunnableEBaseShape0S0202000_I0(this, i2, i, obj, 1));
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1Dw  reason: invalid class name */
public class AnonymousClass1Dw {
    public static AnonymousClass1Dw A04;
    public AnonymousClass1Dv A00;
    public AnonymousClass1Dv A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new AnonymousClass1Dt(this));
    public final Object A03 = new Object();

    public static AnonymousClass1Dw A00() {
        AnonymousClass1Dw r0 = A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1Dw r02 = new AnonymousClass1Dw();
        A04 = r02;
        return r02;
    }

    public final void A01() {
        AnonymousClass1Dv r0 = this.A01;
        if (r0 != null) {
            this.A00 = r0;
            this.A01 = null;
            AbstractC24961Du r02 = (AbstractC24961Du) r0.A02.get();
            if (r02 != null) {
                r02.APf();
            } else {
                this.A00 = null;
            }
        }
    }

    public void A02(AbstractC24961Du r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                AnonymousClass1Dv r1 = this.A00;
                if (!r1.A01) {
                    r1.A01 = true;
                    this.A02.removeCallbacksAndMessages(r1);
                }
            }
        }
    }

    public void A03(AbstractC24961Du r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                AnonymousClass1Dv r1 = this.A00;
                if (r1.A01) {
                    r1.A01 = false;
                    A04(r1);
                }
            }
        }
    }

    public final void A04(AnonymousClass1Dv r5) {
        int i = r5.A00;
        if (i != -2) {
            int i2 = 2750;
            if (i == -1) {
                i2 = 1500;
            }
            Handler handler = this.A02;
            handler.removeCallbacksAndMessages(r5);
            handler.sendMessageDelayed(Message.obtain(handler, 0, r5), (long) i2);
        }
    }

    public final boolean A05(AbstractC24961Du r3) {
        AnonymousClass1Dv r0 = this.A00;
        if (r0 == null || r3 == null || r0.A02.get() != r3) {
            return false;
        }
        return true;
    }

    public final boolean A06(AnonymousClass1Dv r3, int i) {
        AbstractC24961Du r1 = (AbstractC24961Du) r3.A02.get();
        if (r1 == null) {
            return false;
        }
        this.A02.removeCallbacksAndMessages(r3);
        r1.A3n(i);
        return true;
    }
}

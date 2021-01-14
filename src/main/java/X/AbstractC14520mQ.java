package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.0mQ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC14520mQ {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public AbstractC14520mQ(ComponentName componentName) {
        this.A02 = componentName;
    }

    public void A00() {
        if (this instanceof C29911aP) {
            C29911aP r3 = (C29911aP) this;
            synchronized (r3) {
                if (r3.A01) {
                    if (r3.A00) {
                        r3.A03.acquire(60000);
                    }
                    r3.A01 = false;
                    r3.A04.release();
                }
            }
        }
    }

    public void A01(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 != i) {
            StringBuilder A0T = AnonymousClass008.A0T("Given job ID ", i, " is different than previous ");
            A0T.append(i2);
            throw new IllegalArgumentException(A0T.toString());
        }
    }

    public void A02(Intent intent) {
        C29911aP r3 = (C29911aP) this;
        Intent intent2 = new Intent(intent);
        intent2.setComponent(((AbstractC14520mQ) r3).A02);
        if (r3.A02.startService(intent2) != null) {
            synchronized (r3) {
                if (!r3.A00) {
                    r3.A00 = true;
                    if (!r3.A01) {
                        r3.A03.acquire(60000);
                    }
                }
            }
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.13v  reason: invalid class name and case insensitive filesystem */
public final class C229513v {
    public final int A00;
    public final C229113r A01;
    public final CopyOnWriteArrayList A02;

    public C229513v() {
        this.A02 = new CopyOnWriteArrayList();
        this.A00 = 0;
        this.A01 = null;
    }

    public C229513v(CopyOnWriteArrayList copyOnWriteArrayList, int i, C229113r r3) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r3;
    }

    public static final void A00(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final long A01(long j) {
        long A012 = AnonymousClass11u.A01(j);
        if (A012 != -9223372036854775807L) {
            return 0 + A012;
        }
        return -9223372036854775807L;
    }

    public void A02() {
        C229113r r5 = this.A01;
        if (r5 != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C229413u r0 = (C229413u) it.next();
                A00(r0.A00, new RunnableEBaseShape2S0300000_I1(this, r0.A01, r5, 7));
            }
            return;
        }
        throw null;
    }

    public void A03() {
        C229113r r5 = this.A01;
        if (r5 != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C229413u r0 = (C229413u) it.next();
                A00(r0.A00, new RunnableEBaseShape2S0300000_I1(this, r0.A01, r5, 9));
            }
            return;
        }
        throw null;
    }

    public void A04() {
        C229113r r5 = this.A01;
        if (r5 != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C229413u r0 = (C229413u) it.next();
                A00(r0.A00, new RunnableEBaseShape2S0300000_I1(this, r0.A01, r5, 8));
            }
            return;
        }
        throw null;
    }

    public void A05(C229613w r9, C229713x r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C229413u r0 = (C229413u) it.next();
            A00(r0.A00, new RunnableEBaseShape1S0400000_I1(this, r10, r0.A01, r9, 2));
        }
    }

    public void A06(C229613w r9, C229713x r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C229413u r0 = (C229413u) it.next();
            A00(r0.A00, new RunnableEBaseShape1S0400000_I1(this, r10, r0.A01, r9, 3));
        }
    }

    public void A07(C229613w r9, C229713x r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C229413u r0 = (C229413u) it.next();
            A00(r0.A00, new RunnableEBaseShape1S0400000_I1(this, r10, r0.A01, r9, 4));
        }
    }

    public void A08(C229613w r11, C229713x r12, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C229413u r0 = (C229413u) it.next();
            A00(r0.A00, new RunnableEBaseShape1S0510000_I1(this, r0.A01, r11, r12, iOException, z, 0));
        }
    }

    public void A09(C229713x r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C229413u r0 = (C229413u) it.next();
            A00(r0.A00, new RunnableEBaseShape2S0300000_I1(this, r0.A01, r6, 6));
        }
    }
}

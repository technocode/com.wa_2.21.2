package com.google.android.gms.common.api.internal;

import X.AbstractC236917d;
import X.AnonymousClass178;
import X.AnonymousClass179;
import X.AnonymousClass17A;
import X.AnonymousClass17C;
import X.AnonymousClass17D;
import X.AnonymousClass17h;
import X.AnonymousClass260;
import X.AnonymousClass263;
import X.AnonymousClass2AQ;
import X.AnonymousClass2AR;
import X.AnonymousClass2AT;
import X.AnonymousClass2BV;
import X.C001801b;
import X.C34881jN;
import X.C457226a;
import X.C458626q;
import X.HandlerC34731j7;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends AnonymousClass17A {
    public static final ThreadLocal A0D = new AnonymousClass17h();
    public AnonymousClass17C A00;
    public AnonymousClass17D A01;
    public Status A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final HandlerC34731j7 A06;
    public final Object A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final CountDownLatch A0A;
    public final AtomicReference A0B;
    public volatile boolean A0C;

    public BasePendingResult() {
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A05 = false;
        this.A06 = new HandlerC34731j7(Looper.getMainLooper());
        this.A08 = new WeakReference(null);
    }

    public BasePendingResult(AnonymousClass178 r3) {
        Looper looper;
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A05 = false;
        if (r3 == null) {
            looper = Looper.getMainLooper();
        } else if (r3 instanceof AnonymousClass263) {
            looper = ((AnonymousClass263) r3).A00.A02;
        } else if (!(r3 instanceof C34881jN)) {
            throw new UnsupportedOperationException();
        } else {
            looper = ((C34881jN) r3).A08;
        }
        this.A06 = new HandlerC34731j7(looper);
        this.A08 = new WeakReference(r3);
    }

    public final AnonymousClass17C A02() {
        AnonymousClass17C r2;
        synchronized (this.A07) {
            boolean z = false;
            if (!this.A0C) {
                z = true;
            }
            C001801b.A1b(z, "Result has already been consumed.");
            C001801b.A1b(A09(), "Result is not ready.");
            r2 = this.A00;
            this.A00 = null;
            this.A01 = null;
            this.A0C = true;
        }
        AbstractC236917d r0 = (AbstractC236917d) this.A0B.getAndSet(null);
        if (r0 != null) {
            r0.ARb(this);
        }
        return r2;
    }

    public AnonymousClass17C A03(Status status) {
        if (this instanceof AnonymousClass260) {
            return status;
        }
        if (this instanceof AnonymousClass2AT) {
            return new C458626q(status, new ArrayList());
        }
        if (!(this instanceof AnonymousClass2BV)) {
            return ((this instanceof AnonymousClass2AR) || !(this instanceof AnonymousClass2AQ)) ? status : status;
        }
        return new C457226a(status, null);
    }

    public void A04() {
        synchronized (this.A07) {
            if (!this.A03 && !this.A0C) {
                this.A03 = true;
                A07(A03(Status.A04));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (((java.lang.Boolean) com.google.android.gms.common.api.internal.BasePendingResult.A0D.get()).booleanValue() != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r2 = this;
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x0013
            java.lang.ThreadLocal r0 = com.google.android.gms.common.api.internal.BasePendingResult.A0D
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.A05():void");
    }

    public final void A06(AnonymousClass17C r5) {
        synchronized (this.A07) {
            if (!this.A04 && !this.A03) {
                A09();
                boolean z = true;
                boolean z2 = false;
                if (!A09()) {
                    z2 = true;
                }
                C001801b.A1b(z2, "Results have already been set");
                if (this.A0C) {
                    z = false;
                }
                C001801b.A1b(z, "Result has already been consumed");
                A07(r5);
            }
        }
    }

    public final void A07(AnonymousClass17C r6) {
        this.A00 = r6;
        this.A0A.countDown();
        this.A02 = this.A00.A9C();
        if (this.A03) {
            this.A01 = null;
        } else if (this.A01 != null) {
            HandlerC34731j7 r3 = this.A06;
            r3.removeMessages(2);
            AnonymousClass17D r2 = this.A01;
            AnonymousClass17C A022 = A02();
            if (r3 != null) {
                r3.sendMessage(r3.obtainMessage(1, new Pair(r2, A022)));
            } else {
                throw null;
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AnonymousClass179) obj).AEP(this.A02);
        }
        arrayList.clear();
    }

    public final void A08(Status status) {
        synchronized (this.A07) {
            if (!A09()) {
                A06(A03(status));
                this.A04 = true;
            }
        }
    }

    public final boolean A09() {
        return this.A0A.getCount() == 0;
    }
}

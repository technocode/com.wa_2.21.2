package X;

import java.util.ArrayDeque;

/* renamed from: X.1hh  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC33981hh implements AbstractC227312y {
    public int A00;
    public int A01;
    public int A02;
    public C33961hf A03;
    public Exception A04;
    public boolean A05;
    public boolean A06;
    public final Object A07 = new Object();
    public final Thread A08;
    public final ArrayDeque A09 = new ArrayDeque();
    public final ArrayDeque A0A = new ArrayDeque();
    public final C33961hf[] A0B;
    public final AbstractC33971hg[] A0C;

    public AbstractC33981hh(C33961hf[] r5, AbstractC33971hg[] r6) {
        this.A0B = r5;
        this.A00 = r5.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0B[i] = new C454925a();
        }
        this.A0C = r6;
        int length = r6.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            r6[i2] = new AnonymousClass28k((AnonymousClass25Z) this);
        }
        AnonymousClass130 r0 = new AnonymousClass130(this);
        this.A08 = r0;
        r0.start();
    }

    @Override // X.AbstractC227312y
    public Object A3b() {
        C33961hf r0;
        synchronized (this.A07) {
            Exception exc = this.A04;
            if (exc == null) {
                boolean z = false;
                if (this.A03 == null) {
                    z = true;
                }
                C002001d.A3A(z);
                int i = this.A00;
                if (i == 0) {
                    r0 = null;
                } else {
                    C33961hf[] r02 = this.A0B;
                    int i2 = i - 1;
                    this.A00 = i2;
                    r0 = r02[i2];
                }
                this.A03 = r0;
            } else {
                throw exc;
            }
        }
        return r0;
    }

    @Override // X.AbstractC227312y
    public Object A3c() {
        synchronized (this.A07) {
            Exception exc = this.A04;
            if (exc == null) {
                ArrayDeque arrayDeque = this.A0A;
                if (arrayDeque.isEmpty()) {
                    return null;
                }
                return (AbstractC33971hg) arrayDeque.removeFirst();
            }
            throw exc;
        }
    }

    @Override // X.AbstractC227312y
    public void AMI(Object obj) {
        Object obj2 = this.A07;
        synchronized (obj2) {
            Exception exc = this.A04;
            if (exc == null) {
                boolean z = false;
                if (obj == this.A03) {
                    z = true;
                }
                C002001d.A39(z);
                ArrayDeque arrayDeque = this.A09;
                arrayDeque.addLast(obj);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj2.notify();
                }
                this.A03 = null;
            } else {
                throw exc;
            }
        }
    }

    @Override // X.AbstractC227312y
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            C33961hf r3 = this.A03;
            if (r3 != null) {
                r3.A03();
                C33961hf[] r2 = this.A0B;
                int i = this.A00;
                this.A00 = i + 1;
                r2[i] = r3;
                this.A03 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                C33961hf r32 = (C33961hf) arrayDeque.removeFirst();
                r32.A03();
                C33961hf[] r22 = this.A0B;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                r22[i2] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A0A;
                if (!arrayDeque2.isEmpty()) {
                    ((AbstractC33971hg) arrayDeque2.removeFirst()).A02();
                }
            }
        }
    }

    @Override // X.AbstractC227312y
    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A06 = true;
            obj.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

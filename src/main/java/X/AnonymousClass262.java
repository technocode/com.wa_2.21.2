package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.262  reason: invalid class name */
public final class AnonymousClass262 implements AnonymousClass17Y, AbstractC35041jd {
    public int A00;
    public C34661ix A01 = null;
    public final Context A02;
    public final AnonymousClass0LQ A03;
    public final AbstractC34691j1 A04;
    public final C34881jN A05;
    public final HandlerC34951jU A06;
    public final AnonymousClass17Z A07;
    public final C238417u A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B = new HashMap();
    public final Condition A0C;
    public final Lock A0D;
    public volatile AnonymousClass17V A0E;

    @Override // X.AnonymousClass17Y
    public final boolean AC2(AnonymousClass17Q r2) {
        return false;
    }

    @Override // X.AnonymousClass17Y
    public final void AC3() {
    }

    public AnonymousClass262(Context context, C34881jN r5, Lock lock, Looper looper, AnonymousClass0LQ r8, Map map, C238417u r10, Map map2, AbstractC34691j1 r12, ArrayList arrayList, AnonymousClass17Z r14) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = r8;
        this.A0A = map;
        this.A08 = r10;
        this.A09 = map2;
        this.A04 = r12;
        this.A05 = r5;
        this.A07 = r14;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C35031jc) obj).A00 = this;
        }
        this.A06 = new HandlerC34951jU(this, looper);
        this.A0C = lock.newCondition();
        this.A0E = new C34871jM(this);
    }

    public final void A00(C34661ix r3) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = r3;
            this.A0E = new C34871jM(this);
            this.A0E.A2C();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AnonymousClass17Y
    public final C34661ix A2K() {
        this.A0E.connect();
        while (this.A0E instanceof C34811jG) {
            try {
                this.A0C.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C34661ix(15, null);
            }
        }
        if (this.A0E instanceof C34791jE) {
            return C34661ix.A04;
        }
        C34661ix r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        return new C34661ix(13, null);
    }

    @Override // X.AnonymousClass17Y
    public final void A3k() {
        if (this.A0E.A3m()) {
            this.A0B.clear();
        }
    }

    @Override // X.AnonymousClass17Y
    public final void A3y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.A0E);
        for (AnonymousClass16z r2 : this.A09.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) r2.A02).println(":");
            ((AbstractC34701j2) this.A0A.get(r2.A00())).A3y(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // X.AnonymousClass17Y
    public final AbstractC457025y A47(AbstractC457025y r2) {
        r2.A05();
        this.A0E.A47(r2);
        return r2;
    }

    @Override // X.AnonymousClass17Y
    public final AbstractC457025y A4A(AbstractC457025y r2) {
        r2.A05();
        return this.A0E.A4A(r2);
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.AEX(bundle);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.AEZ(i);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AbstractC35041jd
    public final void ARQ(C34661ix r3, AnonymousClass16z r4, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.ARQ(r3, r4, z);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AnonymousClass17Y
    public final void connect() {
        this.A0E.connect();
    }

    @Override // X.AnonymousClass17Y
    public final boolean isConnected() {
        return this.A0E instanceof C34791jE;
    }
}

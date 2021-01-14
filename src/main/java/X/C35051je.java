package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1je  reason: invalid class name and case insensitive filesystem */
public final class C35051je implements AnonymousClass17Y {
    public int A00 = 0;
    public Bundle A01;
    public C34661ix A02 = null;
    public C34661ix A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final Looper A06;
    public final AbstractC34701j2 A07;
    public final C34881jN A08;
    public final AnonymousClass262 A09;
    public final AnonymousClass262 A0A;
    public final Map A0B;
    public final Set A0C = Collections.newSetFromMap(new WeakHashMap());
    public final Lock A0D;

    public C35051je(Context context, C34881jN r25, Lock lock, Looper looper, AnonymousClass0LQ r28, Map map, Map map2, C238417u r31, AbstractC34691j1 r32, AbstractC34701j2 r33, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.A05 = context;
        this.A08 = r25;
        this.A0D = lock;
        this.A06 = looper;
        this.A07 = r33;
        this.A09 = new AnonymousClass262(context, r25, lock, looper, r28, map2, null, map4, null, arrayList2, new C35061jf(this));
        this.A0A = new AnonymousClass262(context, this.A08, lock, looper, r28, map, r31, map3, r32, arrayList, new C35071jg(this));
        AnonymousClass05V r4 = new AnonymousClass05V();
        for (Object obj : map2.keySet()) {
            r4.put(obj, this.A09);
        }
        for (Object obj2 : map.keySet()) {
            r4.put(obj2, this.A0A);
        }
        this.A0B = Collections.unmodifiableMap(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3.A02() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C35051je r4) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35051je.A00(X.1je):void");
    }

    public final void A01() {
        Set<AnonymousClass17Q> set = this.A0C;
        for (AnonymousClass17Q r0 : set) {
            r0.AEO();
        }
        set.clear();
    }

    public final void A02(C34661ix r4) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A08.ARa(r4);
        }
        A01();
        this.A00 = 0;
    }

    @Override // X.AnonymousClass17Y
    public final C34661ix A2K() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AnonymousClass17Y
    public final void A3k() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A09.A3k();
        this.A0A.A3k();
        A01();
    }

    @Override // X.AnonymousClass17Y
    public final void A3y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.A0A.A3y(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.A09.A3y(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // X.AnonymousClass17Y
    public final AbstractC457025y A47(AbstractC457025y r7) {
        PendingIntent activity;
        C236316w r3 = r7.A00;
        Map map = this.A0B;
        C001801b.A1a(map.containsKey(r3), "GoogleApiClient is not configured to use the API required for this call.");
        Object obj = map.get(r3);
        AnonymousClass262 r2 = this.A0A;
        if (obj.equals(r2)) {
            C34661ix r0 = this.A03;
            if (r0 == null || r0.A01 != 4) {
                r2.A47(r7);
                return r7;
            }
            AbstractC34701j2 r1 = this.A07;
            if (r1 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.A95(), 134217728);
            }
            r7.A0B(new Status(1, 4, null, activity));
            return r7;
        }
        this.A09.A47(r7);
        return r7;
    }

    @Override // X.AnonymousClass17Y
    public final AbstractC457025y A4A(AbstractC457025y r7) {
        PendingIntent activity;
        C236316w r3 = r7.A00;
        Map map = this.A0B;
        C001801b.A1a(map.containsKey(r3), "GoogleApiClient is not configured to use the API required for this call.");
        Object obj = map.get(r3);
        AnonymousClass262 r2 = this.A0A;
        if (!obj.equals(r2)) {
            return this.A09.A4A(r7);
        }
        C34661ix r0 = this.A03;
        if (r0 == null || r0.A01 != 4) {
            return r2.A4A(r7);
        }
        AbstractC34701j2 r1 = this.A07;
        if (r1 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.A95(), 134217728);
        }
        r7.A0B(new Status(1, 4, null, activity));
        return r7;
    }

    @Override // X.AnonymousClass17Y
    public final boolean AC2(AnonymousClass17Q r5) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = false;
                if (this.A00 == 2) {
                    z = true;
                }
                if (z || isConnected()) {
                    AnonymousClass262 r2 = this.A0A;
                    if (!(r2.A0E instanceof C34791jE)) {
                        this.A0C.add(r5);
                        if (this.A00 == 0) {
                            this.A00 = 1;
                        }
                        this.A03 = null;
                        r2.A0E.connect();
                        lock.unlock();
                        return true;
                    }
                }
                lock.unlock();
                return false;
            } finally {
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AnonymousClass17Y
    public final void AC3() {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = false;
                if (this.A00 == 2) {
                    z = true;
                }
                lock.unlock();
                this.A0A.A3k();
                this.A03 = new C34661ix(4);
                if (z) {
                    new HandlerC04640Ld(this.A06).post(new RunnableEBaseShape5S0100000_I1_0(this, 46));
                } else {
                    A01();
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // X.AnonymousClass17Y
    public final void connect() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A09.A0E.connect();
        this.A0A.A0E.connect();
    }

    @Override // X.AnonymousClass17Y
    public final boolean isConnected() {
        Lock lock = this.A0D;
        lock.lock();
        try {
            boolean z = true;
            if (this.A09.A0E instanceof C34791jE) {
                if (!(this.A0A.A0E instanceof C34791jE)) {
                    C34661ix r0 = this.A03;
                    if (r0 == null || r0.A01 != 4) {
                        if (this.A00 == 1) {
                        }
                    }
                }
                return z;
            }
            z = false;
            return z;
        } finally {
            lock.unlock();
        }
    }
}

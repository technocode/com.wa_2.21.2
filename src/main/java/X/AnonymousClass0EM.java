package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0EM  reason: invalid class name */
public abstract class AnonymousClass0EM {
    public final AbstractC02190Az A00;
    public final Map A01 = new HashMap();

    public AnonymousClass0EM(AbstractC02190Az r2) {
        this.A00 = r2;
    }

    public synchronized Runnable A00(Object obj) {
        return A01(obj, null);
    }

    public synchronized Runnable A01(Object obj, Object obj2) {
        RunnableC56592is r5;
        Runnable runnable;
        PowerManager.WakeLock wakeLock;
        Map map = this.A01;
        r5 = (RunnableC56592is) map.get(obj);
        if (r5 == null) {
            if (this instanceof AnonymousClass3SQ) {
                runnable = new C75073c8((AbstractC007503q) obj, (AnonymousClass3SQ) this);
            } else if (this instanceof AnonymousClass0EL) {
                AnonymousClass0EL r7 = (AnonymousClass0EL) this;
                AnonymousClass1WC r6 = (AnonymousClass1WC) obj2;
                if (r6 != null) {
                    int A002 = r6.A00();
                    if (A002 == 1) {
                        runnable = r7.A00.A04(r6);
                    } else if (A002 != 2) {
                        runnable = r7.A00.A04(r6);
                    } else {
                        AnonymousClass0CP r4 = r7.A00;
                        runnable = new C60772qB(r4.A08, r4.A03, r4.A01, r4.A0Q, r4.A02, r4.A0G, r4.A07, r4.A06, r4.A0P, r4.A0F, r4.A0I, r4.A0L, r4.A0A, r4.A0M, r4.A0B, r4.A0H, r4.A0E, r4.A0N, r4.A0K, (C56892jM) r6);
                    }
                } else {
                    throw null;
                }
            } else if (this instanceof C03060Eq) {
                C03060Eq r72 = (C03060Eq) this;
                AnonymousClass2TS r52 = (AnonymousClass2TS) obj2;
                if (r52 != null) {
                    C03010El r42 = r72.A00;
                    synchronized (r42) {
                        if (r42.A00 == null) {
                            PowerManager A0C = r42.A07.A0C();
                            if (A0C == null) {
                                Log.w("media-transcode-queue/get-transcode-wakelock pm=null");
                            } else {
                                r42.A00 = C002001d.A0f(A0C, 1, "mediatranscode");
                            }
                        }
                        wakeLock = r42.A00;
                    }
                    if (r52 instanceof C57092jh) {
                        runnable = new C60232p1(r42.A08, r42.A03, r42.A0B, r42.A01, r42.A02, r42.A05, r42.A0E, r42.A0N, r42.A06, r42.A0M, r42.A09, r42.A0F, (C57092jh) r52, wakeLock);
                    } else if (r52 instanceof C57162jo) {
                        runnable = new C60262p4(r42.A08, r42.A03, r42.A0B, r42.A01, r42.A02, r42.A0C, r42.A05, r42.A0L, r42.A0E, r42.A0N, r42.A0A, r42.A06, r42.A0M, r42.A09, r42.A0K, r42.A0F, r42.A0H, wakeLock, (C57162jo) r52);
                    } else if (r52 instanceof C57062je) {
                        runnable = new C60212oz(r42.A08, r42.A01, r42.A02, r42.A0M, (C57062je) r52, wakeLock);
                    } else if (r52 instanceof C57102ji) {
                        runnable = new C60242p2(r42.A0B, r42.A01, r42.A05, r42.A0L, r42.A07, r42.A0D, r42.A0A, r42.A06, r42.A0H, r42.A0G, (C57102ji) r52, wakeLock);
                    } else if (r52 instanceof C57142jm) {
                        runnable = new C60252p3(r42.A01, r42.A08, r42.A0J, r42.A02, r42.A05, r42.A0L, r42.A0I, r42.A0D, r42.A04, (C57142jm) r52);
                    } else if (r52 instanceof C57072jf) {
                        runnable = new C60222p0(r42.A08, (C57072jf) r52);
                    } else {
                        throw new AssertionError("Unreachable code");
                    }
                } else {
                    throw null;
                }
            } else if (this instanceof AnonymousClass0K8) {
                runnable = (AbstractRunnableC459527e) obj2;
            } else if (!(this instanceof AnonymousClass0FP)) {
                runnable = (Runnable) obj2;
                if (runnable == null) {
                    throw null;
                }
            } else {
                runnable = (AbstractRunnableC459527e) obj2;
            }
            r5 = new RunnableC56592is(this, obj, runnable, obj2);
            map.put(obj, r5);
            ((ThreadPoolExecutor) this.A00.get()).execute(r5);
        }
        return r5.A02;
    }

    public final synchronized Set A02() {
        return new HashSet(this.A01.keySet());
    }

    public synchronized void A03(Runnable runnable) {
        Iterator it = ((HashSet) A02()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            RunnableC56592is r0 = (RunnableC56592is) this.A01.get(next);
            if (runnable.equals(r0 != null ? r0.A02 : null)) {
                A06(next);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A04(java.lang.Object r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0013 }
            X.2is r0 = (X.RunnableC56592is) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A03     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EM.A04(java.lang.Object):boolean");
    }

    public final synchronized boolean A05(Object obj, RunnableC56592is r4) {
        Map map = this.A01;
        if (!r4.equals(map.get(obj))) {
            return false;
        }
        map.remove(obj);
        ((ThreadPoolExecutor) this.A00.get()).remove(r4);
        return true;
    }

    public synchronized boolean A06(Object obj) {
        Map map = this.A01;
        RunnableC56592is r1 = (RunnableC56592is) map.get(obj);
        if (r1 == null) {
            return false;
        }
        r1.cancel();
        ((ThreadPoolExecutor) this.A00.get()).remove(r1);
        map.remove(obj);
        return true;
    }
}

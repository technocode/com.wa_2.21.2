package X;

import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0Jt  reason: invalid class name and case insensitive filesystem */
public class C04280Jt extends AnonymousClass028 {
    public final AnonymousClass3SO A00;
    public final AnonymousClass3SP A01 = new AnonymousClass3SP(this);
    public final Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04280Jt(Executor executor, AnonymousClass025 r4) {
        super(2, executor, r4);
        AnonymousClass3SO r1 = new AnonymousClass3SO();
        this.A00 = r1;
        this.A02 = new HashSet();
    }

    public static void A00(C04280Jt r15) {
        HashSet hashSet;
        HashSet hashSet2;
        Long l;
        boolean z;
        String str;
        boolean containsKey;
        AnonymousClass025 r4 = ((AnonymousClass028) r15).A01;
        synchronized (r4) {
            hashSet = new HashSet(r4.A02.keySet());
        }
        long j = -1;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) it.next();
            synchronized (r4) {
                hashSet2 = new HashSet(r4.A02(threadPoolExecutor).A02.keySet());
            }
            Iterator it2 = hashSet2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Runnable runnable = (Runnable) it2.next();
                    synchronized (r4) {
                        l = (Long) r4.A02(threadPoolExecutor).A02.get(runnable);
                    }
                    if (l != null) {
                        String A002 = AnonymousClass025.A00(runnable);
                        long uptimeMillis = r4.A01(A002).A00 - (SystemClock.uptimeMillis() - l.longValue());
                        if (uptimeMillis <= 0) {
                            Set set = r15.A02;
                            synchronized (set) {
                                z = false;
                                if (!set.contains(A002)) {
                                    z = true;
                                    AnonymousClass025 r5 = ((AnonymousClass028) r15).A01;
                                    synchronized (r5) {
                                        containsKey = r5.A02(threadPoolExecutor).A02.containsKey(runnable);
                                    }
                                    if (containsKey) {
                                        set.add(A002);
                                    }
                                }
                            }
                            if (z) {
                                AnonymousClass025 r6 = ((AnonymousClass028) r15).A01;
                                HashMap hashMap = new HashMap();
                                synchronized (r6) {
                                    str = (String) r6.A02(threadPoolExecutor).A03.get(runnable);
                                }
                                hashMap.put("threadName", str);
                                hashMap.put("expectedJobLimit", String.valueOf(r6.A01(A002).A00));
                                hashMap.put("threadPoolExecutor", threadPoolExecutor.toString());
                                r15.A00(A002, hashMap);
                            } else {
                                continue;
                            }
                        } else if (j < 0 || uptimeMillis < j) {
                            j = uptimeMillis;
                        }
                    }
                }
            }
        }
        if (r15.A02()) {
            synchronized (r15.A00) {
                if (r15.A02()) {
                    if (j > 0) {
                        r15.A00.A01(j, r15.A01);
                    } else {
                        AnonymousClass3SO r3 = r15.A00;
                        synchronized (r3) {
                            r3.A03 = null;
                            if (r3.A02 != null || r3.A01 != null) {
                                AnonymousClass36U r1 = r3.A02;
                                if (r1 != null) {
                                    r1.removeMessages(1);
                                    r1.removeMessages(3);
                                    r1.removeMessages(2);
                                    r3.A02 = null;
                                }
                                HandlerThread handlerThread = r3.A01;
                                if (handlerThread != null) {
                                    handlerThread.quit();
                                    r3.A01 = null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass028
    public void A01(String str) {
        if (A02()) {
            synchronized (this.A00) {
                if (A02()) {
                    AnonymousClass3SO r3 = this.A00;
                    AnonymousClass02C r0 = AnonymousClass02C.A01;
                    r3.A01(60000, this.A01);
                }
            }
        }
    }

    public final boolean A02() {
        int i;
        AnonymousClass3SO r2 = this.A00;
        synchronized (r2) {
            i = r2.A00;
        }
        return i == 1;
    }
}

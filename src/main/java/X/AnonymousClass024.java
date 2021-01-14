package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.024  reason: invalid class name */
public final class AnonymousClass024 {
    public final AnonymousClass026 A00;
    public final AnonymousClass025 A01;
    public final List A02 = new ArrayList(2);

    public AnonymousClass024(Executor executor) {
        AnonymousClass025 r4 = new AnonymousClass025();
        AnonymousClass026 r3 = new AnonymousClass026();
        List singletonList = Collections.singletonList(new AnonymousClass027(executor, r4));
        this.A01 = r4;
        this.A00 = r3;
        if (singletonList.size() > 0) {
            this.A02.addAll(singletonList);
            for (AnonymousClass028 r1 : this.A02) {
                synchronized (r1) {
                    r1.A02.add(this);
                }
            }
        }
    }

    public synchronized void A00(ThreadPoolExecutor threadPoolExecutor, AnonymousClass02C r5) {
        AnonymousClass025 r2 = this.A01;
        synchronized (r2) {
            HashMap hashMap = r2.A02;
            AnonymousClass02D r0 = (AnonymousClass02D) hashMap.get(threadPoolExecutor);
            if (r0 == null) {
                hashMap.put(threadPoolExecutor, new AnonymousClass02D(r5));
            } else {
                r0.A00 = r5;
            }
        }
    }

    public synchronized void A01(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        AnonymousClass025 r2 = this.A01;
        synchronized (r2) {
            AnonymousClass02D A022 = r2.A02(threadPoolExecutor);
            A022.A02.remove(runnable);
            A022.A03.remove(runnable);
            String A002 = AnonymousClass025.A00(runnable);
            r2.A01.remove(A002);
            r2.A00.remove(A002);
        }
        String A003 = AnonymousClass025.A00(runnable);
        for (AnonymousClass028 r1 : this.A02) {
            if (r1 instanceof C04280Jt) {
                Set set = ((C04280Jt) r1).A02;
                synchronized (set) {
                    set.remove(A003);
                }
            }
        }
    }

    public synchronized void A02(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor2;
        BlockingQueue<Runnable> queue;
        Runnable peek;
        Long l;
        HashSet hashSet;
        BlockingQueue<Runnable> queue2;
        Long l2;
        String str;
        Long l3;
        Object obj;
        AnonymousClass02C r5 = AnonymousClass02C.A01;
        AnonymousClass025 r4 = this.A01;
        synchronized (r4) {
            AnonymousClass02D A022 = r4.A02(threadPoolExecutor);
            A022.A01.put(runnable, Long.valueOf(SystemClock.uptimeMillis()));
            r4.A01.put(AnonymousClass025.A00(runnable), threadPoolExecutor);
            if (r5 != A022.A00) {
                r4.A00.put(AnonymousClass025.A00(runnable), r5);
            }
        }
        String A002 = AnonymousClass025.A00(runnable);
        for (AnonymousClass028 r9 : this.A02) {
            if (r9 instanceof AnonymousClass027) {
                AnonymousClass027 r92 = (AnonymousClass027) r9;
                AtomicBoolean atomicBoolean = r92.A00;
                if (!atomicBoolean.get()) {
                    AnonymousClass025 r42 = r92.A01;
                    synchronized (r42) {
                        threadPoolExecutor2 = (ThreadPoolExecutor) r42.A01.get(A002);
                    }
                    if (threadPoolExecutor2 == null) {
                        AnonymousClass008.A18("[JobAnomalyDetector] Could not execute detector as ThreadPoolExecutor is null for jobId: ", A002);
                    } else {
                        synchronized (r42) {
                            queue = threadPoolExecutor2.getQueue();
                        }
                        if (!(queue == null || (peek = queue.peek()) == null)) {
                            synchronized (r42) {
                                l = (Long) r42.A02(threadPoolExecutor2).A01.get(peek);
                            }
                            if (l != null && SystemClock.uptimeMillis() - l.longValue() > 300000) {
                                HashMap hashMap = new HashMap();
                                synchronized (r42) {
                                    hashSet = new HashSet(r42.A02(threadPoolExecutor2).A02.keySet());
                                }
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    StringBuilder A0S = AnonymousClass008.A0S("Running task: [");
                                    A0S.append(next.toString());
                                    A0S.append("]");
                                    String obj2 = A0S.toString();
                                    StringBuilder A0S2 = AnonymousClass008.A0S("[ThreadName: ");
                                    synchronized (r42) {
                                        str = (String) r42.A02(threadPoolExecutor2).A03.get(next);
                                    }
                                    A0S2.append(str);
                                    A0S2.append("], ");
                                    A0S2.append("[Class: ");
                                    A0S2.append(next.getClass().getName());
                                    A0S2.append("]");
                                    synchronized (r42) {
                                        l3 = (Long) r42.A02(threadPoolExecutor2).A02.get(next);
                                    }
                                    A0S2.append(", [StartTime: ");
                                    if (l3 == null) {
                                        obj = "Unknown";
                                    } else {
                                        obj = AnonymousClass008.A06(l3, SystemClock.uptimeMillis());
                                    }
                                    A0S2.append(obj);
                                    A0S2.append("ms]");
                                    hashMap.put(obj2, A0S2.toString());
                                }
                                synchronized (r42) {
                                    queue2 = threadPoolExecutor2.getQueue();
                                }
                                if (queue2 != null) {
                                    for (Object obj3 : queue2) {
                                        StringBuilder A0S3 = AnonymousClass008.A0S("Queued task: [");
                                        A0S3.append(obj3.toString());
                                        A0S3.append("]");
                                        String obj4 = A0S3.toString();
                                        StringBuilder A0S4 = AnonymousClass008.A0S("[ClassName: ");
                                        A0S4.append(obj3.getClass().getName());
                                        A0S4.append("]");
                                        synchronized (r42) {
                                            l2 = (Long) r42.A02(threadPoolExecutor2).A01.get(obj3);
                                        }
                                        if (l2 != null) {
                                            A0S4.append(", [QueuedTime: ");
                                            A0S4.append(SystemClock.uptimeMillis() - l2.longValue());
                                            A0S4.append("ms]");
                                        }
                                        hashMap.put(obj4, A0S4.toString());
                                    }
                                }
                                r92.A00(A002, hashMap);
                                atomicBoolean.set(true);
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public synchronized void A03(ThreadPoolExecutor threadPoolExecutor, Thread thread, Runnable runnable) {
        AnonymousClass025 r4 = this.A01;
        synchronized (r4) {
            AnonymousClass02D A022 = r4.A02(threadPoolExecutor);
            A022.A01.remove(runnable);
            A022.A02.put(runnable, Long.valueOf(SystemClock.uptimeMillis()));
            A022.A03.put(runnable, thread.getName());
        }
        String A002 = AnonymousClass025.A00(runnable);
        for (AnonymousClass028 r0 : this.A02) {
            r0.A01(A002);
        }
    }
}

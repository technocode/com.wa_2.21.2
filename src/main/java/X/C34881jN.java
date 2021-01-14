package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jN  reason: invalid class name and case insensitive filesystem */
public final class C34881jN extends AnonymousClass178 implements AnonymousClass17Z {
    public long A00 = 120000;
    public long A01 = 5000;
    public AnonymousClass0LU A02;
    public AnonymousClass17Y A03 = null;
    public Integer A04 = null;
    public Set A05 = new HashSet();
    public final int A06;
    public final Context A07;
    public final Looper A08;
    public final AnonymousClass0LP A09;
    public final AbstractC34691j1 A0A;
    public final AnonymousClass17P A0B = new AnonymousClass17P();
    public final HandlerC34931jS A0C;
    public final C236817c A0D;
    public final C238417u A0E;
    public final AbstractC238517v A0F;
    public final C238617w A0G;
    public final ArrayList A0H;
    public final Map A0I;
    public final Map A0J;
    public final Queue A0K = new LinkedList();
    public final Lock A0L;
    public volatile boolean A0M;

    public C34881jN(Context context, Lock lock, Looper looper, C238417u r12, AnonymousClass0LP r13, AbstractC34691j1 r14, Map map, List list, List list2, Map map2, ArrayList arrayList) {
        C34891jO r1 = new C34891jO(this);
        this.A0F = r1;
        this.A07 = context;
        this.A0L = lock;
        this.A0G = new C238617w(looper, r1);
        this.A08 = looper;
        this.A0C = new HandlerC34931jS(this, looper);
        this.A09 = r13;
        this.A06 = -1;
        this.A0I = map;
        this.A0J = map2;
        this.A0H = arrayList;
        this.A0D = new C236817c(map2);
        for (Object obj : list) {
            C238617w r5 = this.A0G;
            C001801b.A1Q(obj);
            synchronized (r5.A03) {
                ArrayList arrayList2 = r5.A04;
                if (arrayList2.contains(obj)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList2.add(obj);
                }
            }
            if (r5.A02.isConnected()) {
                Handler handler = r5.A01;
                handler.sendMessage(handler.obtainMessage(1, obj));
            }
        }
        for (Object obj2 : list2) {
            C238617w r0 = this.A0G;
            C001801b.A1Q(obj2);
            synchronized (r0.A03) {
                ArrayList arrayList3 = r0.A06;
                if (arrayList3.contains(obj2)) {
                    String valueOf2 = String.valueOf(obj2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf2);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    arrayList3.add(obj2);
                }
            }
        }
        this.A0E = r12;
        this.A0A = r14;
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractC34701j2 r1 = (AbstractC34701j2) it.next();
            if (r1.AMw()) {
                z2 = true;
            }
            if (r1.AMD()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    public static void A01(C34881jN r3) {
        Lock lock = r3.A0L;
        lock.lock();
        try {
            if (r3.A0M) {
                r3.A0G.A08 = true;
                r3.A03.connect();
            }
        } finally {
            lock.unlock();
        }
    }

    public final void A05(int i) {
        String str;
        String str2;
        Integer num = this.A04;
        if (num == null) {
            this.A04 = Integer.valueOf(i);
        } else {
            int intValue = num.intValue();
            if (intValue != i) {
                if (i != 1) {
                    str = i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL";
                } else {
                    str = "SIGN_IN_MODE_REQUIRED";
                }
                if (intValue != 1) {
                    str2 = intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL";
                } else {
                    str2 = "SIGN_IN_MODE_REQUIRED";
                }
                throw new IllegalStateException(AnonymousClass008.A09(str2.length() + str.length() + 51, "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
            }
        }
        if (this.A03 == null) {
            Map map = this.A0J;
            boolean z = false;
            boolean z2 = false;
            for (AbstractC34701j2 r1 : map.values()) {
                if (r1.AMw()) {
                    z = true;
                }
                if (r1.AMD()) {
                    z2 = true;
                }
            }
            int intValue2 = this.A04.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && z) {
                    Context context = this.A07;
                    Lock lock = this.A0L;
                    Looper looper = this.A08;
                    AnonymousClass0LP r13 = this.A09;
                    C238417u r11 = this.A0E;
                    Map map2 = this.A0I;
                    AbstractC34691j1 r10 = this.A0A;
                    ArrayList arrayList = this.A0H;
                    AnonymousClass05V r9 = new AnonymousClass05V();
                    AnonymousClass05V r8 = new AnonymousClass05V();
                    AbstractC34701j2 r24 = null;
                    for (Map.Entry entry : map.entrySet()) {
                        AbstractC34701j2 r4 = (AbstractC34701j2) entry.getValue();
                        if (r4.AMD()) {
                            r24 = r4;
                        }
                        boolean AMw = r4.AMw();
                        Object key = entry.getKey();
                        if (AMw) {
                            r9.put(key, r4);
                        } else {
                            r8.put(key, r4);
                        }
                    }
                    C001801b.A1b(!r9.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                    AnonymousClass05V r7 = new AnonymousClass05V();
                    AnonymousClass05V r6 = new AnonymousClass05V();
                    for (AnonymousClass16z r12 : map2.keySet()) {
                        C236316w A002 = r12.A00();
                        if (r9.containsKey(A002)) {
                            r7.put(r12, map2.get(r12));
                        } else if (r8.containsKey(A002)) {
                            r6.put(r12, map2.get(r12));
                        } else {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        C35031jc r14 = (C35031jc) obj;
                        if (r7.containsKey(r14.A01)) {
                            arrayList2.add(r14);
                        } else if (r6.containsKey(r14.A01)) {
                            arrayList3.add(r14);
                        } else {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                    }
                    this.A03 = new C35051je(context, this, lock, looper, r13, r9, r8, r11, r10, r24, arrayList2, arrayList3, r7, r6);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.A03 = new AnonymousClass262(this.A07, this, this.A0L, this.A08, this.A09, map, this.A0E, this.A0I, this.A0A, this.A0H, this);
        }
    }

    public final void A06(PrintWriter printWriter) {
        printWriter.append("").append("mContext=").println(this.A07);
        printWriter.append("").append("mResuming=").print(this.A0M);
        printWriter.append(" mWorkQueue.size()=").print(this.A0K.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A0D.A02.size());
        AnonymousClass17Y r0 = this.A03;
        if (r0 != null) {
            r0.A3y("", null, printWriter, null);
        }
    }

    public final boolean A07() {
        if (!this.A0M) {
            return false;
        }
        this.A0M = false;
        HandlerC34931jS r2 = this.A0C;
        r2.removeMessages(2);
        r2.removeMessages(1);
        AnonymousClass0LU r0 = this.A02;
        if (r0 != null) {
            r0.A00();
            this.A02 = null;
        }
        return true;
    }

    @Override // X.AnonymousClass17Z
    public final void ARX(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1 && !z && !this.A0M) {
            this.A0M = true;
            if (this.A02 == null) {
                this.A02 = AnonymousClass0LP.A01(this.A07.getApplicationContext(), new C34941jT(this));
            }
            HandlerC34931jS r3 = this.A0C;
            r3.sendMessageDelayed(r3.obtainMessage(1), 120000);
            r3.sendMessageDelayed(r3.obtainMessage(2), 5000);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.A0D.A02.toArray(C236817c.A04)) {
            basePendingResult.A08(C236817c.A03);
        }
        C238617w r8 = this.A0G;
        if (r8 != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = r8.A01;
            boolean z2 = false;
            if (myLooper == handler.getLooper()) {
                z2 = true;
            }
            C001801b.A1b(z2, "onUnintentionalDisconnection must only be called on the Handler thread");
            handler.removeMessages(1);
            synchronized (r8.A03) {
                r8.A00 = true;
                ArrayList arrayList = r8.A04;
                ArrayList arrayList2 = new ArrayList(arrayList);
                atomicInteger = r8.A07;
                int i2 = atomicInteger.get();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    AnonymousClass176 r1 = (AnonymousClass176) obj;
                    if (!r8.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(r1)) {
                        r1.AEZ(i);
                    }
                }
                r8.A05.clear();
                r8.A00 = false;
            }
            r8.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                r8.A08 = true;
                this.A03.connect();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass17Z
    public final void ARY(Bundle bundle) {
        while (true) {
            Queue queue = this.A0K;
            if (queue.isEmpty()) {
                break;
            }
            A01((AbstractC457025y) queue.remove());
        }
        C238617w r10 = this.A0G;
        if (r10 != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = r10.A01;
            boolean z = true;
            boolean z2 = false;
            if (myLooper == handler.getLooper()) {
                z2 = true;
            }
            C001801b.A1b(z2, "onConnectionSuccess must only be called on the Handler thread");
            synchronized (r10.A03) {
                boolean z3 = false;
                if (!r10.A00) {
                    z3 = true;
                }
                C001801b.A1Z(z3);
                handler.removeMessages(1);
                r10.A00 = true;
                ArrayList arrayList = r10.A05;
                if (arrayList.size() != 0) {
                    z = false;
                }
                C001801b.A1Z(z);
                ArrayList arrayList2 = new ArrayList(r10.A04);
                AtomicInteger atomicInteger = r10.A07;
                int i = atomicInteger.get();
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    AnonymousClass176 r1 = (AnonymousClass176) obj;
                    if (!r10.A08 || !r10.A02.isConnected() || atomicInteger.get() != i) {
                        break;
                    } else if (!arrayList.contains(r1)) {
                        r1.AEX(bundle);
                    }
                }
                arrayList.clear();
                r10.A00 = false;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass17Z
    public final void ARa(C34661ix r11) {
        boolean A022;
        AtomicInteger atomicInteger;
        AnonymousClass0LP r0 = this.A09;
        Context context = this.A07;
        int i = r11.A01;
        if (r0 != null) {
            if (i == 18) {
                A022 = true;
            } else {
                A022 = i == 1 ? AnonymousClass0LV.A02(context) : false;
            }
            if (!A022) {
                A07();
            }
            if (!this.A0M) {
                C238617w r8 = this.A0G;
                if (r8 != null) {
                    Looper myLooper = Looper.myLooper();
                    Handler handler = r8.A01;
                    int i2 = 0;
                    boolean z = false;
                    if (myLooper == handler.getLooper()) {
                        z = true;
                    }
                    C001801b.A1b(z, "onConnectionFailure must only be called on the Handler thread");
                    handler.removeMessages(1);
                    synchronized (r8.A03) {
                        ArrayList arrayList = r8.A06;
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        atomicInteger = r8.A07;
                        int i3 = atomicInteger.get();
                        int size = arrayList2.size();
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i2);
                            i2++;
                            AnonymousClass177 r1 = (AnonymousClass177) obj;
                            if (r8.A08 && atomicInteger.get() == i3) {
                                if (arrayList.contains(r1)) {
                                    r1.AEY(r11);
                                }
                            }
                        }
                    }
                    r8.A08 = false;
                    atomicInteger.incrementAndGet();
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }
}

package X;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.0sA  reason: invalid class name and case insensitive filesystem */
public class RunnableC17740sA extends RunnableEmptyBase implements Runnable {
    public static final String A0J = AbstractC17610rq.A01("WorkerWrapper");
    public Context A00;
    public AnonymousClass01Z A01;
    public AbstractC17600ro A02 = new C30961cI();
    public ListenableWorker A03;
    public C17700s2 A04;
    public WorkDatabase A05;
    public AbstractC17890sR A06;
    public AbstractC17930sV A07;
    public C18030sf A08;
    public AbstractC18040sg A09;
    public AbstractC18060si A0A;
    public C453624k A0B = new C453624k();
    public AnonymousClass0t5 A0C;
    public AnonymousClass1EY A0D = null;
    public String A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public volatile boolean A0I;

    public RunnableC17740sA(AnonymousClass0s9 r3) {
        this.A00 = r3.A00;
        this.A0C = r3.A05;
        this.A06 = r3.A04;
        this.A0F = r3.A06;
        this.A0G = r3.A07;
        this.A04 = r3.A02;
        this.A03 = null;
        this.A01 = r3.A01;
        WorkDatabase workDatabase = r3.A03;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A09();
        this.A07 = this.A05.A05();
        this.A0A = this.A05.A0A();
    }

    public void A00() {
        if (!A06()) {
            this.A05.A02();
            try {
                AnonymousClass0VU A012 = ((C31481dI) this.A09).A01(this.A0F);
                AbstractC18000sc A082 = this.A05.A08();
                String str = this.A0F;
                C31391d9 r0 = (C31391d9) A082;
                AbstractC16780qQ r4 = r0.A00;
                r4.A01();
                AbstractC16810qT r3 = r0.A01;
                AbstractC30751bt A002 = r3.A00();
                if (str == null) {
                    ((C30791bx) A002).A00.bindNull(1);
                } else {
                    ((C30791bx) A002).A00.bindString(1, str);
                }
                r4.A02();
                AnonymousClass248 r1 = (AnonymousClass248) A002;
                try {
                    r1.A00.executeUpdateDelete();
                    r4.A04();
                    r4.A03();
                    if (r1 == r3.A02) {
                        r3.A01.set(false);
                    }
                    if (A012 == null) {
                        A05(false);
                    } else if (A012 == AnonymousClass0VU.RUNNING) {
                        AbstractC17600ro r12 = this.A02;
                        if (r12 instanceof C30981cK) {
                            AbstractC17610rq A003 = AbstractC17610rq.A00();
                            String str2 = A0J;
                            A003.A04(str2, String.format("Worker result SUCCESS for %s", this.A0E), new Throwable[0]);
                            boolean z = false;
                            if (this.A08.A04 != 0) {
                                z = true;
                            }
                            if (z) {
                                A03();
                            } else {
                                this.A05.A02();
                                try {
                                    AbstractC18040sg r32 = this.A09;
                                    ((C31481dI) r32).A06(AnonymousClass0VU.SUCCEEDED, this.A0F);
                                    C17550rj r2 = ((C30981cK) this.A02).A00;
                                    ((C31481dI) this.A09).A09(this.A0F, r2);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Iterator it = ((ArrayList) ((C31331d2) this.A07).A00(this.A0F)).iterator();
                                    while (it.hasNext()) {
                                        String str3 = (String) it.next();
                                        if (((C31481dI) this.A09).A01(str3) == AnonymousClass0VU.BLOCKED) {
                                            C31331d2 r33 = (C31331d2) this.A07;
                                            boolean z2 = true;
                                            C30721bp A004 = C30721bp.A00("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (str3 == null) {
                                                A004.A03[1] = 1;
                                            } else {
                                                A004.A02(1, str3);
                                            }
                                            AbstractC16780qQ r02 = r33.A01;
                                            r02.A01();
                                            boolean z3 = false;
                                            Cursor A005 = C16830qW.A00(r02, A004, false);
                                            try {
                                                if (A005.moveToFirst()) {
                                                    if (A005.getInt(0) == 0) {
                                                        z2 = false;
                                                    }
                                                    z3 = z2;
                                                }
                                                if (z3) {
                                                    AbstractC17610rq.A00().A04(str2, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                                                    AbstractC18040sg r5 = this.A09;
                                                    ((C31481dI) r5).A06(AnonymousClass0VU.ENQUEUED, str3);
                                                    ((C31481dI) this.A09).A08(str3, currentTimeMillis);
                                                }
                                            } finally {
                                                A005.close();
                                                A004.A01();
                                            }
                                        }
                                    }
                                    this.A05.A04();
                                } finally {
                                    this.A05.A03();
                                    A05(false);
                                }
                            }
                        } else if (r12 instanceof C30971cJ) {
                            AbstractC17610rq.A00().A04(A0J, String.format("Worker result RETRY for %s", this.A0E), new Throwable[0]);
                            A02();
                        } else {
                            AbstractC17610rq.A00().A04(A0J, String.format("Worker result FAILURE for %s", this.A0E), new Throwable[0]);
                            boolean z4 = false;
                            if (this.A08.A04 != 0) {
                                z4 = true;
                            }
                            if (z4) {
                                A03();
                            } else {
                                A01();
                            }
                        }
                    } else if (!A012.A00()) {
                        A02();
                    }
                    this.A05.A04();
                } catch (Throwable th) {
                    r4.A03();
                    r3.A02(A002);
                    throw th;
                }
            } finally {
                this.A05.A03();
            }
        }
        List<AbstractC17710s5> list = this.A0G;
        if (list != null) {
            for (AbstractC17710s5 r13 : list) {
                r13.A2X(this.A0F);
            }
            AnonymousClass0s6.A01(this.A05, this.A0G);
        }
    }

    public void A01() {
        this.A05.A02();
        try {
            String str = this.A0F;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (((C31481dI) this.A09).A01(str2) != AnonymousClass0VU.CANCELLED) {
                    AbstractC18040sg r2 = this.A09;
                    ((C31481dI) r2).A06(AnonymousClass0VU.FAILED, str2);
                }
                linkedList.addAll(((C31331d2) this.A07).A00(str2));
            }
            ((C31481dI) this.A09).A09(this.A0F, ((C30961cI) this.A02).A00);
            this.A05.A04();
        } finally {
            this.A05.A03();
            A05(false);
        }
    }

    public final void A02() {
        this.A05.A02();
        try {
            AbstractC18040sg r5 = this.A09;
            ((C31481dI) r5).A06(AnonymousClass0VU.ENQUEUED, this.A0F);
            ((C31481dI) this.A09).A08(this.A0F, System.currentTimeMillis());
            ((C31481dI) this.A09).A07(this.A0F, -1);
            this.A05.A04();
        } finally {
            this.A05.A03();
            A05(true);
        }
    }

    public final void A03() {
        this.A05.A02();
        try {
            ((C31481dI) this.A09).A08(this.A0F, System.currentTimeMillis());
            AbstractC18040sg r3 = this.A09;
            ((C31481dI) r3).A06(AnonymousClass0VU.ENQUEUED, this.A0F);
            AbstractC18040sg r0 = this.A09;
            String str = this.A0F;
            C31481dI r02 = (C31481dI) r0;
            AbstractC16780qQ r5 = r02.A01;
            r5.A01();
            AbstractC16810qT r32 = r02.A06;
            AbstractC30751bt A002 = r32.A00();
            if (str == null) {
                ((C30791bx) A002).A00.bindNull(1);
            } else {
                ((C30791bx) A002).A00.bindString(1, str);
            }
            r5.A02();
            AnonymousClass248 r1 = (AnonymousClass248) A002;
            try {
                r1.A00.executeUpdateDelete();
                r5.A04();
                r5.A03();
                if (r1 == r32.A02) {
                    r32.A01.set(false);
                }
                ((C31481dI) this.A09).A07(this.A0F, -1);
                this.A05.A04();
            } catch (Throwable th) {
                r5.A03();
                r32.A02(A002);
                throw th;
            }
        } finally {
            this.A05.A03();
            A05(false);
        }
    }

    public final void A04() {
        AnonymousClass0VU A012 = ((C31481dI) this.A09).A01(this.A0F);
        if (A012 == AnonymousClass0VU.RUNNING) {
            AbstractC17610rq.A00().A02(A0J, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.A0F), new Throwable[0]);
            A05(true);
            return;
        }
        AbstractC17610rq.A00().A02(A0J, String.format("Status for %s is %s; not doing any work", this.A0F, A012), new Throwable[0]);
        A05(false);
    }

    /* JADX INFO: finally extract failed */
    public final void A05(boolean z) {
        this.A05.A02();
        try {
            C31481dI r1 = (C31481dI) this.A05.A09();
            C30721bp A002 = C30721bp.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            AbstractC16780qQ r0 = r1.A01;
            r0.A01();
            Cursor A003 = C16830qW.A00(r0, A002, false);
            try {
                ArrayList arrayList = new ArrayList(A003.getCount());
                while (A003.moveToNext()) {
                    arrayList.add(A003.getString(0));
                }
                A003.close();
                A002.A01();
                if (arrayList.isEmpty()) {
                    C18110so.A00(this.A00, RescheduleReceiver.class, false);
                }
                if (z) {
                    ((C31481dI) this.A09).A07(this.A0F, -1);
                }
                this.A05.A04();
                this.A05.A03();
                this.A0B.A08(Boolean.valueOf(z));
            } catch (Throwable th) {
                A003.close();
                A002.A01();
                throw th;
            }
        } catch (Throwable th2) {
            this.A05.A03();
            throw th2;
        }
    }

    public final boolean A06() {
        if (!this.A0I) {
            return false;
        }
        AbstractC17610rq.A00().A02(A0J, String.format("Work interrupted for %s", this.A0E), new Throwable[0]);
        AnonymousClass0VU A012 = ((C31481dI) this.A09).A01(this.A0F);
        if (A012 == null) {
            A05(false);
            return true;
        }
        A05(!A012.A00());
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        C17550rj r7;
        Object newInstance;
        AbstractC18060si r2 = this.A0A;
        String str = this.A0F;
        C31491dJ r22 = (C31491dJ) r2;
        if (r22 != null) {
            boolean z = true;
            C30721bp A002 = C30721bp.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
            if (str == null) {
                A002.A03[1] = 1;
            } else {
                A002.A02(1, str);
            }
            AbstractC16780qQ r0 = r22.A01;
            r0.A01();
            Cursor A003 = C16830qW.A00(r0, A002, false);
            try {
                ArrayList<String> arrayList = new ArrayList(A003.getCount());
                while (A003.moveToNext()) {
                    arrayList.add(A003.getString(0));
                }
                A003.close();
                A002.A01();
                this.A0H = arrayList;
                StringBuilder sb = new StringBuilder("Work [ id=");
                sb.append(this.A0F);
                sb.append(", tags={ ");
                boolean z2 = true;
                for (String str2 : arrayList) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(str2);
                }
                sb.append(" } ]");
                this.A0E = sb.toString();
                AnonymousClass0VU r23 = AnonymousClass0VU.ENQUEUED;
                if (!A06()) {
                    this.A05.A02();
                    try {
                        C18030sf A022 = ((C31481dI) this.A09).A02(this.A0F);
                        this.A08 = A022;
                        if (A022 == null) {
                            AbstractC17610rq.A00().A03(A0J, String.format("Didn't find WorkSpec for id %s", this.A0F), new Throwable[0]);
                            A05(false);
                        } else {
                            AnonymousClass0VU r9 = A022.A0C;
                            if (r9 != r23) {
                                A04();
                                this.A05.A04();
                                AbstractC17610rq.A00().A02(A0J, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.A08.A0F), new Throwable[0]);
                            } else {
                                boolean z3 = false;
                                if (A022.A04 != 0) {
                                    z3 = true;
                                }
                                if (z3 || (r9 == r23 && A022.A00 > 0)) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (A022.A06 != 0 && currentTimeMillis < A022.A00()) {
                                        AbstractC17610rq.A00().A02(A0J, String.format("Delaying execution for %s because it is being executed before schedule.", this.A08.A0F), new Throwable[0]);
                                        A05(true);
                                    }
                                }
                                this.A05.A04();
                                this.A05.A03();
                                C18030sf r3 = this.A08;
                                boolean z4 = false;
                                if (r3.A04 != 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    r7 = r3.A0A;
                                } else {
                                    C30951cH r02 = this.A01.A04;
                                    String str3 = r3.A0E;
                                    if (r02 != null) {
                                        try {
                                            AbstractC17590rn r8 = (AbstractC17590rn) Class.forName(str3).newInstance();
                                            if (r8 != null) {
                                                ArrayList<C17550rj> arrayList2 = new ArrayList();
                                                arrayList2.add(this.A08.A0A);
                                                AbstractC18040sg r32 = this.A09;
                                                String str4 = this.A0F;
                                                C31481dI r33 = (C31481dI) r32;
                                                if (r33 != null) {
                                                    C30721bp A004 = C30721bp.A00("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                                    if (str4 == null) {
                                                        A004.A03[1] = 1;
                                                    } else {
                                                        A004.A02(1, str4);
                                                    }
                                                    AbstractC16780qQ r03 = r33.A01;
                                                    r03.A01();
                                                    Cursor A005 = C16830qW.A00(r03, A004, false);
                                                    try {
                                                        ArrayList arrayList3 = new ArrayList(A005.getCount());
                                                        while (A005.moveToNext()) {
                                                            arrayList3.add(C17550rj.A00(A005.getBlob(0)));
                                                        }
                                                        A005.close();
                                                        A004.A01();
                                                        arrayList2.addAll(arrayList3);
                                                        if (!(r8 instanceof OverwritingInputMerger)) {
                                                            C17540ri r92 = new C17540ri();
                                                            HashMap hashMap = new HashMap();
                                                            loop3:
                                                            for (C17550rj r04 : arrayList2) {
                                                                Iterator it = Collections.unmodifiableMap(r04.A00).entrySet().iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        Map.Entry entry = (Map.Entry) it.next();
                                                                        Object key = entry.getKey();
                                                                        Object value = entry.getValue();
                                                                        Class<?> cls = value.getClass();
                                                                        Object obj = hashMap.get(key);
                                                                        if (obj != null) {
                                                                            Class<?> cls2 = obj.getClass();
                                                                            if (cls2.equals(cls)) {
                                                                                if (cls2.isArray()) {
                                                                                    int length = Array.getLength(obj);
                                                                                    int length2 = Array.getLength(value);
                                                                                    Object newInstance2 = Array.newInstance(cls2.getComponentType(), length + length2);
                                                                                    System.arraycopy(obj, 0, newInstance2, 0, length);
                                                                                    System.arraycopy(value, 0, newInstance2, length, length2);
                                                                                    value = newInstance2;
                                                                                } else {
                                                                                    newInstance = Array.newInstance(cls2, 2);
                                                                                    Array.set(newInstance, 0, obj);
                                                                                    Array.set(newInstance, 1, value);
                                                                                }
                                                                            } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                                                                                int length3 = Array.getLength(obj);
                                                                                Object newInstance3 = Array.newInstance(cls, length3 + 1);
                                                                                System.arraycopy(obj, 0, newInstance3, 0, length3);
                                                                                Array.set(newInstance3, length3, value);
                                                                                value = newInstance3;
                                                                            } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                                                                                int length4 = Array.getLength(value);
                                                                                Object newInstance4 = Array.newInstance(cls2, length4 + 1);
                                                                                System.arraycopy(value, 0, newInstance4, 0, length4);
                                                                                Array.set(newInstance4, length4, obj);
                                                                                value = newInstance4;
                                                                            }
                                                                            hashMap.put(key, value);
                                                                        } else if (!cls.isArray()) {
                                                                            newInstance = Array.newInstance(cls, 1);
                                                                            Array.set(newInstance, 0, value);
                                                                        } else {
                                                                            hashMap.put(key, value);
                                                                        }
                                                                        value = newInstance;
                                                                        hashMap.put(key, value);
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException();
                                                            }
                                                            r92.A00(hashMap);
                                                            r7 = new C17550rj(r92.A00);
                                                            C17550rj.A01(r7);
                                                        } else {
                                                            C17540ri r5 = new C17540ri();
                                                            HashMap hashMap2 = new HashMap();
                                                            for (C17550rj r05 : arrayList2) {
                                                                hashMap2.putAll(Collections.unmodifiableMap(r05.A00));
                                                            }
                                                            r5.A00(hashMap2);
                                                            r7 = new C17550rj(r5.A00);
                                                            C17550rj.A01(r7);
                                                        }
                                                    } catch (Throwable th) {
                                                        A005.close();
                                                        A004.A01();
                                                        throw th;
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            }
                                        } catch (Exception e) {
                                            AbstractC17610rq.A00().A03(AbstractC17590rn.A00, AnonymousClass008.A0K("Trouble instantiating + ", str3), e);
                                        }
                                        AbstractC17610rq.A00().A03(A0J, String.format("Could not create Input Merger %s", this.A08.A0E), new Throwable[0]);
                                        A01();
                                        return;
                                    }
                                    throw null;
                                }
                                UUID fromString = UUID.fromString(this.A0F);
                                List list = this.A0H;
                                int i = this.A08.A00;
                                AnonymousClass01Z r06 = this.A01;
                                Executor executor = r06.A06;
                                AnonymousClass0s1 r11 = r06.A05;
                                new C31541dO();
                                new C18170su();
                                WorkerParameters workerParameters = new WorkerParameters(fromString, r7, list, i, executor, r11);
                                ListenableWorker listenableWorker = this.A03;
                                if (listenableWorker == null) {
                                    listenableWorker = this.A01.A05.A00(this.A00, this.A08.A0F, workerParameters);
                                    this.A03 = listenableWorker;
                                }
                                if (listenableWorker == null) {
                                    AbstractC17610rq.A00().A03(A0J, String.format("Could not create Worker %s", this.A08.A0F), new Throwable[0]);
                                    A01();
                                } else if (listenableWorker.A02) {
                                    AbstractC17610rq.A00().A03(A0J, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.A08.A0F), new Throwable[0]);
                                    A01();
                                } else {
                                    listenableWorker.A02 = true;
                                    this.A05.A02();
                                    try {
                                        if (((C31481dI) this.A09).A01(this.A0F) == r23) {
                                            AbstractC18040sg r34 = this.A09;
                                            ((C31481dI) r34).A06(AnonymousClass0VU.RUNNING, this.A0F);
                                            AbstractC18040sg r07 = this.A09;
                                            String str5 = this.A0F;
                                            C31481dI r08 = (C31481dI) r07;
                                            AbstractC16780qQ r52 = r08.A01;
                                            r52.A01();
                                            AbstractC16810qT r35 = r08.A03;
                                            AbstractC30751bt A006 = r35.A00();
                                            if (str5 == null) {
                                                ((C30791bx) A006).A00.bindNull(1);
                                            } else {
                                                ((C30791bx) A006).A00.bindString(1, str5);
                                            }
                                            r52.A02();
                                            AnonymousClass248 r1 = (AnonymousClass248) A006;
                                            try {
                                                r1.A00.executeUpdateDelete();
                                                r52.A04();
                                                r52.A03();
                                                if (r1 == r35.A02) {
                                                    r35.A01.set(false);
                                                }
                                            } catch (Throwable th2) {
                                                r52.A03();
                                                r35.A02(A006);
                                                throw th2;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        this.A05.A04();
                                        if (!z) {
                                            A04();
                                        } else if (!A06()) {
                                            C453624k r36 = new C453624k();
                                            ((C31581dS) this.A0C).A02.execute(new RunnableEBaseShape5S0200000_I1_0(this, r36, 16));
                                            r36.A1o(new RunnableEBaseShape1S1200000_I1(this, r36, this.A0E, 3), ((C31581dS) this.A0C).A01);
                                        }
                                    } finally {
                                        this.A05.A03();
                                    }
                                }
                            }
                        }
                    } finally {
                        this.A05.A03();
                    }
                }
            } catch (Throwable th3) {
                A003.close();
                A002.A01();
                throw th3;
            }
        } else {
            throw null;
        }
    }
}

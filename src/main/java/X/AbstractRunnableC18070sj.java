package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.0sj  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC18070sj extends RunnableEmptyBase implements Runnable {
    public final C31081cW A00 = new C31081cW();

    public static void A00(C31221cl r9, String str) {
        boolean z;
        WorkDatabase workDatabase = r9.A04;
        AbstractC18040sg A09 = workDatabase.A09();
        AbstractC17930sV A05 = workDatabase.A05();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C31481dI r2 = (C31481dI) A09;
            AnonymousClass0VU A01 = r2.A01(str2);
            if (!(A01 == AnonymousClass0VU.SUCCEEDED || A01 == AnonymousClass0VU.FAILED)) {
                r2.A06(AnonymousClass0VU.CANCELLED, str2);
            }
            linkedList.addAll(((C31331d2) A05).A00(str2));
        }
        C31091cX r3 = r9.A03;
        synchronized (r3.A08) {
            AbstractC17610rq A002 = AbstractC17610rq.A00();
            String str3 = C31091cX.A0A;
            A002.A02(str3, String.format("Processor cancelling %s", str), new Throwable[0]);
            r3.A07.add(str);
            RunnableC17740sA r0 = (RunnableC17740sA) r3.A06.remove(str);
            if (r0 == null) {
                z = false;
                r0 = (RunnableC17740sA) r3.A05.remove(str);
            }
            C31091cX.A00(str, r0);
            if (z) {
                synchronized (r3.A08) {
                    if (!(!r3.A06.isEmpty())) {
                        SystemForegroundService systemForegroundService = SystemForegroundService.A04;
                        if (systemForegroundService != null) {
                            AbstractC17610rq.A00().A02(str3, "No more foreground work. Stopping SystemForegroundService", new Throwable[0]);
                            systemForegroundService.A01.post(new RunnableEBaseShape5S0100000_I1_0(systemForegroundService, 22));
                        } else {
                            AbstractC17610rq.A00().A02(str3, "No more foreground work. SystemForegroundService is already stopped", new Throwable[0]);
                        }
                    }
                }
            }
        }
        for (AbstractC17710s5 r02 : r9.A07) {
            r02.A2X(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        try {
            if (this instanceof C31521dM) {
                C31521dM r7 = (C31521dM) this;
                C31221cl r5 = r7.A00;
                WorkDatabase workDatabase = r5.A04;
                workDatabase.A02();
                try {
                    AbstractC18040sg A09 = workDatabase.A09();
                    String str = r7.A01;
                    C31481dI r3 = (C31481dI) A09;
                    C30721bp A002 = C30721bp.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                    if (str == null) {
                        A002.A03[1] = 1;
                    } else {
                        A002.A02(1, str);
                    }
                    AbstractC16780qQ r0 = r3.A01;
                    r0.A01();
                    Cursor A003 = C16830qW.A00(r0, A002, false);
                    try {
                        ArrayList arrayList = new ArrayList(A003.getCount());
                        while (A003.moveToNext()) {
                            arrayList.add(A003.getString(0));
                        }
                        A003.close();
                        A002.A01();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            A00(r5, (String) it.next());
                        }
                        workDatabase.A04();
                        workDatabase.A03();
                        if (r7.A02) {
                            AnonymousClass0s6.A01(r5.A04, r5.A07);
                        }
                    } catch (Throwable th) {
                        A003.close();
                        A002.A01();
                        throw th;
                    }
                } catch (Throwable th2) {
                    workDatabase.A03();
                    throw th2;
                }
            } else if (!(this instanceof C31511dL)) {
                C31501dK r72 = (C31501dK) this;
                C31221cl r2 = r72.A00;
                WorkDatabase workDatabase2 = r2.A04;
                workDatabase2.A02();
                try {
                    A00(r2, r72.A01.toString());
                    workDatabase2.A04();
                    workDatabase2.A03();
                    AnonymousClass0s6.A01(r2.A04, r2.A07);
                } catch (Throwable th3) {
                    workDatabase2.A03();
                    throw th3;
                }
            } else {
                C31511dL r73 = (C31511dL) this;
                C31221cl r52 = r73.A00;
                WorkDatabase workDatabase3 = r52.A04;
                workDatabase3.A02();
                try {
                    AbstractC18040sg A092 = workDatabase3.A09();
                    String str2 = r73.A01;
                    C31481dI r32 = (C31481dI) A092;
                    C30721bp A004 = C30721bp.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
                    if (str2 == null) {
                        A004.A03[1] = 1;
                    } else {
                        A004.A02(1, str2);
                    }
                    AbstractC16780qQ r02 = r32.A01;
                    r02.A01();
                    Cursor A005 = C16830qW.A00(r02, A004, false);
                    try {
                        ArrayList arrayList2 = new ArrayList(A005.getCount());
                        while (A005.moveToNext()) {
                            arrayList2.add(A005.getString(0));
                        }
                        A005.close();
                        A004.A01();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            A00(r52, (String) it2.next());
                        }
                        workDatabase3.A04();
                        workDatabase3.A03();
                        AnonymousClass0s6.A01(r52.A04, r52.A07);
                    } catch (Throwable th4) {
                        A005.close();
                        A004.A01();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    workDatabase3.A03();
                    throw th5;
                }
            }
            this.A00.A00(AbstractC17640rt.A01);
        } catch (Throwable th6) {
            this.A00.A00(new C31021cO(th6));
        }
    }
}

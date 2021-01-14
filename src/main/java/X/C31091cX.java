package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1cX  reason: invalid class name and case insensitive filesystem */
public class C31091cX implements AnonymousClass0s4, AbstractC17890sR {
    public static final String A0A = AbstractC17610rq.A01("Processor");
    public Context A00;
    public AnonymousClass01Z A01;
    public WorkDatabase A02;
    public AnonymousClass0t5 A03;
    public List A04;
    public Map A05 = new HashMap();
    public Map A06 = new HashMap();
    public Set A07;
    public final Object A08;
    public final List A09;

    public C31091cX(Context context, AnonymousClass01Z r3, AnonymousClass0t5 r4, WorkDatabase workDatabase, List list) {
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = workDatabase;
        this.A04 = list;
        this.A07 = new HashSet();
        this.A09 = new ArrayList();
        this.A08 = new Object();
    }

    public static boolean A00(String str, RunnableC17740sA r7) {
        boolean z;
        if (r7 != null) {
            r7.A0I = true;
            r7.A06();
            AnonymousClass1EY r0 = r7.A0D;
            if (r0 != null) {
                z = r0.isDone();
                r7.A0D.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = r7.A03;
            if (listenableWorker == null || z) {
                AbstractC17610rq.A00().A02(RunnableC17740sA.A0J, String.format("WorkSpec %s is already done. Not interrupting.", r7.A08), new Throwable[0]);
            } else {
                listenableWorker.A01();
            }
            AbstractC17610rq.A00().A02(A0A, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        AbstractC17610rq.A00().A02(A0A, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public void A01(AnonymousClass0s4 r3) {
        synchronized (this.A08) {
            this.A09.add(r3);
        }
    }

    public void A02(AnonymousClass0s4 r3) {
        synchronized (this.A08) {
            this.A09.remove(r3);
        }
    }

    public boolean A03(String str, C17700s2 r14) {
        synchronized (this.A08) {
            if (this.A05.containsKey(str)) {
                AbstractC17610rq.A00().A02(A0A, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            AnonymousClass0s9 r5 = new AnonymousClass0s9(this.A00, this.A01, this.A03, this, this.A02, str);
            r5.A07 = this.A04;
            if (r14 != null) {
                r5.A02 = r14;
            }
            RunnableC17740sA r7 = new RunnableC17740sA(r5);
            C453624k r6 = r7.A0B;
            r6.A1o(new RunnableEBaseShape1S1200000_I1(this, r6, str, 2), ((C31581dS) this.A03).A02);
            this.A05.put(str, r7);
            ((C31581dS) this.A03).A01.execute(r7);
            AbstractC17610rq.A00().A02(A0A, String.format("%s: processing %s", "Processor", str), new Throwable[0]);
            return true;
        }
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        synchronized (this.A08) {
            this.A05.remove(str);
            AbstractC17610rq.A00().A02(A0A, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (AnonymousClass0s4 r0 : this.A09) {
                r0.AFn(str, z);
            }
        }
    }
}

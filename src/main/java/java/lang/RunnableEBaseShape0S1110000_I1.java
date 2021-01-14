package java.lang;

import X.AbstractC17610rq;
import X.AbstractC18040sg;
import X.AbstractC27251Ot;
import X.AnonymousClass01I;
import X.AnonymousClass0VU;
import X.AnonymousClass3U7;
import X.C27241Os;
import X.C27261Ou;
import X.C31091cX;
import X.C31221cl;
import X.C31481dI;
import X.RunnableC17740sA;
import X.RunnableC18150ss;
import androidx.work.impl.WorkDatabase;
import com.whatsapp.voipcalling.Voip;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

public class RunnableEBaseShape0S1110000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape0S1110000_I1(Object obj, String str, boolean z, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = z;
    }

    public void run() {
        boolean containsKey;
        boolean z;
        Object obj;
        switch (this.A03) {
            case 0:
                C31221cl r4 = (C31221cl) this.A00;
                WorkDatabase workDatabase = r4.A04;
                C31091cX r0 = r4.A03;
                AbstractC18040sg A09 = workDatabase.A09();
                workDatabase.A02();
                try {
                    String str = this.A01;
                    synchronized (r0.A08) {
                        containsKey = r0.A06.containsKey(str);
                    }
                    if (this.A02) {
                        C31091cX r9 = r4.A03;
                        synchronized (r9.A08) {
                            AbstractC17610rq.A00().A02(C31091cX.A0A, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
                            z = C31091cX.A00(str, (RunnableC17740sA) r9.A06.remove(str));
                        }
                    } else {
                        if (!containsKey) {
                            C31481dI r3 = (C31481dI) A09;
                            if (r3.A01(str) == AnonymousClass0VU.RUNNING) {
                                r3.A06(AnonymousClass0VU.ENQUEUED, str);
                            }
                        }
                        C31091cX r92 = r4.A03;
                        synchronized (r92.A08) {
                            AbstractC17610rq.A00().A02(C31091cX.A0A, String.format("Processor stopping background work %s", str), new Throwable[0]);
                            z = C31091cX.A00(str, (RunnableC17740sA) r92.A05.remove(str));
                        }
                    }
                    AbstractC17610rq.A00().A02(RunnableC18150ss.A00, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", str, Boolean.valueOf(z)), new Throwable[0]);
                    workDatabase.A04();
                    return;
                } finally {
                    workDatabase.A03();
                }
            case 1:
                boolean z2 = this.A02;
                String str2 = this.A01;
                C27241Os r2 = (C27241Os) this.A00;
                HashMap hashMap = C27261Ou.A01;
                if (z2) {
                    obj = hashMap.remove(str2);
                } else {
                    obj = hashMap.get(str2);
                }
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        AbstractC27251Ot r02 = (AbstractC27251Ot) it.next();
                        if (r02 != null) {
                            r02.AIE(r2, z2);
                        }
                    }
                }
                if (r2 != null) {
                    C27261Ou.A00.put(str2, r2);
                    return;
                }
                return;
            case 2:
                boolean z3 = this.A02;
                String str3 = this.A01;
                AnonymousClass01I r03 = ((AnonymousClass3U7) this.A00).A1I;
                if (r03 != null) {
                    r03.A04();
                    if (r03.A01 == null) {
                        return;
                    }
                    if (z3) {
                        Voip.endCallAndAcceptPendingCall(str3);
                        return;
                    } else {
                        Voip.acceptCall();
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}

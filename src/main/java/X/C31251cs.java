package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public class C31251cs implements AnonymousClass0s4, AbstractC17820sK, AbstractC18190sw {
    public static final String A09 = AbstractC17610rq.A01("DelayMetCommandHandler");
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final C31261ct A05;
    public final C31291cx A06;
    public final Object A07 = new Object();
    public final String A08;

    public C31251cs(Context context, int i, String str, C31261ct r6) {
        this.A04 = context;
        this.A03 = i;
        this.A05 = r6;
        this.A08 = str;
        this.A06 = new C31291cx(context, r6.A08, this);
    }

    public final void A00() {
        synchronized (this.A07) {
            this.A06.A00();
            C18200sx r0 = this.A05.A07;
            String str = this.A08;
            r0.A00(str);
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC17610rq.A00().A02(A09, String.format("Releasing wakelock %s for WorkSpec %s", this.A01, str), new Throwable[0]);
                this.A01.release();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r14.A06.containsKey(r10) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31251cs.A01():void");
    }

    @Override // X.AbstractC17820sK
    public void ACg(List list) {
        String str = this.A08;
        if (list.contains(str)) {
            synchronized (this.A07) {
                if (this.A00 == 0) {
                    this.A00 = 1;
                    AbstractC17610rq.A00().A02(A09, String.format("onAllConstraintsMet for %s", str), new Throwable[0]);
                    C31261ct r2 = this.A05;
                    if (r2.A04.A03(str, null)) {
                        C18200sx r9 = r2.A07;
                        synchronized (r9.A00) {
                            AbstractC17610rq.A00().A02(C18200sx.A05, String.format("Starting timer for %s", str), new Throwable[0]);
                            r9.A00(str);
                            RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = new RunnableEBaseShape1S1100000_I1(r9, str, 0);
                            r9.A02.put(str, runnableEBaseShape1S1100000_I1);
                            r9.A01.put(str, this);
                            r9.A03.schedule(runnableEBaseShape1S1100000_I1, 600000, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        A00();
                    }
                } else {
                    AbstractC17610rq.A00().A02(A09, String.format("Already started work for %s", str), new Throwable[0]);
                }
            }
        }
    }

    @Override // X.AbstractC17820sK
    public void ACh(List list) {
        A01();
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        AbstractC17610rq.A00().A02(A09, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        A00();
        if (z) {
            Context context = this.A04;
            String str2 = this.A08;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", str2);
            C31261ct r3 = this.A05;
            r3.A03.post(new RunnableEBaseShape1S0201000_I1(intent, this.A03, r3, 4));
        }
        if (this.A02) {
            Intent intent2 = new Intent(this.A04, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            C31261ct r32 = this.A05;
            r32.A03.post(new RunnableEBaseShape1S0201000_I1(intent2, this.A03, r32, 4));
        }
    }

    @Override // X.AbstractC18190sw
    public void AKy(String str) {
        AbstractC17610rq.A00().A02(A09, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        A01();
    }
}

package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0GW  reason: invalid class name */
public class AnonymousClass0GW {
    public static volatile AnonymousClass0GW A08;
    public ScheduledFuture A00;
    public final C000300f A01;
    public final AnonymousClass0A5 A02;
    public final C52532bH A03;
    public final AnonymousClass0AO A04;
    public final RunnableEBaseShape0S0701000_I0 A05;
    public final RunnableEBaseShape0S0701000_I0 A06;
    public final ScheduledThreadPoolExecutor A07;

    public AnonymousClass0GW(AnonymousClass00S r11, C014408c r12, AnonymousClass009 r13, C000300f r14, AnonymousClass01K r15, C019309z r16, AnonymousClass0AO r17, AnonymousClass0A5 r18, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.A01 = r14;
        this.A04 = r17;
        C52532bH r2 = new C52532bH(this);
        this.A03 = r2;
        this.A05 = new RunnableEBaseShape0S0701000_I0(r12, r2, r15, r13, 100, r16, r11, r17, 1);
        this.A06 = new RunnableEBaseShape0S0701000_I0(r12, null, r15, r13, 0, r16, r11, r17, 1);
        this.A02 = r18;
        this.A07 = scheduledThreadPoolExecutor;
    }

    public static AnonymousClass0GW A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0GW.class) {
                if (A08 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C014408c A003 = C014408c.A00();
                    AnonymousClass009 A004 = AnonymousClass009.A00();
                    C000300f A005 = C000300f.A00();
                    AnonymousClass01K A006 = AnonymousClass01K.A00();
                    C019309z A012 = C019309z.A01();
                    AnonymousClass0AO A007 = AnonymousClass0AO.A00();
                    AnonymousClass0A5 A008 = AnonymousClass0A5.A00();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    A08 = new AnonymousClass0GW(A002, A003, A004, A005, A006, A012, A007, A008, scheduledThreadPoolExecutor);
                }
            }
        }
        return A08;
    }

    public void A01() {
        if (this.A01.A0D(AbstractC000400g.A0v)) {
            this.A07.execute(new RunnableEBaseShape2S0100000_I0_2(this, 42));
        }
    }

    public final synchronized void A02(long j, boolean z, RunnableEBaseShape0S0701000_I0 runnableEBaseShape0S0701000_I0) {
        long j2 = 0;
        if (j != 0) {
            if (this.A02 != null) {
                j2 = Math.max(30000L, j);
            } else {
                throw null;
            }
        }
        ScheduledFuture scheduledFuture = this.A00;
        if (scheduledFuture != null && !scheduledFuture.isDone() && this.A00.getDelay(TimeUnit.MILLISECONDS) > j2 && !this.A00.cancel(false)) {
            Log.e("EphemeralDeletionManager/scheduleRunnable/unable to cancel future");
        }
        if (j2 < 86400000) {
            ScheduledFuture<?> schedule = this.A07.schedule(runnableEBaseShape0S0701000_I0, j2, TimeUnit.MILLISECONDS);
            this.A00 = schedule;
            if (z) {
                try {
                    schedule.get();
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("EphemeralDeletionManager/scheduleNextRun", e);
                }
            }
        }
    }

    public void A03(AnonymousClass02N r7, String str) {
        StringBuilder sb = new StringBuilder("EphemeralDeletionManager/sessionActive/");
        sb.append(str);
        sb.append("/");
        sb.append(r7);
        Log.d(sb.toString());
        AnonymousClass0AO r5 = this.A04;
        if (r5.A00 == -1) {
            r5.A00 = r5.A01.A05();
        }
        Map map = r5.A03;
        Set set = (Set) map.get(r7);
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        map.put(r7, set);
    }

    public void A04(AnonymousClass02N r5, String str) {
        StringBuilder sb = new StringBuilder("EphemeralDeletionManager/sessionInactive/");
        sb.append(str);
        sb.append("/");
        sb.append(r5);
        Log.d(sb.toString());
        AnonymousClass0AO r3 = this.A04;
        Map map = r3.A03;
        Set set = (Set) map.get(r5);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(r5);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("EphemeralSessionManager/null session: ");
            sb2.append(r5);
            Log.e(sb2.toString());
        }
        if (map.isEmpty()) {
            r3.A00 = -1;
        }
        if (r5 != null) {
            AnonymousClass0AP r0 = r3.A02;
            AbstractC007503q r1 = null;
            if (r5 == null) {
                Log.e("msgstore/last/message/jid is null");
            } else {
                C08560bL A052 = r0.A03.A05(r5);
                if (A052 == null) {
                    AnonymousClass008.A13("msgstore/last/message/no chat for ", r5);
                } else {
                    r1 = A052.A0O;
                }
            }
            if (r1 != null) {
                boolean z = false;
                if (r1.A02 > 0) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        A01();
    }
}

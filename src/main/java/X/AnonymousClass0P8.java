package X;

import com.whatsapp.schedulers.work.SchedulerExperimentWorker;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0P8  reason: invalid class name */
public class AnonymousClass0P8 {
    public static volatile AnonymousClass0P8 A02;
    public final AbstractC17680ry A00;
    public final AnonymousClass0P4 A01;

    public AnonymousClass0P8(AnonymousClass0P4 r1, AbstractC17680ry r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static AnonymousClass0P8 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0P7.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0P8(AnonymousClass0P4.A00(), C31221cl.A00(AnonymousClass00G.A01.A00));
                }
            }
        }
        return A02;
    }

    public final C17670rx A01() {
        C31221cl r0 = (C31221cl) this.A00;
        if (r0 != null) {
            C31531dN r1 = new C31531dN(r0);
            ((C31581dS) r0.A06).A01.execute(r1);
            try {
                List list = (List) ((AbstractRunnableC18140sr) r1).A00.get();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                return (C17670rx) list.get(0);
            } catch (InterruptedException | ExecutionException e) {
                Log.d("SchExpWorkers/find_work; failed to find work", e);
                return null;
            }
        } else {
            throw null;
        }
    }

    public void A02() {
        AnonymousClass0P4 r2 = this.A01;
        if (r2.A01() != 7) {
            Log.d("SchExpWorkers/schedule; wrong bucket");
            return;
        }
        long A022 = r2.A02();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C31051cS r22 = new C31051cS(SchedulerExperimentWorker.class, A022, timeUnit, A022 / 2, timeUnit);
        r22.A01.add(Long.toString(A022));
        AbstractC17680ry r23 = this.A00;
        C31221cl r24 = (C31221cl) r23;
        r24.A03("com.whatsapp.schedulers.work.PERIODIC", EnumC17560rk.KEEP, (C31061cT) r22.A00()).A00();
        StringBuilder sb = new StringBuilder("SchExpWorkers/schedule; scheduled with ");
        sb.append((A022 / 1000) / 60);
        sb.append("m period.");
        Log.d(sb.toString());
    }
}

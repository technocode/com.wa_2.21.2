package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0EB  reason: invalid class name */
public class AnonymousClass0EB {
    public final Context A00;
    public final Executor A01 = Executors.newSingleThreadExecutor();
    public final C05150Nj A02 = new C05150Nj();
    public final C05170Nl A03;
    public final C05180Nm A04;

    public AnonymousClass0EB(Context context, String str, List list, C05140Ni r9, int i) {
        this.A00 = context;
        C05170Nl r1 = new C05170Nl();
        this.A03 = r1;
        this.A04 = new C05180Nm(context, str, r9, r1);
        this.A01.execute(new RunnableEBaseShape4S0200000_I0_3(this));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0NT) it.next()).AOR(this);
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            new AnonymousClass0OA(AnonymousClass008.A0F("JobConsumer-", i2), this.A02, this.A04).start();
        }
    }

    public void A00() {
        this.A01.execute(new RunnableEBaseShape4S0100000_I0_4(this, 49));
    }

    public void A01(Job job) {
        if (job.parameters.wakeLock) {
            Context context = this.A00;
            String obj = job.toString();
            long j = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j);
            }
            job.A02 = newWakeLock;
        }
        this.A01.execute(new RunnableEBaseShape4S0200000_I0_3(this, job, 23));
    }
}

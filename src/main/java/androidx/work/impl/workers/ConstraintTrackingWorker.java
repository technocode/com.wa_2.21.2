package androidx.work.impl.workers;

import X.AbstractC17610rq;
import X.AbstractC17820sK;
import X.C453624k;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements AbstractC17820sK {
    public static final String A05 = AbstractC17610rq.A01("ConstraintTrkngWrkr");
    public ListenableWorker A00;
    public WorkerParameters A01;
    public C453624k A02 = new C453624k();
    public final Object A03 = new Object();
    public volatile boolean A04 = false;

    @Override // X.AbstractC17820sK
    public void ACg(List list) {
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = workerParameters;
    }

    @Override // X.AbstractC17820sK
    public void ACh(List list) {
        AbstractC17610rq.A00().A02(A05, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.A03) {
            this.A04 = true;
        }
    }
}

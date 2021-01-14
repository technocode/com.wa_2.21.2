package X;

import android.app.job.JobInfo;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.3N3  reason: invalid class name */
public class AnonymousClass3N3 implements AbstractC655430e {
    public final AnonymousClass0P7 A00;

    @Override // X.AbstractC655430e
    public int A7U() {
        return 21;
    }

    public AnonymousClass3N3(AnonymousClass0P7 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC655430e
    public void A2z() {
        AnonymousClass0P7 r5 = this.A00;
        if (r5 != null) {
            Log.d("SchExpJobs/periodic_api/consistency;");
            AnonymousClass0P4 r2 = r5.A01;
            if (r2.A01() != 4) {
                Log.d("SchExpJobs/periodic_api/consistency; wrong bucket");
            } else if (Build.VERSION.SDK_INT < 21) {
                Log.d("SchExpJobs/periodic_api/consistency; unsupported OS version");
            } else {
                JobInfo A01 = r5.A01(11);
                if (A01 == null) {
                    Log.d("SchExpJobs/periodic_api/consistency; not scheduled, rescheduling...");
                    r5.A05();
                    return;
                }
                boolean isPeriodic = A01.isPeriodic();
                long intervalMillis = A01.getIntervalMillis();
                long A02 = r2.A02();
                if (!isPeriodic || intervalMillis != A02) {
                    Log.d("SchExpJobs/periodic_api/consistency; period does not match, rescheduling...");
                    r5.A02();
                    r5.A05();
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        return this.A00.A01(11) != null;
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A05();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        this.A00.A02();
    }
}

package X;

import android.app.job.JobInfo;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.3N1  reason: invalid class name */
public class AnonymousClass3N1 implements AbstractC655430e {
    public final AnonymousClass0P7 A00;

    @Override // X.AbstractC655430e
    public int A7U() {
        return 21;
    }

    public AnonymousClass3N1(AnonymousClass0P7 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC655430e
    public void A2z() {
        AnonymousClass0P7 r8 = this.A00;
        if (r8 != null) {
            Log.d("SchExpJobs/manual_post/consistency;");
            AnonymousClass0P4 r2 = r8.A01;
            if (r2.A01() != 6) {
                Log.d("SchExpJobs/manual_post/consistency; wrong bucket");
            } else if (Build.VERSION.SDK_INT < 21) {
                Log.d("SchExpJobs/manual_post/consistency; unsupported OS version");
            } else {
                JobInfo A01 = r8.A01(14);
                if (A01 == null) {
                    Log.d("SchExpJobs/manual_post/consistency; not scheduled, rescheduling...");
                    r8.A03();
                    return;
                }
                long minLatencyMillis = A01.getMinLatencyMillis();
                long maxExecutionDelayMillis = A01.getMaxExecutionDelayMillis();
                long A02 = r2.A02();
                if (A02 != minLatencyMillis || A02 != maxExecutionDelayMillis) {
                    Log.d("SchExpJobs/manual_post/consistency; period does not match, rescheduling...");
                    Log.d("SchExpJobs/manual_post/cancel;");
                    r8.A06(14);
                    r8.A03();
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        return this.A00.A01(14) != null;
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A03();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        AnonymousClass0P7 r1 = this.A00;
        if (r1 != null) {
            Log.d("SchExpJobs/manual_post/cancel;");
            r1.A06(14);
            return;
        }
        throw null;
    }
}

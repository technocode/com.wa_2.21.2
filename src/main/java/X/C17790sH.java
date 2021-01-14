package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.0sH  reason: invalid class name and case insensitive filesystem */
public class C17790sH {
    public static final String A01 = AbstractC17610rq.A01("SystemJobInfoConverter");
    public final ComponentName A00;

    public C17790sH(Context context) {
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri A00(C07000Vn r3) {
        return new JobInfo.TriggerContentUri(r3.A00, r3.A01 ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo A01(X.C18030sf r13, int r14) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17790sH.A01(X.0sf, int):android.app.job.JobInfo");
    }
}

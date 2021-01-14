package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.0Nl  reason: invalid class name and case insensitive filesystem */
public class C05170Nl {
    public void A00(Context context, Job job) {
        if (job instanceof AnonymousClass0EA) {
            ((AnonymousClass0EA) job).AO7(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof AnonymousClass0EA) {
                ((AnonymousClass0EA) requirement).AO7(context);
            }
        }
    }
}

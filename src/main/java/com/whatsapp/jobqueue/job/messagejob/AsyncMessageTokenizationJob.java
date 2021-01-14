package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass01X;
import X.AnonymousClass0AM;
import android.content.Context;

public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public transient AnonymousClass0AM A00;

    public AsyncMessageTokenizationJob(long j) {
        super(j);
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob, X.AnonymousClass0EA
    public void AO7(Context context) {
        super.AO7(context);
        this.A00 = AnonymousClass0AM.A00();
        AnonymousClass01X.A00();
    }
}

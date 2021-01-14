package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass09V;
import X.AnonymousClass0EA;
import X.C014508d;
import android.content.Context;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public abstract class AsyncMessageJob extends Job implements AnonymousClass0EA {
    public transient AnonymousClass09V A00;
    public transient C014508d A01;
    public final long rowId;

    public AsyncMessageJob(long j) {
        super(new JobParameters(new LinkedList(), true, "async-message"));
        this.rowId = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0202, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0209, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x020d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0214, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01de, code lost:
        r0 = move-exception;
     */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
        // Method dump skipped, instructions count: 533
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob.A03():void");
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass09V.A00();
        this.A01 = C014508d.A00();
    }
}

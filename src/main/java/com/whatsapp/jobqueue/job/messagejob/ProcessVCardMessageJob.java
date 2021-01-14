package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass00G;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass0AM;
import X.AnonymousClass0CN;
import X.C016909b;
import X.C017009c;
import android.content.Context;

public class ProcessVCardMessageJob extends AsyncMessageJob {
    public transient C017009c A00;
    public transient AnonymousClass01A A01;
    public transient AnonymousClass00G A02;
    public transient AnonymousClass01X A03;
    public transient AnonymousClass0AM A04;
    public transient C016909b A05;
    public transient AnonymousClass0CN A06;

    public ProcessVCardMessageJob(long j) {
        super(j);
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob, X.AnonymousClass0EA
    public void AO7(Context context) {
        super.AO7(context);
        AnonymousClass00G r6 = AnonymousClass00G.A01;
        AnonymousClass0CN A002 = AnonymousClass0CN.A00();
        AnonymousClass01A A003 = AnonymousClass01A.A00();
        AnonymousClass01X A004 = AnonymousClass01X.A00();
        AnonymousClass0AM A005 = AnonymousClass0AM.A00();
        C016909b A006 = C016909b.A00();
        C017009c A007 = C017009c.A00();
        this.A02 = r6;
        this.A06 = A002;
        this.A01 = A003;
        this.A03 = A004;
        this.A04 = A005;
        this.A05 = A006;
        this.A00 = A007;
    }
}

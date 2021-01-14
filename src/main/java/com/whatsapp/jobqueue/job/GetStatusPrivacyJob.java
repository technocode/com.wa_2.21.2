package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass09E;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1WZ;
import X.C55542gk;
import android.content.Context;
import android.os.Message;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class GetStatusPrivacyJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass09E A00;
    public transient AnonymousClass09H A01;

    public GetStatusPrivacyJob(JobParameters jobParameters) {
        super(jobParameters);
    }

    public static GetStatusPrivacyJob A00() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ChatConnectionRequirement());
        return new GetStatusPrivacyJob(new JobParameters(linkedList, true, "GetStatusPrivacyJob"));
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        AtomicInteger atomicInteger = new AtomicInteger();
        String A02 = this.A01.A02();
        ((AnonymousClass0I1) this.A01.A05(A02, Message.obtain(null, 0, 121, 0, new AnonymousClass1WZ(A02, new C55542gk(this, atomicInteger))), false)).get(32000, TimeUnit.MILLISECONDS);
        if (atomicInteger.get() == 500) {
            StringBuilder A0S = AnonymousClass008.A0S("server 500 error during get status privacy job");
            A0S.append(A05());
            throw new Exception(A0S.toString());
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass09E.A00();
        this.A01 = AnonymousClass09H.A01();
    }
}

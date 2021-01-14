package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.C000300f;
import X.C02130At;
import X.C02400Bv;
import X.C02770Dj;
import X.C03100Eu;
import X.C64392y7;
import android.content.Context;
import android.os.Message;
import java.util.LinkedList;
import java.util.concurrent.Future;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class SendWebForwardJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass009 A00;
    public transient AnonymousClass01I A01;
    public transient C000300f A02;
    public transient AnonymousClass01J A03;
    public transient C02770Dj A04;
    public transient AnonymousClass09H A05;
    public transient C02130At A06;
    public transient C03100Eu A07;
    public transient C02400Bv A08;
    public final transient Message A09;
    public final transient String A0A;
    public final transient String A0B;

    public final class AckWebForwardJob extends Job implements AnonymousClass0EA {
        public static final long serialVersionUID = 1;
        public transient AnonymousClass01J A00;
        public transient C02400Bv A01;
        public final transient Message A02;
        public final transient String A03;
        public final transient String A04;
        public final transient Future A05;

        public AckWebForwardJob(String str, String str2, Message message, Future future) {
            super(new JobParameters(new LinkedList(), false, "webAck"));
            this.A03 = str;
            this.A02 = message;
            this.A04 = str2;
            this.A05 = future;
        }

        @Override // org.whispersystems.jobqueue.Job
        public void A03() {
            StringBuilder A0S = AnonymousClass008.A0S("job/ackWebFwd/onRun/block id=");
            String str = this.A03;
            A0S.append(str);
            A0S.append("; ref=");
            String str2 = this.A04;
            AnonymousClass008.A1S(A0S, str2);
            this.A05.get();
            StringBuilder sb = new StringBuilder("job/ackWebFwd/onRun/unblock id=");
            sb.append(str);
            sb.append("; ref=");
            AnonymousClass008.A1S(sb, str2);
        }

        @Override // X.AnonymousClass0EA
        public void AO7(Context context) {
            this.A01 = C02400Bv.A00();
            this.A00 = AnonymousClass01J.A00();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendWebForwardJob(java.lang.String r5, java.lang.String r6, android.os.Message r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r2 = "webSend"
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            r0 = 0
            if (r5 == 0) goto L_0x0026
            r4.A0A = r5
            if (r7 == 0) goto L_0x0025
            r4.A09 = r7
            r4.A0B = r6
            return
        L_0x0025:
            throw r0
        L_0x0026:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendWebForwardJob.<init>(java.lang.String, java.lang.String, android.os.Message):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r1 != 28) goto L_0x008b;
     */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendWebForwardJob.A03():void");
    }

    public final void A05(C64392y7 r9) {
        byte[] bArr;
        AnonymousClass009 r2 = this.A00;
        AnonymousClass01I r3 = this.A01;
        C000300f r4 = this.A02;
        C02770Dj r5 = this.A04;
        C03100Eu r6 = this.A07;
        C02130At r7 = this.A06;
        synchronized (r9) {
            bArr = r9.A0Q;
        }
        if (bArr == null) {
            byte[] A052 = r9.A05(r2, r3, r4, r5, r6, r7);
            synchronized (r9) {
                r9.A0Q = A052;
            }
        }
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass009.A00();
        this.A01 = AnonymousClass01I.A00();
        this.A08 = C02400Bv.A00();
        this.A02 = C000300f.A00();
        this.A03 = AnonymousClass01J.A00();
        this.A04 = C02770Dj.A00();
        this.A05 = AnonymousClass09H.A01();
        this.A07 = C03100Eu.A00();
        this.A06 = C02130At.A00();
    }
}

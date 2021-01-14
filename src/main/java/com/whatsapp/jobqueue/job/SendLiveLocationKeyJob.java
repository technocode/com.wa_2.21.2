package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01S;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.C001000o;
import X.C001400w;
import X.C04540Kt;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import org.whispersystems.jobqueue.Job;

public final class SendLiveLocationKeyJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01I A00;
    public transient C04540Kt A01;
    public transient C001000o A02;
    public transient C001400w A03;
    public transient AnonymousClass01S A04;
    public transient AnonymousClass09H A05;
    public final ArrayList rawJids;
    public final Integer retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r5, byte[] r6, int r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(java.util.List r5) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0009
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L_0x0026
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0009
        L_0x0026:
            r0 = 0
            throw r0
        L_0x0028:
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendLiveLocationKeyJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.AnonymousClass00E.A05(r5)
            java.util.ArrayList r0 = X.AnonymousClass1VY.A0F(r5)
            r4.rawJids = r0
            r0 = 0
            r4.retryCount = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x011c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 669
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.A03():void");
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; persistentId=");
        A0S.append(super.A01);
        A0S.append("; jids.size()=");
        A0S.append(this.rawJids.size());
        A0S.append("; retryCount=");
        A0S.append(this.retryCount);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01I.A00();
        this.A05 = AnonymousClass09H.A01();
        this.A03 = C001400w.A02;
        this.A02 = C001000o.A00();
        this.A01 = C04540Kt.A00();
        this.A04 = AnonymousClass01S.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ArrayList arrayList = this.rawJids;
        if (arrayList == null || arrayList.isEmpty()) {
            StringBuilder A0S = AnonymousClass008.A0S("jids must not be empty");
            A0S.append(A05());
            throw new InvalidObjectException(A0S.toString());
        }
        Integer num = this.retryCount;
        if (num != null && num.intValue() < 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("retryCount cannot be negative");
            A0S2.append(A05());
            throw new InvalidObjectException(A0S2.toString());
        }
    }
}

package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1XX;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendPermanentFailureReceiptJob extends Job implements AnonymousClass0EA {
    public transient AnonymousClass09H A00;
    public final String jid;
    public final String messageKeyId;
    public final String participant;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPermanentFailureReceiptJob(X.AnonymousClass02N r5, X.AnonymousClass02N r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "permanent-failure-"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jid = r0
            java.lang.String r0 = X.AnonymousClass1VY.A0D(r6)
            r4.participant = r0
            r4.messageKeyId = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob.<init>(X.02N, X.02N, java.lang.String):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        ArrayList arrayList;
        AnonymousClass02N A01 = AnonymousClass02N.A01(this.jid);
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.participant);
        HashMap hashMap = new HashMap();
        String str = this.messageKeyId;
        if (hashMap.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(hashMap.values());
        }
        AnonymousClass1XX r5 = new AnonymousClass1XX(A01, "receipt", str, "error", null, A012, null, null, 0, arrayList);
        AnonymousClass09H r52 = this.A00;
        String str2 = this.messageKeyId;
        Message obtain = Message.obtain(null, 0, 163, 0, A01);
        obtain.getData().putString("messageKeyId", str2);
        obtain.getData().putParcelable("remoteResource", A012);
        ((AnonymousClass0I1) r52.A04(r5, obtain)).get();
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; jid=");
        A0S.append(this.jid);
        A0S.append("; participant=");
        A0S.append(this.participant);
        A0S.append("; id=");
        A0S.append(this.messageKeyId);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass09H.A01();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.messageKeyId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }
}

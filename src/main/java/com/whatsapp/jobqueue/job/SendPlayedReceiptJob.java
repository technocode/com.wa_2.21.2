package com.whatsapp.jobqueue.job;

import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.AnonymousClass1XX;
import X.C28971Wl;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendPlayedReceiptJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass09H A00;
    public final int editVersion;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;
    public final String webAttrString;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJob(X.AbstractC007503q r9) {
        /*
            r8 = this;
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r6 = 0
            java.lang.String r0 = "played-receipt-"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r5 = r9.A0n
            X.02N r4 = r5.A00
            if (r4 == 0) goto L_0x0048
            java.lang.String r0 = r4.getRawString()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r7.add(r0)
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r7, r2, r3)
            r8.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r8.remoteJidRawJid = r0
            X.02N r0 = r9.A07()
            java.lang.String r0 = X.AnonymousClass1VY.A0D(r0)
            r8.remoteResourceRawJid = r0
            java.lang.String r0 = r5.A01
            r8.messageId = r0
            r8.webAttrString = r1
            r8.editVersion = r6
            return
        L_0x0048:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJob.<init>(X.03q):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        AnonymousClass02N r3;
        ArrayList arrayList;
        AnonymousClass02N A002 = AnonymousClass02N.A00(this.remoteJidRawJid);
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            r3 = AnonymousClass02N.A01(this.remoteResourceRawJid);
        } else {
            r3 = null;
        }
        StringBuilder sb = new StringBuilder("SendPlayedReceiptJob/onRun: remoteJid=");
        sb.append(A002);
        sb.append("; remoteResource=");
        sb.append(r3);
        sb.append("; id=");
        sb.append(this.messageId);
        Log.d(sb.toString());
        AnonymousClass02N r5 = r3;
        if (!AnonymousClass1VY.A0T(r3)) {
            r5 = A002;
            A002 = r3;
        }
        HashMap hashMap = new HashMap();
        String str = this.messageId;
        if (hashMap.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(hashMap.values());
        }
        ((AnonymousClass0I1) this.A00.A04(new AnonymousClass1XX(r5, "receipt", str, "played", null, A002, null, null, 0, arrayList), Message.obtain(null, 0, 38, 0, new C28971Wl(r5, A002, this.messageId)))).get();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass09H.A01();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw new InvalidObjectException("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }
}

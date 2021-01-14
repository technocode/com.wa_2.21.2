package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass01S;
import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1XX;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public class SendDisableLiveLocationJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01S A00;
    public transient AnonymousClass09H A01;
    public final String rawJid;
    public final long sequenceNumber;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDisableLiveLocationJob(X.AnonymousClass02N r5, long r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = r5.getRawString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.rawJid = r0
            r4.sequenceNumber = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.02N, long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        ArrayList arrayList;
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.rawJid);
        if (A012 == null) {
            AnonymousClass008.A1T(AnonymousClass008.A0S("skip disable live location job; invalid jid: "), this.rawJid);
        } else if (this.A00.A0e(A012)) {
            StringBuilder A0S = AnonymousClass008.A0S("skip disable live location job; sharing is currently enabled");
            A0S.append(A05());
            Log.i(A0S.toString());
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("starting disable live location job");
            A0S2.append(A05());
            Log.i(A0S2.toString());
            String A03 = this.A01.A03();
            HashMap hashMap = new HashMap();
            if (hashMap.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(hashMap.values());
            }
            AnonymousClass1XX r6 = new AnonymousClass1XX(A012, "notification", A03, "location", null, null, null, null, 0, arrayList);
            AnonymousClass09H r7 = this.A01;
            AnonymousClass02N A013 = AnonymousClass02N.A01(this.rawJid);
            long j = this.sequenceNumber;
            Message obtain = Message.obtain(null, 0, 81, 0);
            obtain.getData().putString("id", A03);
            obtain.getData().putParcelable("jid", A013);
            obtain.getData().putLong("seq", j);
            ((AnonymousClass0I1) r7.A04(r6, obtain)).get();
            StringBuilder sb = new StringBuilder("done disable live location job");
            sb.append(A05());
            Log.i(sb.toString());
        }
    }

    public final String A05() {
        StringBuilder A0W = AnonymousClass008.A0W("; jid=", AnonymousClass02N.A01(this.rawJid), "; persistentId=");
        A0W.append(super.A01);
        return A0W.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = AnonymousClass09H.A01();
        this.A00 = AnonymousClass01S.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }
}

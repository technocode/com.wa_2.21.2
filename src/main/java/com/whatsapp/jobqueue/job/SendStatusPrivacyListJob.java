package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass09H;
import X.AnonymousClass0C4;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.C55562gy;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

public final class SendStatusPrivacyListJob extends Job implements AnonymousClass0EA {
    public static volatile long A02 = 0;
    public static final long serialVersionUID = 1;
    public transient AnonymousClass09H A00;
    public transient AnonymousClass0C4 A01;
    public final Collection jids;
    public final int statusDistribution;
    public final String webId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendStatusPrivacyListJob(int r5, java.util.Collection r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendStatusPrivacyListJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            r4.statusDistribution = r5
            if (r6 != 0) goto L_0x0022
            r0 = 0
        L_0x001d:
            r4.jids = r0
            r4.webId = r7
            return
        L_0x0022:
            java.util.ArrayList r0 = X.AnonymousClass1VY.A0F(r6)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(int, java.util.Collection, java.lang.String):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        ArrayList<? extends Parcelable> arrayList;
        if (A02 != super.A01) {
            StringBuilder A0S = AnonymousClass008.A0S("skip send status privacy job");
            A0S.append(A05());
            A0S.append("; lastJobId=");
            AnonymousClass008.A1P(A0S, A02);
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("run send status privacy job");
        A0S2.append(A05());
        Log.i(A0S2.toString());
        AtomicInteger atomicInteger = new AtomicInteger();
        String str = this.webId;
        if (str == null) {
            str = this.A00.A02();
        }
        AnonymousClass09H r6 = this.A00;
        int i = this.statusDistribution;
        Collection collection = this.jids;
        if (collection == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            AnonymousClass1VY.A0O(UserJid.class, collection, arrayList);
        }
        Message obtain = Message.obtain(null, 0, 120, 0, new C55562gy(this, atomicInteger));
        Bundle data = obtain.getData();
        data.putString("id", str);
        data.putInt("statusDistributionMode", i);
        if (arrayList != null) {
            data.putParcelableArrayList("jids", arrayList);
        }
        ((AnonymousClass0I1) r6.A05(str, obtain, false)).get();
        int i2 = atomicInteger.get();
        if (i2 == 500) {
            StringBuilder A0S3 = AnonymousClass008.A0S("server 500 error during send status privacy job");
            A0S3.append(A05());
            throw new Exception(A0S3.toString());
        } else if (i2 != 0) {
            StringBuilder sb = new StringBuilder("server error code returned during send status privacy job; errorCode=");
            sb.append(i2);
            sb.append(A05());
            Log.w(sb.toString());
        }
    }

    public final String A05() {
        String arrays;
        Jid nullable;
        StringBuilder A0S = AnonymousClass008.A0S("; statusDistribution=");
        A0S.append(this.statusDistribution);
        A0S.append("; jids=");
        Collection<String> collection = this.jids;
        if (collection == null) {
            arrays = "null";
        } else {
            ArrayList arrayList = new ArrayList(collection.size());
            for (String str : collection) {
                if (!(str == null || (nullable = Jid.getNullable(str)) == null)) {
                    arrayList.add(nullable);
                }
            }
            arrays = Arrays.toString(arrayList.toArray());
        }
        A0S.append(arrays);
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = AnonymousClass0C4.A00();
        this.A00 = AnonymousClass09H.A01();
    }
}

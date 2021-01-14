package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass02Y;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.C04540Kt;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class GetVNameCertificateJob extends Job implements AnonymousClass0EA {
    public static final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient C04540Kt A00;
    public transient AnonymousClass09H A01;
    public final String jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r3 = r6.getRawString()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r6)
            if (r1 == 0) goto L_0x0032
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r4.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r2, r3)
            r5.<init>(r0)
            java.lang.String r0 = r6.getRawString()
            X.AnonymousClass00E.A03(r0)
            r5.jid = r0
            return
        L_0x0032:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("starting get vname certificate job");
            sb.append(A05());
            Log.i(sb.toString());
            String A022 = this.A01.A02();
            AnonymousClass09H r4 = this.A01;
            UserJid userJid = UserJid.get(this.jid);
            Message obtain = Message.obtain(null, 0, 118, 0);
            Bundle data = obtain.getData();
            data.putString("id", A022);
            data.putParcelable("jid", userJid);
            ((AnonymousClass0I1) r4.A05(A022, obtain, false)).get();
            A02.remove(this.jid);
            return;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            A02.remove(this.jid);
            throw th;
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; jid=");
        A0S.append(UserJid.getNullable(this.jid));
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = AnonymousClass09H.A01();
        this.A00 = C04540Kt.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.jid)) {
            try {
                UserJid.get(this.jid);
                A02.put(this.jid, Boolean.TRUE);
            } catch (AnonymousClass02Y unused) {
                StringBuilder A0S = AnonymousClass008.A0S("jid must be an individual jid; jid=");
                A0S.append(this.jid);
                throw new InvalidObjectException(A0S.toString());
            }
        } else {
            throw new InvalidObjectException("jid must not be empty");
        }
    }
}

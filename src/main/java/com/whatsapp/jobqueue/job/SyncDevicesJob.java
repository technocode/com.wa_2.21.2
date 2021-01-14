package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass0EA;
import X.AnonymousClass0ER;
import X.AnonymousClass0HN;
import X.AnonymousClass0QK;
import X.AnonymousClass1VY;
import X.C015808q;
import X.EnumC03840Hy;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.Job;

public final class SyncDevicesJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0HN A00;
    public transient AnonymousClass0ER A01;
    public transient C015808q A02;
    public final String[] jids;
    public final int syncType;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            X.AnonymousClass00E.A0B(r5)
            int r3 = r5.length
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x0028
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.AnonymousClass00E.A04(r1, r0)
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0028:
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String[] r0 = X.AnonymousClass1VY.A0g(r0)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        EnumC03840Hy r0;
        try {
            if (!this.A02.A03()) {
                this.A01.A01(this.jids);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SyncDevicesJob/onRun/start sync device. param=");
            sb.append(A05());
            Log.i(sb.toString());
            AnonymousClass0HN r3 = this.A00;
            List A0H = AnonymousClass1VY.A0H(this.jids);
            if (!((AbstractCollection) A0H).isEmpty()) {
                int i = this.syncType;
                if (i == 1) {
                    r0 = EnumC03840Hy.MESSAGE_QUERY_DEVICES;
                } else if (i == 2) {
                    r0 = EnumC03840Hy.NOTIFICATION_DEVICE;
                } else if (i == 3) {
                    r0 = EnumC03840Hy.BACKGROUND_DEVICE;
                } else if (i != 4) {
                    r0 = EnumC03840Hy.INTERACTIVE_QUERY_DEVICES;
                } else {
                    r0 = EnumC03840Hy.VOIP_QUERY_DEVICES;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SyncDevicesJob/onRun/sync is success=");
                sb2.append(((AnonymousClass0QK) r3.A03(A0H, r0).get()).A00());
                Log.d(sb2.toString());
                this.A01.A01(this.jids);
                return;
            }
            throw new IllegalArgumentException("jid list is empty");
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SyncDevicesJob/onRun/error, param=");
            sb3.append(A05());
            Log.e(sb3.toString());
            throw e;
        } catch (Throwable th) {
            this.A01.A01(this.jids);
            throw th;
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; jids=");
        A0S.append(Arrays.toString(this.jids));
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A02 = C015808q.A00();
        this.A00 = AnonymousClass0HN.A00();
        this.A01 = AnonymousClass0ER.A00();
        String[] strArr = this.jids;
        if (strArr != null && (r3 = strArr.length) > 0) {
            HashSet hashSet = new HashSet();
            for (String str : strArr) {
                UserJid nullable = UserJid.getNullable(str);
                if (nullable != null) {
                    hashSet.add(nullable);
                }
            }
            AnonymousClass0ER r7 = this.A01;
            synchronized (r7.A03) {
                r7.A03.addAll(hashSet);
                long A05 = r7.A00.A05();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    r7.A01.put((UserJid) it.next(), Long.valueOf(A05));
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (r2 = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        for (String str : strArr) {
            if (UserJid.getNullable(str) == null) {
                throw new InvalidObjectException("an jid is not a UserJid");
            }
        }
    }
}

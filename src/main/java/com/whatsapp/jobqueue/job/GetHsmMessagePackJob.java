package com.whatsapp.jobqueue.job;

import X.AbstractC002201f;
import X.AnonymousClass008;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0Ja;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class GetHsmMessagePackJob extends Job implements AnonymousClass0EA {
    public static final HashSet A02 = new HashSet();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0Ja A00;
    public transient AnonymousClass09H A01;
    public final String elementName;
    public final Locale[] locales;
    public final String namespace;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetHsmMessagePackJob(java.util.Locale[] r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r1, r5)
            r3.<init>(r0)
            X.AnonymousClass00E.A0B(r4)
            r3.locales = r4
            X.AnonymousClass00E.A03(r5)
            r3.namespace = r5
            X.AnonymousClass00E.A03(r6)
            r3.elementName = r6
            java.util.HashSet r1 = com.whatsapp.jobqueue.job.GetHsmMessagePackJob.A02
            monitor-enter(r1)
            r1.add(r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetHsmMessagePackJob.<init>(java.util.Locale[], java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Locale[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static Message A00(String str, Locale[] localeArr, String[] strArr, String str2, String str3) {
        Message obtain = Message.obtain(null, 0, 115, 0);
        Bundle data = obtain.getData();
        data.putString("id", str);
        data.putSerializable("locales", localeArr);
        if (strArr != null) {
            data.putStringArray("haveHashes", strArr);
        } else {
            data.remove("haveHashes");
        }
        data.putString("namespace", str2);
        data.putString("reason", str3);
        return obtain;
    }

    public static boolean A01(Locale[] localeArr, String str, String str2) {
        HashSet hashSet = A02;
        synchronized (hashSet) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                GetHsmMessagePackJob getHsmMessagePackJob = (GetHsmMessagePackJob) it.next();
                if (Arrays.equals(getHsmMessagePackJob.locales, localeArr) && TextUtils.equals(getHsmMessagePackJob.namespace, str) && TextUtils.equals(getHsmMessagePackJob.elementName, str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        if (r9 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011d, code lost:
        if (r3 > 0) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0122, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0126, code lost:
        throw r1;
     */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetHsmMessagePackJob.A03():void");
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; namespace=");
        A0S.append(this.namespace);
        A0S.append("; element=");
        A0S.append(this.elementName);
        A0S.append("; locales=");
        A0S.append(AbstractC002201f.A08(this.locales));
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = AnonymousClass09H.A01();
        this.A00 = AnonymousClass0Ja.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr == null || localeArr.length == 0) {
            throw new InvalidObjectException("locales[] must not be empty");
        } else if (TextUtils.isEmpty(this.namespace)) {
            throw new InvalidObjectException("namespace must not be empty");
        } else if (!TextUtils.isEmpty(this.elementName)) {
            HashSet hashSet = A02;
            synchronized (hashSet) {
                hashSet.add(this);
            }
        } else {
            throw new InvalidObjectException("elementName must not be empty");
        }
    }
}

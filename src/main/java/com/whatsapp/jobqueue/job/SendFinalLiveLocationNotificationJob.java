package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01S;
import X.AnonymousClass02N;
import X.AnonymousClass02P;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.AnonymousClass1XX;
import X.C001000o;
import X.C001400w;
import X.C007303n;
import X.C02770Dj;
import X.C02840Dr;
import X.C02850Ds;
import X.C02900Dx;
import X.CallableC49672Ro;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationNotificationJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01I A00;
    public transient C001000o A01;
    public transient C001400w A02;
    public transient AnonymousClass01S A03;
    public transient C02770Dj A04;
    public transient AnonymousClass09H A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationNotificationJob(X.C007303n r6, X.C02900Dx r7, int r8) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "final-live-location-"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.02N r3 = r6.A00
            java.lang.String r0 = X.AnonymousClass1VY.A0D(r3)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r1, r2)
            r5.<init>(r0)
            boolean r0 = r6.A02
            X.AnonymousClass00E.A07(r0)
            if (r3 == 0) goto L_0x0051
            java.lang.String r0 = r3.getRawString()
            r5.rawJid = r0
            java.lang.String r0 = r6.A01
            r5.msgId = r0
            double r0 = r7.A00
            r5.latitude = r0
            double r0 = r7.A01
            r5.longitude = r0
            long r0 = r7.A05
            r5.timestamp = r0
            r5.timeOffset = r8
            return
        L_0x0051:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.03n, X.0Dx, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        ArrayList arrayList;
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            C02900Dx r9 = new C02900Dx(userJid);
            r9.A00 = this.latitude;
            r9.A01 = this.longitude;
            r9.A05 = this.timestamp;
            StringBuilder A0S = AnonymousClass008.A0S("run send final live location job");
            A0S.append(A05());
            Log.i(A0S.toString());
            AnonymousClass01S r10 = this.A03;
            AnonymousClass02N A012 = AnonymousClass02N.A01(this.rawJid);
            if (A012 != null) {
                C02850Ds A07 = r10.A07(new C007303n(A012, true, this.msgId));
                if (A07 != null) {
                    synchronized (r10.A0S) {
                        C02900Dx r1 = A07.A02;
                        if (!r9.equals(r1)) {
                            if (r1 == null || r9.A05 >= r1.A05) {
                                r10.A0Y(A07, r9);
                            }
                        }
                        C02840Dr A042 = this.A04.A04(r9, Integer.valueOf(this.timeOffset));
                        try {
                            AnonymousClass02P r3 = (AnonymousClass02P) this.A02.A00.submit(new CallableC49672Ro(this, A042)).get();
                            AnonymousClass02N A013 = AnonymousClass02N.A01(this.rawJid);
                            String A032 = this.A05.A03();
                            HashMap hashMap = new HashMap();
                            if (hashMap.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(hashMap.values());
                            }
                            ((AnonymousClass0I1) this.A05.A04(new AnonymousClass1XX(A013, "notification", A032, "location", null, null, null, null, 0, arrayList), AnonymousClass1VY.A05(A032, A013, null, this.msgId, r3, 0))).get();
                        } catch (InterruptedException | ExecutionException e) {
                            Log.e("LocationSharingManager/encryptAndSendLocation error", e);
                        }
                        StringBuilder A0S2 = AnonymousClass008.A0S("sent final live location notifications");
                        A0S2.append(A05());
                        Log.i(A0S2.toString());
                        return;
                    }
                }
                StringBuilder A0S3 = AnonymousClass008.A0S("skip sending final live location job, final live location notification already sent");
                A0S3.append(A05());
                Log.i(A0S3.toString());
                return;
            }
            throw null;
        }
        throw null;
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; persistentId=");
        A0S.append(super.A01);
        A0S.append("; jid=");
        A0S.append(this.rawJid);
        A0S.append("; msgId=");
        A0S.append(this.msgId);
        A0S.append("; location.timestamp=");
        A0S.append(this.timestamp);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01I.A00();
        this.A04 = C02770Dj.A00();
        this.A05 = AnonymousClass09H.A01();
        this.A02 = C001400w.A02;
        this.A01 = C001000o.A00();
        this.A03 = AnonymousClass01S.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            StringBuilder A0S = AnonymousClass008.A0S("jid must not be empty");
            A0S.append(A05());
            throw new InvalidObjectException(A0S.toString());
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A0S2 = AnonymousClass008.A0S("msgId must not be empty");
            A0S2.append(A05());
            throw new InvalidObjectException(A0S2.toString());
        } else if (this.timestamp == 0) {
            StringBuilder A0S3 = AnonymousClass008.A0S("location timestamp must not be 0");
            A0S3.append(A05());
            throw new InvalidObjectException(A0S3.toString());
        }
    }
}

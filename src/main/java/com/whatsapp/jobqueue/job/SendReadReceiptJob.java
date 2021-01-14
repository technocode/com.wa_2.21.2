package com.whatsapp.jobqueue.job;

import X.AbstractC28981Wm;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass09T;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass0ZG;
import X.AnonymousClass1NI;
import X.AnonymousClass1VY;
import X.AnonymousClass1XX;
import X.C007303n;
import X.C12060hU;
import X.C28991Wn;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendReadReceiptJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass09T A00;
    public transient AnonymousClass00S A01;
    public transient AnonymousClass09H A02;
    public transient C28991Wn A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String remoteSender;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendReadReceiptJob(X.AnonymousClass02N r5, X.AnonymousClass02N r6, com.whatsapp.jid.DeviceJid r7, java.lang.String[] r8, long r9, long r11) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "read-receipt-"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass1VY.A0D(r6)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            if (r0 == 0) goto L_0x0058
            r4.jid = r0
            r1 = 0
            if (r6 != 0) goto L_0x0053
            r0 = r1
        L_0x003f:
            r4.participant = r0
            if (r7 == 0) goto L_0x0047
            java.lang.String r1 = r7.getRawString()
        L_0x0047:
            r4.remoteSender = r1
            X.AnonymousClass00E.A0B(r8)
            r4.messageIds = r8
            r4.originalMessageTimestamp = r9
            r4.loggableStanzaId = r11
            return
        L_0x0053:
            java.lang.String r0 = r6.getRawString()
            goto L_0x003f
        L_0x0058:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.02N, X.02N, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        String str;
        String[] strArr;
        AnonymousClass1NI r2;
        ArrayList arrayList;
        StringBuilder A0S = AnonymousClass008.A0S("SendReadReceiptJob/onRun ");
        A0S.append(A05());
        Log.d(A0S.toString());
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.jid);
        if (this.A00.A01(A012)) {
            if (AnonymousClass1VY.A0b(A012)) {
                long j = this.originalMessageTimestamp;
                if (j > 0 && j + 86400000 < this.A01.A05()) {
                    return;
                }
            }
            AnonymousClass02N A013 = AnonymousClass02N.A01(this.participant);
            DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
            if (this.A00.A02(A012)) {
                str = "read";
            } else {
                str = "read-self";
            }
            if (AnonymousClass1VY.A0b(A013)) {
                Log.w("send-read-job/malformed participant flipping");
                C12060hU r22 = C12060hU.A00;
                strArr = this.messageIds;
                r2 = new AnonymousClass1NI(new C007303n(r22, false, strArr[0]), A012, nullable, str);
            } else {
                strArr = this.messageIds;
                r2 = new AnonymousClass1NI(new C007303n(A012, false, strArr[0]), A013, nullable, str);
            }
            int length = strArr.length;
            if (length > 1) {
                int i = length - 1;
                String[] strArr2 = new String[i];
                r2.A01 = strArr2;
                System.arraycopy(strArr, 1, strArr2, 0, i);
            }
            Pair A014 = AnonymousClass0ZG.A01(A012, A013, nullable);
            HashMap hashMap = new HashMap();
            Jid jid2 = (Jid) A014.first;
            String str2 = this.messageIds[0];
            Jid jid3 = (Jid) A014.second;
            long j2 = this.loggableStanzaId;
            if (hashMap.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(hashMap.values());
            }
            AnonymousClass1XX r6 = new AnonymousClass1XX(jid2, "receipt", str2, str, null, jid3, null, null, j2, arrayList);
            long j3 = this.loggableStanzaId;
            r2.A00 = j3;
            AbstractC28981Wm A015 = this.A03.A01(0, j3);
            if (A015 != null) {
                A015.A01(6);
            }
            ((AnonymousClass0I1) this.A02.A04(r6, Message.obtain(null, 0, 89, 0, r2))).get();
        }
    }

    public final String A05() {
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.jid);
        AnonymousClass02N A013 = AnonymousClass02N.A01(this.participant);
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A012);
        sb.append("; participant=");
        sb.append(A013);
        sb.append("; remoteSender=");
        sb.append(nullable);
        sb.append("; ids:");
        sb.append(Arrays.deepToString(this.messageIds));
        return sb.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = AnonymousClass00S.A00();
        this.A02 = AnonymousClass09H.A01();
        this.A00 = AnonymousClass09T.A00();
        this.A03 = C28991Wn.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) != null) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("jid must not be empty");
    }
}

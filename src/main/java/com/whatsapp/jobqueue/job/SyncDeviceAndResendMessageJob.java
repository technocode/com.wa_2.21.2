package com.whatsapp.jobqueue.job;

import X.AbstractC007503q;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass01N;
import X.AnonymousClass02N;
import X.AnonymousClass09V;
import X.AnonymousClass0B2;
import X.AnonymousClass0EA;
import X.AnonymousClass0ER;
import X.AnonymousClass0FZ;
import X.AnonymousClass0HN;
import X.AnonymousClass0I1;
import X.AnonymousClass0QK;
import X.AnonymousClass0ZJ;
import X.AnonymousClass1VY;
import X.C007303n;
import X.EnumC03840Hy;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceAndResendMessageJob extends Job implements AnonymousClass0EA {
    public transient AnonymousClass0HN A00;
    public transient AnonymousClass0ER A01;
    public transient AnonymousClass00S A02;
    public transient AnonymousClass09V A03;
    public transient AnonymousClass0B2 A04;
    public transient AnonymousClass01N A05;
    public transient AnonymousClass0FZ A06;
    public transient C007303n A07;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceAndResendMessageJob(X.C007303n r5, com.whatsapp.jid.UserJid[] r6, long r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r2 = 1
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.AnonymousClass00E.A0B(r6)
            int r3 = r6.length
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x0028
            r1 = r6[r2]
            java.lang.String r0 = "invalid jid"
            X.AnonymousClass00E.A04(r1, r0)
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0028:
            r4.A07 = r5
            java.util.List r0 = java.util.Arrays.asList(r6)
            java.lang.String[] r0 = X.AnonymousClass1VY.A0g(r0)
            r4.rawUserJids = r0
            java.lang.String r0 = r5.A01
            r4.messageId = r0
            X.02N r0 = r5.A00
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r0.getRawString()
            r4.messageRawChatJid = r0
            r4.expirationMs = r7
            return
        L_0x0045:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.<init>(X.03n, com.whatsapp.jid.UserJid[], long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        Set A032;
        StringBuilder A0S = AnonymousClass008.A0S("SyncDeviceAndResendMessageJob/onRun/param=");
        A0S.append(A05());
        Log.i(A0S.toString());
        if (this.expirationMs <= 0 || this.A02.A05() <= this.expirationMs) {
            try {
                AnonymousClass0HN r4 = this.A00;
                List A0H = AnonymousClass1VY.A0H(this.rawUserJids);
                if (!((AbstractCollection) A0H).isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncDeviceAndResendMessageJob/onRun/sync is success=");
                    boolean A002 = ((AnonymousClass0QK) r4.A03(A0H, EnumC03840Hy.MESSAGE_QUERY_DEVICES).get()).A00();
                    sb.append(A002);
                    Log.d(sb.toString());
                    if (A002) {
                        C007303n r2 = this.A07;
                        AbstractC007503q A052 = this.A03.A05(r2);
                        if (A052 == null) {
                            StringBuilder sb2 = new StringBuilder("SyncDeviceAndResendMessageJob/revokeMessage/message ");
                            sb2.append(r2);
                            sb2.append(" no longer exist");
                            Log.i(sb2.toString());
                            return;
                        }
                        Set A033 = this.A05.A03(r2);
                        AnonymousClass0B2 r8 = this.A04;
                        if (r8 != null) {
                            if (A052 instanceof AnonymousClass0ZJ) {
                                A032 = r8.A02(A052);
                            } else {
                                A032 = (!A052.A0n.A02 || A052.A0C != 0) ? null : r8.A03(A052);
                            }
                            StringBuilder sb3 = new StringBuilder("SyncDeviceAndResendMessageJob/original list = ");
                            sb3.append(A033);
                            Log.i(sb3.toString());
                            StringBuilder sb4 = new StringBuilder("SyncDeviceAndResendMessageJob/new list = ");
                            sb4.append(A032);
                            Log.i(sb4.toString());
                            if (A032 != null) {
                                A032.removeAll(A033);
                                if (!A032.isEmpty()) {
                                    AnonymousClass01N r42 = this.A05;
                                    if (r42 != null) {
                                        StringBuilder A0S2 = AnonymousClass008.A0S("ReceiptDeviceStore/appendBlankReceiptsForTargetDevices: msg_key=");
                                        A0S2.append(A052.A0n);
                                        A0S2.append(" row_id=");
                                        A0S2.append(A052.A0p);
                                        A0S2.append(" device count=");
                                        A0S2.append(A032.size());
                                        Log.d(A0S2.toString());
                                        r42.A05(A052, A032, false);
                                        AnonymousClass0I1 r19 = new AnonymousClass0I1();
                                        this.A06.A01(A052, null, null, A032, false, 0, this.expirationMs, null, r19);
                                        r19.get();
                                        return;
                                    }
                                    throw null;
                                }
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                throw new IllegalArgumentException("jid list is empty");
            } catch (Exception e) {
                StringBuilder A0S3 = AnonymousClass008.A0S("SyncDeviceAndResendMessageJob/onRun/error, param=");
                A0S3.append(A05());
                Log.e(A0S3.toString());
                throw e;
            }
        } else {
            Log.w("SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration");
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; rawJids=");
        A0S.append(Arrays.toString(this.rawUserJids));
        A0S.append("; key=");
        A0S.append(this.A07);
        A0S.append("; timeoutMs=");
        A0S.append(this.expirationMs);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A02 = AnonymousClass00S.A00();
        this.A03 = AnonymousClass09V.A00();
        this.A00 = AnonymousClass0HN.A00();
        this.A05 = AnonymousClass01N.A00();
        this.A06 = AnonymousClass0FZ.A00();
        this.A01 = AnonymousClass0ER.A00();
        this.A04 = AnonymousClass0B2.A00();
        AnonymousClass0ER r0 = this.A01;
        C007303n r2 = this.A07;
        synchronized (r0.A02) {
            r0.A02.add(r2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (r5 = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            UserJid nullable = UserJid.getNullable(str);
            if (nullable != null) {
                hashSet.add(nullable);
            } else {
                throw new InvalidObjectException(AnonymousClass008.A0K("invalid jid:", str));
            }
        }
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.messageRawChatJid);
        if (A012 != null) {
            this.A07 = new C007303n(A012, true, this.messageId);
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("invalid jid:");
        A0S.append(this.messageRawChatJid);
        throw new InvalidObjectException(A0S.toString());
    }
}

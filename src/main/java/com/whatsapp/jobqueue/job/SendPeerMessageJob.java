package com.whatsapp.jobqueue.job;

import X.AbstractC007503q;
import X.AbstractC05460Oq;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass02P;
import X.AnonymousClass09H;
import X.AnonymousClass0AY;
import X.AnonymousClass0DH;
import X.AnonymousClass0DL;
import X.AnonymousClass0DR;
import X.AnonymousClass0EA;
import X.AnonymousClass0F9;
import X.AnonymousClass0I1;
import X.AnonymousClass0ZG;
import X.AnonymousClass1XX;
import X.AnonymousClass287;
import X.AnonymousClass288;
import X.C001000o;
import X.C001400w;
import X.C007303n;
import X.C015808q;
import X.C02840Dr;
import X.C04540Kt;
import X.C04970Mo;
import X.C05350Oe;
import X.C28891Wd;
import X.C64552yN;
import X.CallableC49712Rs;
import X.EnumC05410Ok;
import android.content.Context;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public class SendPeerMessageJob extends Job implements AnonymousClass0EA {
    public static final DeviceJid[] A09 = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01I A00;
    public transient C04540Kt A01;
    public transient AnonymousClass0F9 A02;
    public transient C001000o A03;
    public transient C001400w A04;
    public transient AnonymousClass01L A05;
    public transient AnonymousClass0DR A06;
    public transient AnonymousClass09H A07;
    public transient C015808q A08;
    public final long peerMessageRowId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPeerMessageJob(java.lang.String r4, long r5, com.whatsapp.jid.DeviceJid r7) {
        /*
            r3 = this;
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDeviceSessionRequirement
            r0.<init>(r7)
            r2.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r1, r4)
            r3.<init>(r0)
            r3.peerMessageRowId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPeerMessageJob.<init>(java.lang.String, long, com.whatsapp.jid.DeviceJid):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        AnonymousClass02P r2;
        ArrayList arrayList;
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("SendPeerMessageJob/onRun/start send");
        A0S.append(A05());
        Log.i(A0S.toString());
        if (!this.A08.A01()) {
            Log.w("SendPeerMessageJob/onRun/wap4 disable.");
            return;
        }
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid == null) {
            Log.e("SendPeerMessageJob/onRun/no my user id (unregistered?).");
            return;
        }
        AbstractC05460Oq A022 = this.A06.A02(this.peerMessageRowId);
        if (A022 == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("SendPeerMessageJob/onRun/no message found (");
            A0S2.append(this.peerMessageRowId);
            A0S2.append(").");
            Log.e(A0S2.toString());
            return;
        }
        DeviceJid deviceJid = A022.A00;
        C05350Oe A023 = this.A05.A02();
        if (deviceJid == null || A023.A00.isEmpty()) {
            Log.e("SendPeerMessageJob/onRun/no target device or no companion device exists.");
        } else if (!A023.A00.contains(deviceJid)) {
            Log.e("SendPeerMessageJob/onRun/target device is not in db.");
        } else {
            HashMap hashMap = new HashMap();
            String str2 = A022.A0n.A01;
            C04970Mo A082 = C02840Dr.A08();
            AnonymousClass0ZG.A0F(A022, new C64552yN(this.A00, A082, false, false, null, null));
            try {
                r2 = (AnonymousClass02P) this.A04.A00.submit(new CallableC49712Rs(this, deviceJid, A082.A01().A09())).get();
            } catch (Exception unused) {
                StringBuilder A0S3 = AnonymousClass008.A0S("SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=");
                A0S3.append(deviceJid.getRawString());
                Log.e(A0S3.toString());
                r2 = null;
            }
            AnonymousClass09H r4 = this.A07;
            if (hashMap.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(hashMap.values());
            }
            AnonymousClass1XX r17 = new AnonymousClass1XX(deviceJid, "message", str2, null, null, null, userJid, null, 0, arrayList);
            C007303n r15 = A022.A0n;
            int i = A022.A07;
            String str3 = A022.A0a;
            EnumC05410Ok r9 = A022.A0J;
            Map emptyMap = Collections.emptyMap();
            int A042 = A022.A04();
            int i2 = ((AbstractC007503q) A022).A00;
            Map emptyMap2 = Collections.emptyMap();
            Integer valueOf = Integer.valueOf(A022.A02);
            if (!(A022 instanceof AnonymousClass288)) {
                str = !(A022 instanceof AnonymousClass287) ? null : "high";
            } else {
                str = "high";
            }
            ((AnonymousClass0I1) r4.A04(r17, Message.obtain(null, 0, 8, 0, new C28891Wd(r15, deviceJid, 0, i, null, userJid, str3, null, r9, r2, emptyMap, null, null, A042, i2, null, null, emptyMap2, valueOf, "peer", str, false)))).get();
            AnonymousClass0F9 r22 = this.A02;
            synchronized (r22.A00) {
                Iterator it = r22.A00.iterator();
                while (true) {
                    AnonymousClass0AY r42 = (AnonymousClass0AY) it;
                    if (r42.hasNext()) {
                        AnonymousClass0DH r7 = (AnonymousClass0DH) r42.next();
                        if (A022 instanceof AnonymousClass288) {
                            AnonymousClass0DL r8 = r7.A0D;
                            AnonymousClass288 r10 = (AnonymousClass288) A022;
                            AnonymousClass0DR r92 = r8.A06;
                            long j = r10.A0p;
                            if (r92 != null) {
                                AnonymousClass00E.A00();
                                r92.A07(Collections.singletonList(Long.valueOf(j)));
                                if (r10.A00 && !r8.A08()) {
                                    HashSet hashSet = new HashSet(r10.A01.values());
                                    hashSet.remove(null);
                                    r8.A07.A02(hashSet);
                                    r7.A0N.ANF(new RunnableEBaseShape2S0100000_I0_2(r7, 22));
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                }
            }
            StringBuilder A0S4 = AnonymousClass008.A0S("SendPeerMessageJob/onRun/end send");
            A0S4.append(A05());
            Log.i(A0S4.toString());
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; peer_msg_row_id=");
        A0S.append(this.peerMessageRowId);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01I.A00();
        this.A07 = AnonymousClass09H.A01();
        this.A04 = C001400w.A02;
        this.A06 = AnonymousClass0DR.A00();
        this.A03 = C001000o.A00();
        this.A05 = AnonymousClass01L.A00();
        this.A08 = C015808q.A00();
        this.A01 = C04540Kt.A00();
        this.A02 = AnonymousClass0F9.A00;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}

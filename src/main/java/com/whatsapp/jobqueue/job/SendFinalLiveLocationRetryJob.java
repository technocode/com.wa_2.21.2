package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass02N;
import X.AnonymousClass02P;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.AnonymousClass1XX;
import X.C001000o;
import X.C001400w;
import X.C02770Dj;
import X.C02840Dr;
import X.C02900Dx;
import X.C04540Kt;
import X.CallableC49682Rp;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationRetryJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01I A00;
    public transient C04540Kt A01;
    public transient C001000o A02;
    public transient C001400w A03;
    public transient C02770Dj A04;
    public transient AnonymousClass09H A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationRetryJob(X.C007303n r5, com.whatsapp.jid.DeviceJid r6, X.C02900Dx r7, int r8, byte[] r9, int r10) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(X.03n, com.whatsapp.jid.DeviceJid, X.0Dx, int, byte[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        ArrayList arrayList;
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            C02900Dx r3 = new C02900Dx(userJid);
            r3.A00 = this.latitude;
            r3.A01 = this.longitude;
            r3.A05 = this.timestamp;
            StringBuilder A0S = AnonymousClass008.A0S("run send final live location retry job");
            A0S.append(A05());
            Log.i(A0S.toString());
            C02840Dr A042 = this.A04.A04(r3, Integer.valueOf(this.timeOffset));
            try {
                AnonymousClass02P r4 = (AnonymousClass02P) this.A03.A00.submit(new CallableC49682Rp(this, A042)).get();
                DeviceJid nullable = DeviceJid.getNullable(this.rawDeviceJid);
                if (nullable != null) {
                    UserJid userJid2 = nullable.userJid;
                    String A032 = this.A05.A03();
                    AnonymousClass02N r10 = null;
                    HashMap hashMap = new HashMap();
                    if (hashMap.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(hashMap.values());
                    }
                    AnonymousClass1XX r5 = new AnonymousClass1XX(userJid2, "notification", A032, "location", null, null, null, null, 0, arrayList);
                    AnonymousClass09H r32 = this.A05;
                    String str = this.contextRawJid;
                    if (str != null) {
                        r10 = AnonymousClass02N.A01(str);
                    }
                    ((AnonymousClass0I1) r32.A04(r5, AnonymousClass1VY.A05(A032, userJid2, r10, this.msgId, r4, this.retryCount))).get();
                    StringBuilder A0S2 = AnonymousClass008.A0S("sent final live location notifications");
                    A0S2.append(A05());
                    Log.i(A0S2.toString());
                    return;
                }
                throw null;
            } catch (InterruptedException | ExecutionException e) {
                Log.e("LocationSharingManager/encryptAndSendLocation error", e);
            }
        } else {
            throw null;
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; persistentId=");
        A0S.append(super.A01);
        A0S.append("; jid=");
        A0S.append(this.rawDeviceJid);
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
        this.A03 = C001400w.A02;
        this.A02 = C001000o.A00();
        this.A01 = C04540Kt.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawDeviceJid)) {
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

package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass0X4;
import X.AnonymousClass1VY;
import X.C007303n;
import X.C57832kw;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class ReceiptProcessingJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0X4 A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    public ReceiptProcessingJob(C007303n[] r8, Jid jid, DeviceJid deviceJid, int i, long j) {
        super(new JobParameters(new LinkedList(), true, "ReceiptProcessingGroup"));
        int length = r8.length;
        String[] strArr = new String[length];
        this.keyId = strArr;
        boolean[] zArr = new boolean[length];
        this.keyFromMe = zArr;
        String[] strArr2 = new String[length];
        this.keyRemoteChatJidRawString = strArr2;
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = r8[i2].A01;
            C007303n r1 = r8[i2];
            zArr[i2] = r1.A02;
            strArr2[i2] = AnonymousClass1VY.A0D(r1.A00);
        }
        this.remoteJidRawString = jid.getRawString();
        this.participantDeviceJidRawString = AnonymousClass1VY.A0D(deviceJid);
        this.status = i;
        this.timestamp = j;
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0S = AnonymousClass008.A0S("ReceiptProcessingJob/onRun/start param=");
        A0S.append(A05());
        Log.i(A0S.toString());
        int length = this.keyId.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            AnonymousClass02N A01 = AnonymousClass02N.A01(this.keyRemoteChatJidRawString[i]);
            if (A01 != null) {
                arrayList.add(new C007303n(A01, this.keyFromMe[i], this.keyId[i]));
            }
        }
        C57832kw r5 = new C57832kw((C007303n[]) arrayList.toArray(new C007303n[0]), Jid.get(this.remoteJidRawString), DeviceJid.getNullable(this.participantDeviceJidRawString), this.status, this.timestamp, null, false);
        AnonymousClass0X4 r3 = this.A00;
        if (r3 != null) {
            AnonymousClass0I1 r2 = new AnonymousClass0I1();
            r3.A07(new RunnableEBaseShape2S0300000_I1(r3, r5, r2, 39), 13);
            r2.get();
            return;
        }
        throw null;
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; remoteJid=");
        A0S.append(Jid.getNullable(this.remoteJidRawString));
        A0S.append("; number of keys=");
        A0S.append(this.keyId.length);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass0X4.A00();
    }
}

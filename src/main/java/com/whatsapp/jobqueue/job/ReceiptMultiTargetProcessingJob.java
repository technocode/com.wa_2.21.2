package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass0X4;
import X.AnonymousClass1VY;
import X.C007303n;
import X.C57842kx;
import android.content.Context;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class ReceiptMultiTargetProcessingJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0X4 A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    public ReceiptMultiTargetProcessingJob(C007303n r7, Jid jid, int i, List list) {
        super(new JobParameters(new LinkedList(), true, "ReceiptProcessingGroup"));
        int size = list.size();
        this.keyId = r7.A01;
        this.keyFromMe = r7.A02;
        AnonymousClass02N r0 = r7.A00;
        if (r0 != null) {
            this.keyRemoteChatJidRawString = r0.getRawString();
            this.remoteJidString = jid.getRawString();
            this.status = i;
            this.participantDeviceJidRawString = new String[size];
            this.timestamp = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                this.participantDeviceJidRawString[i2] = AnonymousClass1VY.A0D((Jid) pair.first);
                long[] jArr = this.timestamp;
                Object obj = pair.second;
                if (obj != null) {
                    jArr[i2] = ((Number) obj).longValue();
                } else {
                    throw null;
                }
            }
            return;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0S = AnonymousClass008.A0S("ReceiptMultiTargetProcessingJob/onRun/start param=");
        A0S.append(A05());
        Log.i(A0S.toString());
        C007303n r5 = new C007303n(AnonymousClass02N.A00(this.keyRemoteChatJidRawString), this.keyFromMe, this.keyId);
        Jid jid = Jid.get(this.remoteJidString);
        int length = this.participantDeviceJidRawString.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            DeviceJid nullable = DeviceJid.getNullable(this.participantDeviceJidRawString[i]);
            if (nullable != null) {
                arrayList.add(new Pair(nullable, Long.valueOf(this.timestamp[i])));
            }
        }
        C57842kx r4 = new C57842kx(r5, jid, this.status, arrayList, null, false);
        AnonymousClass0X4 r3 = this.A00;
        if (r3 != null) {
            AnonymousClass0I1 r2 = new AnonymousClass0I1();
            r3.A07(new RunnableEBaseShape2S0300000_I1(r3, r4, r2, 39), 13);
            r2.get();
            return;
        }
        throw null;
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; keyRemoteJid=");
        A0S.append(Jid.getNullable(this.keyRemoteChatJidRawString));
        A0S.append("; remoteJid=");
        A0S.append(Jid.getNullable(this.remoteJidString));
        A0S.append("; number of participants=");
        A0S.append(this.participantDeviceJidRawString.length);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass0X4.A00();
    }
}

package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.C445220l;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.whispersystems.jobqueue.Job;

public final class BulkGetPreKeyJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass00Y A00;
    public transient AnonymousClass09H A01;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BulkGetPreKeyJob(com.whatsapp.jid.DeviceJid[] r7, com.whatsapp.jid.DeviceJid[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.BulkGetPreKeyJob.<init>(com.whatsapp.jid.DeviceJid[], com.whatsapp.jid.DeviceJid[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        List arrayList;
        StringBuilder A0S = AnonymousClass008.A0S("starting bulk get pre key job");
        A0S.append(A05());
        Log.i(A0S.toString());
        String A02 = this.A01.A02();
        List A0G = AnonymousClass1VY.A0G(DeviceJid.class, Arrays.asList(this.jids));
        String[] strArr = this.identityChangedJids;
        if (strArr != null) {
            arrayList = AnonymousClass1VY.A0G(DeviceJid.class, Arrays.asList(strArr));
        } else {
            arrayList = new ArrayList();
        }
        if (this.context != 0) {
            C445220l r5 = new C445220l();
            r5.A00 = Boolean.valueOf(!arrayList.isEmpty());
            r5.A02 = Long.valueOf((long) ((AbstractCollection) A0G).size());
            r5.A01 = Integer.valueOf(this.context);
            this.A00.A0B(r5, null, false);
        }
        AnonymousClass09H r52 = this.A01;
        Message obtain = Message.obtain(null, 0, 87, 0);
        obtain.getData().putString("id", A02);
        Bundle data = obtain.getData();
        data.putParcelableArray("jids", (Jid[]) ((AbstractCollection) A0G).toArray(new DeviceJid[0]));
        obtain.getData().putParcelableArray("identityJids", (Jid[]) arrayList.toArray(new DeviceJid[0]));
        ((AnonymousClass0I1) r52.A05(A02, obtain, false)).get();
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; jids=");
        A0S.append(Arrays.toString(this.jids));
        A0S.append("; context=");
        A0S.append(this.context);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context2) {
        this.A00 = AnonymousClass00Y.A00();
        this.A01 = AnonymousClass09H.A01();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (r3 = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        for (String str : strArr) {
            DeviceJid nullable = DeviceJid.getNullable(str);
            if (nullable == null) {
                throw new InvalidObjectException("an element of jids was empty");
            } else if (AnonymousClass1VY.A0Y(nullable) || AnonymousClass1VY.A0T(nullable)) {
                StringBuilder sb = new StringBuilder();
                sb.append("jid must be an individual jid; jid=");
                sb.append(nullable);
                throw new InvalidObjectException(sb.toString());
            }
        }
        String[] strArr2 = this.identityChangedJids;
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                DeviceJid nullable2 = DeviceJid.getNullable(str2);
                if (nullable2 == null) {
                    throw new InvalidObjectException("an element of identityChangedJids was empty");
                } else if (AnonymousClass1VY.A0Y(nullable2) || AnonymousClass1VY.A0T(nullable2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jid must be an individual jid; jid=");
                    sb2.append(nullable2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
        }
    }
}

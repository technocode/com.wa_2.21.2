package com.whatsapp.jobqueue.job;

import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.AnonymousClass1XQ;
import X.AnonymousClass1XX;
import X.C001000o;
import X.C001400w;
import X.C05360Of;
import X.C28921Wg;
import X.CallableC49722Rt;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendRetryReceiptJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient C001000o A00;
    public transient C001400w A01;
    public transient AnonymousClass09H A02;
    public final int editVersion;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendRetryReceiptJob(X.AnonymousClass1XJ r6, int r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.1XJ, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        String str;
        String str2;
        String str3;
        byte[] A04 = C05360Of.A04(this.localRegistrationId);
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(this.participant)) {
            str = null;
        } else {
            str = this.participant;
        }
        boolean A0T = AnonymousClass1VY.A0T(Jid.getNullable(str));
        HashMap hashMap = new HashMap();
        if (A0T) {
            str2 = str;
        } else {
            str2 = this.jid;
        }
        Jid nullable = Jid.getNullable(str2);
        String str4 = this.id;
        int i = this.editVersion;
        if (i != 0) {
            str3 = String.valueOf(i);
        } else {
            str3 = null;
        }
        if (A0T) {
            str = this.jid;
        }
        Jid nullable2 = Jid.getNullable(str);
        if (!hashMap.isEmpty()) {
            arrayList = new ArrayList(hashMap.values());
        }
        AnonymousClass1XX r4 = new AnonymousClass1XX(nullable, "receipt", str4, "retry", null, nullable2, null, str3, 0, arrayList);
        Jid nullable3 = Jid.getNullable(this.participant);
        if (this.retryCount > 0) {
            Pair pair = (Pair) this.A01.A00.submit(new CallableC49722Rt(this)).get();
            AnonymousClass1XQ[] r2 = (AnonymousClass1XQ[]) pair.second;
            ((AnonymousClass0I1) this.A02.A04(r4, Message.obtain(null, 0, 11, 0, new C28921Wg(Jid.getNullable(this.jid), this.id, nullable3, UserJid.getNullable(this.recipientJid), this.timestamp, this.retryCount + 1, A04, this.editVersion, (byte[]) pair.first, (byte) 5, r2[0], r2[1], this.loggableStanzaId)))).get();
            return;
        }
        ((AnonymousClass0I1) this.A02.A04(r4, Message.obtain(null, 0, 11, 0, new C28921Wg(Jid.getNullable(this.jid), this.id, nullable3, UserJid.getNullable(this.recipientJid), this.timestamp, this.retryCount + 1, A04, this.editVersion, null, (byte) 0, null, null, this.loggableStanzaId)))).get();
    }

    public final String A05() {
        Jid nullable = Jid.getNullable(this.jid);
        Jid nullable2 = Jid.getNullable(this.participant);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(nullable);
        sb.append("; id=");
        sb.append(this.id);
        sb.append("; participant=");
        sb.append(nullable2);
        sb.append("; retryCount=");
        sb.append(this.retryCount);
        sb.append("; editVersion=");
        sb.append(this.editVersion);
        return sb.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A02 = AnonymousClass09H.A01();
        this.A01 = C001400w.A02;
        this.A00 = C001000o.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.id)) {
            throw new InvalidObjectException("id must not be empty");
        }
    }
}

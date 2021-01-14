package com.whatsapp.jobqueue.job;

import X.AbstractC000400g;
import X.AnonymousClass02N;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1VY;
import X.AnonymousClass1XX;
import X.C000300f;
import X.C007603r;
import X.C04450Kk;
import X.C28961Wk;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendMediaErrorReceiptJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient C000300f A00;
    public transient C04450Kk A01;
    public transient AnonymousClass09H A02;
    public final byte[] mediaKey;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendMediaErrorReceiptJob(X.AnonymousClass0M3 r5) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r2 = 1
            java.lang.String r1 = "media-error-receipt"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.03n r1 = r5.A0n
            X.02N r0 = r1.A00
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.getRawString()
            r4.remoteJidRawJid = r0
            X.02N r0 = r5.A0G
            java.lang.String r0 = X.AnonymousClass1VY.A0D(r0)
            r4.remoteResourceRawJid = r0
            java.lang.String r0 = r1.A01
            r4.messageId = r0
            X.0M4 r0 = r5.A02
            if (r0 == 0) goto L_0x003d
            byte[] r0 = r0.A0U
            if (r0 == 0) goto L_0x003b
            r4.mediaKey = r0
            return
        L_0x003b:
            r0 = 0
            throw r0
        L_0x003d:
            r0 = 0
            throw r0
        L_0x003f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.0M3):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        AnonymousClass02N r2;
        ArrayList arrayList;
        byte[] bArr;
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.remoteJidRawJid);
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            r2 = AnonymousClass02N.A01(this.remoteResourceRawJid);
        } else {
            r2 = null;
        }
        StringBuilder sb = new StringBuilder("SendMediaErrorReceiptJob/onRun: remoteJid=");
        sb.append(A012);
        sb.append("; remoteResource=");
        sb.append(r2);
        sb.append("; id=");
        sb.append(this.messageId);
        Log.d(sb.toString());
        boolean A0T = AnonymousClass1VY.A0T(r2);
        AnonymousClass02N r7 = A012;
        if (A0T) {
            r7 = r2;
        }
        if (r7 != null) {
            if (AnonymousClass1VY.A0Y(A012) || AnonymousClass1VY.A0b(A012)) {
                A012 = r2;
            } else if (!A0T) {
                A012 = null;
            }
            byte[] bArr2 = null;
            HashMap hashMap = new HashMap();
            String str = this.messageId;
            if (hashMap.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(hashMap.values());
            }
            AnonymousClass1XX r6 = new AnonymousClass1XX(r7, "receipt", str, "server-error", null, A012, null, null, 0, arrayList);
            if (!this.A00.A0D(AbstractC000400g.A1a)) {
                bArr = null;
            } else if (this.A01 != null) {
                bArr2 = C007603r.A0C(12);
                C04450Kk r0 = this.A01;
                String str2 = this.messageId;
                if (r0 == null) {
                    throw null;
                } else if (JniBridge.getInstance() != null) {
                    Object jvidispatchOO = JniBridge.jvidispatchOO(1, str2);
                    byte[] bArr3 = this.mediaKey;
                    String str3 = this.messageId;
                    C04450Kk.A01(bArr3, bArr2);
                    bArr = (byte[]) JniBridge.jvidispatchOOOOO(0, str3, jvidispatchOO, bArr3, bArr2);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
            ((AnonymousClass0I1) this.A02.A04(r6, Message.obtain(null, 0, 77, 0, new C28961Wk(r7, A012, this.messageId, bArr, bArr2)))).get();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = C000300f.A00();
        this.A02 = AnonymousClass09H.A01();
        this.A01 = C04450Kk.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw new InvalidObjectException("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }
}

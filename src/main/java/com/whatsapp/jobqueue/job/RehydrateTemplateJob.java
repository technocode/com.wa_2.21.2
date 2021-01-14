package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00S;
import X.AnonymousClass00Y;
import X.AnonymousClass01J;
import X.AnonymousClass01K;
import X.AnonymousClass02N;
import X.AnonymousClass098;
import X.AnonymousClass0AL;
import X.AnonymousClass0AR;
import X.AnonymousClass0EA;
import X.AnonymousClass0Ja;
import X.AnonymousClass21H;
import X.C000300f;
import X.C003701u;
import X.C02360Br;
import X.C02660Cy;
import X.C02840Dr;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class RehydrateTemplateJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient AnonymousClass009 A01;
    public transient C000300f A02;
    public transient AnonymousClass01J A03;
    public transient AnonymousClass0Ja A04;
    public transient AnonymousClass00S A05;
    public transient AnonymousClass01K A06;
    public transient AnonymousClass00Y A07;
    public transient C02660Cy A08;
    public transient AnonymousClass0AR A09;
    public transient C02840Dr A0A;
    public final transient AnonymousClass0AL A0B;
    public final int expiration;
    public final long expireTimeMs;
    public final String id;
    public final String jid;
    public final Locale[] locales;
    public final String participant;
    public final long timestamp;
    public final int verifiedLevel;
    public final Long verifiedSender;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.AnonymousClass1VY.A0T(r16) != false) goto L_0x000e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RehydrateTemplateJob(X.AnonymousClass0AL r12, X.AnonymousClass01X r13, X.C02840Dr r14, java.lang.String r15, X.AnonymousClass02N r16, X.AnonymousClass02N r17, long r18, long r20, java.lang.Long r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateTemplateJob.<init>(X.0AL, X.01X, X.0Dr, java.lang.String, X.02N, X.02N, long, long, java.lang.Long, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:237:0x042c, code lost:
        if ((Integer.MIN_VALUE & r2) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0453, code lost:
        if (r4 != false) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0466, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0473, code lost:
        if ((r2 & 64) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0481, code lost:
        if ((r2 & 256) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x048a, code lost:
        if (r3.equals("application/msword") != false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0498, code lost:
        if ((r2 & 16) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04a1, code lost:
        if (r3.equals("application/vnd.ms-excel") != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04a5, code lost:
        if ((r2 & 4) == 0) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04ae, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04b2, code lost:
        if ((r2 & 2) == 0) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04bc, code lost:
        if (r3.equals("application/vnd.ms-powerpoint") != false) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04c5, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04c9, code lost:
        if ((r2 & 8) == 0) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04d7, code lost:
        if ((r2 & 1) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04e5, code lost:
        if ((r2 & 128) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04f3, code lost:
        if ((r2 & 32) != 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05c0, code lost:
        A07(1007, "title", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r10 == null) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02be A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f6 A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x030f A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0334 A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0337 A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05ee  */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 1588
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateTemplateJob.A03():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A04() {
        if (this.A05.A05() >= this.expireTimeMs || super.A04()) {
            return true;
        }
        return false;
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; id=");
        A0S.append(this.id);
        A0S.append("; jid=");
        A0S.append(this.jid);
        A0S.append("; participant=");
        A0S.append(this.participant);
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    public final String A06(String str, int i, int i2, int i3) {
        String A082 = C003701u.A08(str, i);
        if (str != null && !str.equals(A082)) {
            AnonymousClass21H r2 = new AnonymousClass21H();
            r2.A02 = Long.valueOf((long) str.length());
            r2.A00 = Integer.valueOf(i2);
            if (i2 == 4) {
                r2.A01 = Long.valueOf((long) i3);
            }
            this.A07.A09(r2, 1);
            AnonymousClass00Y.A01(r2, "");
        }
        return A082;
    }

    public final void A07(Integer num, String str, String str2) {
        this.A09.A0C(AnonymousClass02N.A01(this.jid), this.id, AnonymousClass02N.A01(this.participant), num, str, str2);
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = context.getApplicationContext();
        this.A05 = AnonymousClass00S.A00();
        this.A01 = AnonymousClass009.A00();
        this.A07 = AnonymousClass00Y.A00();
        this.A09 = AnonymousClass0AR.A00();
        this.A02 = C000300f.A00();
        AnonymousClass098.A00();
        this.A03 = AnonymousClass01J.A00();
        C02360Br.A00();
        this.A06 = AnonymousClass01K.A00();
        this.A04 = AnonymousClass0Ja.A00();
        this.A08 = C02660Cy.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0A = C02840Dr.A09((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0S = AnonymousClass008.A0S("RehydrateTemplateJob/readObject/error hsm missing message bytes, loggableParam=");
            A0S.append(A05());
            Log.e(A0S.toString());
        }
        if (this.A0A == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("RehydrateTemplateJob/readObject/error message is null, loggableParam=");
            A0S2.append(A05());
            Log.e(A0S2.toString());
        }
        if (this.id == null) {
            StringBuilder A0S3 = AnonymousClass008.A0S("id must not be null");
            A0S3.append(A05());
            throw new InvalidObjectException(A0S3.toString());
        } else if (this.jid == null) {
            StringBuilder A0S4 = AnonymousClass008.A0S("jid must not be null");
            A0S4.append(A05());
            throw new InvalidObjectException(A0S4.toString());
        } else if (this.timestamp <= 0) {
            StringBuilder A0S5 = AnonymousClass008.A0S("timestamp must be valid");
            A0S5.append(A05());
            throw new InvalidObjectException(A0S5.toString());
        } else if (this.expireTimeMs <= 0) {
            StringBuilder A0S6 = AnonymousClass008.A0S("expireTimeMs must be non-negative");
            A0S6.append(A05());
            throw new InvalidObjectException(A0S6.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0A.A09());
    }
}

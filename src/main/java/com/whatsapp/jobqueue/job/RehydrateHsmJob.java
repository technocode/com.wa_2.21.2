package com.whatsapp.jobqueue.job;

import X.AbstractC007503q;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00S;
import X.AnonymousClass01J;
import X.AnonymousClass01K;
import X.AnonymousClass02N;
import X.AnonymousClass098;
import X.AnonymousClass0AL;
import X.AnonymousClass0AR;
import X.AnonymousClass0EA;
import X.AnonymousClass0FI;
import X.AnonymousClass0Ja;
import X.C007303n;
import X.C02360Br;
import X.C02840Dr;
import X.C04110Jc;
import X.C04130Je;
import X.C49732Rv;
import X.C76103e0;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class RehydrateHsmJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient AnonymousClass009 A01;
    public transient AnonymousClass01J A02;
    public transient AnonymousClass0Ja A03;
    public transient AnonymousClass00S A04;
    public transient AnonymousClass01K A05;
    public transient AnonymousClass0AR A06;
    public transient C02840Dr A07;
    public transient AnonymousClass0AL A08;
    public final Long existingMessageRowId;
    public final int expiration;
    public final long expireTimeMs;
    public final String id;
    public final String jid;
    public final Locale[] locales;
    public final String participant;
    public final long timestamp;
    public final int verifiedLevel;
    public final Long verifiedSender;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (X.AnonymousClass1VY.A0T(r15) != false) goto L_0x000d;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RehydrateHsmJob(X.AnonymousClass01X r11, X.AnonymousClass0AL r12, X.C02840Dr r13, java.lang.String r14, X.AnonymousClass02N r15, X.AnonymousClass02N r16, long r17, long r19, java.lang.Long r21, int r22, java.lang.Long r23, int r24) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateHsmJob.<init>(X.01X, X.0AL, X.0Dr, java.lang.String, X.02N, X.02N, long, long, java.lang.Long, int, java.lang.Long, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0S = AnonymousClass008.A0S("RehydrateHsmJob/onRun/info: starting job, param=");
        A0S.append(A05());
        Log.i(A0S.toString());
        if (this.A07 == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("RehydrateHsmJob/onRun/error: missing message, param=");
            A0S2.append(A05());
            Log.e(A0S2.toString());
            this.A01.A04("rehydratehsmjob/run/message missing", null, true);
            A06(null);
        } else if (this.A04.A05() >= this.expireTimeMs) {
            StringBuilder A0S3 = AnonymousClass008.A0S("RehydrateHsmJob/onRun/error: job expired, param=");
            A0S3.append(A05());
            Log.e(A0S3.toString());
            A06(null);
        } else {
            C76103e0 r4 = this.A07.A0H;
            if (r4 == null) {
                r4 = C76103e0.A0A;
            }
            try {
                C49732Rv.A02(r4, A05());
                C04110Jc A002 = C49732Rv.A00(this.A03, this.locales, r4.A09, A05());
                C04130Je A012 = AnonymousClass0Ja.A01(A002, r4.A06);
                if (A012 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("RehydrateHsmJob/onRun/error: translation is null, param=");
                    sb.append(A05());
                    Log.e(sb.toString());
                    A06(1001);
                    return;
                }
                String A013 = C49732Rv.A01(this.A00, A002, r4, A012, A05(), false, false);
                C04110Jc A032 = this.A03.A03(this.locales, r4.A09);
                if (A032 != null) {
                    Locale locale = new Locale(A032.A05, A032.A04);
                    AbstractC007503q A022 = this.A08.A02(new C007303n(AnonymousClass02N.A01(this.jid), false, this.id), this.timestamp, (byte) 0);
                    A022.A0Y(AnonymousClass02N.A01(this.participant));
                    A022.A0d(A013);
                    Long l = this.verifiedSender;
                    if (l != null) {
                        A022.A0U = l;
                    }
                    A022.A0A = this.verifiedLevel;
                    A022.A0O(8);
                    A022.A0Q(this.expiration);
                    Long l2 = this.existingMessageRowId;
                    if (l2 != null) {
                        A022.A0p = l2.longValue();
                        AnonymousClass01K r0 = this.A05;
                        AbstractC007503q A052 = r0.A0J.A05(A022.A0n);
                        if (A052 == null) {
                            this.A05.A0g(A022, 11);
                        } else {
                            byte b = A052.A0m;
                            if (b == 11) {
                                Log.i("rehydrateHsmJob/message-exists-already-replace-decryption-failure");
                                this.A05.A0d(A022);
                            } else if (b == 31) {
                                Log.i("rehydrateHsmJob/message-exists-already-replace-multi-device-placeholder");
                                this.A05.A0d(A022);
                            } else {
                                StringBuilder A0S4 = AnonymousClass008.A0S("rehydrateHsmJob/message-exists-already-non-decryption-failure type=");
                                A0S4.append(AnonymousClass0FI.A08(b));
                                Log.i(A0S4.toString());
                                A022.A0Z(A052);
                                this.A05.A0g(A022, 11);
                            }
                        }
                    } else {
                        this.A05.A0d(A022);
                    }
                    AnonymousClass0Ja r02 = this.A03;
                    r02.A01.A01(locale, A032.A06);
                    return;
                }
                throw null;
            } catch (HSMRehydrationUtil$SendStructUnavailableException e) {
                A06(e.errorCode);
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A04() {
        if (this.A04.A05() >= this.expireTimeMs || super.A04()) {
            return true;
        }
        return false;
    }

    public final String A05() {
        AnonymousClass02N A012 = AnonymousClass02N.A01(this.jid);
        StringBuilder A0S = AnonymousClass008.A0S("; id=");
        A0S.append(this.id);
        A0S.append("; jid=");
        A0S.append(A012);
        A0S.append("; participant=");
        A0S.append(this.participant);
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    public final void A06(Integer num) {
        this.A06.A0C(AnonymousClass02N.A01(this.jid), this.id, AnonymousClass02N.A01(this.participant), num, null, null);
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = context.getApplicationContext();
        this.A04 = AnonymousClass00S.A00();
        this.A01 = AnonymousClass009.A00();
        this.A06 = AnonymousClass0AR.A00();
        AnonymousClass098.A00();
        this.A02 = AnonymousClass01J.A00();
        C02360Br.A00();
        this.A08 = AnonymousClass0AL.A01();
        this.A05 = AnonymousClass01K.A00();
        this.A03 = AnonymousClass0Ja.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A07 = C02840Dr.A09((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0S = AnonymousClass008.A0S("RehydrateHsmJob/readObject/error: missing message bytes ");
            A0S.append(A05());
            Log.e(A0S.toString());
        }
        if (this.A07 == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("RehydrateHsmJob/readObject/error: message is null");
            A0S2.append(A05());
            Log.e(A0S2.toString());
        }
        C02840Dr r0 = this.A07;
        if (r0 != null && (r0.A00 & 8192) != 8192) {
            StringBuilder A0S3 = AnonymousClass008.A0S("message must contain an HSM");
            A0S3.append(A05());
            throw new InvalidObjectException(A0S3.toString());
        } else if (this.id == null) {
            StringBuilder A0S4 = AnonymousClass008.A0S("id must not be null");
            A0S4.append(A05());
            throw new InvalidObjectException(A0S4.toString());
        } else if (this.jid == null) {
            StringBuilder A0S5 = AnonymousClass008.A0S("jid must not be null");
            A0S5.append(A05());
            throw new InvalidObjectException(A0S5.toString());
        } else if (this.timestamp <= 0) {
            StringBuilder A0S6 = AnonymousClass008.A0S("timestamp must be valid");
            A0S6.append(A05());
            throw new InvalidObjectException(A0S6.toString());
        } else if (this.expireTimeMs > 0) {
            Locale[] localeArr = this.locales;
            if (localeArr == null || localeArr.length == 0) {
                StringBuilder A0S7 = AnonymousClass008.A0S("locales[] must not be empty");
                A0S7.append(A05());
                throw new InvalidObjectException(A0S7.toString());
            }
        } else {
            StringBuilder A0S8 = AnonymousClass008.A0S("expireTimeMs must be non-negative");
            A0S8.append(A05());
            throw new InvalidObjectException(A0S8.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A07.A09());
    }
}

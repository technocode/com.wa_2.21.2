package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01P;
import X.AnonymousClass02Y;
import X.AnonymousClass0EA;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class VNameCertificateRequirement implements AnonymousClass0EA, Requirement {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01P A00;
    public transient UserJid A01;
    public final String jid;

    public VNameCertificateRequirement(UserJid userJid) {
        this.A01 = userJid;
        String rawString = userJid.getRawString();
        AnonymousClass00E.A03(rawString);
        this.jid = rawString;
    }

    public UserJid A00() {
        UserJid userJid = this.A01;
        if (userJid != null) {
            return userJid;
        }
        try {
            UserJid userJid2 = UserJid.get(this.jid);
            this.A01 = userJid2;
            return userJid2;
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean ABQ() {
        long j;
        Number number;
        UserJid A002 = A00();
        if (A002 == null || (number = (Number) this.A00.A08.get(A002)) == null) {
            j = 0;
        } else {
            j = number.longValue();
        }
        if (j > 0 && System.currentTimeMillis() - j < 3600000) {
            StringBuilder A0S = AnonymousClass008.A0S("satisfying vname requirement due to recent response");
            StringBuilder A0S2 = AnonymousClass008.A0S("; jid=");
            A0S2.append(A00());
            A0S.append(A0S2.toString());
            Log.d(A0S.toString());
            return true;
        } else if (!GetVNameCertificateJob.A02.containsKey(this.jid)) {
            StringBuilder A0S3 = AnonymousClass008.A0S("satisfying vname requirement because there is no scheduled job that could satisfy it");
            StringBuilder A0S4 = AnonymousClass008.A0S("; jid=");
            A0S4.append(A00());
            A0S3.append(A0S4.toString());
            Log.d(A0S3.toString());
            return true;
        } else {
            return this.A00.A02.A0C(A00()) != null;
        }
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01P.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            StringBuilder A0S = AnonymousClass008.A0S("jid must not be empty");
            StringBuilder A0S2 = AnonymousClass008.A0S("; jid=");
            A0S2.append(A00());
            A0S.append(A0S2.toString());
            throw new InvalidObjectException(A0S.toString());
        }
    }
}

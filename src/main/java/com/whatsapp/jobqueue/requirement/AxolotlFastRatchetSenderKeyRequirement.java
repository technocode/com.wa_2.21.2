package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01S;
import X.AnonymousClass0EA;
import X.AnonymousClass2A2;
import X.C001000o;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlFastRatchetSenderKeyRequirement implements AnonymousClass0EA, Requirement {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass01I A00;
    public transient C001000o A01;
    public transient AnonymousClass01S A02;
    public String groupJid = AnonymousClass2A2.A00.getRawString();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (r8 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        throw r0;
     */
    @Override // org.whispersystems.jobqueue.requirements.Requirement
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ABQ() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement.ABQ():boolean");
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01I.A00();
        this.A01 = C001000o.A00();
        this.A02 = AnonymousClass01S.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = AnonymousClass2A2.A00.getRawString();
        String str = this.groupJid;
        if (!rawString.equals(str)) {
            StringBuilder A0S = AnonymousClass008.A0S("groupJid is not location Jid, only location Jid supported for now; groupJid=");
            A0S.append(str);
            throw new InvalidObjectException(A0S.toString());
        }
    }
}

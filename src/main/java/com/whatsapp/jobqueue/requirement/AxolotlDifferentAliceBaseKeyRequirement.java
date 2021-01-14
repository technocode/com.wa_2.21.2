package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass008;
import X.AnonymousClass02Y;
import X.AnonymousClass0EA;
import X.C001000o;
import X.C001801b;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlDifferentAliceBaseKeyRequirement implements AnonymousClass0EA, Requirement {
    public static final long serialVersionUID = 1;
    public transient C001000o A00;
    public transient DeviceJid A01;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public AxolotlDifferentAliceBaseKeyRequirement(DeviceJid deviceJid, byte[] bArr) {
        this.A01 = deviceJid;
        this.jid = deviceJid.getRawString();
        if (bArr.length != 0) {
            this.oldAliceBaseKey = bArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean ABQ() {
        return !Arrays.equals(this.oldAliceBaseKey, this.A00.A0D(C001801b.A0A(this.A01)).A01.A00.A05.A01());
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = C001000o.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A01 = DeviceJid.get(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw new InvalidObjectException("oldAliceBaseKey must not be empty");
            }
        } catch (AnonymousClass02Y unused) {
            StringBuilder A0S = AnonymousClass008.A0S("jid must be a valid user jid; jid=");
            A0S.append(this.jid);
            throw new InvalidObjectException(A0S.toString());
        }
    }
}

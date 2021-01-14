package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Kn  reason: invalid class name and case insensitive filesystem */
public class C48002Kn {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final UserJid A03;

    public C48002Kn(DeviceJid deviceJid, UserJid userJid, int i, long j) {
        this.A02 = deviceJid;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48002Kn.class != obj.getClass()) {
            return false;
        }
        C48002Kn r7 = (C48002Kn) obj;
        UserJid userJid = this.A03;
        if (userJid == null) {
            if (r7.A03 != null) {
                return false;
            }
        } else if (!userJid.equals(r7.A03)) {
            return false;
        }
        if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02.equals(r7.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.A02.hashCode() + 31) * 31;
        UserJid userJid = this.A03;
        if (userJid == null) {
            hashCode = 0;
        } else {
            hashCode = userJid.hashCode();
        }
        return (int) (((long) ((((hashCode2 + hashCode) * 31) + this.A00) * 31)) + this.A01);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Device = ");
        A0S.append(this.A02);
        A0S.append(", recipient = ");
        A0S.append(this.A03);
        A0S.append(", status = ");
        A0S.append(this.A00);
        A0S.append(", timestamp = ");
        A0S.append(this.A01);
        return A0S.toString();
    }
}

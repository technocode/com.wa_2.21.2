package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1M4  reason: invalid class name */
public class AnonymousClass1M4 {
    public boolean A00;
    public final DeviceJid A01;

    public AnonymousClass1M4(DeviceJid deviceJid, boolean z) {
        this.A01 = deviceJid;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1M4.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1M4 r4 = (AnonymousClass1M4) obj;
        if (this.A00 != r4.A00) {
            return false;
        }
        return this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + (this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ParticipantDevice{deviceJid=");
        A0S.append(this.A01);
        A0S.append(", sentSenderKey=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}

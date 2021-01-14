package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.1VI  reason: invalid class name */
public class AnonymousClass1VI {
    public long A00;
    public long A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final DeviceJid A05;
    public final EnumC449622i A06;
    public final String A07;
    public final boolean A08;

    public AnonymousClass1VI(DeviceJid deviceJid, EnumC449622i r3, String str, long j, long j2, long j3, int i, boolean z, String str2) {
        if (deviceJid != null) {
            this.A05 = deviceJid;
            this.A06 = r3;
            this.A07 = str;
            this.A00 = j;
            this.A04 = j2;
            this.A01 = j3;
            this.A03 = i;
            this.A08 = z;
            this.A02 = str2;
            return;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass1VI r7 = (AnonymousClass1VI) obj;
        if (this.A05.equals(r7.A05) && this.A06.equals(r7.A06) && C003701u.A0F(this.A07, r7.A07) && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A08 == r7.A08 && C006803i.A0q(this.A02, r7.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        DeviceJid deviceJid = this.A05;
        return Arrays.hashCode(new Object[]{deviceJid, this.A06, deviceJid, Long.valueOf(this.A00), Long.valueOf(this.A04), Long.valueOf(this.A01), Integer.valueOf(this.A03), Boolean.valueOf(this.A08), this.A02});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Device jid: ");
        A0S.append(this.A05);
        A0S.append(", Platform type: ");
        A0S.append(this.A06.toString());
        A0S.append(", Device OS: ");
        A0S.append(this.A07);
        A0S.append(", Last active: ");
        A0S.append(this.A00);
        A0S.append(", Login time: ");
        A0S.append(this.A04);
        A0S.append(", Logout time: ");
        A0S.append(this.A01);
        A0S.append(", ADV Key Index: ");
        A0S.append(this.A03);
        A0S.append(", full sync required: ");
        A0S.append(this.A08);
        A0S.append(", Place Name: ");
        A0S.append(this.A02);
        return A0S.toString();
    }
}

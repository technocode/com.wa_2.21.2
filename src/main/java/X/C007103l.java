package X;

import java.io.Serializable;

/* renamed from: X.03l  reason: invalid class name and case insensitive filesystem */
public class C007103l implements Serializable {
    public static final long serialVersionUID = 1;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public C007103l(int i, long j) {
        this.expiration = i;
        this.ephemeralSettingTimestamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C007103l.class != obj.getClass()) {
            return false;
        }
        C007103l r7 = (C007103l) obj;
        if (this.expiration == r7.expiration && this.ephemeralSettingTimestamp == r7.ephemeralSettingTimestamp) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.ephemeralSettingTimestamp;
        return (this.expiration * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("EphemeralInfo{expiration=");
        A0S.append(this.expiration);
        A0S.append(", ephemeralSettingTimestamp=");
        A0S.append(this.ephemeralSettingTimestamp);
        A0S.append('}');
        return A0S.toString();
    }
}

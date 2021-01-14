package X;

import java.util.Arrays;

/* renamed from: X.0OB  reason: invalid class name */
public class AnonymousClass0OB {
    public final int A00;
    public final int A01;
    public final long A02;

    public AnonymousClass0OB() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = 0;
    }

    public AnonymousClass0OB(int i, int i2, long j) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
    }

    public AnonymousClass0OB(AnonymousClass0OB r3) {
        if (r3 == null) {
            this.A01 = 0;
            this.A00 = 0;
            this.A02 = 0;
            return;
        }
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
    }

    public AnonymousClass0OB(String str, String str2, String str3) {
        this.A01 = C002001d.A0I(str);
        this.A00 = C002001d.A0H(str2);
        this.A02 = C006803i.A04(str3, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0OB.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0OB r7 = (AnonymousClass0OB) obj;
        if (this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("PrivacyMode{hostStorage=");
        A0S.append(this.A01);
        A0S.append(", actualActors=");
        A0S.append(this.A00);
        A0S.append(", privacyModeTs=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}

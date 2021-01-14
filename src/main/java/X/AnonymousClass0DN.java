package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0DN  reason: invalid class name */
public class AnonymousClass0DN {
    public final int A00;
    public final int A01;
    public final Set A02;

    public AnonymousClass0DN(int i, int i2, Set set) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public static AnonymousClass0DN A00(C75583dA r4) {
        int i = r4.A00;
        if ((i & 1) == 1 && (i & 2) == 2 && r4.A04.size() != 0) {
            return new AnonymousClass0DN(r4.A03, r4.A01, new HashSet(r4.A04));
        }
        return null;
    }

    public C75583dA A01() {
        AbstractC04160Jh A0B = C75583dA.A05.AQb();
        int i = this.A01;
        A0B.A02();
        C75583dA r1 = (C75583dA) A0B.A00;
        r1.A00 |= 1;
        r1.A03 = i;
        int i2 = this.A00;
        A0B.A02();
        C75583dA r12 = (C75583dA) A0B.A00;
        r12.A00 |= 2;
        r12.A01 = i2;
        Set set = this.A02;
        A0B.A02();
        C75583dA r2 = (C75583dA) A0B.A00;
        AbstractC11330g6 r13 = r2.A04;
        if (!((AbstractC05040Mx) r13).A00) {
            r2.A04 = AnonymousClass078.A03(r13);
        }
        AnonymousClass079.A07(set, r2.A04);
        return (C75583dA) A0B.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0DN)) {
            return false;
        }
        AnonymousClass0DN r4 = (AnonymousClass0DN) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02.equals(r4.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass008.A0Y("SyncdKeyFingerprint{", "rawId=");
        A0Y.append(this.A01);
        A0Y.append(", currentIndex=");
        A0Y.append(this.A00);
        A0Y.append(", deviceIndexes=");
        A0Y.append(this.A02);
        A0Y.append('}');
        return A0Y.toString();
    }
}

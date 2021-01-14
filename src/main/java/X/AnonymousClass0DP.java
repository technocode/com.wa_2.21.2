package X;

import android.util.Pair;
import java.util.Arrays;

/* renamed from: X.0DP  reason: invalid class name */
public class AnonymousClass0DP {
    public final AnonymousClass0DO A00;
    public final AnonymousClass0DM A01;

    public AnonymousClass0DP(AnonymousClass0DM r1, AnonymousClass0DO r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static Pair A00(C75543d6 r6) {
        C75603dC r0 = r6.A02;
        if (r0 == null) {
            r0 = C75603dC.A02;
        }
        AnonymousClass0DM A002 = AnonymousClass0DM.A00(r0);
        AnonymousClass0DP r3 = null;
        if (A002 == null) {
            return null;
        }
        C75563d8 r62 = r6.A01;
        if (r62 == null) {
            r62 = C75563d8.A04;
        }
        int i = r62.A00;
        if ((i & 4) == 4 || (i & 2) == 2 || (i & 1) == 1) {
            C75583dA r02 = r62.A03;
            if (r02 == null) {
                r02 = C75583dA.A05;
            }
            AnonymousClass0DN A003 = AnonymousClass0DN.A00(r02);
            if (A003 != null) {
                r3 = new AnonymousClass0DP(A002, new AnonymousClass0DO(r62.A02.A01(), r62.A01, A003));
            }
        }
        return new Pair(A002, r3);
    }

    public static C75543d6 A01(AnonymousClass0DM r5, AnonymousClass0DO r6) {
        AbstractC04160Jh A0B = C75543d6.A03.AQb();
        C75603dC A03 = r5.A03();
        A0B.A02();
        C75543d6 r1 = (C75543d6) A0B.A00;
        if (A03 != null) {
            r1.A02 = A03;
            r1.A00 |= 1;
            if (r6 != null) {
                AbstractC04160Jh A0B2 = C75563d8.A04.AQb();
                byte[] bArr = r6.A02;
                AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
                A0B2.A02();
                C75563d8 r12 = (C75563d8) A0B2.A00;
                r12.A00 |= 1;
                r12.A02 = A002;
                long j = r6.A00;
                A0B2.A02();
                C75563d8 r13 = (C75563d8) A0B2.A00;
                r13.A00 |= 4;
                r13.A01 = j;
                C75583dA A012 = r6.A01.A01();
                A0B2.A02();
                C75563d8 r14 = (C75563d8) A0B2.A00;
                if (A012 != null) {
                    r14.A03 = A012;
                    r14.A00 |= 2;
                    C75563d8 r0 = (C75563d8) A0B2.A01();
                    A0B.A02();
                    C75543d6 r15 = (C75543d6) A0B.A00;
                    if (r0 != null) {
                        r15.A01 = r0;
                        r15.A00 |= 2;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            return (C75543d6) A0B.A01();
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0DP)) {
            return false;
        }
        AnonymousClass0DP r4 = (AnonymousClass0DP) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncdKey{keyId=");
        A0S.append(this.A01);
        A0S.append(", syncdKeyData=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}

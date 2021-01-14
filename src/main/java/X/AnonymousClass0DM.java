package X;

import java.util.Arrays;

/* renamed from: X.0DM  reason: invalid class name */
public class AnonymousClass0DM {
    public final byte[] A00;

    public AnonymousClass0DM(int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.A00 = new byte[0];
            return;
        }
        byte[] bArr = new byte[6];
        this.A00 = bArr;
        bArr[1] = (byte) i;
        bArr[0] = (byte) (i >> 8);
        bArr[5] = (byte) i2;
        bArr[4] = (byte) (i2 >> 8);
        bArr[3] = (byte) (i2 >> 16);
        bArr[2] = (byte) (i2 >> 24);
    }

    public AnonymousClass0DM(byte[] bArr) {
        this.A00 = bArr;
    }

    public static AnonymousClass0DM A00(C75603dC r2) {
        if ((r2.A00 & 1) == 1) {
            return new AnonymousClass0DM(r2.A01.A01());
        }
        return null;
    }

    public int A01() {
        byte[] bArr = this.A00;
        if (bArr.length == 0) {
            return 0;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public int A02() {
        byte[] bArr = this.A00;
        if (bArr.length == 0) {
            return 0;
        }
        return (bArr[5] & 255) | ((bArr[2] & 255) << 24) | ((bArr[3] & 255) << 16) | ((bArr[4] & 255) << 8);
    }

    public C75603dC A03() {
        AbstractC04160Jh A0B = C75603dC.A02.AQb();
        byte[] bArr = this.A00;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        C75603dC r1 = (C75603dC) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = A002;
        return (C75603dC) A0B.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0DM)) {
            return false;
        }
        return Arrays.equals(this.A00, ((AnonymousClass0DM) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncdKeyId{deviceId=");
        A0S.append(A01());
        A0S.append(", epoch=");
        A0S.append(A02());
        A0S.append("}");
        return A0S.toString();
    }
}

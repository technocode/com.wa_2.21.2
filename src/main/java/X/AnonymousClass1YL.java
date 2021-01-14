package X;

import java.util.Arrays;

/* renamed from: X.1YL  reason: invalid class name */
public class AnonymousClass1YL {
    public final int A00;
    public final AnonymousClass0OB A01;
    public final boolean A02;

    public AnonymousClass1YL(AnonymousClass0OB r3, int i, int i2) {
        this.A01 = r3 == null ? new AnonymousClass0OB() : r3;
        this.A00 = i;
        this.A02 = i2 == 3;
    }

    public static int A00(AnonymousClass0J9 r3) {
        if (r3 == null) {
            return 1;
        }
        String str = r3.A07;
        if (str != null && str.startsWith("smb:")) {
            return 2;
        }
        if (r3.A01()) {
            return 3;
        }
        return 1;
    }

    public int A01() {
        if (A03(1, 1, 1, false)) {
            return 0;
        }
        if (A03(2, 1, 1, false)) {
            return 1;
        }
        if (A03(2, 1, 1, true)) {
            return 2;
        }
        if (A03(3, 1, 1, false)) {
            return 3;
        }
        if (A03(3, 1, 1, true)) {
            return 4;
        }
        if (A03(3, 1, 2, false)) {
            return 5;
        }
        if (A03(3, 1, 2, true)) {
            return 6;
        }
        if (A03(3, 2, 1, false)) {
            return 7;
        }
        if (A03(3, 2, 1, true)) {
            return 8;
        }
        if (A03(3, 2, 2, false)) {
            return 9;
        }
        if (A03(3, 2, 2, true)) {
            return 10;
        }
        if (A03(1, 0, 0, false)) {
            return 0;
        }
        if (A03(2, 0, 0, false)) {
            return 1;
        }
        if (A03(2, 0, 0, true)) {
            return 2;
        }
        if (A03(3, 0, 0, false)) {
            return 3;
        }
        if (A03(3, 0, 0, true)) {
            return 4;
        }
        return 0;
    }

    public boolean A02() {
        int A012 = A01();
        return A012 == 0 || A012 == 1 || A012 == 2 || A012 == 3 || A012 == 4;
    }

    public final boolean A03(int i, int i2, int i3, boolean z) {
        if (this.A00 == i) {
            AnonymousClass0OB r1 = this.A01;
            return r1.A00 == i2 && r1.A01 == i3 && this.A02 == z;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1YL.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1YL r5 = (AnonymousClass1YL) obj;
        if (this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("BusinessState{privacyMode=");
        A0S.append(this.A01);
        A0S.append(", client=");
        A0S.append(this.A00);
        A0S.append(", isVerified=");
        A0S.append(this.A02);
        A0S.append(", stateId=");
        A0S.append(A01());
        A0S.append('}');
        return A0S.toString();
    }
}

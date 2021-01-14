package X;

import java.util.Arrays;

/* renamed from: X.25e  reason: invalid class name and case insensitive filesystem */
public final class C455225e implements AbstractC232114v {
    public int A00;
    public final int A01;
    public final AnonymousClass148 A02;
    public final int[] A03;
    public final AnonymousClass126[] A04;

    public C455225e(AnonymousClass148 r8, int... iArr) {
        int length = iArr.length;
        C002001d.A3A(length > 0);
        if (r8 != null) {
            this.A02 = r8;
            this.A01 = length;
            AnonymousClass126[] r3 = new AnonymousClass126[length];
            this.A04 = r3;
            for (int i = 0; i < length; i++) {
                r3[i] = r8.A02[iArr[i]];
            }
            Arrays.sort(r3, new C231214m());
            int i2 = this.A01;
            int[] iArr2 = new int[i2];
            this.A03 = iArr2;
            for (int i3 = 0; i3 < i2; i3++) {
                AnonymousClass126 r32 = this.A04[i3];
                int i4 = 0;
                while (true) {
                    AnonymousClass126[] r1 = r8.A02;
                    if (i4 >= r1.length) {
                        i4 = -1;
                        break;
                    }
                    if (r32 == r1[i4]) {
                        break;
                    }
                    i4++;
                }
                iArr2[i3] = i4;
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractC232114v
    public final AnonymousClass126 A6T(int i) {
        return this.A04[i];
    }

    @Override // X.AbstractC232114v
    public final int A6m(int i) {
        return this.A03[i];
    }

    @Override // X.AbstractC232114v
    public final AnonymousClass148 A9Q() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C455225e r5 = (C455225e) obj;
        if (this.A02 != r5.A02 || !Arrays.equals(this.A03, r5.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A03) + (System.identityHashCode(this.A02) * 31);
        this.A00 = hashCode;
        return hashCode;
    }

    @Override // X.AbstractC232114v
    public final int length() {
        return this.A03.length;
    }
}

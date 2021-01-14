package X;

/* renamed from: X.1Fy  reason: invalid class name */
public final class AnonymousClass1Fy {
    public AnonymousClass1G4 A00;
    public AnonymousClass1G9 A01;
    public boolean A02;
    public final C25201Fn A03;

    public AnonymousClass1Fy(C25201Fn r3) {
        int i = r3.A00;
        if (i < 21 || (i & 3) != 1) {
            throw C37201no.A00;
        }
        this.A03 = r3;
    }

    public final int A00(int i, int i2, int i3) {
        return this.A02 ? this.A03.A03(i2, i) : this.A03.A03(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public AnonymousClass1G4 A01() {
        AnonymousClass1G4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = A00(i3, 8, i2);
        }
        int A002 = A00(8, 7, A00(8, 8, A00(7, 8, i2)));
        int i4 = 5;
        do {
            A002 = A00(8, i4, A002);
            i4--;
        } while (i4 >= 0);
        int i5 = this.A03.A00;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = A00(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = A00(i8, 8, i);
        }
        AnonymousClass1G4 A012 = AnonymousClass1G4.A01(A002, i);
        if (A012 == null) {
            A012 = AnonymousClass1G4.A01(A002 ^ 21522, i ^ 21522);
        }
        this.A00 = A012;
        if (A012 != null) {
            return A012;
        }
        throw C37201no.A00;
    }

    public AnonymousClass1G9 A02() {
        int i;
        AnonymousClass1G9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) >> 2;
        if (i3 <= 6) {
            return AnonymousClass1G9.A01(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            i = i2 - 9;
            while (i >= i4) {
                i8 = A00(i, i7, i8);
                i--;
            }
            i7--;
        } while (i7 >= 0);
        AnonymousClass1G9 A002 = AnonymousClass1G9.A00(i8);
        if (A002 == null || (A002.A01 << 2) + 17 != i2) {
            do {
                for (int i9 = i; i9 >= i4; i9--) {
                    i6 = A00(i5, i9, i6);
                }
                i5--;
            } while (i5 >= 0);
            AnonymousClass1G9 A003 = AnonymousClass1G9.A00(i6);
            if (A003 == null || (A003.A01 << 2) + 17 != i2) {
                throw C37201no.A00;
            }
            this.A01 = A003;
            return A003;
        }
        this.A01 = A002;
        return A002;
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.1YN  reason: invalid class name */
public class AnonymousClass1YN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass0OB A04;
    public final AnonymousClass0OB A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public AnonymousClass1YN(int i, int i2, String str, String str2, AnonymousClass0OB r5, AnonymousClass0OB r6, boolean z, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r5;
        this.A04 = r6;
        this.A08 = z;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1YN.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1YN r5 = (AnonymousClass1YN) obj;
        if (this.A03 == r5.A03 && this.A01 == r5.A01 && this.A08 == r5.A08 && this.A02 == r5.A02 && this.A00 == r5.A00 && C006803i.A0q(this.A07, r5.A07) && C006803i.A0q(this.A06, r5.A06) && C006803i.A0q(this.A05, r5.A05) && C006803i.A0q(this.A04, r5.A04)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A01), this.A07, this.A06, this.A05, this.A04, Boolean.valueOf(this.A08), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }
}

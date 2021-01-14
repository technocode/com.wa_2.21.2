package X;

/* renamed from: X.0sJ  reason: invalid class name and case insensitive filesystem */
public class C17810sJ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public C17810sJ(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17810sJ)) {
            return false;
        }
        C17810sJ r4 = (C17810sJ) obj;
        if (this.A00 == r4.A00 && this.A03 == r4.A03 && this.A01 == r4.A01 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        if (this.A00) {
            i = 1;
        }
        if (this.A03) {
            i += 16;
        }
        if (this.A01) {
            i += 256;
        }
        return this.A02 ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.A00), Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Boolean.valueOf(this.A02));
    }
}

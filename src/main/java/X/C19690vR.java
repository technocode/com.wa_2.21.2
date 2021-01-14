package X;

/* renamed from: X.0vR  reason: invalid class name and case insensitive filesystem */
public final class C19690vR {
    public final C07040Vr A00;
    public final C07040Vr A01;
    public final C07040Vr A02;
    public final C07040Vr A03;
    public final C19630vL A04;

    public C19690vR(C07040Vr r1, C07040Vr r2, C07040Vr r3, C07040Vr r4, C19630vL r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19690vR)) {
            return false;
        }
        C19690vR r4 = (C19690vR) obj;
        C07040Vr r1 = this.A02;
        if (r1 == null) {
            if (r4.A02 != null) {
                return false;
            }
        } else if (!r1.equals(r4.A02)) {
            return false;
        }
        C07040Vr r12 = this.A03;
        if (r12 == null) {
            if (r4.A03 != null) {
                return false;
            }
        } else if (!r12.equals(r4.A03)) {
            return false;
        }
        C07040Vr r13 = this.A00;
        if (r13 == null) {
            if (r4.A00 != null) {
                return false;
            }
        } else if (!r13.equals(r4.A00)) {
            return false;
        }
        C07040Vr r14 = this.A01;
        if (r14 == null) {
            if (r4.A01 != null) {
                return false;
            }
        } else if (!r14.equals(r4.A01)) {
            return false;
        }
        C19630vL r15 = this.A04;
        C19630vL r0 = r4.A04;
        if (r15 == null) {
            if (r0 == null) {
                return true;
            }
            return false;
        } else if (r15.equals(r0)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C07040Vr r0 = this.A02;
        int i5 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        C07040Vr r02 = this.A03;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        C07040Vr r03 = this.A00;
        if (r03 != null) {
            i3 = r03.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        C07040Vr r04 = this.A01;
        if (r04 != null) {
            i4 = r04.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        C19630vL r05 = this.A04;
        if (r05 != null) {
            i5 = r05.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisibleRegion");
        sb.append("{nearLeft=");
        sb.append(this.A02);
        sb.append(", nearRight=");
        sb.append(this.A03);
        sb.append(", farLeft=");
        sb.append(this.A00);
        sb.append(", farRight=");
        sb.append(this.A01);
        sb.append(", latLngBounds=");
        sb.append(this.A04);
        sb.append("}");
        return sb.toString();
    }
}

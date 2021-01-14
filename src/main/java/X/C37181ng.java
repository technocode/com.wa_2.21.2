package X;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public class C37181ng implements AbstractC05000Mr {
    public int A00 = 0;

    @Override // X.AbstractC05000Mr
    public boolean AR5(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = this.A00 * 53;
        int i2 = 1237;
        if (z2) {
            i2 = 1231;
        }
        this.A00 = i2 + i;
        return z2;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass071 AR6(boolean z, AnonymousClass071 r4, boolean z2, AnonymousClass071 r6) {
        this.A00 = r4.hashCode() + (this.A00 * 53);
        return r4;
    }

    @Override // X.AbstractC05000Mr
    public double AR7(boolean z, double d, boolean z2, double d2) {
        int i = this.A00 * 53;
        long doubleToLongBits = Double.doubleToLongBits(d);
        this.A00 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + i;
        return d;
    }

    @Override // X.AbstractC05000Mr
    public float AR8(boolean z, float f, boolean z2, float f2) {
        this.A00 = Float.floatToIntBits(f) + (this.A00 * 53);
        return f;
    }

    @Override // X.AbstractC05000Mr
    public int AR9(boolean z, int i, boolean z2, int i2) {
        this.A00 = (this.A00 * 53) + i;
        return i;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC11330g6 ARA(AbstractC11330g6 r3, AbstractC11330g6 r4) {
        this.A00 = r3.hashCode() + (this.A00 * 53);
        return r3;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC04120Jd ARB(AbstractC04120Jd r3, AbstractC04120Jd r4) {
        this.A00 = r3.hashCode() + (this.A00 * 53);
        return r3;
    }

    @Override // X.AbstractC05000Mr
    public long ARC(boolean z, long j, boolean z2, long j2) {
        this.A00 = ((int) (j ^ (j >>> 32))) + (this.A00 * 53);
        return j;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass076 ARD(AnonymousClass076 r5, AnonymousClass076 r6) {
        int i;
        if (r5 == null) {
            i = 37;
        } else if (r5 instanceof AnonymousClass078) {
            AnonymousClass078 r3 = (AnonymousClass078) r5;
            i = ((AnonymousClass079) r3).A00;
            if (i == 0) {
                int i2 = this.A00;
                this.A00 = 0;
                r3.A0E(this, r3);
                i = this.A00;
                ((AnonymousClass079) r3).A00 = i;
                this.A00 = i2;
            }
        } else {
            i = r5.hashCode();
        }
        this.A00 = (this.A00 * 53) + i;
        return r5;
    }

    @Override // X.AbstractC05000Mr
    public Object ARE(boolean z, Object obj, Object obj2) {
        AnonymousClass076 r2 = (AnonymousClass076) obj;
        ARD(r2, (AnonymousClass076) obj2);
        return r2;
    }

    @Override // X.AbstractC05000Mr
    public void ARF(boolean z) {
        if (z) {
            throw new IllegalStateException();
        }
    }

    @Override // X.AbstractC05000Mr
    public Object ARG(boolean z, Object obj, Object obj2) {
        this.A00 = obj.hashCode() + (this.A00 * 53);
        return obj;
    }

    @Override // X.AbstractC05000Mr
    public String ARH(boolean z, String str, boolean z2, String str2) {
        this.A00 = str.hashCode() + (this.A00 * 53);
        return str;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass07A ARI(AnonymousClass07A r3, AnonymousClass07A r4) {
        this.A00 = r3.hashCode() + (this.A00 * 53);
        return r3;
    }
}

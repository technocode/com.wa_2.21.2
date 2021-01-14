package X;

/* renamed from: X.1nf  reason: invalid class name and case insensitive filesystem */
public class C37171nf implements AbstractC05000Mr {
    public static final AnonymousClass1FN A00 = new AnonymousClass1FN();
    public static final C37171nf A01 = new C37171nf();

    @Override // X.AbstractC05000Mr
    public boolean AR5(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z == z3 && z2 == z4) {
            return z2;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass071 AR6(boolean z, AnonymousClass071 r3, boolean z2, AnonymousClass071 r5) {
        if (z == z2 && r3.equals(r5)) {
            return r3;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public double AR7(boolean z, double d, boolean z2, double d2) {
        if (z == z2 && d == d2) {
            return d;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public float AR8(boolean z, float f, boolean z2, float f2) {
        if (z == z2 && f == f2) {
            return f;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public int AR9(boolean z, int i, boolean z2, int i2) {
        if (z == z2 && i == i2) {
            return i;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC11330g6 ARA(AbstractC11330g6 r2, AbstractC11330g6 r3) {
        if (r2.equals(r3)) {
            return r2;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC04120Jd ARB(AbstractC04120Jd r2, AbstractC04120Jd r3) {
        if (r2.equals(r3)) {
            return r2;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public long ARC(boolean z, long j, boolean z2, long j2) {
        if (z == z2 && j == j2) {
            return j;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass076 ARD(AnonymousClass076 r4, AnonymousClass076 r5) {
        if (r4 == null) {
            if (r5 == null) {
                return null;
            }
        } else if (r5 != null) {
            AnonymousClass078 r2 = (AnonymousClass078) r4;
            if (r2 != r5 && r2.A0H(EnumC04960Mn.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(r5)) {
                r2.A0E(this, (AnonymousClass078) r5);
            }
            return r4;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public Object ARE(boolean z, Object obj, Object obj2) {
        if (z) {
            AnonymousClass078 r3 = (AnonymousClass078) obj;
            AnonymousClass076 r7 = (AnonymousClass076) obj2;
            boolean z2 = true;
            if (r3 != r7) {
                if (!r3.A0H(EnumC04960Mn.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(r7)) {
                    z2 = false;
                } else {
                    r3.A0E(this, (AnonymousClass078) r7);
                }
            }
            if (z2) {
                return obj;
            }
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public void ARF(boolean z) {
        if (z) {
            throw A00;
        }
    }

    @Override // X.AbstractC05000Mr
    public Object ARG(boolean z, Object obj, Object obj2) {
        if (z && obj.equals(obj2)) {
            return obj;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public String ARH(boolean z, String str, boolean z2, String str2) {
        if (z == z2 && str.equals(str2)) {
            return str;
        }
        throw A00;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass07A ARI(AnonymousClass07A r2, AnonymousClass07A r3) {
        if (r2.equals(r3)) {
            return r2;
        }
        throw A00;
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.0Mp  reason: invalid class name and case insensitive filesystem */
public class C04980Mp implements AbstractC05000Mr {
    public static final C04980Mp A00 = new C04980Mp();

    @Override // X.AbstractC05000Mr
    public boolean AR5(boolean z, boolean z2, boolean z3, boolean z4) {
        return z3 ? z4 : z2;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass071 AR6(boolean z, AnonymousClass071 r2, boolean z2, AnonymousClass071 r4) {
        return z2 ? r4 : r2;
    }

    @Override // X.AbstractC05000Mr
    public double AR7(boolean z, double d, boolean z2, double d2) {
        return z2 ? d2 : d;
    }

    @Override // X.AbstractC05000Mr
    public float AR8(boolean z, float f, boolean z2, float f2) {
        return z2 ? f2 : f;
    }

    @Override // X.AbstractC05000Mr
    public int AR9(boolean z, int i, boolean z2, int i2) {
        return z2 ? i2 : i;
    }

    @Override // X.AbstractC05000Mr
    public long ARC(boolean z, long j, boolean z2, long j2) {
        return z2 ? j2 : j;
    }

    @Override // X.AbstractC05000Mr
    public void ARF(boolean z) {
    }

    @Override // X.AbstractC05000Mr
    public Object ARG(boolean z, Object obj, Object obj2) {
        return obj2;
    }

    @Override // X.AbstractC05000Mr
    public String ARH(boolean z, String str, boolean z2, String str2) {
        return z2 ? str2 : str;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC11330g6 ARA(AbstractC11330g6 r4, AbstractC11330g6 r5) {
        int size = r4.size();
        int size2 = r5.size();
        if (size <= 0) {
            return r5;
        }
        if (size2 > 0) {
            if (!((AbstractC05040Mx) r4).A00) {
                r4 = ((C11320g5) r4).ACC(size2 + size);
            }
            r4.addAll(r5);
        }
        return r4;
    }

    @Override // X.AbstractC05000Mr
    public AbstractC04120Jd ARB(AbstractC04120Jd r4, AbstractC04120Jd r5) {
        int size = r4.size();
        int size2 = r5.size();
        if (size <= 0) {
            return r5;
        }
        if (size2 > 0) {
            if (!((AbstractC05040Mx) r4).A00) {
                r4 = r4.ACC(size2 + size);
            }
            r4.addAll(r5);
        }
        return r4;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass076 ARD(AnonymousClass076 r4, AnonymousClass076 r5) {
        if (r4 == null) {
            return r5;
        }
        if (r5 == null) {
            return r4;
        }
        AbstractC04170Ji AQb = r4.AQb();
        if (AQb != null) {
            AbstractC04160Jh r2 = (AbstractC04160Jh) AQb;
            if (r2.A02.getClass().isInstance(r5)) {
                r2.A02();
                r2.A00.A0E(A00, (AnonymousClass078) ((AnonymousClass079) r5));
                return r2.A01();
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        throw null;
    }

    @Override // X.AbstractC05000Mr
    public Object ARE(boolean z, Object obj, Object obj2) {
        return z ? ARD((AnonymousClass076) obj, (AnonymousClass076) obj2) : obj2;
    }

    @Override // X.AbstractC05000Mr
    public AnonymousClass07A ARI(AnonymousClass07A r8, AnonymousClass07A r9) {
        if (r9 == AnonymousClass07A.A04) {
            return r8;
        }
        int i = r8.count + r9.count;
        int[] copyOf = Arrays.copyOf(r8.A02, i);
        System.arraycopy(r9.A02, 0, copyOf, r8.count, r9.count);
        Object[] copyOf2 = Arrays.copyOf(r8.A03, i);
        System.arraycopy(r9.A03, 0, copyOf2, r8.count, r9.count);
        return new AnonymousClass07A(i, copyOf, copyOf2, true);
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.1hW  reason: invalid class name and case insensitive filesystem */
public class C33871hW implements AbstractC226712s {
    public final C33931hc A00 = new C33931hc();
    public final C33941hd A01;
    public final AbstractC225412e[] A02;

    public C33871hW(AbstractC225412e... r5) {
        int length = r5.length;
        this.A02 = (AbstractC225412e[]) Arrays.copyOf(r5, length + 2);
        C33941hd r2 = new C33941hd();
        this.A01 = r2;
        AbstractC225412e[] r1 = this.A02;
        r1[length] = this.A00;
        r1[length + 1] = r2;
    }

    @Override // X.AbstractC226712s
    public AnonymousClass12F A25(AnonymousClass12F r8) {
        C33931hc r0 = this.A00;
        boolean z = r8.A03;
        r0.A09 = z;
        r0.flush();
        C33941hd r6 = this.A01;
        float f = r8.A01;
        if (r6 != null) {
            float max = Math.max(0.1f, Math.min(f, 8.0f));
            if (r6.A01 != max) {
                r6.A01 = max;
                r6.A08 = null;
            }
            r6.flush();
            float f2 = r8.A00;
            if (r6 != null) {
                float max2 = Math.max(0.1f, Math.min(f2, 8.0f));
                if (r6.A00 != max2) {
                    r6.A00 = max2;
                    r6.A08 = null;
                }
                r6.flush();
                return new AnonymousClass12F(max, max2, z);
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC226712s
    public long A7K(long j) {
        C33941hd r3 = this.A01;
        long j2 = r3.A07;
        if (j2 < 1024) {
            return (long) (((double) r3.A01) * ((double) j));
        }
        int i = r3.A03;
        int i2 = r3.A05;
        long j3 = r3.A06;
        if (i == i2) {
            return AnonymousClass0W2.A04(j, j3, j2);
        }
        return AnonymousClass0W2.A04(j, j3 * ((long) i), j2 * ((long) i2));
    }

    @Override // X.AbstractC226712s
    public long A98() {
        return this.A00.A06;
    }
}

package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1iF  reason: invalid class name and case insensitive filesystem */
public final class C34311iF implements AnonymousClass14F {
    public final long[] A00;
    public final AnonymousClass14E[] A01;

    public C34311iF(AnonymousClass14E[] r1, long[] jArr) {
        this.A01 = r1;
        this.A00 = jArr;
    }

    @Override // X.AnonymousClass14F
    public List A5d(long j) {
        AnonymousClass14E r0;
        int A02 = AnonymousClass0W2.A02(this.A00, j);
        if (A02 == -1 || (r0 = this.A01[A02]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(r0);
    }

    @Override // X.AnonymousClass14F
    public long A6H(int i) {
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        C002001d.A39(z2);
        long[] jArr = this.A00;
        if (i >= jArr.length) {
            z = false;
        }
        C002001d.A39(z);
        return jArr[i];
    }

    @Override // X.AnonymousClass14F
    public int A6I() {
        return this.A00.length;
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        long[] jArr = this.A00;
        int A03 = AnonymousClass0W2.A03(jArr, j, false, false);
        if (A03 >= jArr.length) {
            return -1;
        }
        return A03;
    }
}

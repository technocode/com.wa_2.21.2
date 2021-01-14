package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1iI  reason: invalid class name and case insensitive filesystem */
public final class C34341iI implements AnonymousClass14F {
    public static final C34341iI A01 = new C34341iI();
    public final List A00;

    @Override // X.AnonymousClass14F
    public int A6I() {
        return 1;
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        return j < 0 ? 0 : -1;
    }

    public C34341iI() {
        this.A00 = Collections.emptyList();
    }

    public C34341iI(AnonymousClass14E r2) {
        this.A00 = Collections.singletonList(r2);
    }

    @Override // X.AnonymousClass14F
    public List A5d(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // X.AnonymousClass14F
    public long A6H(int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        C002001d.A39(z);
        return 0;
    }
}

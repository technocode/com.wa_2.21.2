package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1iJ  reason: invalid class name and case insensitive filesystem */
public final class C34351iJ implements AnonymousClass14F {
    public final List A00;

    @Override // X.AnonymousClass14F
    public int A6I() {
        return 1;
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        return j < 0 ? 0 : -1;
    }

    public C34351iJ(List list) {
        this.A00 = Collections.unmodifiableList(list);
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

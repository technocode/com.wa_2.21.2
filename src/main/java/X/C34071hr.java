package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1hr  reason: invalid class name and case insensitive filesystem */
public final class C34071hr implements AnonymousClass13X {
    @Override // X.AnonymousClass13X
    public List A60(String str, boolean z) {
        List A03 = C227813d.A03(str, z);
        if (A03.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(A03.get(0));
    }

    @Override // X.AnonymousClass13X
    public AnonymousClass13V A7z() {
        AnonymousClass13V r0;
        List A03 = C227813d.A03("audio/raw", false);
        if (A03.isEmpty() || (r0 = (AnonymousClass13V) A03.get(0)) == null) {
            return null;
        }
        return new AnonymousClass13V(r0.A02, null, null, true, false, false);
    }
}

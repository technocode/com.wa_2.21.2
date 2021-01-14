package androidx.lifecycle;

import X.AbstractC005102k;
import X.AnonymousClass082;
import X.AnonymousClass0SK;

public class FullLifecycleObserverAdapter implements AnonymousClass0SK {
    public final AnonymousClass0SK A00;

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r3, AnonymousClass082 r4) {
        switch (r4.ordinal()) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                AnonymousClass0SK r0 = this.A00;
                if (r0 != null) {
                    r0.AKQ(r3, r4);
                    return;
                }
                return;
        }
    }
}

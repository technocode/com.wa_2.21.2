package androidx.savedstate;

import X.AbstractC005102k;
import X.AnonymousClass082;
import X.AnonymousClass0SI;
import X.AnonymousClass0SK;

public class SavedStateRegistry$1 implements AnonymousClass0SK {
    public final /* synthetic */ AnonymousClass0SI A00;

    public SavedStateRegistry$1(AnonymousClass0SI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r3, AnonymousClass082 r4) {
        if (r4 == AnonymousClass082.ON_START) {
            this.A00.A03 = true;
        } else if (r4 == AnonymousClass082.ON_STOP) {
            this.A00.A03 = false;
        }
    }
}

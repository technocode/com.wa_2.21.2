package androidx.activity;

import X.AbstractC005102k;
import X.AnonymousClass02i;
import X.AnonymousClass082;
import X.AnonymousClass0SK;

public class ComponentActivity$3 implements AnonymousClass0SK {
    public final /* synthetic */ AnonymousClass02i A00;

    public ComponentActivity$3(AnonymousClass02i r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r3, AnonymousClass082 r4) {
        if (r4 == AnonymousClass082.ON_DESTROY) {
            AnonymousClass02i r1 = this.A00;
            if (!r1.isChangingConfigurations()) {
                r1.A9n().A00();
            }
        }
    }
}

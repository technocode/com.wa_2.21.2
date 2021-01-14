package androidx.fragment.app;

import X.AbstractC005102k;
import X.AnonymousClass037;
import X.AnonymousClass082;
import X.AnonymousClass0SK;
import android.view.View;

public class Fragment$2 implements AnonymousClass0SK {
    public final /* synthetic */ AnonymousClass037 A00;

    public Fragment$2(AnonymousClass037 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
        View view;
        if (r3 == AnonymousClass082.ON_STOP && (view = this.A00.A0A) != null) {
            view.cancelPendingInputEvents();
        }
    }
}

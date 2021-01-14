package androidx.activity;

import X.AbstractC005102k;
import X.AnonymousClass02i;
import X.AnonymousClass082;
import X.AnonymousClass0SK;
import android.view.View;
import android.view.Window;

public class ComponentActivity$2 implements AnonymousClass0SK {
    public final /* synthetic */ AnonymousClass02i A00;

    public ComponentActivity$2(AnonymousClass02i r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
        Window window;
        View peekDecorView;
        if (r3 == AnonymousClass082.ON_STOP && (window = this.A00.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}

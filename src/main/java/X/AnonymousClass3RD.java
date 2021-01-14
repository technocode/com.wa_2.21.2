package X;

import android.view.View;
import java.util.List;

/* renamed from: X.3RD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RD implements AnonymousClass33J {
    public final /* synthetic */ C74213aM A00;

    public /* synthetic */ AnonymousClass3RD(C74213aM r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33J
    public final void AKV(List list) {
        C74213aM r3 = this.A00;
        r3.A01 = list;
        AnonymousClass3QG A002 = r3.A00();
        if (A002 != null) {
            A002.A08(r3.A01);
            ((AbstractC16300pa) A002).A01.A00();
            if (r3.A00 != null) {
                int A05 = r3.A00().A05();
                View view = r3.A00;
                int i = 8;
                if (A05 == 0) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
    }
}

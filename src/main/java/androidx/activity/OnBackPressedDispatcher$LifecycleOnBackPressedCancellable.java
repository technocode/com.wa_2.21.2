package androidx.activity;

import X.AbstractC005102k;
import X.AbstractC013907w;
import X.AnonymousClass082;
import X.AnonymousClass0S8;
import X.AnonymousClass0SK;
import X.AnonymousClass0SU;
import X.AnonymousClass0WS;
import X.C013807v;
import X.C08870bs;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements AnonymousClass0WS, AnonymousClass0SK {
    public AnonymousClass0WS A00;
    public final AnonymousClass0SU A01;
    public final AbstractC013907w A02;
    public final /* synthetic */ AnonymousClass0S8 A03;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(AnonymousClass0S8 r1, AbstractC013907w r2, AnonymousClass0SU r3) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
        r2.A00(this);
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r5, AnonymousClass082 r6) {
        if (r6 == AnonymousClass082.ON_START) {
            AnonymousClass0S8 r3 = this.A03;
            AnonymousClass0SU r2 = this.A01;
            r3.A01.add(r2);
            C08870bs r1 = new C08870bs(r3, r2);
            r2.A00.add(r1);
            this.A00 = r1;
        } else if (r6 == AnonymousClass082.ON_STOP) {
            AnonymousClass0WS r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r6 == AnonymousClass082.ON_DESTROY) {
            cancel();
        }
    }

    @Override // X.AnonymousClass0WS
    public void cancel() {
        ((C013807v) this.A02).A01.A01(this);
        this.A01.A00.remove(this);
        AnonymousClass0WS r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            this.A00 = null;
        }
    }
}

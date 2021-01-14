package androidx.lifecycle;

import X.AbstractC005102k;
import X.AbstractC02280Bj;
import X.AnonymousClass082;
import X.AnonymousClass0SG;
import X.AnonymousClass0SK;
import X.AnonymousClass0V3;
import X.C013807v;
import X.EnumC014207z;

public class LiveData$LifecycleBoundObserver extends AnonymousClass0V3 implements AnonymousClass0SK {
    public final AbstractC005102k A00;
    public final /* synthetic */ AbstractC02280Bj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(AbstractC02280Bj r1, AbstractC005102k r2, AnonymousClass0SG r3) {
        super(r1, r3);
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r3, AnonymousClass082 r4) {
        if (((C013807v) this.A00.A75()).A02 == EnumC014207z.DESTROYED) {
            this.A01.A06(this.A02);
            return;
        }
        boolean z = false;
        if (((C013807v) this.A00.A75()).A02.compareTo((Enum) EnumC014207z.STARTED) >= 0) {
            z = true;
        }
        A00(z);
    }
}

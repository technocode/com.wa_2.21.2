package X;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;

/* renamed from: X.0ba  reason: invalid class name and case insensitive filesystem */
public class C08710ba implements AnonymousClass0SG {
    public int A00 = -1;
    public final AbstractC02280Bj A01;
    public final AnonymousClass0SG A02;

    public C08710ba(AbstractC02280Bj r2, AnonymousClass0SG r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00() {
        AbstractC02280Bj r1 = this.A01;
        if (r1 != null) {
            AbstractC02280Bj.A00("observeForever");
            C11210ft r2 = new C11210ft(r1, this);
            Object A022 = r1.A02.A02(this, r2);
            if (A022 instanceof LiveData$LifecycleBoundObserver) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (A022 == null) {
                r2.A00(true);
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass0SG
    public void ADy(Object obj) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.ADy(obj);
        }
    }
}

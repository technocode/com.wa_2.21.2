package X;

import java.util.Iterator;

/* renamed from: X.0Wa  reason: invalid class name and case insensitive filesystem */
public class C07130Wa implements Iterator, AbstractC07140Wb {
    public AnonymousClass0SN A00;
    public boolean A01 = true;
    public final /* synthetic */ C014107y A02;

    public C07130Wa(C014107y r2) {
        this.A02 = r2;
    }

    @Override // X.AbstractC07140Wb
    public void AQN(AnonymousClass0SN r3) {
        AnonymousClass0SN r0 = this.A00;
        if (r3 == r0) {
            AnonymousClass0SN r1 = r0.A01;
            this.A00 = r1;
            boolean z = false;
            if (r1 == null) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public boolean hasNext() {
        if (!this.A01) {
            AnonymousClass0SN r0 = this.A00;
            if (r0 == null || r0.A00 == null) {
                return false;
            }
            return true;
        } else if (this.A02.A02 == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.A01) {
            this.A01 = false;
            AnonymousClass0SN r0 = this.A02.A02;
            this.A00 = r0;
            return r0;
        }
        AnonymousClass0SN r02 = this.A00;
        AnonymousClass0SN r03 = r02 != null ? r02.A00 : null;
        this.A00 = r03;
        return r03;
    }
}

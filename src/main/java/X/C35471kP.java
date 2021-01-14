package X;

import android.os.RemoteException;

/* renamed from: X.1kP  reason: invalid class name and case insensitive filesystem */
public final class C35471kP implements AbstractC240818w {
    public final /* synthetic */ AbstractC240918x A00;

    public C35471kP(AbstractC240918x r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC240818w
    public final int A9B() {
        return 5;
    }

    @Override // X.AbstractC240818w
    public final void ARU(AbstractC241018y r3) {
        C35921lI r0 = (C35921lI) this.A00.A01;
        if (r0 != null) {
            try {
                r0.A02.AJj();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            throw null;
        }
    }
}

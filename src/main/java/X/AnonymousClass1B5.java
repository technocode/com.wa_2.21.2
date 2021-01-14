package X;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.1B5  reason: invalid class name */
public final class AnonymousClass1B5 {
    public AnonymousClass1BA A00;
    public final IGoogleMapDelegate A01;

    public AnonymousClass1B5(IGoogleMapDelegate iGoogleMapDelegate) {
        C001801b.A1Q(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }

    public final AnonymousClass1B9 A00() {
        try {
            return new AnonymousClass1B9(this.A01.A8Z());
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final AnonymousClass1BA A01() {
        try {
            AnonymousClass1BA r1 = this.A00;
            if (r1 != null) {
                return r1;
            }
            AnonymousClass1BA r12 = new AnonymousClass1BA(this.A01.A9W());
            this.A00 = r12;
            return r12;
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final CameraPosition A02() {
        try {
            return this.A01.A59();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final AnonymousClass1BR A03(C36011lR r3) {
        try {
            AnonymousClass1Ab A1p = this.A01.A1p(r3);
            if (A1p != null) {
                return new AnonymousClass1BR(A1p);
            }
            return null;
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A04() {
        try {
            this.A01.AN1();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A05() {
        try {
            this.A01.AOX(16.0f);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A06(int i) {
        try {
            this.A01.AOU(i);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A07(int i, int i2, int i3) {
        try {
            this.A01.AOl(0, i, i2, i3);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A08(AnonymousClass06A r3) {
        try {
            this.A01.A1x(r3.A00);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A09(AnonymousClass06A r3) {
        try {
            this.A01.ACA(r3.A00);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A0A(AnonymousClass06A r4, AbstractC24471Ay r5) {
        BinderC457426c r0;
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r4.A00;
            if (r5 == null) {
                r0 = null;
            } else {
                r0 = new BinderC457426c(r5);
            }
            iGoogleMapDelegate.A1y(iObjectWrapper, r0);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A0B(AnonymousClass06A r5, AbstractC24471Ay r6) {
        BinderC457426c r0;
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r5.A00;
            if (r6 == null) {
                r0 = null;
            } else {
                r0 = new BinderC457426c(r6);
            }
            iGoogleMapDelegate.A1z(iObjectWrapper, 400, r0);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A0C(C36001lQ r3) {
        try {
            this.A01.AOT(r3);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A0D(boolean z) {
        try {
            this.A01.AOc(z);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A0E(boolean z) {
        try {
            this.A01.APF(z);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }
}

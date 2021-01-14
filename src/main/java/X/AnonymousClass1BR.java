package X;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1BR  reason: invalid class name */
public final class AnonymousClass1BR {
    public final AnonymousClass1Ab A00;

    public AnonymousClass1BR(AnonymousClass1Ab r1) {
        C001801b.A1Q(r1);
        this.A00 = r1;
    }

    public final LatLng A00() {
        try {
            return this.A00.A8S();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final Object A01() {
        try {
            return BinderC04800Lv.A00(this.A00.ASM());
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A02() {
        try {
            this.A00.AAR();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A03() {
        try {
            this.A00.APn();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A04(float f) {
        try {
            this.A00.APQ(f);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A05(AnonymousClass06F r3) {
        if (r3 == null) {
            try {
                this.A00.ASJ(null);
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            this.A00.ASJ(r3.A00);
        }
    }

    public final void A06(LatLng latLng) {
        try {
            this.A00.AOr(latLng);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final void A07(boolean z) {
        try {
            this.A00.APL(z);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final boolean A08() {
        try {
            return this.A00.isVisible();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1BR)) {
            return false;
        }
        try {
            return this.A00.ASL(((AnonymousClass1BR) obj).A00);
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final int hashCode() {
        try {
            return this.A00.ASK();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }
}

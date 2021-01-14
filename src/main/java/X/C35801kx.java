package X;

import android.location.Location;

/* renamed from: X.1kx  reason: invalid class name and case insensitive filesystem */
public final class C35801kx implements AnonymousClass17N {
    public final /* synthetic */ Location A00;

    public C35801kx(Location location) {
        this.A00 = location;
    }

    @Override // X.AnonymousClass17N
    public final /* synthetic */ void ACV(Object obj) {
        ((AbstractC24441Ao) obj).onLocationChanged(this.A00);
    }
}

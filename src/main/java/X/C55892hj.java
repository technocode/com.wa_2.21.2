package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.2hj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55892hj implements AbstractC19240uh {
    public final /* synthetic */ LatLng A00;

    public /* synthetic */ C55892hj(LatLng latLng) {
        this.A00 = latLng;
    }

    @Override // X.AbstractC19240uh
    public final void AHR(C32031eE r8) {
        LatLng latLng = this.A00;
        int i = (int) (C002301g.A0K.A00 * 2.0f);
        r8.A07(i << 1, i, i);
        r8.A08(AnonymousClass0N2.A0i(new C07020Vp(new C07040Vr(latLng.A00, latLng.A01), 15.0f, Float.MIN_VALUE, Float.MIN_VALUE)), 0, null);
    }
}

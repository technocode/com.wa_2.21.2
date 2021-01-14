package X;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2hk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55902hk implements AbstractC19240uh {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C55902hk(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    @Override // X.AbstractC19240uh
    public final void AHR(C32031eE r8) {
        C19570vF A012;
        LatLng latLng = this.A00;
        String str = this.A01;
        if (WaMapView.A03 == null) {
            if (C19590vH.A02 == null) {
                A012 = null;
            } else {
                A012 = C19590vH.A01(AnonymousClass008.A0F("resource_", R.drawable.ic_map_pin), new C32301ef());
            }
            WaMapView.A03 = A012;
        }
        C19640vM r5 = new C19640vM();
        r5.A02 = new C07040Vr(latLng.A00, latLng.A01);
        r5.A01 = WaMapView.A03;
        r5.A04 = str;
        r8.A05();
        C32311eg r0 = new C32311eg(r8, r5);
        r8.A09(r0);
        r0.A0I = r8;
    }
}

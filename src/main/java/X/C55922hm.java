package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2hm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55922hm implements AnonymousClass1B8 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ C36001lQ A01;
    public final /* synthetic */ WaMapView A02;

    public /* synthetic */ C55922hm(WaMapView waMapView, C36001lQ r2, LatLng latLng) {
        this.A02 = waMapView;
        this.A01 = r2;
        this.A00 = latLng;
    }

    @Override // X.AnonymousClass1B8
    public final void AHS(AnonymousClass1B5 r7) {
        C36001lQ r0;
        WaMapView waMapView = this.A02;
        C36001lQ r2 = this.A01;
        LatLng latLng = this.A00;
        if (C002001d.A3E(waMapView.getContext())) {
            r0 = C36001lQ.A00(waMapView.getContext(), R.raw.night_map_style_json);
        } else {
            r0 = null;
        }
        if (r2 == null) {
            r2 = r0;
        }
        r7.A0C(r2);
        int i = (int) (C002301g.A0K.A00 * 2.0f);
        r7.A07(i << 1, i, i);
        r7.A09(C008805h.A0F(new CameraPosition(latLng, 15.0f, 0.0f, 0.0f)));
        AnonymousClass1B6 r02 = waMapView.A01;
        if (r02 != null) {
            r02.setVisibility(0);
            return;
        }
        throw null;
    }
}

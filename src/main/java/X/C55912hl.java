package X;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2hl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55912hl implements AnonymousClass1B8 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C55912hl(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }

    @Override // X.AnonymousClass1B8
    public final void AHS(AnonymousClass1B5 r6) {
        LatLng latLng = this.A00;
        String str = this.A01;
        AnonymousClass06F r2 = WaMapView.A04;
        if (r2 == null) {
            try {
                AnonymousClass06E r1 = C008805h.A01;
                C001801b.A1R(r1, "IBitmapDescriptorFactory is not initialized");
                r2 = new AnonymousClass06F(r1.ARk(R.drawable.ic_map_pin));
                WaMapView.A04 = r2;
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        }
        C36011lR r12 = new C36011lR();
        if (latLng != null) {
            r12.A08 = latLng;
            r12.A07 = r2;
            r12.A09 = str;
            if (r6 != null) {
                try {
                    r6.A01.clear();
                    r6.A03(r12);
                } catch (RemoteException e2) {
                    throw new AnonymousClass06B(e2);
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }
}

package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2hc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55822hc implements AnonymousClass1B3 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55822hc(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B3
    public final void AHQ(LatLng latLng) {
        LocationPicker2 locationPicker2 = this.A00;
        PlaceInfo placeInfo = locationPicker2.A08.A0Z;
        if (placeInfo != null) {
            Object obj = placeInfo.A01;
            if (obj != null) {
                ((AnonymousClass1BR) obj).A05(locationPicker2.A03);
            }
            AbstractC49792Sd r1 = locationPicker2.A08;
            r1.A0Z = null;
            r1.A0D();
        }
        AbstractC49792Sd r12 = locationPicker2.A08;
        if (r12.A0o) {
            r12.A0E.setVisibility(0);
        }
        locationPicker2.A08.A0B.setVisibility(8);
    }
}

package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2hX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55772hX implements AbstractC19240uh {
    public final /* synthetic */ LocationPicker A00;

    public /* synthetic */ C55772hX(LocationPicker locationPicker) {
        this.A00 = locationPicker;
    }

    @Override // X.AbstractC19240uh
    public final void AHR(C32031eE r11) {
        LocationPicker locationPicker = this.A00;
        if (locationPicker.A03 == null) {
            locationPicker.A03 = r11;
            if (r11 == null) {
                return;
            }
            if (r11 != null) {
                if (locationPicker.A0K.A04() && !locationPicker.A09.A0t) {
                    locationPicker.A03.A0B(true);
                }
                C32031eE r2 = locationPicker.A03;
                AbstractC49792Sd r0 = locationPicker.A09;
                r2.A07(0, 0, Math.max(r0.A00, r0.A02));
                C19270uk r02 = locationPicker.A03.A0S;
                r02.A01 = false;
                r02.A00();
                locationPicker.A03.A08 = new C56132i8(locationPicker);
                C32031eE r1 = locationPicker.A03;
                r1.A0C = new C55752hV(locationPicker);
                r1.A0A = new C55782hY(locationPicker);
                r1.A0B = new C55742hU(locationPicker);
                r1.A09 = new C55762hW(locationPicker);
                locationPicker.A09.A0T(false, null);
                AbstractC49792Sd r12 = locationPicker.A09;
                AnonymousClass1N1 r03 = r12.A0a;
                if (r03 != null && !r03.places.isEmpty()) {
                    r12.A05();
                }
                Bundle bundle = locationPicker.A02;
                if (bundle != null) {
                    locationPicker.A08.setLocationMode(bundle.getInt("map_location_mode", 2));
                    if (locationPicker.A02.containsKey("camera_zoom")) {
                        locationPicker.A03.A08(AnonymousClass0N2.A0j(new C07040Vr(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")), 0, null);
                    }
                    locationPicker.A02 = null;
                    return;
                }
                SharedPreferences A01 = locationPicker.A0U.A01(AnonymousClass020.A02);
                locationPicker.A03.A08(AnonymousClass0N2.A0j(new C07040Vr((double) A01.getFloat("share_location_lat", 37.389805f), (double) A01.getFloat("share_location_lon", -122.08141f)), A01.getFloat("share_location_zoom", 15.0f) - 0.2f), 0, null);
                return;
            }
            throw null;
        }
    }
}

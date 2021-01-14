package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public class C56152iA extends AbstractC49792Sd {
    public AbstractC24471Ay A00 = new C56142i9();
    public final /* synthetic */ LocationPicker2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56152iA(LocationPicker2 locationPicker2, AnonymousClass00G r33, AnonymousClass00S r34, C002701k r35, AnonymousClass0Eg r36, AnonymousClass02M r37, C06170Sb r38, AnonymousClass01I r39, AnonymousClass00T r40, C02590Cr r41, C02600Cs r42, C04360Kb r43, C03930Ii r44, C02780Dk r45, C02770Dj r46, AnonymousClass0HJ r47, AnonymousClass03P r48, AnonymousClass0M9 r49, AnonymousClass01X r50, AnonymousClass01K r51, AnonymousClass1N2 r52, WhatsAppLibLoader whatsAppLibLoader, C53492dM r54, C02660Cy r55, AnonymousClass03S r56, AnonymousClass00D r57, AnonymousClass0C1 r58, AnonymousClass01S r59, AnonymousClass022 r60, AnonymousClass0HK r61) {
        super(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, whatsAppLibLoader, r54, r55, r56, r57, r58, r59, r60, r61);
        this.A01 = locationPicker2;
    }

    @Override // X.AbstractC49792Sd
    public void onLocationChanged(Location location) {
        AnonymousClass1B5 r6;
        if (location != null) {
            LocationPicker2 locationPicker2 = this.A01;
            if (locationPicker2.A08.A06 == null && (r6 = locationPicker2.A01) != null) {
                r6.A09(C008805h.A0G(new LatLng(location.getLatitude(), location.getLongitude())));
            }
            if (locationPicker2.A08.A0t && locationPicker2.A01 != null) {
                if (locationPicker2.A05 == null) {
                    A04();
                }
                LocationPicker2.A04(locationPicker2, new LatLng(location.getLatitude(), location.getLongitude()));
            }
            if (locationPicker2.A08.A0s && locationPicker2.A01 != null) {
                locationPicker2.A01.A08(C008805h.A0G(new LatLng(location.getLatitude(), location.getLongitude())));
            }
            locationPicker2.A07.A06 = location;
            super.onLocationChanged(location);
        }
    }
}

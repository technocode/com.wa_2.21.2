package X;

import android.location.Location;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.2i7  reason: invalid class name and case insensitive filesystem */
public class C56122i7 extends AbstractC49792Sd {
    public AbstractC19070uN A00 = new AnonymousClass2i6();
    public final /* synthetic */ LocationPicker A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56122i7(LocationPicker locationPicker, AnonymousClass00G r33, AnonymousClass00S r34, C002701k r35, AnonymousClass0Eg r36, AnonymousClass02M r37, C06170Sb r38, AnonymousClass01I r39, AnonymousClass00T r40, C02590Cr r41, C02600Cs r42, C04360Kb r43, C03930Ii r44, C02780Dk r45, C02770Dj r46, AnonymousClass0HJ r47, AnonymousClass03P r48, AnonymousClass0M9 r49, AnonymousClass01X r50, AnonymousClass01K r51, AnonymousClass1N2 r52, WhatsAppLibLoader whatsAppLibLoader, C53492dM r54, C02660Cy r55, AnonymousClass03S r56, AnonymousClass00D r57, AnonymousClass0C1 r58, AnonymousClass01S r59, AnonymousClass022 r60, AnonymousClass0HK r61) {
        super(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, whatsAppLibLoader, r54, r55, r56, r57, r58, r59, r60, r61);
        this.A01 = locationPicker;
    }

    @Override // X.AbstractC49792Sd
    public void onLocationChanged(Location location) {
        C32031eE r7;
        if (location != null) {
            LocationPicker locationPicker = this.A01;
            if (locationPicker.A09.A06 == null && (r7 = locationPicker.A03) != null) {
                C07040Vr r6 = new C07040Vr(location.getLatitude(), location.getLongitude());
                C07030Vq r1 = new C07030Vq();
                r1.A08 = r6;
                r7.A08(r1, 0, null);
            }
            if (locationPicker.A09.A0t && locationPicker.A03 != null) {
                if (locationPicker.A07 == null) {
                    A04();
                }
                LocationPicker.A04(locationPicker, new C07040Vr(location.getLatitude(), location.getLongitude()));
            }
            if (locationPicker.A09.A0s && locationPicker.A03 != null) {
                C07040Vr r62 = new C07040Vr(location.getLatitude(), location.getLongitude());
                C32031eE r2 = locationPicker.A03;
                C07030Vq r12 = new C07030Vq();
                r12.A08 = r62;
                r2.A08(r12, 1500, null);
            }
            super.onLocationChanged(location);
        }
    }
}

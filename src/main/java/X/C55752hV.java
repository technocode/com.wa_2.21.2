package X;

import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2hV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55752hV implements AbstractC19120uV {
    public final /* synthetic */ LocationPicker A00;

    public /* synthetic */ C55752hV(LocationPicker locationPicker) {
        this.A00 = locationPicker;
    }

    @Override // X.AbstractC19120uV
    public final boolean AHT(C32311eg r4) {
        Object obj;
        LocationPicker locationPicker = this.A00;
        AbstractC49792Sd r1 = locationPicker.A09;
        if (r1.A0t) {
            return true;
        }
        if (String.valueOf(((AbstractC19160uZ) r4).A07) == null) {
            return false;
        }
        PlaceInfo placeInfo = r1.A0Z;
        if (!(placeInfo == null || (obj = placeInfo.A01) == null)) {
            C32311eg r12 = (C32311eg) obj;
            r12.A07(locationPicker.A05);
            r12.A03();
        }
        r4.A07(locationPicker.A06);
        locationPicker.A09.A0O(r4);
        locationPicker.A09.A0B.setVisibility(8);
        locationPicker.A09.A0E.setVisibility(8);
        if (!locationPicker.A09.A0o && locationPicker.A0K.A04()) {
            return true;
        }
        r4.A04();
        return true;
    }
}

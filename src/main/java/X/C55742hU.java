package X;

import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2hU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55742hU implements AbstractC19110uR {
    public final /* synthetic */ LocationPicker A00;

    public /* synthetic */ C55742hU(LocationPicker locationPicker) {
        this.A00 = locationPicker;
    }

    @Override // X.AbstractC19110uR
    public final void AHP(C07040Vr r4) {
        LocationPicker locationPicker = this.A00;
        PlaceInfo placeInfo = locationPicker.A09.A0Z;
        if (placeInfo != null) {
            Object obj = placeInfo.A01;
            if (obj != null) {
                ((C32311eg) obj).A07(locationPicker.A05);
            }
            AbstractC49792Sd r1 = locationPicker.A09;
            r1.A0Z = null;
            r1.A0D();
        }
        AbstractC49792Sd r12 = locationPicker.A09;
        if (r12.A0o) {
            r12.A0E.setVisibility(0);
        }
        locationPicker.A09.A0B.setVisibility(8);
    }
}

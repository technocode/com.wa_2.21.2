package X;

import android.os.RemoteException;
import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2hb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55812hb implements AnonymousClass1B4 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55812hb(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B4
    public final boolean AHU(AnonymousClass1BR r4) {
        Object obj;
        LocationPicker2 locationPicker2 = this.A00;
        if (locationPicker2.A08.A0t) {
            return true;
        }
        if (r4 != null) {
            try {
                if (r4.A00.getId() == null) {
                    return false;
                }
                PlaceInfo placeInfo = locationPicker2.A08.A0Z;
                if (!(placeInfo == null || (obj = placeInfo.A01) == null)) {
                    AnonymousClass1BR r1 = (AnonymousClass1BR) obj;
                    r1.A05(locationPicker2.A03);
                    r1.A02();
                }
                r4.A05(locationPicker2.A04);
                locationPicker2.A08.A0O(r4);
                locationPicker2.A08.A0B.setVisibility(8);
                locationPicker2.A08.A0E.setVisibility(8);
                if (!locationPicker2.A08.A0o && locationPicker2.A0I.A04()) {
                    return true;
                }
                r4.A03();
                return true;
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            throw null;
        }
    }
}

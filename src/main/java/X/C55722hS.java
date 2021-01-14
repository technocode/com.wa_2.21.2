package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.List;

/* renamed from: X.2hS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55722hS implements AnonymousClass1B3 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55722hS(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B3
    public final void AHQ(LatLng latLng) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        AbstractView$OnCreateContextMenuListenerC56112i5 r1 = groupChatLiveLocationsActivity2.A08;
        if (r1.A0l != null) {
            r1.A0B();
            return;
        }
        C49842Sk A06 = r1.A06(latLng);
        if (A06 != null) {
            List list = A06.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity2.A08.A0P(A06, true);
                ((AnonymousClass1BR) groupChatLiveLocationsActivity2.A09.get(A06.A03)).A03();
            } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity2.A08.A0P(A06, true);
            } else {
                groupChatLiveLocationsActivity2.A0W(list, true);
                groupChatLiveLocationsActivity2.A08.A0j = new AnonymousClass2SN(list, groupChatLiveLocationsActivity2.A06.A02().A02);
            }
        }
    }
}

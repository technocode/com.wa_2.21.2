package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import java.util.List;

/* renamed from: X.2hJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55632hJ implements AbstractC19110uR {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C55632hJ(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19110uR
    public final void AHP(C07040Vr r8) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        AbstractView$OnCreateContextMenuListenerC56112i5 r6 = groupChatLiveLocationsActivity.A07;
        if (r6.A0l != null) {
            r6.A0B();
            return;
        }
        C49842Sk A06 = r6.A06(new LatLng(r8.A00, r8.A01));
        if (A06 != null) {
            List list = A06.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity.A07.A0P(A06, true);
                ((C32311eg) groupChatLiveLocationsActivity.A08.get(A06.A03)).A04();
            } else if (groupChatLiveLocationsActivity.A05.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity.A07.A0P(A06, true);
            } else {
                groupChatLiveLocationsActivity.A0W(list, true);
                groupChatLiveLocationsActivity.A07.A0j = new AnonymousClass2SN(list, groupChatLiveLocationsActivity.A05.A02().A02);
            }
        }
    }
}

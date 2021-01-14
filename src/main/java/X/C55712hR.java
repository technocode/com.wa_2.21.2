package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55712hR implements AnonymousClass1B0 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55712hR(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B0
    public final void ADk() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        AnonymousClass1B5 r0 = groupChatLiveLocationsActivity2.A06;
        if (r0 != null) {
            CameraPosition A02 = r0.A02();
            if (A02 != null) {
                int i = (int) (groupChatLiveLocationsActivity2.A00 * 5.0f);
                float f = A02.A02;
                if (i != ((int) (5.0f * f))) {
                    groupChatLiveLocationsActivity2.A00 = f;
                    groupChatLiveLocationsActivity2.A0V();
                }
                AbstractView$OnCreateContextMenuListenerC56112i5 r1 = groupChatLiveLocationsActivity2.A08;
                if (r1.A0j != null) {
                    r1.A0U(null);
                }
                AbstractView$OnCreateContextMenuListenerC56112i5 r02 = groupChatLiveLocationsActivity2.A08;
                C49842Sk r12 = r02.A0l;
                if (r12 != null && r02.A0t && groupChatLiveLocationsActivity2.A0Z(r12.A00())) {
                    groupChatLiveLocationsActivity2.A08.A0B();
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}

package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hr  reason: invalid class name and case insensitive filesystem */
public class C55972hr implements AbstractC24471Ay {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public C55972hr(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AbstractC24471Ay
    public void ADq() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0W = false;
        if (groupChatLiveLocationsActivity2.A06 == null) {
            throw null;
        }
    }

    @Override // X.AbstractC24471Ay
    public void AGA() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0W = false;
        AnonymousClass1B5 r0 = groupChatLiveLocationsActivity2.A06;
        if (r0 != null) {
            r0.A04();
            AbstractView$OnCreateContextMenuListenerC56112i5 r2 = groupChatLiveLocationsActivity2.A08;
            if (r2.A0j != null) {
                r2.A0U(Float.valueOf(groupChatLiveLocationsActivity2.A06.A02().A02));
                return;
            }
            C49842Sk r02 = r2.A0l;
            if (r02 != null) {
                LatLng A002 = r02.A00();
                if (!groupChatLiveLocationsActivity2.A06.A00().A01().A04.A00(A002) && !groupChatLiveLocationsActivity2.A08.A0t) {
                    groupChatLiveLocationsActivity2.A0W = true;
                    groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0H(A002, Math.min(groupChatLiveLocationsActivity2.A00 * 2.0f, 16.0f)), this);
                }
            } else if (!r2.A0u && groupChatLiveLocationsActivity2.A0X) {
                groupChatLiveLocationsActivity2.A0X = false;
                groupChatLiveLocationsActivity2.A0X(true);
            }
        } else {
            throw null;
        }
    }
}

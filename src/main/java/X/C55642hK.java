package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2hK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55642hK implements AbstractC19240uh {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C55642hK(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19240uh
    public final void AHR(C32031eE r11) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        if (groupChatLiveLocationsActivity.A05 == null) {
            groupChatLiveLocationsActivity.A05 = r11;
            if (r11 != null) {
                r11.A07(0, 0, groupChatLiveLocationsActivity.A01);
                groupChatLiveLocationsActivity.A01 = 0;
                C32031eE r0 = groupChatLiveLocationsActivity.A05;
                if (r0 != null) {
                    r0.A0S.A01(true);
                    C19270uk r02 = groupChatLiveLocationsActivity.A05.A0S;
                    r02.A01 = false;
                    r02.A00();
                    groupChatLiveLocationsActivity.A05.A08 = new C55962hq(groupChatLiveLocationsActivity);
                    C32031eE r1 = groupChatLiveLocationsActivity.A05;
                    r1.A0C = new C55652hL(groupChatLiveLocationsActivity);
                    r1.A09 = new C55672hN(groupChatLiveLocationsActivity);
                    r1.A0B = new C55632hJ(groupChatLiveLocationsActivity);
                    r1.A0A = new C55662hM(groupChatLiveLocationsActivity);
                    groupChatLiveLocationsActivity.A0V();
                    Bundle bundle = groupChatLiveLocationsActivity.A02;
                    if (bundle != null) {
                        groupChatLiveLocationsActivity.A06.setLocationMode(bundle.getInt("map_location_mode", 2));
                        if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                            groupChatLiveLocationsActivity.A05.A08(AnonymousClass0N2.A0j(new C07040Vr(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")), 0, null);
                        }
                        groupChatLiveLocationsActivity.A02 = null;
                    } else if (groupChatLiveLocationsActivity.A09.isEmpty()) {
                        SharedPreferences A01 = groupChatLiveLocationsActivity.A0S.A01(AnonymousClass020.A02);
                        C07040Vr r2 = new C07040Vr((double) A01.getFloat("live_location_lat", 37.389805f), (double) A01.getFloat("live_location_lng", -122.08141f));
                        C32031eE r12 = groupChatLiveLocationsActivity.A05;
                        C07030Vq r03 = new C07030Vq();
                        r03.A08 = r2;
                        r12.A08(r03, 0, null);
                        C32031eE r22 = groupChatLiveLocationsActivity.A05;
                        C07030Vq r04 = new C07030Vq();
                        r04.A03 = A01.getFloat("live_location_zoom", 16.0f) - 0.2f;
                        r22.A08(r04, 0, null);
                    } else {
                        groupChatLiveLocationsActivity.A0X(false);
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}

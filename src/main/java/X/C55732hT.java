package X;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55732hT implements AnonymousClass1B2 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55732hT(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B2
    public final void AGl(AnonymousClass1BR r7) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        C49842Sk r0 = (C49842Sk) r7.A01();
        if (r0 != null) {
            AnonymousClass01I r1 = groupChatLiveLocationsActivity2.A0D;
            UserJid userJid = r0.A02.A06;
            if (!r1.A09(userJid)) {
                Intent intent = new Intent(groupChatLiveLocationsActivity2, QuickContactActivity.class);
                groupChatLiveLocationsActivity2.A07.getLocationOnScreen(new int[2]);
                LatLng A002 = r7.A00();
                AnonymousClass1B5 r02 = groupChatLiveLocationsActivity2.A06;
                if (r02 != null) {
                    Point A003 = r02.A00().A00(A002);
                    Rect rect = new Rect();
                    int i = A003.x;
                    rect.left = i;
                    int i2 = A003.y;
                    rect.top = i2;
                    rect.right = i;
                    rect.bottom = i2;
                    intent.setSourceBounds(rect);
                    intent.putExtra("jid", userJid.getRawString());
                    intent.putExtra("gjid", groupChatLiveLocationsActivity2.A08.A0e.getRawString());
                    intent.putExtra("show_get_direction", true);
                    C02900Dx r03 = groupChatLiveLocationsActivity2.A08.A0m;
                    if (r03 != null) {
                        intent.putExtra("location_latitude", r03.A00);
                        intent.putExtra("location_longitude", groupChatLiveLocationsActivity2.A08.A0m.A01);
                    }
                    groupChatLiveLocationsActivity2.startActivity(intent);
                    return;
                }
                throw null;
            }
        }
    }
}

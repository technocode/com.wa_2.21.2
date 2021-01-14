package X;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2hM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55662hM implements AbstractC19100uQ {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C55662hM(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19100uQ
    public final void AGk(C32311eg r7) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        C49842Sk r5 = (C49842Sk) r7.A0L;
        if (r5 != null && !groupChatLiveLocationsActivity.A0C.A09(r5.A02.A06)) {
            Intent intent = new Intent(groupChatLiveLocationsActivity, QuickContactActivity.class);
            C07040Vr r1 = r7.A0K;
            C32031eE r0 = groupChatLiveLocationsActivity.A05;
            if (r0 != null) {
                Point A04 = r0.A0R.A04(r1);
                Rect rect = new Rect();
                int i = A04.x;
                rect.left = i;
                int i2 = A04.y;
                rect.top = i2;
                rect.right = i;
                rect.bottom = i2;
                intent.setSourceBounds(rect);
                intent.putExtra("jid", r5.A02.A06.getRawString());
                intent.putExtra("gjid", groupChatLiveLocationsActivity.A07.A0e.getRawString());
                intent.putExtra("show_get_direction", true);
                C02900Dx r02 = groupChatLiveLocationsActivity.A07.A0m;
                if (r02 != null) {
                    intent.putExtra("location_latitude", r02.A00);
                    intent.putExtra("location_longitude", groupChatLiveLocationsActivity.A07.A0m.A01);
                }
                groupChatLiveLocationsActivity.startActivity(intent);
                return;
            }
            throw null;
        }
    }
}

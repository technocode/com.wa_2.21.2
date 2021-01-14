package X;

import android.graphics.Point;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2hp  reason: invalid class name and case insensitive filesystem */
public class C55952hp implements AbstractC19070uN {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public C55952hp(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19070uN
    public void ADq() {
        this.A00.A0V = false;
    }

    @Override // X.AbstractC19070uN
    public void AGA() {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        groupChatLiveLocationsActivity.A0V = false;
        C32031eE r7 = groupChatLiveLocationsActivity.A05;
        if (r7 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r1 = groupChatLiveLocationsActivity.A07;
            C02900Dx r0 = r1.A0o;
            if (r0 != null) {
                C07040Vr r3 = new C07040Vr(r0.A00, r0.A01);
                Point A04 = r7.A0R.A04(r3);
                int i = A04.x;
                if (i <= 0 || A04.y <= 0 || i >= groupChatLiveLocationsActivity.A06.getWidth() || A04.y >= groupChatLiveLocationsActivity.A06.getHeight()) {
                    groupChatLiveLocationsActivity.A0V = true;
                    groupChatLiveLocationsActivity.A05.A08(AnonymousClass0N2.A0j(r3, groupChatLiveLocationsActivity.A00 * 2.0f), 1500, this);
                }
            } else if (!r1.A0u && groupChatLiveLocationsActivity.A0W) {
                groupChatLiveLocationsActivity.A0W = false;
                groupChatLiveLocationsActivity.A0X(true);
            }
        } else {
            throw null;
        }
    }
}

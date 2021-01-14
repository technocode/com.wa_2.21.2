package X;

import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2ol  reason: invalid class name and case insensitive filesystem */
public class C60082ol extends AbstractView$OnCreateContextMenuListenerC56112i5 {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60082ol(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, AnonymousClass00S r22, AnonymousClass02M r23, AnonymousClass01I r24, C09200cS r25, AnonymousClass0L2 r26, C02770Dj r27, AnonymousClass0HJ r28, AnonymousClass01A r29, C014308b r30, AnonymousClass01X r31, AnonymousClass08B r32, AnonymousClass0AC r33, AnonymousClass03S r34, AnonymousClass0C1 r35, AnonymousClass01S r36, AnonymousClass0HK r37, AnonymousClass0XZ r38, AnonymousClass0EU r39) {
        super(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractView$OnCreateContextMenuListenerC56112i5
    public void A0B() {
        super.A0B();
        this.A00.A0V();
    }

    @Override // X.AbstractView$OnCreateContextMenuListenerC56112i5
    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        if (groupChatLiveLocationsActivity.A07.A0s && location != null) {
            if (groupChatLiveLocationsActivity.A05 != null) {
                C07040Vr r0 = new C07040Vr(location.getLatitude(), location.getLongitude());
                C32031eE r3 = groupChatLiveLocationsActivity.A05;
                C07030Vq r2 = new C07030Vq();
                r2.A08 = r0;
                r3.A08(r2, 1500, null);
                return;
            }
            throw null;
        }
    }
}

package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2om  reason: invalid class name and case insensitive filesystem */
public class C60092om extends AbstractView$OnCreateContextMenuListenerC56112i5 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60092om(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, AnonymousClass00S r22, AnonymousClass02M r23, AnonymousClass01I r24, C09200cS r25, AnonymousClass0L2 r26, C02770Dj r27, AnonymousClass0HJ r28, AnonymousClass01A r29, C014308b r30, AnonymousClass01X r31, AnonymousClass08B r32, AnonymousClass0AC r33, AnonymousClass03S r34, AnonymousClass0C1 r35, AnonymousClass01S r36, AnonymousClass0HK r37, AnonymousClass0XZ r38, AnonymousClass0EU r39) {
        super(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AbstractView$OnCreateContextMenuListenerC56112i5
    public void A0B() {
        super.A0B();
        this.A00.A0V();
    }

    @Override // X.AbstractView$OnCreateContextMenuListenerC56112i5
    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        if (groupChatLiveLocationsActivity2.A08.A0s && location != null) {
            if (groupChatLiveLocationsActivity2.A06 != null) {
                groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0G(new LatLng(location.getLatitude(), location.getLongitude())), groupChatLiveLocationsActivity2.A05);
            } else {
                throw null;
            }
        }
        groupChatLiveLocationsActivity2.A07.A06 = location;
    }
}

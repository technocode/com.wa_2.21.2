package X;

import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2hN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55672hN implements AbstractC19090uP {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C55672hN(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19090uP
    public final void ADh(C07020Vp r6) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        C32031eE r3 = groupChatLiveLocationsActivity.A05;
        if (r3 == null) {
            throw null;
        } else if (((int) (groupChatLiveLocationsActivity.A00 * 5.0f)) != ((int) (r3.A02().A02 * 5.0f))) {
            groupChatLiveLocationsActivity.A00 = groupChatLiveLocationsActivity.A05.A02().A02;
            groupChatLiveLocationsActivity.A0V();
        }
    }
}

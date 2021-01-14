package X;

import android.content.Context;
import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2pk  reason: invalid class name and case insensitive filesystem */
public class C60572pk extends C60072ok {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60572pk(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context, C19130uW r3) {
        super(context, r3);
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.C60072ok
    public Location getMyLocation() {
        Location location;
        AbstractView$OnCreateContextMenuListenerC56112i5 r0 = this.A00.A07;
        if (r0 == null || (location = r0.A0J) == null) {
            return super.getMyLocation();
        }
        return location;
    }
}

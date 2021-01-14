package X;

import android.view.View;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55692hP implements AnonymousClass1B1 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55692hP(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B1
    public final void ADo(int i) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        if (i != 1) {
            return;
        }
        if (groupChatLiveLocationsActivity2.A06 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r0 = groupChatLiveLocationsActivity2.A08;
            r0.A0u = true;
            int i2 = 0;
            r0.A0s = false;
            View view = r0.A0U;
            if (r0.A0m != null) {
                i2 = 8;
            }
            view.setVisibility(i2);
            groupChatLiveLocationsActivity2.A06.A04();
            groupChatLiveLocationsActivity2.A08.A0t = true;
            return;
        }
        throw null;
    }
}

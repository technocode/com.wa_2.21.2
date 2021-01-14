package X;

import android.view.View;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import java.util.List;

/* renamed from: X.2hL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55652hL implements AbstractC19120uV {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C55652hL(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.AbstractC19120uV
    public final boolean AHT(C32311eg r7) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        AbstractView$OnCreateContextMenuListenerC56112i5 r0 = groupChatLiveLocationsActivity.A07;
        r0.A0u = true;
        r0.A0s = false;
        View view = r0.A0U;
        C02900Dx r1 = r0.A0m;
        int i = 8;
        if (r1 == null) {
            i = 0;
        }
        view.setVisibility(i);
        Object obj = r7.A0L;
        if (!(obj instanceof C49842Sk)) {
            groupChatLiveLocationsActivity.A07.A0B();
            return true;
        }
        C49842Sk r2 = (C49842Sk) obj;
        if (!((AbstractC19160uZ) r7).A04) {
            r2 = groupChatLiveLocationsActivity.A07.A07((C02900Dx) r2.A04.get(0));
            if (r2 != null) {
                r7 = (C32311eg) groupChatLiveLocationsActivity.A08.get(r2.A03);
            } else {
                groupChatLiveLocationsActivity.A07.A0B();
                return true;
            }
        }
        if (r2.A00 == 1) {
            groupChatLiveLocationsActivity.A07.A0B();
            return true;
        }
        List list = r2.A04;
        if (list.size() == 1) {
            groupChatLiveLocationsActivity.A07.A0P(r2, true);
            r7.A04();
            return true;
        }
        C32031eE r02 = groupChatLiveLocationsActivity.A05;
        if (r02 == null) {
            throw null;
        } else if (r02.A02().A02 >= 16.0f) {
            groupChatLiveLocationsActivity.A07.A0P(r2, true);
            return true;
        } else {
            groupChatLiveLocationsActivity.A0W(list, true);
            groupChatLiveLocationsActivity.A07.A0j = new AnonymousClass2SN(list, groupChatLiveLocationsActivity.A05.A02().A02);
            return true;
        }
    }
}

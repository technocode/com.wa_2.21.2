package X;

import android.view.View;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.List;

/* renamed from: X.2hQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55702hQ implements AnonymousClass1B4 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55702hQ(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B4
    public final boolean AHU(AnonymousClass1BR r7) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        if (groupChatLiveLocationsActivity2.A06 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r0 = groupChatLiveLocationsActivity2.A08;
            r0.A0u = true;
            r0.A0s = false;
            View view = r0.A0U;
            C02900Dx r1 = r0.A0m;
            int i = 8;
            if (r1 == null) {
                i = 0;
            }
            view.setVisibility(i);
            if (!(r7.A01() instanceof C49842Sk)) {
                groupChatLiveLocationsActivity2.A08.A0B();
                return true;
            }
            C49842Sk r2 = (C49842Sk) r7.A01();
            if (!r7.A08()) {
                r2 = groupChatLiveLocationsActivity2.A08.A07((C02900Dx) r2.A04.get(0));
                if (r2 != null) {
                    r7 = (AnonymousClass1BR) groupChatLiveLocationsActivity2.A09.get(r2.A03);
                } else {
                    groupChatLiveLocationsActivity2.A08.A0B();
                    return true;
                }
            }
            if (r2.A00 == 1) {
                groupChatLiveLocationsActivity2.A08.A0B();
                return true;
            }
            List list = r2.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity2.A08.A0P(r2, true);
                r7.A03();
                return true;
            } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity2.A08.A0P(r2, true);
                return true;
            } else {
                groupChatLiveLocationsActivity2.A0W(list, true);
                groupChatLiveLocationsActivity2.A08.A0j = new AnonymousClass2SN(list, groupChatLiveLocationsActivity2.A06.A02().A02);
                return true;
            }
        } else {
            throw null;
        }
    }
}

package X;

import android.view.ViewTreeObserver;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2SJ  reason: invalid class name */
public class AnonymousClass2SJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public AnonymousClass2SJ(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public void onGlobalLayout() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A07.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (groupChatLiveLocationsActivity2.A07.getWidth() > 0 && groupChatLiveLocationsActivity2.A07.getHeight() > 0) {
            groupChatLiveLocationsActivity2.A0X(false);
        }
    }
}

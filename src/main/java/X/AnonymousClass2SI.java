package X;

import android.view.ViewTreeObserver;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2SI  reason: invalid class name */
public class AnonymousClass2SI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public AnonymousClass2SI(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public void onGlobalLayout() {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        groupChatLiveLocationsActivity.A06.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (groupChatLiveLocationsActivity.A06.getWidth() > 0 && groupChatLiveLocationsActivity.A06.getHeight() > 0) {
            groupChatLiveLocationsActivity.A0X(false);
        }
    }
}

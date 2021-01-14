package X;

import android.view.MenuItem;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2Iu  reason: invalid class name */
public class AnonymousClass2Iu implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ StarredMessagesActivity A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public AnonymousClass2Iu(StarredMessagesActivity starredMessagesActivity) {
        this.A00 = starredMessagesActivity;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.A00.A06 = null;
        return true;
    }
}

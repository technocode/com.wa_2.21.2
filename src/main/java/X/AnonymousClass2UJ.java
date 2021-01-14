package X;

import android.database.ContentObserver;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2UJ  reason: invalid class name */
public class AnonymousClass2UJ extends ContentObserver {
    public final /* synthetic */ C57502kP A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2UJ(C57502kP r2) {
        super(null);
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        Log.d("MediaMessagesNavigator/navigator/on-change");
        ((MediaViewBaseFragment) this.A00.A07).A09.post(new RunnableEBaseShape10S0100000_I1_5(this, 49));
    }
}

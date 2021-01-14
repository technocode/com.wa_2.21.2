package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1LG  reason: invalid class name */
public class AnonymousClass1LG extends Handler {
    public final /* synthetic */ Conversation A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1LG(Conversation conversation) {
        super(Looper.getMainLooper());
        this.A00 = conversation;
    }

    public void handleMessage(Message message) {
        Conversation conversation = this.A00;
        if (!conversation.A2E.A00) {
            AnonymousClass0FE r2 = conversation.A3k;
            r2.A04();
            Log.d("conversation/statusbarrefresher/refresh");
            if (conversation.A1h) {
                r2.A0C(false);
                Log.d("conversation/statusbarrefresher/statusbar/cancel");
            }
            conversation.A1j = false;
            conversation.A1h = true;
        }
    }
}

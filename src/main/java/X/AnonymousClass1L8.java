package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1L8  reason: invalid class name */
public class AnonymousClass1L8 extends BroadcastReceiver {
    public final /* synthetic */ Conversation A00;

    public AnonymousClass1L8(Conversation conversation) {
        this.A00 = conversation;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            Conversation conversation = this.A00;
            conversation.unregisterReceiver(this);
            Log.i("conversation/reset-ime");
            InputMethodManager A0H = conversation.A2p.A0H();
            if (A0H != null) {
                A0H.restartInput(conversation.A0k);
                conversation.A0B = null;
                return;
            }
            throw null;
        } catch (Exception e) {
            Log.e("conversation/unregister user present receiver ", e);
        }
    }
}

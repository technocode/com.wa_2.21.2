package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Conversation;

/* renamed from: X.1L1  reason: invalid class name */
public class AnonymousClass1L1 extends Handler {
    public final /* synthetic */ Conversation A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1L1(Conversation conversation, Looper looper) {
        super(looper);
        this.A00 = conversation;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.A00.A0s();
        }
        this.A00.A0Y.setTranscriptMode(0);
    }
}

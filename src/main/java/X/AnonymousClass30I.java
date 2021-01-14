package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.30I  reason: invalid class name */
public class AnonymousClass30I extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass30I(RegisterName registerName, Looper looper) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        this.A00.A0Z();
    }
}

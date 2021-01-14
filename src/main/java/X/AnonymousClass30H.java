package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.30H  reason: invalid class name */
public class AnonymousClass30H extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass30H(RegisterName registerName, Looper looper) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        AnonymousClass30M r1 = RegisterName.A1K;
        if (r1 != null && r1.A03) {
            if (r1.A04) {
                DialogC70763Mh r0 = this.A00.A0E;
                if (r0 != null) {
                    r0.A00(1);
                    return;
                }
                return;
            }
            RegisterName registerName = this.A00;
            C002001d.A2N(registerName, 0);
            int i = RegisterName.A1K.A00;
            if (i == 1) {
                C002001d.A2O(registerName, 1);
            } else if (i == 3) {
                C002001d.A2O(registerName, 109);
            }
        }
    }
}

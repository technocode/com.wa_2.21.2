package X;

import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.SetStatus;

/* renamed from: X.1J4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J4 implements Handler.Callback {
    public final /* synthetic */ SetStatus A00;

    public /* synthetic */ AnonymousClass1J4(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    public final boolean handleMessage(Message message) {
        SetStatus setStatus = this.A00;
        if (message.what == 1) {
            setStatus.A06.A03((String) message.obj, null);
        } else {
            ((ActivityC004702f) setStatus).A0F.A06(R.string.info_update_failed, 0);
        }
        C002001d.A2N(setStatus, 2);
        return true;
    }
}

package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.SetStatus;

/* renamed from: X.1qo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39011qo implements AnonymousClass1XY {
    public final /* synthetic */ SetStatus A00;

    public /* synthetic */ C39011qo(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    @Override // X.AnonymousClass1XY
    public final void ANG(String str) {
        SetStatus setStatus = this.A00;
        setStatus.A03 = true;
        Handler handler = setStatus.A04;
        handler.removeMessages(0);
        handler.sendMessage(Message.obtain(handler, 1, str));
    }
}

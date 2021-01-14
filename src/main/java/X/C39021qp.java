package X;

import android.os.Handler;
import com.whatsapp.SetStatus;

/* renamed from: X.1qp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39021qp implements AnonymousClass1XK {
    public final /* synthetic */ SetStatus A00;

    public /* synthetic */ C39021qp(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    @Override // X.AnonymousClass1XK
    public final void AN9(int i) {
        Handler handler = this.A00.A04;
        handler.removeMessages(0);
        handler.sendEmptyMessage(0);
    }
}

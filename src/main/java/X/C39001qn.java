package X;

import android.os.Handler;
import com.whatsapp.SetStatus;

/* renamed from: X.1qn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39001qn implements AnonymousClass1XD {
    public final /* synthetic */ SetStatus A00;

    public /* synthetic */ C39001qn(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    @Override // X.AnonymousClass1XD
    public final void AND(Exception exc) {
        Handler handler = this.A00.A04;
        handler.removeMessages(0);
        handler.sendEmptyMessage(0);
    }
}

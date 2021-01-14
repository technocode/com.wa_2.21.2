package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.1Ii  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25791Ii implements Handler.Callback {
    public final /* synthetic */ AnonymousClass0JQ A00;
    public final /* synthetic */ AnonymousClass0IY A01;

    public /* synthetic */ C25791Ii(AnonymousClass0JQ r1, AnonymousClass0IY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass0JQ r3 = this.A00;
        AnonymousClass0IY r2 = this.A01;
        if (message.what != 1) {
            return false;
        }
        if (r2.A00) {
            return true;
        }
        r3.A02(false);
        return true;
    }
}

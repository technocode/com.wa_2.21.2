package X;

import android.os.Looper;

/* renamed from: X.17O  reason: invalid class name */
public final class AnonymousClass17O {
    public final AnonymousClass17M A00;
    public final HandlerC34751jA A01;
    public volatile Object A02;

    public AnonymousClass17O(Looper looper, Object obj) {
        this.A01 = new HandlerC34751jA(this, looper);
        C001801b.A1R(obj, "Listener must not be null");
        this.A02 = obj;
        C001801b.A1T("LocationListener");
        this.A00 = new AnonymousClass17M(obj);
    }
}

package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yT  reason: invalid class name and case insensitive filesystem */
public class CallableC21270yT implements Callable {
    public final /* synthetic */ C33081gA A00;

    public CallableC21270yT(C33081gA r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r1 = this.A00;
        if (r1.isConnected() && !r1.A0b) {
            C33091gB r2 = r1.A0L;
            if (r2.A00) {
                r2.A05.A04("Focus reset must happen on the Optic thread.");
                if (r2.A08) {
                    r2.A06 = false;
                    r2.A07 = false;
                    r2.A00(((C21420yi) r2).A01, EnumC21130yE.CANCELLED, null);
                    ((C21420yi) r2).A00.cancelAutoFocus();
                    C33331gZ A002 = r2.A04.A00(r2.A03);
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0A, null);
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0V, null);
                    A002.A01();
                    A002.A00();
                }
            }
        }
        return null;
    }
}

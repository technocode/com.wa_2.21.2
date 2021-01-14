package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ud  reason: invalid class name and case insensitive filesystem */
public class C41191ud implements AbstractC03150Ez {
    public final C03140Ey A00 = new C03140Ey();
    public final C03140Ey A01 = new C03140Ey();
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void A00(Object obj) {
        if (this.A02.compareAndSet(false, true)) {
            this.A01.A04(obj);
        }
    }

    public final void A01(Throwable th) {
        if (this.A02.compareAndSet(false, true)) {
            this.A00.A04(th);
        }
    }

    public void A02() {
        this.A01.A01();
        this.A00.A01();
        if (!this.A02.get()) {
            Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
        }
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        A00(obj);
    }
}

package X;

import android.graphics.Point;
import java.util.concurrent.Callable;

/* renamed from: X.383  reason: invalid class name */
public final /* synthetic */ class AnonymousClass383 implements Callable {
    public final /* synthetic */ C72723Tz A00;

    public /* synthetic */ AnonymousClass383(C72723Tz r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r2 = this.A00;
        AnonymousClass3C1 r1 = r2.A03;
        if (r1 == null || C72723Tz.A00(r1)) {
            return new Point(0, 0);
        }
        return new Point(r1.A02(), r2.A03.A01());
    }
}

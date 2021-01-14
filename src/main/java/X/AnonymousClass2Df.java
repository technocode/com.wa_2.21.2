package X;

import java.util.concurrent.Callable;

/* renamed from: X.2Df  reason: invalid class name */
public class AnonymousClass2Df implements Callable {
    public final /* synthetic */ AnonymousClass2Dk A00;

    public AnonymousClass2Df(AnonymousClass2Dk r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass2Dk r1 = this.A00;
        synchronized (r1) {
            if (r1.A03 == null) {
                return null;
            }
            r1.A09();
            if (r1.A0C()) {
                r1.A0A();
                r1.A00 = 0;
            }
            return null;
        }
    }
}

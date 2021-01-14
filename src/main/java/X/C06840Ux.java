package X;

import java.util.concurrent.Executor;

/* renamed from: X.0Ux  reason: invalid class name and case insensitive filesystem */
public class C06840Ux extends AbstractC06850Uy {
    public static final Executor A02 = new ExecutorC06860Uz();
    public static volatile C06840Ux A03;
    public AbstractC06850Uy A00;
    public AbstractC06850Uy A01;

    public C06840Ux() {
        AnonymousClass0V0 r0 = new AnonymousClass0V0();
        this.A00 = r0;
        this.A01 = r0;
    }

    public static C06840Ux A00() {
        if (A03 != null) {
            return A03;
        }
        synchronized (C06840Ux.class) {
            if (A03 == null) {
                A03 = new C06840Ux();
            }
        }
        return A03;
    }
}

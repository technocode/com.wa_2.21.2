package X;

import java.util.Timer;

/* renamed from: X.1NN  reason: invalid class name */
public abstract class AnonymousClass1NN {
    public static Timer A03 = new Timer();
    public boolean A00 = false;
    public boolean A01;
    public final AnonymousClass1NM A02;

    public abstract void A00();

    public AnonymousClass1NN() {
        AnonymousClass1NM r1 = new AnonymousClass1NM(this);
        this.A02 = r1;
        A03.schedule(r1, 20000);
    }
}

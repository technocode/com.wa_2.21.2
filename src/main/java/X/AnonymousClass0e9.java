package X;

/* renamed from: X.0e9  reason: invalid class name */
public class AnonymousClass0e9 extends AnonymousClass0JW {
    public final AnonymousClass01K A00;
    public final Runnable A01;

    public AnonymousClass0e9(AnonymousClass01K r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}

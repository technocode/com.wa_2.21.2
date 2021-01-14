package X;

/* renamed from: X.0eu  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC10610eu extends AnonymousClass0JW {
    public final Runnable A00;

    public AbstractC10610eu(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Runnable runnable;
        if (((Boolean) obj).booleanValue() && (runnable = this.A00) != null) {
            runnable.run();
        }
    }
}

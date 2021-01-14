package X;

/* renamed from: X.1AV  reason: invalid class name */
public final class AnonymousClass1AV {
    public final /* synthetic */ AnonymousClass29F A00;

    public AnonymousClass1AV(AnonymousClass29F r1) {
        this.A00 = r1;
    }

    public final void A00() {
        if (!this.A00.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}

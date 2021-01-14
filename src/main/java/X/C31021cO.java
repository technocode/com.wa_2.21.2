package X;

/* renamed from: X.1cO  reason: invalid class name and case insensitive filesystem */
public final class C31021cO extends AbstractC17630rs {
    public final Throwable A00;

    public C31021cO(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        return String.format("FAILURE (%s)", this.A00.getMessage());
    }
}

package X;

/* renamed from: X.11w  reason: invalid class name */
public final class AnonymousClass11w extends Exception {
    public final Throwable cause;
    public final int rendererIndex;
    public final int type;

    public AnonymousClass11w(int i, Throwable th, int i2) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
    }
}

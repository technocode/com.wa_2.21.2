package X;

/* renamed from: X.0lC  reason: invalid class name and case insensitive filesystem */
public final class C13900lC {
    public static final C13900lC A00 = new C13900lC(false);
    public volatile C13900lC next;
    public volatile Thread thread;

    public C13900lC() {
        AbstractC13850l7 r3 = AbstractC29771aA.A00;
        Thread currentThread = Thread.currentThread();
        if (!(r3 instanceof C29761a9)) {
            ((C29751a8) r3).A03.lazySet(this, currentThread);
        } else {
            this.thread = currentThread;
        }
    }

    public C13900lC(boolean z) {
    }
}

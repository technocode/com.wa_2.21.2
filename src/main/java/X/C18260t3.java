package X;

/* renamed from: X.0t3  reason: invalid class name and case insensitive filesystem */
public final class C18260t3 {
    public static final C18260t3 A00 = new C18260t3(false);
    public volatile C18260t3 next;
    public volatile Thread thread;

    public C18260t3() {
        AbstractC18210sy r3 = AbstractC31571dR.A00;
        Thread currentThread = Thread.currentThread();
        if (!(r3 instanceof C31561dQ)) {
            ((C31551dP) r3).A03.lazySet(this, currentThread);
        } else {
            this.thread = currentThread;
        }
    }

    public C18260t3(boolean z) {
    }
}
